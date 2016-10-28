/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.ImageIcon;



/**
 *
 * @author usuario
 */
public class MenuIngreso extends javax.swing.JFrame {

    menuprincipal MainMenu;
    
    
    public MenuIngreso() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon(getClass().getResource("../imagenes/icon.png")).getImage());
        MainMenu=new menuprincipal();
    }

  
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JBTNBicicleta = new javax.swing.JButton();
        JBTNMoto = new javax.swing.JButton();
        JBTNCamioneta = new javax.swing.JButton();
        JBTNCarro = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        JLBLFondo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JBTNBicicleta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bike_icono.png"))); // NOI18N
        JBTNBicicleta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBTNBicicleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTNBicicletaActionPerformed(evt);
            }
        });
        getContentPane().add(JBTNBicicleta, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 250, 170, 130));

        JBTNMoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/moto_icono.png"))); // NOI18N
        JBTNMoto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBTNMoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTNMotoActionPerformed(evt);
            }
        });
        getContentPane().add(JBTNMoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, 170, 130));

        JBTNCamioneta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/camioneta_icono.png"))); // NOI18N
        JBTNCamioneta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBTNCamioneta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTNCamionetaActionPerformed(evt);
            }
        });
        getContentPane().add(JBTNCamioneta, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 170, 130));

        JBTNCarro.setBackground(new java.awt.Color(204, 204, 204));
        JBTNCarro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/carro_icono.png"))); // NOI18N
        JBTNCarro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBTNCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTNCarroActionPerformed(evt);
            }
        });
        getContentPane().add(JBTNCarro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 170, 130));

        jLabel1.setFont(new java.awt.Font("Lucida Calligraphy", 2, 36)); // NOI18N
        jLabel1.setText("Parking 24/7");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 260, 40));

        JLBLFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.jpg"))); // NOI18N
        getContentPane().add(JLBLFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-120, 0, 900, 440));

        jMenu1.setText("Archivo");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Salir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBTNBicicletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTNBicicletaActionPerformed
       
        MainMenu.ConfigurarMenu(3);
        MainMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_JBTNBicicletaActionPerformed

    private void JBTNCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTNCarroActionPerformed
       
        MainMenu.ConfigurarMenu(0);
        MainMenu.setVisible(true);
        dispose();
        
        
    }//GEN-LAST:event_JBTNCarroActionPerformed

    private void JBTNMotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTNMotoActionPerformed
        
        MainMenu.ConfigurarMenu(1);
        MainMenu.setVisible(true);
        dispose();
        
        
    }//GEN-LAST:event_JBTNMotoActionPerformed

    private void JBTNCamionetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTNCamionetaActionPerformed
        
        MainMenu.ConfigurarMenu(2);
        MainMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_JBTNCamionetaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        
        System.exit(0);
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(MenuIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuIngreso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBTNBicicleta;
    private javax.swing.JButton JBTNCamioneta;
    private javax.swing.JButton JBTNCarro;
    private javax.swing.JButton JBTNMoto;
    private javax.swing.JLabel JLBLFondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
}
