package campominado.view;

import campominado.service.Manager;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author wellington.almeida
 */
public final class MinefieldEase extends javax.swing.JInternalFrame {

    Manager manager = new Manager();
    Minefield minefield;
    
    /**
     * Creates new form MinefieldEase
     * @param minefield
     */
    public MinefieldEase(Minefield minefield) {
        initComponents();
        manager.generateMines();
        manager.ratioInit();
        generateButtonValue();
        generateButtonName();
        this.minefield = minefield;
    }

    private void generateButtonValue() {
        Map<Integer, JButton> buttonsValue = new HashMap<>();
        buttonsValue.put(1, B1_1);
        buttonsValue.put(2, B1_2);
        buttonsValue.put(3, B1_3);
        buttonsValue.put(4, B1_4);
        buttonsValue.put(5, B1_5);
        buttonsValue.put(6, B1_6);
        buttonsValue.put(7, B1_7);
        buttonsValue.put(8, B1_8);
        buttonsValue.put(9, B1_9);
        buttonsValue.put(10, B2_1);
        buttonsValue.put(11, B2_2);
        buttonsValue.put(12, B2_3);
        buttonsValue.put(13, B2_4);
        buttonsValue.put(14, B2_5);
        buttonsValue.put(15, B2_6);
        buttonsValue.put(16, B2_7);
        buttonsValue.put(17, B2_8);
        buttonsValue.put(18, B2_9);
        buttonsValue.put(19, B3_1);
        buttonsValue.put(20, B3_2);
        buttonsValue.put(21, B3_3);
        buttonsValue.put(22, B3_4);
        buttonsValue.put(23, B3_5);
        buttonsValue.put(24, B3_6);
        buttonsValue.put(25, B3_7);
        buttonsValue.put(26, B3_8);
        buttonsValue.put(27, B3_9);
        buttonsValue.put(28, B4_1);
        buttonsValue.put(29, B4_2);
        buttonsValue.put(30, B4_3);
        buttonsValue.put(31, B4_4);
        buttonsValue.put(32, B4_5);
        buttonsValue.put(33, B4_6);
        buttonsValue.put(34, B4_7);
        buttonsValue.put(35, B4_8);
        buttonsValue.put(36, B4_9);
        buttonsValue.put(37, B5_1);
        buttonsValue.put(38, B5_2);
        buttonsValue.put(39, B5_3);
        buttonsValue.put(40, B5_4);
        buttonsValue.put(41, B5_5);
        buttonsValue.put(42, B5_6);
        buttonsValue.put(43, B5_7);
        buttonsValue.put(44, B5_8);
        buttonsValue.put(45, B5_9);
        buttonsValue.put(46, B6_1);
        buttonsValue.put(47, B6_2);
        buttonsValue.put(48, B6_3);
        buttonsValue.put(49, B6_4);
        buttonsValue.put(50, B6_5);
        buttonsValue.put(51, B6_6);
        buttonsValue.put(52, B6_7);
        buttonsValue.put(53, B6_8);
        buttonsValue.put(54, B6_9);
        buttonsValue.put(55, B7_1);
        buttonsValue.put(56, B7_2);
        buttonsValue.put(57, B7_3);
        buttonsValue.put(58, B7_4);
        buttonsValue.put(59, B7_5);
        buttonsValue.put(60, B7_6);
        buttonsValue.put(61, B7_7);
        buttonsValue.put(62, B7_8);
        buttonsValue.put(63, B7_9);
        buttonsValue.put(64, B8_1);
        buttonsValue.put(65, B8_2);
        buttonsValue.put(66, B8_3);
        buttonsValue.put(67, B8_4);
        buttonsValue.put(68, B8_5);
        buttonsValue.put(69, B8_6);
        buttonsValue.put(70, B8_7);
        buttonsValue.put(71, B8_8);
        buttonsValue.put(72, B8_9);
        buttonsValue.put(73, B9_1);
        buttonsValue.put(74, B9_2);
        buttonsValue.put(75, B9_3);
        buttonsValue.put(76, B9_4);
        buttonsValue.put(77, B9_5);
        buttonsValue.put(78, B9_6);
        buttonsValue.put(79, B9_7);
        buttonsValue.put(80, B9_8);
        buttonsValue.put(81, B9_9);
        manager.setButtonsValue(buttonsValue);
    }
    
