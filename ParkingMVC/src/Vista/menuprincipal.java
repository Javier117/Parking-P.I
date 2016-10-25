/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class menuprincipal extends javax.swing.JFrame {

    private boolean MenuMoto;
    private boolean MenuBici;
    private boolean MenuCamioneta;
    private boolean MenuCarro;
    
    
    
    public menuprincipal() {
        initComponents();
        setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LBLTitulo = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        JTFPlaca = new javax.swing.JTextField();
        JLBLPlaca = new javax.swing.JLabel();
        JTFModelo = new javax.swing.JTextField();
        JTFNom_dueño = new javax.swing.JTextField();
        JLBLtipo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        JLBLNom_owner = new javax.swing.JLabel();
        JCBTipo_de_Vehiculo = new javax.swing.JComboBox<>();
        JBTNCerrar = new javax.swing.JButton();
        JLBLFecha = new javax.swing.JLabel();
        JLBLFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LBLTitulo.setFont(new java.awt.Font("Copperplate Gothic Light", 2, 48)); // NOI18N
        LBLTitulo.setForeground(new java.awt.Color(255, 255, 255));
        LBLTitulo.setText("Parking");
        getContentPane().add(LBLTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 233, 42));

        jButton1.setText("Retirar");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 120, 30));

        jButton2.setText("Ingresar");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, 120, 30));

        JTFPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFPlacaActionPerformed(evt);
            }
        });
        getContentPane().add(JTFPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 230, -1));

        JLBLPlaca.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JLBLPlaca.setForeground(new java.awt.Color(255, 255, 255));
        JLBLPlaca.setText("Placa:");
        getContentPane().add(JLBLPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 200, -1));

        JTFModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFModeloActionPerformed(evt);
            }
        });
        getContentPane().add(JTFModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 230, -1));
        getContentPane().add(JTFNom_dueño, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 230, -1));

        JLBLtipo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JLBLtipo.setForeground(new java.awt.Color(255, 255, 255));
        JLBLtipo.setText("Tipo:");
        getContentPane().add(JLBLtipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 190, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Modelo:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 170, -1));

        JLBLNom_owner.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JLBLNom_owner.setForeground(new java.awt.Color(255, 255, 255));
        JLBLNom_owner.setText("Numero de _____:");
        getContentPane().add(JLBLNom_owner, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 170, -1));

        JCBTipo_de_Vehiculo.setEditable(true);
        JCBTipo_de_Vehiculo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JCBTipo_de_Vehiculo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Carro", "Moto", "Camioneta", "Bicicleta" }));
        JCBTipo_de_Vehiculo.setFocusable(false);
        getContentPane().add(JCBTipo_de_Vehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 230, -1));

        JBTNCerrar.setText("Cerrar");
        JBTNCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTNCerrarActionPerformed(evt);
            }
        });
        getContentPane().add(JBTNCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, -1, -1));

        JLBLFecha.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        JLBLFecha.setForeground(new java.awt.Color(255, 255, 255));
        JLBLFecha.setText("--:--:--");
        getContentPane().add(JLBLFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 270, 40));

        JLBLFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo2.jpg"))); // NOI18N
        getContentPane().add(JLBLFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-110, -10, 750, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTFModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFModeloActionPerformed

    private void JTFPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFPlacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFPlacaActionPerformed

    private void JBTNCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTNCerrarActionPerformed
        
        System.exit(0);
        
    }//GEN-LAST:event_JBTNCerrarActionPerformed

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
            java.util.logging.Logger.getLogger(menuprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuprincipal().setVisible(true);
            }
        });
    }

    
    
    
public void ConfigurarMenu(int Numero_menu)
{
    switch(Numero_menu)
    {   
        // cero:configura menu para ingresar  carros
        // uno: para motos        dos:para camionetas
        // tres: para bicicletas
        case 0:this.JCBTipo_de_Vehiculo.setSelectedIndex(0);break;
        case 1:this.JCBTipo_de_Vehiculo.setSelectedIndex(1);break;
        case 2:this.JCBTipo_de_Vehiculo.setSelectedIndex(2);break;
        case 3:this.JCBTipo_de_Vehiculo.setSelectedIndex(3);this.JLBLPlaca.setText("Número de Marco:");break;
        default:JOptionPane.showMessageDialog(null,"Error al ingresar a menu"); break;
    
    }
    definirfecha();
    
}    
    
    
    
    
    public void definirfecha()
    {
        Calendar fecha = Calendar.getInstance();
        int mes = fecha.get(Calendar.MONTH) + 1;
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        int hora = fecha.get(Calendar.HOUR_OF_DAY);
        int minuto = fecha.get(Calendar.MINUTE);
        this.JLBLFecha.setText("Mes: "+mes+"|Día: "+dia+" |Hora "+hora+":"+minuto);
    
    }
    
    public boolean isMenuMoto() {
        return MenuMoto;
    }

    public void setMenuMoto(boolean MenuMoto) {
        this.MenuMoto = MenuMoto;
    }

    public boolean isMenuBici() {
        return MenuBici;
    }

    public void setMenuBici(boolean MenuBici) {
        this.MenuBici = MenuBici;
    }

    public boolean isMenuCamioneta() {
        return MenuCamioneta;
    }

    public void setMenuCamioneta(boolean MenuCamioneta) {
        this.MenuCamioneta = MenuCamioneta;
    }

    public boolean isMenuCarro() {
        return MenuCarro;
    }

    public void setMenuCarro(boolean MenuCarro) {
        this.MenuCarro = MenuCarro;
    }
   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBTNCerrar;
    private javax.swing.JComboBox<String> JCBTipo_de_Vehiculo;
    private javax.swing.JLabel JLBLFecha;
    private javax.swing.JLabel JLBLFondo;
    private javax.swing.JLabel JLBLNom_owner;
    private javax.swing.JLabel JLBLPlaca;
    private javax.swing.JLabel JLBLtipo;
    private javax.swing.JTextField JTFModelo;
    private javax.swing.JTextField JTFNom_dueño;
    private javax.swing.JTextField JTFPlaca;
    private javax.swing.JLabel LBLTitulo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
