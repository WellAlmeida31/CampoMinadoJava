package campominado.view;

import javax.swing.JOptionPane;

/**
 *
 * @author wellington.almeida
 */
public class Minefield extends javax.swing.JFrame {

    /**
     * Creates new form Minefield
     */
    public Minefield() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public void setWin(){
        if(LB_vitoria.getText().equals("")){
            LB_vitoria.setText("1");
        } else 
        LB_vitoria.setText(""+(Integer.parseInt(LB_vitoria.getText())+1));
    }
    
    public void setLose(){
        if(LB_derrota.getText().equals("")){
            LB_derrota.setText("1");
        } else 
        LB_derrota.setText(""+(Integer.parseInt(LB_derrota.getText())+1));
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        DP_minefield = new javax.swing.JDesktopPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        BT_iniciar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        LB_vitoria = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        LB_derrota = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MN_arquivo = new javax.swing.JMenu();
        MI_sair = new javax.swing.JMenuItem();
        MN_ajuda = new javax.swing.JMenu();
        MI_comojogar = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        MI_sobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Campo Minado");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        DP_minefield.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.blue));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DP_minefield, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DP_minefield)
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.blue));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nova Partida", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), java.awt.Color.blue)); // NOI18N

        BT_iniciar.setBackground(new java.awt.Color(21, 142, 198));
        BT_iniciar.setForeground(java.awt.Color.white);
        BT_iniciar.setText("Iniciar");
        BT_iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_iniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BT_iniciar, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BT_iniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Placar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), java.awt.Color.blue)); // NOI18N

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Vitórias", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(27, 172, 225))); // NOI18N
        jPanel5.setPreferredSize(new java.awt.Dimension(34, 58));

        LB_vitoria.setForeground(java.awt.Color.blue);
        LB_vitoria.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LB_vitoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(LB_vitoria, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Derrotas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), java.awt.Color.red)); // NOI18N

        LB_derrota.setForeground(java.awt.Color.red);
        LB_derrota.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LB_derrota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addComponent(LB_derrota, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(114, Short.MAX_VALUE))
        );

        MN_arquivo.setText("Arquivo");

        MI_sair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        MI_sair.setText("Sair");
        MI_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_sairActionPerformed(evt);
            }
        });
        MN_arquivo.add(MI_sair);

        jMenuBar1.add(MN_arquivo);

        MN_ajuda.setText("Ajuda");

        MI_comojogar.setText("Como jogar");
        MI_comojogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_comojogarActionPerformed(evt);
            }
        });
        MN_ajuda.add(MI_comojogar);
        MN_ajuda.add(jSeparator1);

        MI_sobre.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F10, java.awt.event.InputEvent.ALT_MASK));
        MI_sobre.setText("Sobre");
        MI_sobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_sobreActionPerformed(evt);
            }
        });
        MN_ajuda.add(MI_sobre);

        jMenuBar1.add(MN_ajuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BT_iniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_iniciarActionPerformed
        
        if(me.isShowing()){
            return;
        }
        me = new MinefieldEase(this);
        me.setClosable(true);
        me.setTitle("Campo Minado");
        me.setIconifiable(true);
        me.setResizable(false);
        DP_minefield.add(me);
        me.setVisible(true);

    }//GEN-LAST:event_BT_iniciarActionPerformed

    private void MI_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_sairActionPerformed
        System.exit(EXIT_ON_CLOSE);
    }//GEN-LAST:event_MI_sairActionPerformed

    private void MI_sobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_sobreActionPerformed
        JOptionPane.showMessageDialog(this, "Campo Minado\n\nversão 1.0\n"
                + "Desenvolvedor: Wellington Almeida\n\n"
                + "GitHub: \nhttps://github.com/WellAlmeida31", "Campo Minado", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_MI_sobreActionPerformed

    private void MI_comojogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_comojogarActionPerformed
        JOptionPane.showMessageDialog(this, "Campo Minado\n\n"
                + "* O Campo Minado possui 81 quadrados e 9 minas.\n"
                + "* Use os botões esquerdo e direito do mouse para jogar.\n"
                + "* Se você clicar em uma mina, o jogo acaba.\n"
                + "* Se clicar em um quadrado vazio, o jogo continua.\n"
                + "* Se aparecer um número, ele informará quantas minas\n"
                + "  estão escondidas ao redor.\n"
                + "* Se você suspeita que um quadrado contém uma mina, \n"
                + " clique nele com o botão direito do mouse. \n"
                + " Isso marca o quadrado com uma bandeira.", "Campo Minado", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_MI_comojogarActionPerformed

    MinefieldEase me = new MinefieldEase(this);
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_iniciar;
    private javax.swing.JDesktopPane DP_minefield;
    private javax.swing.JLabel LB_derrota;
    private javax.swing.JLabel LB_vitoria;
    private javax.swing.JMenuItem MI_comojogar;
    private javax.swing.JMenuItem MI_sair;
    private javax.swing.JMenuItem MI_sobre;
    private javax.swing.JMenu MN_ajuda;
    private javax.swing.JMenu MN_arquivo;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
