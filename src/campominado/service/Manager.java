package campominado.service;

import campominado.view.Minefield;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.Set;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author wellington.almeida
 */
public class Manager {

    private static final String ICON_FLAG = "/campominado/icons/bandeira.png";
    private static final String ICON_BOMB = "/campominado/icons/bomba.jpg";
    private static final List<Integer> RIGHT_COLUMN = new ArrayList<>(Arrays.asList(1,10,19,28,37,46,55,64,73));

    private final ImageIcon imageFlag = new javax.swing.ImageIcon(getClass().getResource(ICON_FLAG));
    private final ImageIcon imageBomb = new javax.swing.ImageIcon(getClass().getResource(ICON_BOMB));

    private static Map<Integer, Boolean> minesInFields = new HashMap<>();
    private static Map<String, Integer> ratio = new HashMap<>();
    private static Map<Integer, JButton> buttonsValue = new HashMap<>();
    private static Map<Integer, Boolean> flags = new HashMap<>();
    private static List<Integer> bombs = new ArrayList<>();
    private static Map<Integer, Boolean> noBombs = new HashMap<>();
    

    public Manager() {
    }

    public Map<Integer, JButton> getButtonsValue() {
        return buttonsValue;
    }

    public void setButtonsValue(Map<Integer, JButton> buttonsValue) {
        Manager.buttonsValue = buttonsValue;
    }

    public void generateMines() {
        int i = 1;
        minesInFields.clear();
        bombs.clear();
        while (i < 82) {
            minesInFields.put(i, Boolean.FALSE);
            flags.put(i, Boolean.FALSE);
            i++;
        }
        Random rand = new Random();
        Set<Integer> minesList = new HashSet<>();
        while (minesList.size() < 9) {
            Integer mines = 1 + rand.nextInt(81);
            minesList.add(mines);
        }
        minesList.forEach((mine) -> {
            minesInFields.put(mine, true);
        });

        minesInFields.forEach((k, v) -> {
            if (v == true) {
                bombs.add(k);
            }
        });
        noBombs.putAll(minesInFields);

    }

    public void ratioInit() {
        int i = 1;
        while (i < 10) {
            ratio.put("B1_" + i, -1);
            ratio.put("B2_" + i, 7);
            ratio.put("B3_" + i, 15);
            ratio.put("B4_" + i, 23);
            ratio.put("B5_" + i, 31);
            ratio.put("B6_" + i, 39);
            ratio.put("B7_" + i, 47);
            ratio.put("B8_" + i, 55);
            ratio.put("B9_" + i, 63);
            i++;
        }

    }

    public Integer getNumberReference(String buttonName) {
        Integer num = Integer.parseInt(buttonName.substring(1, 2)) + Integer
                .parseInt(buttonName.substring(3));
        return num += ratio.get(buttonName);
    }

    public void setFlag(MouseEvent evt, JButton button) {
        Integer num = getNumberReference(button.getName());
        if (evt.getButton() == MouseEvent.BUTTON3 && button.isEnabled()) {
            if (flags.get(num)) {
                button.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
                flags.put(num, Boolean.FALSE);
            } else {
                button.setIcon(imageFlag);
                flags.put(num, Boolean.TRUE);
            }

        }
    }

    public void setBomb(java.awt.event.MouseEvent evt, JButton button) {
        if (button.isEnabled()) {
            button.setIcon(imageBomb);
        }
    }

    public Boolean verifyUniqueBomb(MouseEvent evt, JButton button) {
        Integer num = getNumberReference(button.getName());
        if (evt.getButton() == MouseEvent.BUTTON1 && !flags.get(num)) {
            if (minesInFields.get(num)) {
                bombs.forEach((Integer bomb) -> {
                    buttonsValue.forEach((Integer k, JButton v) -> {
                        if (Objects.equals(bomb, k)) {
                            setBomb(evt, v);
                        }
                    });
                });
                noBombs.clear();
                JOptionPane.showMessageDialog(null, "Infelizmente você explodiu! :(\n"
                        + "Tente novamente", "Campo Minado", JOptionPane.ERROR_MESSAGE);
                return true;
            }
        }
        return false;
    }

    public Integer checkForMines(MouseEvent evt, JButton button) {
        Integer num = getNumberReference(button.getName());
        if (evt.getButton() == MouseEvent.BUTTON1 && !flags.get(num) && button.isEnabled()) {
            if (!minesInFields.get(num)) {
                setMinesAround(num, button);
            }
        }
        return 0;
    }

    public Integer setMinesAround(Integer buttonNum, JButton button) {
        List<Integer> minesAround = minesAround(buttonNum);
        if (!minesAround.isEmpty()) {
            button.setText("" + minesAround.size());
            button.setEnabled(false);
            noBombs.put(buttonNum, Boolean.TRUE);
            return minesAround.size();
        } else if (minesAround.isEmpty()) {
            button.setEnabled(false);
            noBombs.put(buttonNum, Boolean.TRUE);
            if(!RIGHT_COLUMN.contains(buttonNum + 1)) buttonsAround(buttonNum + 1, minesAround);
            if((buttonNum - 1) % 9 != 0 ) buttonsAround(buttonNum - 1, minesAround);
            buttonsAround(buttonNum + 9, minesAround);
            buttonsAround(buttonNum - 9, minesAround);           
        }
        return 0;
    }

    private Boolean numIsValid(Integer num) {
        return num > 0 && num < 82;
    }

    private List<Integer> minesAround(Integer buttonNum) {
        List<Integer> minesAround = new ArrayList<>();
        if(!RIGHT_COLUMN.contains(buttonNum + 1)) minesAround.add(buttonNum + 1);
        if((buttonNum - 1) % 9 != 0 ) minesAround.add(buttonNum - 1);
        minesAround.add(buttonNum + 9);
        minesAround.add(buttonNum - 9);
        
        minesAround.removeIf((m) -> {
            return Objects.isNull(minesInFields.get(m));
        });
        minesAround.removeIf((m) -> {
            return !minesInFields.get(m);
        });
        return minesAround;
    }
    
    private void buttonsAround(Integer buttonNum, List<Integer> minesAround){
        if (numIsValid(buttonNum)) {
                minesAround = minesAround(buttonNum);
                if (!minesAround.isEmpty()) {
                    buttonsValue.get(buttonNum).setText("" + minesAround.size());
                    buttonsValue.get(buttonNum).setEnabled(false);
                    noBombs.put(buttonNum, Boolean.TRUE);
                } else if (minesAround.isEmpty()) {
                    buttonsValue.get(buttonNum).setEnabled(false);
                    noBombs.put(buttonNum, Boolean.TRUE);
                }
            }
    }
    
    public Boolean checkWin(){
        Long fieldsNoBombs = noBombs.values().stream().filter(mine -> mine == true).count();
        if(fieldsNoBombs == 81){
            JOptionPane.showMessageDialog(null, "Parabens você sobreviveu ao Campo minado!!", "Campo Minado", JOptionPane.INFORMATION_MESSAGE);
            return true;
        }
        return false;
    }

}
