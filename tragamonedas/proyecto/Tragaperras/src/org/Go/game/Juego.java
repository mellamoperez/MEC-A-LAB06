package org.bolivia.game;

import javax.swing.JOptionPane;


public class Juego extends javax.swing.JFrame {

    JFigura jfa = new JFigura();
    JFigura jfb = new JFigura();
    JFigura jfc = new JFigura();
    
    /**
     * Creates new form Juego
     */
    public Juego() {
        initComponents();
        setTitle("Tragazorras v1.0 [http://www.jc-mouse.net/]");
        
        jFigA.add(jfa);
        jFigB.add(jfb);
        jFigC.add(jfc);
        
        lbEstado.setText("");              
        repaint();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jcMousePanel1 = new jcMousePanel.jcMousePanel();
        jFigA = new javax.swing.JPanel();
        jFigB = new javax.swing.JPanel();
        jFigC = new javax.swing.JPanel();
        lbEstado = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbCredito = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lbApuesta = new javax.swing.JTextField();
        lbBoton = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jcMousePanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/bolivia/game/res/bgt.jpg"))); // NOI18N
        jcMousePanel1.setPreferredSize(new java.awt.Dimension(700, 400));
        jcMousePanel1.setVisibleLogo(false);

        javax.swing.GroupLayout jFigALayout = new javax.swing.GroupLayout(jFigA);
        jFigA.setLayout(jFigALayout);
        jFigALayout.setHorizontalGroup(
            jFigALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jFigALayout.setVerticalGroup(
            jFigALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFigBLayout = new javax.swing.GroupLayout(jFigB);
        jFigB.setLayout(jFigBLayout);
        jFigBLayout.setHorizontalGroup(
            jFigBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jFigBLayout.setVerticalGroup(
            jFigBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFigCLayout = new javax.swing.GroupLayout(jFigC);
        jFigC.setLayout(jFigCLayout);
        jFigCLayout.setHorizontalGroup(
            jFigCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jFigCLayout.setVerticalGroup(
            jFigCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        lbEstado.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lbEstado.setForeground(new java.awt.Color(255, 255, 0));
        lbEstado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbEstado.setText("jLabel1");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CREDITO");

        lbCredito.setBackground(new java.awt.Color(0, 0, 0));
        lbCredito.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbCredito.setForeground(new java.awt.Color(255, 0, 0));
        lbCredito.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lbCredito.setText("1000");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("APUESTA");

        lbApuesta.setBackground(new java.awt.Color(0, 0, 0));
        lbApuesta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbApuesta.setForeground(new java.awt.Color(255, 0, 0));
        lbApuesta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lbApuesta.setText("100");

        lbBoton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/bolivia/game/res/boton.jpg"))); // NOI18N
        lbBoton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbBoton.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/org/bolivia/game/res/boton.jpg"))); // NOI18N
        lbBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbBotonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jcMousePanel1Layout = new javax.swing.GroupLayout(jcMousePanel1);
        jcMousePanel1.setLayout(jcMousePanel1Layout);
        jcMousePanel1Layout.setHorizontalGroup(
            jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jcMousePanel1Layout.createSequentialGroup()
                .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jcMousePanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(lbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jcMousePanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jFigA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jFigB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(jFigC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(61, 61, 61)
                .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2)
                        .addComponent(lbCredito, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                        .addComponent(lbApuesta))
                    .addComponent(lbBoton))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jcMousePanel1Layout.setVerticalGroup(
            jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jcMousePanel1Layout.createSequentialGroup()
                .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jcMousePanel1Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jFigC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFigB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFigA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(67, 67, 67)
                        .addComponent(lbEstado))
                    .addGroup(jcMousePanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbCredito, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbApuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(lbBoton)))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(jcMousePanel1, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbBotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbBotonMouseClicked
        lbEstado.setText("");        
        if( Integer.parseInt(lbApuesta.getText()) <= Integer.parseInt(lbCredito.getText()) )
        {
            lbBoton.setEnabled(false);
            PlayWorker pwA = new PlayWorker(jfa);
            pwA.execute();

            PlayWorker pwB = new PlayWorker(jfb);
            pwB.execute();

            PlayWorker pwC = new PlayWorker(jfc);
            pwC.execute();

            CheckWorker cw = new CheckWorker(pwA,pwB,pwC,lbEstado,lbCredito,lbApuesta,lbBoton);
            cw.execute();             
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Credito insuficiente!");
        }
    }//GEN-LAST:event_lbBotonMouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Juego().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jFigA;
    private javax.swing.JPanel jFigB;
    private javax.swing.JPanel jFigC;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private jcMousePanel.jcMousePanel jcMousePanel1;
    private javax.swing.JTextField lbApuesta;
    private javax.swing.JLabel lbBoton;
    private javax.swing.JTextField lbCredito;
    private javax.swing.JLabel lbEstado;
    // End of variables declaration//GEN-END:variables
}
