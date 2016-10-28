/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import BO.*;
import controlador.controller;
import java.util.Calendar;
import javax.swing.ImageIcon;
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
    controller control;
    Vehiculo vehiculo;
    bicicleta Bici;
    int hora;
    int minuto;
   
    
    
    public menuprincipal() {
        initComponents();
        control =new controller();
        setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon(getClass().getResource("../imagenes/carro.png")).getImage());
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LBLTitulo = new javax.swing.JLabel();
        JBTNRetirar = new javax.swing.JButton();
        JBTNIngresar = new javax.swing.JButton();
        JTFPlaca = new javax.swing.JTextField();
        JLBLPlaca = new javax.swing.JLabel();
        JTFModelo = new javax.swing.JTextField();
        JTFPropietario = new javax.swing.JTextField();
        JLBLtipo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        JLBLNom_owner = new javax.swing.JLabel();
        JCBTipo_de_Vehiculo = new javax.swing.JComboBox<>();
        JBTNCerrar = new javax.swing.JButton();
        JLBLFecha = new javax.swing.JLabel();
        JBTNVolver = new javax.swing.JButton();
        JBTNCupos = new javax.swing.JButton();
        JLBLFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LBLTitulo.setFont(new java.awt.Font("Copperplate Gothic Light", 2, 48)); // NOI18N
        LBLTitulo.setForeground(new java.awt.Color(255, 255, 255));
        LBLTitulo.setText("Parking");
        getContentPane().add(LBLTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 233, 42));

        JBTNRetirar.setText("Retirar");
        JBTNRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTNRetirarActionPerformed(evt);
            }
        });
        getContentPane().add(JBTNRetirar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 120, 30));

        JBTNIngresar.setText("Ingresar");
        JBTNIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTNIngresarActionPerformed(evt);
            }
        });
        getContentPane().add(JBTNIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, 120, 30));

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

        JTFModelo.setToolTipText("");
        JTFModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFModeloActionPerformed(evt);
            }
        });
        getContentPane().add(JTFModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 230, -1));

        JTFPropietario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTFPropietarioKeyTyped(evt);
            }
        });
        getContentPane().add(JTFPropietario, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 230, -1));

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
        JLBLNom_owner.setText("Propietario:");
        getContentPane().add(JLBLNom_owner, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 170, -1));

        JCBTipo_de_Vehiculo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JCBTipo_de_Vehiculo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Carro", "Moto", "Camioneta", "Bicicleta" }));
        JCBTipo_de_Vehiculo.setFocusable(false);
        JCBTipo_de_Vehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBTipo_de_VehiculoActionPerformed(evt);
            }
        });
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
        getContentPane().add(JLBLFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 270, 40));

        JBTNVolver.setText("Volver");
        JBTNVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTNVolverActionPerformed(evt);
            }
        });
        getContentPane().add(JBTNVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 70, -1));

        JBTNCupos.setText("Cupos");
        JBTNCupos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTNCuposActionPerformed(evt);
            }
        });
        getContentPane().add(JBTNCupos, new org.netbeans.lib.awtextra.AbsoluteConstraints(343, 10, 70, -1));

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

    private void JBTNVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTNVolverActionPerformed
        
        MenuIngreso menu=new MenuIngreso();
        menu.setVisible(true);
        dispose();
        
        
        
    }//GEN-LAST:event_JBTNVolverActionPerformed

    private void JBTNIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTNIngresarActionPerformed
     
       if(ConfirmarCampos())
        {
           ingresar();
           
        }
       JTFPlaca.setText("");
       JTFPlaca.requestFocus();
        
    }//GEN-LAST:event_JBTNIngresarActionPerformed

    private void JBTNRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTNRetirarActionPerformed
       
         if(ConfirmarCampos())
        {
            switch(JCBTipo_de_Vehiculo.getSelectedIndex())
            {
                case 0:break;
                case 1:break;
                case 2:break;
                case 3:control.RetirarBiciController(JTFPlaca.getText(),JTFPropietario.getText());break;
                
            }        
        }
        
    }//GEN-LAST:event_JBTNRetirarActionPerformed

    private void JCBTipo_de_VehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBTipo_de_VehiculoActionPerformed
       
        
        
    }//GEN-LAST:event_JCBTipo_de_VehiculoActionPerformed

    private void JBTNCuposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTNCuposActionPerformed
      
        
          
            System.out.println("Cupos carros: "+control.revisar_parkingController(0));
            System.out.println("Cupos motos: "+control.revisar_parkingController(1));
            System.out.println("Cupos camionetas: "+control.revisar_parkingController(2));
            System.out.println("Cupos bicicletas: "+control.revisar_parkingBicisController());
                
        
        
    }//GEN-LAST:event_JBTNCuposActionPerformed

    private void JTFPropietarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFPropietarioKeyTyped
        // TODO add your handling code here:
            char c=evt.getKeyChar(); 
             
         
          if(Character.isDigit(c)) { 
              getToolkit().beep(); 
               
              evt.consume(); 
               
              JOptionPane.showMessageDialog(null, "Solo Se Admiten Letras");
               
          } 
             
                     
        
    }//GEN-LAST:event_JTFPropietarioKeyTyped

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
        case 3:this.JCBTipo_de_Vehiculo.setSelectedIndex(3);this.JLBLPlaca.setText("Número de Marco:");JTFModelo.setEditable(false);
                                                            JCBTipo_de_Vehiculo.setEnabled(false);break;
        default:JOptionPane.showMessageDialog(null,"Error al ingresar a menu"); break;
    
    }
    definirfecha();
    
}    
    
    
    
    
    public void definirfecha()
    {
        Calendar fecha = Calendar.getInstance();
        int mes = fecha.get(Calendar.MONTH) + 1;
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        hora = fecha.get(Calendar.HOUR_OF_DAY);
        minuto = fecha.get(Calendar.MINUTE);
        this.JLBLFecha.setText("Mes: "+mes+"|Día: "+dia+" |Hora "+hora+":"+minuto);
    
    }
    
    
    private boolean ConfirmarCampos()
    {   
        boolean CamposLlenos=true;
         if (JTFPlaca.getText().equals("")||JTFPlaca.getText().equals(" ")||JTFPropietario.getText().equals("")||JTFPropietario.getText().equals(" "))
            {
                JOptionPane.showMessageDialog(null,"Por favor llene todos los campos","Error en los campos",JOptionPane.ERROR_MESSAGE);
                CamposLlenos=false;
            }
         if(JTFModelo.isEditable())
         {
             if(JTFModelo.getText().equals("")||JTFModelo.getText().equals(" ")) CamposLlenos=false;
         }
         else CamposLlenos=true;
             
         return CamposLlenos;
    }
    
    
    
    private void ingresar()
    {   
        
        switch(this.JCBTipo_de_Vehiculo.getSelectedIndex())
        {
            case 0:
                {
                   vehiculo=new Vehiculo(JTFPlaca.getText(),JTFPropietario.getText(),JTFModelo.getText(),hora,minuto);
                   System.out.println("carro "+vehiculo.getPlaca()); 
                   control.ingresarVehiculoController(0, vehiculo);
                }
                break;
            case 1:
                {
                    vehiculo=new Vehiculo(JTFPlaca.getText(),JTFPropietario.getText(),JTFModelo.getText(),hora,minuto);
                    System.out.println("moto "+vehiculo.getPlaca());
                    control.ingresarVehiculoController(1, vehiculo);
                }break;
            case 2:
                {
                     vehiculo=new Vehiculo(JTFPlaca.getText(),JTFPropietario.getText(),JTFModelo.getText(),hora,minuto);
                    System.out.println("camioneta "+vehiculo.getPlaca());
                    control.ingresarVehiculoController(2, vehiculo);
                }break;
                
                
                // FALTA EL DE BICICLETAS
            case 3:
                {   
                    Bici=new bicicleta(JTFPlaca.getText(),JTFPropietario.getText(),hora,minuto);
                    System.out.println("Bicicleta "+Bici.getMarco());
                    control.ingresarBicisController(Bici);
                }break;
        }
    
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
    private javax.swing.JButton JBTNCupos;
    private javax.swing.JButton JBTNIngresar;
    private javax.swing.JButton JBTNRetirar;
    private javax.swing.JButton JBTNVolver;
    private javax.swing.JComboBox<String> JCBTipo_de_Vehiculo;
    private javax.swing.JLabel JLBLFecha;
    private javax.swing.JLabel JLBLFondo;
    private javax.swing.JLabel JLBLNom_owner;
    private javax.swing.JLabel JLBLPlaca;
    private javax.swing.JLabel JLBLtipo;
    private javax.swing.JTextField JTFModelo;
    private javax.swing.JTextField JTFPlaca;
    private javax.swing.JTextField JTFPropietario;
    private javax.swing.JLabel LBLTitulo;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