    private void generateButtonName(){
        B1_1.setName("B1_1");
        B1_2.setName("B1_2");
        B1_3.setName("B1_3");
        B1_4.setName("B1_4");
        B1_5.setName("B1_5");
        B1_6.setName("B1_6");
        B1_7.setName("B1_7");
        B1_8.setName("B1_8");
        B1_9.setName("B1_9");
        B2_1.setName("B2_1");
        B2_2.setName("B2_2");
        B2_3.setName("B2_3");
        B2_4.setName("B2_4");
        B2_5.setName("B2_5");
        B2_6.setName("B2_6");
        B2_7.setName("B2_7");
        B2_8.setName("B2_8");
        B2_9.setName("B2_9");
        B3_1.setName("B3_1");
        B3_2.setName("B3_2");
        B3_3.setName("B3_3");
        B3_4.setName("B3_4");
        B3_5.setName("B3_5");
        B3_6.setName("B3_6");
        B3_7.setName("B3_7");
        B3_8.setName("B3_8");
        B3_9.setName("B3_9");
        B4_1.setName("B4_1");
        B4_2.setName("B4_2");
        B4_3.setName("B4_3");
        B4_4.setName("B4_4");
        B4_5.setName("B4_5");
        B4_6.setName("B4_6");
        B4_7.setName("B4_7");
        B4_8.setName("B4_8");
        B4_9.setName("B4_9");
        B5_1.setName("B5_1");
        B5_2.setName("B5_2");
        B5_3.setName("B5_3");
        B5_4.setName("B5_4");
        B5_5.setName("B5_5");
        B5_6.setName("B5_6");
        B5_7.setName("B5_7");
        B5_8.setName("B5_8");
        B5_9.setName("B5_9");
        B6_1.setName("B6_1");
        B6_2.setName("B6_2");
        B6_3.setName("B6_3");
        B6_4.setName("B6_4");
        B6_5.setName("B6_5");
        B6_6.setName("B6_6");
        B6_7.setName("B6_7");
        B6_8.setName("B6_8");
        B6_9.setName("B6_9");
        B7_1.setName("B7_1");
        B7_2.setName("B7_2");
        B7_3.setName("B7_3");
        B7_4.setName("B7_4");
        B7_5.setName("B7_5");
        B7_6.setName("B7_6");
        B7_7.setName("B7_7");
        B7_8.setName("B7_8");
        B7_9.setName("B7_9");
        B8_1.setName("B8_1");
        B8_2.setName("B8_2");
        B8_3.setName("B8_3");
        B8_4.setName("B8_4");
        B8_5.setName("B8_5");
        B8_6.setName("B8_6");
        B8_7.setName("B8_7");
        B8_8.setName("B8_8");
        B8_9.setName("B8_9");
        B9_1.setName("B9_1");
        B9_2.setName("B9_2");
        B9_3.setName("B9_3");
        B9_4.setName("B9_4");
        B9_5.setName("B9_5");
        B9_6.setName("B9_6");
        B9_7.setName("B9_7");
        B9_8.setName("B9_8");
        B9_9.setName("B9_9");
    }
    
