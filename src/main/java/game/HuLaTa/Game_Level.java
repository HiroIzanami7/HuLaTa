package game.HuLaTa;


public class Game_Level extends javax.swing.JFrame {

    private int easyseconds = 300;
    private int mediumseconds = 300;
    private int hardseconds = 300;
    private int extremeseconds = 300;

    public Game_Level() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Easy = new javax.swing.JButton();
        Average = new javax.swing.JButton();
        Hard = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        Extreme = new javax.swing.JButton();
        Slang = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);

        Easy.setBackground(new java.awt.Color(102, 255, 102));
        Easy.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        Easy.setForeground(new java.awt.Color(255, 255, 255));
        Easy.setText("EASY");
        Easy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EasyActionPerformed(evt);
            }
        });

        Average.setBackground(new java.awt.Color(255, 204, 0));
        Average.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        Average.setForeground(new java.awt.Color(255, 255, 255));
        Average.setText("AVERAGE");
        Average.setToolTipText("");
        Average.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AverageActionPerformed(evt);
            }
        });

        Hard.setBackground(new java.awt.Color(204, 0, 0));
        Hard.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        Hard.setForeground(new java.awt.Color(255, 255, 255));
        Hard.setText("HARD");
        Hard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HardActionPerformed(evt);
            }
        });

        Back.setBackground(new java.awt.Color(0, 51, 51));
        Back.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        Back.setForeground(new java.awt.Color(255, 255, 255));
        Back.setText("BACK");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        Extreme.setBackground(new java.awt.Color(51, 255, 255));
        Extreme.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        Extreme.setForeground(new java.awt.Color(255, 255, 255));
        Extreme.setText("Extreme");
        Extreme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExtremeActionPerformed(evt);
            }
        });

        Slang.setBackground(new java.awt.Color(51, 255, 255));
        Slang.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        Slang.setForeground(new java.awt.Color(255, 255, 255));
        Slang.setText("Slang");
        Slang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SlangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Slang, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(191, 191, 191)
                            .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(71, 71, 71)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Easy, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Average)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Hard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Extreme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(87, 87, 87))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Easy)
                    .addComponent(Hard))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Average)
                    .addComponent(Extreme))
                .addGap(18, 18, 18)
                .addComponent(Slang)
                .addGap(22, 22, 22)
                .addComponent(Back)
                .addGap(46, 46, 46))
        );

        Easy.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EasyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EasyActionPerformed
        this.setVisible(false);
        Game_Easy game1 = new Game_Easy(easyseconds);
        game1.setVisible(true);
    }//GEN-LAST:event_EasyActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
    
        this.setVisible(false);
        Start start = new Start();
        start.setVisible(true);
    }//GEN-LAST:event_BackActionPerformed

    private void AverageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AverageActionPerformed
        this.setVisible(false);
        Game_Medium game2 = new Game_Medium(mediumseconds);
        game2.setVisible(true);
    }//GEN-LAST:event_AverageActionPerformed

    private void HardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HardActionPerformed
        this.setVisible(false);
        Game_Hard game3 = new Game_Hard(hardseconds);
        game3.setVisible(true);
    }//GEN-LAST:event_HardActionPerformed

    private void ExtremeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExtremeActionPerformed
        this.setVisible(false);
        Game_Extreme game4 = new Game_Extreme(extremeseconds);
        game4.setVisible(true);
    }//GEN-LAST:event_ExtremeActionPerformed

    private void SlangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SlangActionPerformed
        this.setVisible(false);
        Slang_Level game5 =  new Slang_Level();
        game5.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_SlangActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Game_Level.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game_Level.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game_Level.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game_Level.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Game_Level().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Average;
    private javax.swing.JButton Back;
    private javax.swing.JButton Easy;
    private javax.swing.JButton Extreme;
    private javax.swing.JButton Hard;
    private javax.swing.JButton Slang;
    // End of variables declaration//GEN-END:variables
}