    private void actions(java.awt.event.MouseEvent evt, JButton button){
        if (manager.verifyUniqueBomb(evt, button)) {
            minefield.setLose();
            this.dispose();
        }
        manager.setFlag(evt, button);
        manager.checkForMines(evt, button);
        if (manager.checkWin()){
            minefield.setWin();
            this.dispose();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton6 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        B1_3 = new javax.swing.JButton();
        B1_9 = new javax.swing.JButton();
        B6_4 = new javax.swing.JButton();
        B1_2 = new javax.swing.JButton();
        B1_4 = new javax.swing.JButton();
        B1_5 = new javax.swing.JButton();
        B1_6 = new javax.swing.JButton();
        B1_7 = new javax.swing.JButton();
        B1_8 = new javax.swing.JButton();
        B1_1 = new javax.swing.JButton();
        B2_1 = new javax.swing.JButton();
        B3_1 = new javax.swing.JButton();
        B4_1 = new javax.swing.JButton();
        B5_1 = new javax.swing.JButton();
        B6_1 = new javax.swing.JButton();
        B7_1 = new javax.swing.JButton();
        B8_1 = new javax.swing.JButton();
        B9_1 = new javax.swing.JButton();
        B9_2 = new javax.swing.JButton();
        B8_2 = new javax.swing.JButton();
        B7_2 = new javax.swing.JButton();
        B6_2 = new javax.swing.JButton();
        B5_2 = new javax.swing.JButton();
        B4_2 = new javax.swing.JButton();
        B3_2 = new javax.swing.JButton();
        B2_2 = new javax.swing.JButton();
        B2_3 = new javax.swing.JButton();
        B2_4 = new javax.swing.JButton();
        B2_5 = new javax.swing.JButton();
        B2_6 = new javax.swing.JButton();
        B2_7 = new javax.swing.JButton();
        B2_8 = new javax.swing.JButton();
        B2_9 = new javax.swing.JButton();
        B3_9 = new javax.swing.JButton();
        B4_9 = new javax.swing.JButton();
        B5_9 = new javax.swing.JButton();
        B6_9 = new javax.swing.JButton();
        B7_9 = new javax.swing.JButton();
        B8_9 = new javax.swing.JButton();
        B9_9 = new javax.swing.JButton();
        B9_8 = new javax.swing.JButton();
        B9_7 = new javax.swing.JButton();
        B9_6 = new javax.swing.JButton();
        B9_5 = new javax.swing.JButton();
        B9_4 = new javax.swing.JButton();
        B9_3 = new javax.swing.JButton();
        B8_3 = new javax.swing.JButton();
        B8_4 = new javax.swing.JButton();
        B8_5 = new javax.swing.JButton();
        B8_6 = new javax.swing.JButton();
        B8_7 = new javax.swing.JButton();
        B8_8 = new javax.swing.JButton();
        B7_8 = new javax.swing.JButton();
        B6_8 = new javax.swing.JButton();
        B5_8 = new javax.swing.JButton();
        B4_8 = new javax.swing.JButton();
        B3_8 = new javax.swing.JButton();
        B3_7 = new javax.swing.JButton();
        B4_7 = new javax.swing.JButton();
        B5_7 = new javax.swing.JButton();
        B6_7 = new javax.swing.JButton();
        B7_7 = new javax.swing.JButton();
        B7_6 = new javax.swing.JButton();
        B6_6 = new javax.swing.JButton();
        B5_6 = new javax.swing.JButton();
        B4_6 = new javax.swing.JButton();
        B3_6 = new javax.swing.JButton();
        B3_5 = new javax.swing.JButton();
        B3_4 = new javax.swing.JButton();
        B3_3 = new javax.swing.JButton();
        B4_3 = new javax.swing.JButton();
        B5_3 = new javax.swing.JButton();
        B6_3 = new javax.swing.JButton();
        B7_3 = new javax.swing.JButton();
        B7_4 = new javax.swing.JButton();
        B7_5 = new javax.swing.JButton();
        B6_5 = new javax.swing.JButton();
        B5_5 = new javax.swing.JButton();
        B4_5 = new javax.swing.JButton();
        B4_4 = new javax.swing.JButton();
        B5_4 = new javax.swing.JButton();

        jButton6.setText("jButton1");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        B1_3.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        B1_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B1_3MouseClicked(evt);
            }
        });
        jPanel1.add(B1_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 40, 40));

        B1_9.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        B1_9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B1_9MouseClicked(evt);
            }
        });
        jPanel1.add(B1_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 40, 40));

        B6_4.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        B6_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B6_4MouseClicked(evt);
            }
        });
        jPanel1.add(B6_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 40, 40));

        B1_2.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        B1_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B1_2MouseClicked(evt);
            }
        });
        jPanel1.add(B1_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 40, 40));

        B1_4.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        B1_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B1_4MouseClicked(evt);
            }
        });
        jPanel1.add(B1_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 40, 40));

        B1_5.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        B1_5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B1_5MouseClicked(evt);
            }
        });
        jPanel1.add(B1_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 40, 40));

        B1_6.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        B1_6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B1_6MouseClicked(evt);
            }
        });
        jPanel1.add(B1_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 40, 40));

        B1_7.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        B1_7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B1_7MouseClicked(evt);
            }
        });
        jPanel1.add(B1_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 40, 40));

        B1_8.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        B1_8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B1_8MouseClicked(evt);
            }
        });
        jPanel1.add(B1_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 40, 40));

        B1_1.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        B1_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B1_1MouseClicked(evt);
            }
        });
        jPanel1.add(B1_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        B2_1.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        B2_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B2_1MouseClicked(evt);
            }
        });
        jPanel1.add(B2_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 40, 40));

        B3_1.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        B3_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B3_1MouseClicked(evt);
            }
        });
        jPanel1.add(B3_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 40, 40));

        B4_1.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        B4_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B4_1MouseClicked(evt);
            }
        });
        jPanel1.add(B4_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 40, 40));

        B5_1.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        B5_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B5_1MouseClicked(evt);
            }
        });
        jPanel1.add(B5_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 40, 40));

        B6_1.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        B6_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B6_1MouseClicked(evt);
            }
        });
        jPanel1.add(B6_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 40, 40));

        B7_1.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        B7_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B7_1MouseClicked(evt);
            }
        });
        jPanel1.add(B7_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 40, 40));

        B8_1.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        B8_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B8_1MouseClicked(evt);
            }
        });
        jPanel1.add(B8_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 40, 40));

        B9_1.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        B9_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B9_1MouseClicked(evt);
            }
        });
        jPanel1.add(B9_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 40, 40));

        B9_2.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        B9_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B9_2MouseClicked(evt);
            }
        });
        jPanel1.add(B9_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 40, 40));

        B8_2.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        B8_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B8_2MouseClicked(evt);
            }
        });
        jPanel1.add(B8_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 40, 40));

        B7_2.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        B7_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B7_2MouseClicked(evt);
            }
        });
        jPanel1.add(B7_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 40, 40));

        B6_2.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        B6_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B6_2MouseClicked(evt);
            }
        });
        jPanel1.add(B6_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 40, 40));

        B5_2.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        B5_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B5_2MouseClicked(evt);
            }
        });
        jPanel1.add(B5_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 40, 40));

        B4_2.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        B4_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B4_2MouseClicked(evt);
            }
        });
        jPanel1.add(B4_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 40, 40));

        B3_2.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        B3_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B3_2MouseClicked(evt);
            }
        });
        jPanel1.add(B3_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 40, 40));

        B2_2.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        B2_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B2_2MouseClicked(evt);
            }
        });
        jPanel1.add(B2_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 40, 40));

        B2_3.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        B2_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B2_3MouseClicked(evt);
            }
        });
        jPanel1.add(B2_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 40, 40));

        B2_4.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        B2_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B2_4MouseClicked(evt);
            }
        });
        jPanel1.add(B2_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 40, 40));

        B2_5.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        B2_5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B2_5MouseClicked(evt);
            }
        });
        jPanel1.add(B2_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 40, 40));

        B2_6.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        B2_6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B2_6MouseClicked(evt);
            }
        });
        jPanel1.add(B2_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 40, 40));

        B2_7.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        B2_7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B2_7MouseClicked(evt);
            }
        });
        jPanel1.add(B2_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 40, 40));

        B2_8.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        B2_8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B2_8MouseClicked(evt);
            }
        });
        jPanel1.add(B2_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 40, 40));

        B2_9.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        B2_9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B2_9MouseClicked(evt);
            }
        });
        jPanel1.add(B2_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 40, 40));

        B3_9.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        B3_9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B3_9MouseClicked(evt);
            }
        });
        jPanel1.add(B3_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 40, 40));

        B4_9.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        B4_9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B4_9MouseClicked(evt);
            }
        });
        jPanel1.add(B4_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 40, 40));

        B5_9.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        B5_9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B5_9MouseClicked(evt);
            }
        });
        jPanel1.add(B5_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 40, 40));

        B6_9.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        B6_9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B6_9MouseClicked(evt);
            }
        });
        jPanel1.add(B6_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 40, 40));

        B7_9.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        B7_9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B7_9MouseClicked(evt);
            }
        });
        jPanel1.add(B7_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 40, 40));

        B8_9.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        B8_9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B8_9MouseClicked(evt);
            }
        });
        jPanel1.add(B8_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, 40, 40));

        B9_9.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        B9_9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B9_9MouseClicked(evt);
            }
        });
        jPanel1.add(B9_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, 40, 40));

        B9_8.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        B9_8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B9_8MouseClicked(evt);
            }
        });
        jPanel1.add(B9_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, 40, 40));

        B9_7.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        B9_7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B9_7MouseClicked(evt);
            }
        });
        jPanel1.add(B9_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 40, 40));

        B9_6.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        B9_6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B9_6MouseClicked(evt);
            }
        });
        jPanel1.add(B9_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 40, 40));

        B9_5.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        B9_5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B9_5MouseClicked(evt);
            }
        });
        jPanel1.add(B9_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 40, 40));

        B9_4.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        B9_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B9_4MouseClicked(evt);
            }
        });
        jPanel1.add(B9_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 40, 40));

        B9_3.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        B9_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B9_3MouseClicked(evt);
            }
        });
        jPanel1.add(B9_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 40, 40));

        B8_3.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        B8_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B8_3MouseClicked(evt);
            }
        });
        jPanel1.add(B8_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 40, 40));

        B8_4.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        B8_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B8_4MouseClicked(evt);
            }
        });
        jPanel1.add(B8_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 40, 40));

        B8_5.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        B8_5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B8_5MouseClicked(evt);
            }
        });
        jPanel1.add(B8_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 40, 40));

        B8_6.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        B8_6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B8_6MouseClicked(evt);
            }
        });
        jPanel1.add(B8_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 40, 40));

        B8_7.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        B8_7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B8_7MouseClicked(evt);
            }
        });
        jPanel1.add(B8_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 40, 40));

        B8_8.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        B8_8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B8_8MouseClicked(evt);
            }
        });
        jPanel1.add(B8_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 40, 40));

        B7_8.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        B7_8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B7_8MouseClicked(evt);
            }
        });
        jPanel1.add(B7_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 40, 40));

        B6_8.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        B6_8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B6_8MouseClicked(evt);
            }
        });
        jPanel1.add(B6_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 40, 40));

        B5_8.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        B5_8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B5_8MouseClicked(evt);
            }
        });
        jPanel1.add(B5_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 40, 40));

        B4_8.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        B4_8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B4_8MouseClicked(evt);
            }
        });
        jPanel1.add(B4_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 40, 40));

        B3_8.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        B3_8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B3_8MouseClicked(evt);
            }
        });
        jPanel1.add(B3_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 40, 40));

        B3_7.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        B3_7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B3_7MouseClicked(evt);
            }
        });
        jPanel1.add(B3_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 40, 40));

        B4_7.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        B4_7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B4_7MouseClicked(evt);
            }
        });
        jPanel1.add(B4_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 40, 40));

        B5_7.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        B5_7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B5_7MouseClicked(evt);
            }
        });
        jPanel1.add(B5_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 40, 40));

        B6_7.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        B6_7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B6_7MouseClicked(evt);
            }
        });
        jPanel1.add(B6_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 40, 40));

        B7_7.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        B7_7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B7_7MouseClicked(evt);
            }
        });
        jPanel1.add(B7_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 40, 40));

        B7_6.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        B7_6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B7_6MouseClicked(evt);
            }
        });
        jPanel1.add(B7_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 40, 40));

        B6_6.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        B6_6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B6_6MouseClicked(evt);
            }
        });
        jPanel1.add(B6_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 40, 40));

        B5_6.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        B5_6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B5_6MouseClicked(evt);
            }
        });
        jPanel1.add(B5_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 40, 40));

        B4_6.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        B4_6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B4_6MouseClicked(evt);
            }
        });
        jPanel1.add(B4_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 40, 40));

        B3_6.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        B3_6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B3_6MouseClicked(evt);
            }
        });
        jPanel1.add(B3_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 40, 40));

        B3_5.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        B3_5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B3_5MouseClicked(evt);
            }
        });
        jPanel1.add(B3_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 40, 40));

        B3_4.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        B3_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B3_4MouseClicked(evt);
            }
        });
        jPanel1.add(B3_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 40, 40));

        B3_3.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        B3_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B3_3MouseClicked(evt);
            }
        });
        jPanel1.add(B3_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 40, 40));

        B4_3.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        B4_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B4_3MouseClicked(evt);
            }
        });
        jPanel1.add(B4_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 40, 40));

        B5_3.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        B5_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B5_3MouseClicked(evt);
            }
        });
        jPanel1.add(B5_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 40, 40));

        B6_3.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        B6_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B6_3MouseClicked(evt);
            }
        });
        jPanel1.add(B6_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 40, 40));

        B7_3.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        B7_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B7_3MouseClicked(evt);
            }
        });
        jPanel1.add(B7_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 40, 40));

        B7_4.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        B7_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B7_4MouseClicked(evt);
            }
        });
        jPanel1.add(B7_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 40, 40));

        B7_5.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        B7_5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B7_5MouseClicked(evt);
            }
        });
        jPanel1.add(B7_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 40, 40));

        B6_5.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        B6_5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B6_5MouseClicked(evt);
            }
        });
        jPanel1.add(B6_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 40, 40));

        B5_5.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        B5_5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B5_5MouseClicked(evt);
            }
        });
        jPanel1.add(B5_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 40, 40));

        B4_5.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        B4_5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B4_5MouseClicked(evt);
            }
        });
        jPanel1.add(B4_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 40, 40));

        B4_4.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        B4_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B4_4MouseClicked(evt);
            }
        });
        jPanel1.add(B4_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 40, 40));

        B5_4.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        B5_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B5_4MouseClicked(evt);
            }
        });
        jPanel1.add(B5_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 40, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B1_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B1_1MouseClicked
        actions(evt, B1_1);
    }//GEN-LAST:event_B1_1MouseClicked

    private void B1_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B1_2MouseClicked
       actions(evt, B1_2);
    }//GEN-LAST:event_B1_2MouseClicked

    private void B1_3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B1_3MouseClicked
        actions(evt, B1_3);
    }//GEN-LAST:event_B1_3MouseClicked

    private void B1_4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B1_4MouseClicked
        actions(evt, B1_4);
    }//GEN-LAST:event_B1_4MouseClicked

    private void B1_5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B1_5MouseClicked
        actions(evt, B1_5);
    }//GEN-LAST:event_B1_5MouseClicked

    private void B1_6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B1_6MouseClicked
        actions(evt, B1_6);
    }//GEN-LAST:event_B1_6MouseClicked

    private void B1_7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B1_7MouseClicked
        actions(evt, B1_7);
    }//GEN-LAST:event_B1_7MouseClicked

    private void B1_8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B1_8MouseClicked
        actions(evt, B1_8);
    }//GEN-LAST:event_B1_8MouseClicked

    private void B1_9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B1_9MouseClicked
        actions(evt, B1_9);
    }//GEN-LAST:event_B1_9MouseClicked

    private void B2_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B2_1MouseClicked
        actions(evt, B2_1);
    }//GEN-LAST:event_B2_1MouseClicked

    private void B2_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B2_2MouseClicked
        actions(evt, B2_2);
    }//GEN-LAST:event_B2_2MouseClicked

    private void B2_3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B2_3MouseClicked
        actions(evt, B2_3);
    }//GEN-LAST:event_B2_3MouseClicked

    private void B2_4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B2_4MouseClicked
        actions(evt, B2_4);
    }//GEN-LAST:event_B2_4MouseClicked

    private void B2_5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B2_5MouseClicked
        actions(evt, B2_5);
    }//GEN-LAST:event_B2_5MouseClicked

    private void B2_6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B2_6MouseClicked
        actions(evt, B2_6);
    }//GEN-LAST:event_B2_6MouseClicked

    private void B2_7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B2_7MouseClicked
        actions(evt, B2_7);
    }//GEN-LAST:event_B2_7MouseClicked

    private void B2_8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B2_8MouseClicked
        actions(evt, B2_8);
    }//GEN-LAST:event_B2_8MouseClicked

    private void B2_9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B2_9MouseClicked
        actions(evt, B2_9);
    }//GEN-LAST:event_B2_9MouseClicked

    private void B3_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B3_1MouseClicked
        actions(evt, B3_1);
    }//GEN-LAST:event_B3_1MouseClicked

    private void B3_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B3_2MouseClicked
        actions(evt, B3_2);
    }//GEN-LAST:event_B3_2MouseClicked

    private void B3_3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B3_3MouseClicked
        actions(evt, B3_3);
    }//GEN-LAST:event_B3_3MouseClicked

    private void B3_4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B3_4MouseClicked
        actions(evt, B3_4);
    }//GEN-LAST:event_B3_4MouseClicked

    private void B3_5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B3_5MouseClicked
        actions(evt, B3_5);
    }//GEN-LAST:event_B3_5MouseClicked

    private void B3_6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B3_6MouseClicked
        actions(evt, B3_6);
    }//GEN-LAST:event_B3_6MouseClicked

    private void B3_7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B3_7MouseClicked
        actions(evt, B3_7);
    }//GEN-LAST:event_B3_7MouseClicked

    private void B3_8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B3_8MouseClicked
        actions(evt, B3_8);
    }//GEN-LAST:event_B3_8MouseClicked

    private void B3_9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B3_9MouseClicked
        actions(evt, B3_9);
    }//GEN-LAST:event_B3_9MouseClicked

    private void B4_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B4_1MouseClicked
        actions(evt, B4_1);
    }//GEN-LAST:event_B4_1MouseClicked

    private void B4_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B4_2MouseClicked
        actions(evt, B4_2);
    }//GEN-LAST:event_B4_2MouseClicked

    private void B4_3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B4_3MouseClicked
        actions(evt, B4_3);
    }//GEN-LAST:event_B4_3MouseClicked

    private void B4_4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B4_4MouseClicked
        actions(evt, B4_4);
    }//GEN-LAST:event_B4_4MouseClicked

    private void B4_5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B4_5MouseClicked
        actions(evt, B4_5);
    }//GEN-LAST:event_B4_5MouseClicked

    private void B4_6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B4_6MouseClicked
        actions(evt, B4_6);
    }//GEN-LAST:event_B4_6MouseClicked

    private void B4_7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B4_7MouseClicked
        actions(evt, B4_7);
    }//GEN-LAST:event_B4_7MouseClicked

    private void B4_8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B4_8MouseClicked
        actions(evt, B4_8);
    }//GEN-LAST:event_B4_8MouseClicked

    private void B4_9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B4_9MouseClicked
        actions(evt, B4_9);
    }//GEN-LAST:event_B4_9MouseClicked

    private void B5_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B5_1MouseClicked
        actions(evt, B5_1);
    }//GEN-LAST:event_B5_1MouseClicked

    private void B5_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B5_2MouseClicked
        actions(evt, B5_2);
    }//GEN-LAST:event_B5_2MouseClicked

    private void B5_3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B5_3MouseClicked
        actions(evt, B5_3);
    }//GEN-LAST:event_B5_3MouseClicked

    private void B5_4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B5_4MouseClicked
        actions(evt, B5_4);
    }//GEN-LAST:event_B5_4MouseClicked

    private void B5_5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B5_5MouseClicked
        actions(evt, B5_5);
    }//GEN-LAST:event_B5_5MouseClicked

    private void B5_6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B5_6MouseClicked
        actions(evt, B5_6);
    }//GEN-LAST:event_B5_6MouseClicked

    private void B5_7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B5_7MouseClicked
        actions(evt, B5_7);
    }//GEN-LAST:event_B5_7MouseClicked

    private void B5_8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B5_8MouseClicked
        actions(evt, B5_8);
    }//GEN-LAST:event_B5_8MouseClicked

    private void B5_9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B5_9MouseClicked
        actions(evt, B5_9);
    }//GEN-LAST:event_B5_9MouseClicked

    private void B6_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B6_1MouseClicked
        actions(evt, B6_1);
    }//GEN-LAST:event_B6_1MouseClicked

    private void B6_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B6_2MouseClicked
        actions(evt, B6_2);
    }//GEN-LAST:event_B6_2MouseClicked

    private void B6_3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B6_3MouseClicked
        actions(evt, B6_3);
    }//GEN-LAST:event_B6_3MouseClicked

    private void B6_4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B6_4MouseClicked
        actions(evt, B6_4);
    }//GEN-LAST:event_B6_4MouseClicked

    private void B6_5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B6_5MouseClicked
        actions(evt, B6_5);
    }//GEN-LAST:event_B6_5MouseClicked

    private void B6_6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B6_6MouseClicked
        actions(evt, B6_6);
    }//GEN-LAST:event_B6_6MouseClicked

    private void B6_7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B6_7MouseClicked
        actions(evt, B6_7);
    }//GEN-LAST:event_B6_7MouseClicked

    private void B6_8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B6_8MouseClicked
        actions(evt, B6_8);
    }//GEN-LAST:event_B6_8MouseClicked

    private void B6_9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B6_9MouseClicked
        actions(evt, B6_9);
    }//GEN-LAST:event_B6_9MouseClicked

    private void B7_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B7_1MouseClicked
        actions(evt, B7_1);
    }//GEN-LAST:event_B7_1MouseClicked

    private void B7_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B7_2MouseClicked
        actions(evt, B7_2);
    }//GEN-LAST:event_B7_2MouseClicked

    private void B7_3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B7_3MouseClicked
        actions(evt, B7_3);
    }//GEN-LAST:event_B7_3MouseClicked

    private void B7_4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B7_4MouseClicked
        actions(evt, B7_4);
    }//GEN-LAST:event_B7_4MouseClicked

    private void B7_5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B7_5MouseClicked
        actions(evt, B7_5);
    }//GEN-LAST:event_B7_5MouseClicked

    private void B7_6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B7_6MouseClicked
        actions(evt, B7_6);
    }//GEN-LAST:event_B7_6MouseClicked

    private void B7_7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B7_7MouseClicked
        actions(evt, B7_7);
    }//GEN-LAST:event_B7_7MouseClicked

    private void B7_8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B7_8MouseClicked
        actions(evt, B7_8);
    }//GEN-LAST:event_B7_8MouseClicked

    private void B7_9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B7_9MouseClicked
        actions(evt, B7_9);
    }//GEN-LAST:event_B7_9MouseClicked

    private void B8_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B8_1MouseClicked
        actions(evt, B8_1);
    }//GEN-LAST:event_B8_1MouseClicked

    private void B8_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B8_2MouseClicked
        actions(evt, B8_2);
    }//GEN-LAST:event_B8_2MouseClicked

    private void B8_3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B8_3MouseClicked
        actions(evt, B8_3);
    }//GEN-LAST:event_B8_3MouseClicked

    private void B8_4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B8_4MouseClicked
        actions(evt, B8_4);
    }//GEN-LAST:event_B8_4MouseClicked

    private void B8_5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B8_5MouseClicked
        actions(evt, B8_5);
    }//GEN-LAST:event_B8_5MouseClicked

    private void B8_6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B8_6MouseClicked
        actions(evt, B8_6);
    }//GEN-LAST:event_B8_6MouseClicked

    private void B8_7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B8_7MouseClicked
        actions(evt, B8_7);
    }//GEN-LAST:event_B8_7MouseClicked

    private void B8_8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B8_8MouseClicked
        actions(evt, B8_8);
    }//GEN-LAST:event_B8_8MouseClicked

    private void B8_9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B8_9MouseClicked
        actions(evt, B8_9);
    }//GEN-LAST:event_B8_9MouseClicked

    private void B9_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B9_1MouseClicked
        actions(evt, B9_1);
    }//GEN-LAST:event_B9_1MouseClicked

    private void B9_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B9_2MouseClicked
        actions(evt, B9_2);
    }//GEN-LAST:event_B9_2MouseClicked

    private void B9_3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B9_3MouseClicked
        actions(evt, B9_3);
    }//GEN-LAST:event_B9_3MouseClicked

    private void B9_4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B9_4MouseClicked
        actions(evt, B9_4);
    }//GEN-LAST:event_B9_4MouseClicked

    private void B9_5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B9_5MouseClicked
        actions(evt, B9_5);
    }//GEN-LAST:event_B9_5MouseClicked

    private void B9_6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B9_6MouseClicked
        actions(evt, B9_6);
    }//GEN-LAST:event_B9_6MouseClicked

    private void B9_7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B9_7MouseClicked
        actions(evt, B9_7);
    }//GEN-LAST:event_B9_7MouseClicked

    private void B9_8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B9_8MouseClicked
        actions(evt, B9_8);
    }//GEN-LAST:event_B9_8MouseClicked

    private void B9_9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B9_9MouseClicked
        actions(evt, B9_9);
    }//GEN-LAST:event_B9_9MouseClicked

    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B1_1;
    private javax.swing.JButton B1_2;
    private javax.swing.JButton B1_3;
    private javax.swing.JButton B1_4;
    private javax.swing.JButton B1_5;
    private javax.swing.JButton B1_6;
    private javax.swing.JButton B1_7;
    private javax.swing.JButton B1_8;
    private javax.swing.JButton B1_9;
    private javax.swing.JButton B2_1;
    private javax.swing.JButton B2_2;
    private javax.swing.JButton B2_3;
    private javax.swing.JButton B2_4;
    private javax.swing.JButton B2_5;
    private javax.swing.JButton B2_6;
    private javax.swing.JButton B2_7;
    private javax.swing.JButton B2_8;
    private javax.swing.JButton B2_9;
    private javax.swing.JButton B3_1;
    private javax.swing.JButton B3_2;
    private javax.swing.JButton B3_3;
    private javax.swing.JButton B3_4;
    private javax.swing.JButton B3_5;
    private javax.swing.JButton B3_6;
    private javax.swing.JButton B3_7;
    private javax.swing.JButton B3_8;
    private javax.swing.JButton B3_9;
    private javax.swing.JButton B4_1;
    private javax.swing.JButton B4_2;
    private javax.swing.JButton B4_3;
    private javax.swing.JButton B4_4;
    private javax.swing.JButton B4_5;
    private javax.swing.JButton B4_6;
    private javax.swing.JButton B4_7;
    private javax.swing.JButton B4_8;
    private javax.swing.JButton B4_9;
    private javax.swing.JButton B5_1;
    private javax.swing.JButton B5_2;
    private javax.swing.JButton B5_3;
    private javax.swing.JButton B5_4;
    private javax.swing.JButton B5_5;
    private javax.swing.JButton B5_6;
    private javax.swing.JButton B5_7;
    private javax.swing.JButton B5_8;
    private javax.swing.JButton B5_9;
    private javax.swing.JButton B6_1;
    private javax.swing.JButton B6_2;
    private javax.swing.JButton B6_3;
    private javax.swing.JButton B6_4;
    private javax.swing.JButton B6_5;
    private javax.swing.JButton B6_6;
    private javax.swing.JButton B6_7;
    private javax.swing.JButton B6_8;
    private javax.swing.JButton B6_9;
    private javax.swing.JButton B7_1;
    private javax.swing.JButton B7_2;
    private javax.swing.JButton B7_3;
    private javax.swing.JButton B7_4;
    private javax.swing.JButton B7_5;
    private javax.swing.JButton B7_6;
    private javax.swing.JButton B7_7;
    private javax.swing.JButton B7_8;
    private javax.swing.JButton B7_9;
    private javax.swing.JButton B8_1;
    private javax.swing.JButton B8_2;
    private javax.swing.JButton B8_3;
    private javax.swing.JButton B8_4;
    private javax.swing.JButton B8_5;
    private javax.swing.JButton B8_6;
    private javax.swing.JButton B8_7;
    private javax.swing.JButton B8_8;
    private javax.swing.JButton B8_9;
    private javax.swing.JButton B9_1;
    private javax.swing.JButton B9_2;
    private javax.swing.JButton B9_3;
    private javax.swing.JButton B9_4;
    private javax.swing.JButton B9_5;
    private javax.swing.JButton B9_6;
    private javax.swing.JButton B9_7;
    private javax.swing.JButton B9_8;
    private javax.swing.JButton B9_9;
    private javax.swing.JButton jButton6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
