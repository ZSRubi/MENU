
package Programa;

import Restaurante.Carta;
import Restaurante.Cliente;
import Restaurante.TotalesPagar;
import static java.lang.Thread.sleep;
import javax.swing.JOptionPane;

final public class vistaCarta extends javax.swing.JFrame {
  
  Carta nCarta = new Carta();
  TotalesPagar toPagar = new TotalesPagar(); 
  String varComida;
  String varBebida;
  int varPrecioComida;
  int varPrecioBebida;
  int varPrecioTotal;
  
   public vistaCarta(java.awt.Frame parent, boolean modal) {
        initComponents();
        this.setSize(430,470);
        this.setResizable(false);          
    }

    private vistaCarta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBoxComidas = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxBebidas = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtrMensaje = new javax.swing.JTextPane();
        BotonFactura = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jComboBoxComidas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccionar-", "Teriyaki de Pescado", "Arroz De Mariscos", "Filete Playero", "Pulpo con Camarón en Salsa verde", "Camarones al Coco", "Pizza al horno Camarón", "Pizza al horno Marinera", "Almeja Chocolata" }));
        jComboBoxComidas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jComboBoxComidas.setName(""); // NOI18N
        jComboBoxComidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxComidasActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxComidas);
        jComboBoxComidas.setBounds(140, 150, 181, 33);

        jLabel1.setFont(new java.awt.Font("Blackadder ITC", 0, 80)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 51));
        jLabel1.setText("Carta");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(130, 20, 199, 78);

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Comidas");
        jLabel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Deliciosos Platos Para Ti", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(140, 90, 140, 54);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pngwing.com.png"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(330, 200, 80, 100);

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Bebidas");
        jLabel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Saborea La Felicidad", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(140, 210, 140, 54);

        jComboBoxBebidas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccionar-", "Coca Cola", "Coca Cola Sin Azúcar", "Pepsi", "Jugo Del Valle", "Sprite", "Fanta", "Agua Cielo", "Fuze Tea", "Powerade", "Avena Quaker", "Limonada", "Jugo Natural De Mango", "Jugo Natural De Fresa", "Jugo Natural De Mora", "Jugo Natural De Lulo" }));
        jComboBoxBebidas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jComboBoxBebidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxBebidasActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxBebidas);
        jComboBoxBebidas.setBounds(140, 270, 181, 33);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pngegg (2).png"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 110, 140, 120);

        btnAceptar.setBackground(new java.awt.Color(204, 204, 204));
        btnAceptar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAceptar);
        btnAceptar.setBounds(180, 320, 111, 20);

        jScrollPane1.setBackground(new java.awt.Color(255, 0, 51));

        jtrMensaje.setEditable(false);
        jtrMensaje.setBackground(new java.awt.Color(240, 240, 240));
        jtrMensaje.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 240, 240), 0));
        jtrMensaje.setFont(new java.awt.Font("Monospaced", 0, 13)); // NOI18N
        jScrollPane1.setViewportView(jtrMensaje);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(90, 350, 288, 40);

        BotonFactura.setBackground(new java.awt.Color(153, 153, 153));
        BotonFactura.setText("Ver Factura");
        BotonFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonFacturaActionPerformed(evt);
            }
        });
        getContentPane().add(BotonFactura);
        BotonFactura.setBounds(180, 410, 107, 20);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(1001, 216, 0, 0);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/gray-minimalistic-textures-wallpaper-preview.jpg"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 728, 455);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        
      //Condición if para comprobar que se haya escogido algún tipo de comida de la carta
      if(jComboBoxComidas.getSelectedItem().equals("-Seleccionar-")) if(jComboBoxBebidas.getSelectedItem().equals("-Seleccionar-")){
        
      JOptionPane.showMessageDialog(null, "Por favor escoga algo de nuestra carta");
      return;
      }  
        
      Carta.setComida((String) jComboBoxComidas.getSelectedItem()); //Se envía la selección del menú como atributo comida a la clase Carta
      Carta.setBebida((String) jComboBoxBebidas.getSelectedItem()); //Se envía la selección del menú como atributo bebida a la clase Carta
      
      varComida = (String) jComboBoxComidas.getSelectedItem(); //Se captura en una variable la selección de comidas
      varBebida = (String) jComboBoxBebidas.getSelectedItem(); //Se captura en una variable la selección de bebidas
      
    if(null == varComida) {} else switch (varComida) {
          case "-Seleccionar-":
              Carta.setPrecioComida(0); // Declaraciones
              varPrecioComida=0;
              System.out.print("Comida: "+Carta.getPrecioComida());
              break;
          case "Teriyaki de Pescado":
              Carta.setPrecioComida(10000);// Declaraciones
              varPrecioComida=10000;
              System.out.print("Comida: "+Carta.getPrecioComida());
              break;
          case "Arroz De Mariscos":
              Carta.setPrecioComida(10000);// Declaraciones
              varPrecioComida=10000;
              System.out.print("Comida: "+Carta.getPrecioComida());
              break;
          case "Filete Playero":
              Carta.setPrecioComida(10000);// Declaraciones
              varPrecioComida=10000;
              System.out.print("Comida: "+Carta.getPrecioComida());
              break;
          case "Pulpo con Camarón en Salsa verde":
              Carta.setPrecioComida(10000);// Declaraciones
              varPrecioComida=10000;
              System.out.print("Comida: "+Carta.getPrecioComida());
              break;
          case "Camarones al Coco":
              Carta.setPrecioComida(10000);// Declaraciones
              varPrecioComida=10000;
              System.out.print("Comida: "+Carta.getPrecioComida());
              break;
          case "Pizza al horno Camarón":
              Carta.setPrecioComida(10000);// Declaraciones
              varPrecioComida=10000;
              System.out.print("Comida: "+Carta.getPrecioComida());
              break;
          case "Pizza al horno Marinera":
              Carta.setPrecioComida(10000);// Declaraciones
              varPrecioComida=10000;
              System.out.print("Comida: "+Carta.getPrecioComida());
              break;
          case "Almeja Chocolata":
              Carta.setPrecioComida(10000);// Declaraciones
              varPrecioComida=10000;
              System.out.print("Comida: "+Carta.getPrecioComida());
              break;
          default:
              break;
      }
    
  

      
      
        // declaración de switch
        /*switch(varComida) {
            // declaración case
            // los valores deben ser del mismo tipo de la expresión
           case "-Seleccionar-" :
            Carta.setPrecioComida(0); // Declaraciones
            varPrecioComida=0;
            System.out.print("Comida: "+Carta.getPrecioComida());
            break; // break es opcional
            
            case "Teriyaki de Pescado" :
            Carta.setPrecioComida(10000);// Declaraciones
            varPrecioComida=10000;
            System.out.print("Comida: "+Carta.getPrecioComida());
            break; // break es opcional
            
            case "Arroz De Mariscos" :
            Carta.setPrecioComida(12000); // Declaraciones
            varPrecioComida=12000;
            System.out.print("Comida: "+Carta.getPrecioComida());
            break; // break es opcional
            
            case "Filete Playero" :
            Carta.setPrecioComida(10000);// Declaraciones
            varPrecioComida=10000;
            System.out.print("Comida: "+Carta.getPrecioComida());
            break; // break es opcional

            
            case "Pulpo con Camarón en Salsa verde" :
            Carta.setPrecioComida(17000); // Declaraciones
            varPrecioComida=17000;
            System.out.print("Comida: "+Carta.getPrecioComida());
            break; // break es opcional
            
            case "Camarones al Coco" :
            Carta.setPrecioComida(10000);// Declaraciones
            varPrecioComida=10000;
            System.out.print("Comida: "+Carta.getPrecioComida());
            break; // break es opcional
            
            case "Pizza al horno Camarón" :
            Carta.setPrecioComida(12000);
            varPrecioComida=12000;
            System.out.print("Comida: "+Carta.getPrecioComida());
            break; // break es opcional
            
            case "Pizza al horno Marinera" :
            Carta.setPrecioComida(12000); // Declaraciones
            varPrecioComida=12000;
            System.out.print("Comida: "+Carta.getPrecioComida());
            break; // break es opcional
            
            case "Almeja Chocolata" :
            Carta.setPrecioComida(9000);// Declaraciones
            varPrecioComida=9000;
            System.out.print("Comida: "+Carta.getPrecioComida());
            break; // break es opcional
            // default :
            // Declaraciones 
        }          */
        
        if(null == varBebida) {} else switch(varBebida) {
         
               // declaración case
               // los valores deben ser del mismo tipo de la expresión
               case "-Seleccionar-" :
                   Carta.setPrecioBebida(0); // Declaraciones
                   varPrecioBebida=0;
                   System.out.print("\n"+ "Bebida : "+Carta.getPrecioBebida());
                   varPrecioTotal = varPrecioComida + varPrecioBebida;
                   TotalesPagar.setPrecioTotal(varPrecioTotal);
                   System.out.print("\n"+ "Total a Pagar: "+TotalesPagar.getPrecioTotal());
                   break; // break es opcional
                   
               case "Coca Cola" :
                   Carta.setPrecioBebida(2500);// Declaraciones
                   varPrecioBebida=2500;
                   System.out.print("\n"+ "Bebida: "+Carta.getPrecioBebida());
                   varPrecioTotal = varPrecioComida + varPrecioBebida;
                   TotalesPagar.setPrecioTotal(varPrecioTotal);
                   System.out.print("\n"+ "Total a Pagar: "+TotalesPagar.getPrecioTotal());
                   break; // break es opcional
                   
               case "Coca Cola Sin Azúcar" :
                   Carta.setPrecioBebida(2300);// Declaraciones
                   varPrecioBebida=2300;
                   System.out.print("\n"+ "Bebida: "+Carta.getPrecioBebida());
                   varPrecioTotal = varPrecioComida + varPrecioBebida;
                   TotalesPagar.setPrecioTotal(varPrecioTotal);
                   System.out.print("\n"+ "Total a Pagar: "+TotalesPagar.getPrecioTotal());
                   break; // break es opcional
                   
               case "Pepsi" :
                   Carta.setPrecioBebida(2500);// Declaraciones
                   varPrecioBebida=2500;
                   System.out.print("\n"+ "Bebida: "+Carta.getPrecioBebida());
                   varPrecioTotal = varPrecioComida + varPrecioBebida;
                   TotalesPagar.setPrecioTotal(varPrecioTotal);
                   System.out.print("\n"+ "Total a Pagar: "+TotalesPagar.getPrecioTotal());
                   break; // break es opcional
                   
               case "Jugo Del Valle" :
                   Carta.setPrecioBebida(2000);// Declaraciones
                   varPrecioBebida=2000;
                   System.out.print("\n"+ "Bebida: "+Carta.getPrecioBebida());
                   varPrecioTotal = varPrecioComida + varPrecioBebida;
                   TotalesPagar.setPrecioTotal(varPrecioTotal);
                   System.out.print("\n"+ "Comida: "+TotalesPagar.getPrecioTotal());
                   break; // break es opcional
                   
               case "Sprite" :
                   Carta.setPrecioBebida(2100); // Declaraciones
                   varPrecioBebida=2100;
                   System.out.print("\n"+ "Bebida: "+Carta.getPrecioBebida());
                   varPrecioTotal = varPrecioComida + varPrecioBebida;
                   TotalesPagar.setPrecioTotal(varPrecioTotal);
                   System.out.print("\n"+ "Comida: "+TotalesPagar.getPrecioTotal());
                   break; // break es opcional
                   
               case "Fanta" :
                   Carta.setPrecioBebida(2000);// Declaraciones
                   varPrecioBebida=2000;
                   System.out.print("\n"+ "Bebida: "+Carta.getPrecioBebida());
                   varPrecioTotal = varPrecioComida + varPrecioBebida;
                   TotalesPagar.setPrecioTotal(varPrecioTotal);
                   System.out.print("\n"+ "Comida: "+TotalesPagar.getPrecioTotal());
                   break; // break es opcional
                   
               case "Agua Cielo" :
                   Carta.setPrecioBebida(1500);// Declaraciones
                   varPrecioBebida=1500;
                   System.out.print("\n"+ "Bebida: "+Carta.getPrecioBebida());
                   varPrecioTotal = varPrecioComida + varPrecioBebida;
                   TotalesPagar.setPrecioTotal(varPrecioTotal);
                   System.out.print("\n"+ "Comida: "+TotalesPagar.getPrecioTotal());
                   break; // break es opcional
                   
               case "Fuze Tea" :
                   Carta.setPrecioBebida(1900);// Declaraciones
                   varPrecioBebida=1900;
                   System.out.print("\n"+ "Bebida: "+Carta.getPrecioBebida());
                   varPrecioTotal = varPrecioComida + varPrecioBebida;
                   TotalesPagar.setPrecioTotal(varPrecioTotal);
                   System.out.print("\n"+ "Comida: "+TotalesPagar.getPrecioTotal());
                   break; // break es opcional
                   
               case "Powerade" :
                   Carta.setPrecioBebida(2000);// Declaraciones
                   varPrecioBebida=2000;
                   System.out.print("\n"+ "Bebida: "+Carta.getPrecioBebida());
                   varPrecioTotal = varPrecioComida + varPrecioBebida;
                   TotalesPagar.setPrecioTotal(varPrecioTotal);
                   System.out.print("\n"+ "Comida: "+TotalesPagar.getPrecioTotal());
                   break; // break es opcional
                   
               case "Avena Quaker" :
                   Carta.setPrecioBebida(2000);// Declaraciones
                   varPrecioBebida=2000;
                   System.out.print("\n"+ "Bebida: "+Carta.getPrecioBebida());
                   varPrecioTotal = varPrecioComida + varPrecioBebida;
                   TotalesPagar.setPrecioTotal(varPrecioTotal);
                   System.out.print("\n"+ "Comida: "+TotalesPagar.getPrecioTotal());
                   break; // break es opcional
                   
               case "Limonada" :
                   Carta.setPrecioBebida(1500); // Declaraciones
                   varPrecioBebida=1500;
                   System.out.print("\n"+ "Bebida: "+Carta.getPrecioBebida());
                   varPrecioTotal = varPrecioComida + varPrecioBebida;
                   TotalesPagar.setPrecioTotal(varPrecioTotal);
                   System.out.print("\n"+ "Comida: "+TotalesPagar.getPrecioTotal());
                   break; // break es opcional
                   
               case "Jugo Natural De Mango" :
                   Carta.setPrecioBebida(3000);// Declaraciones
                   varPrecioBebida=3000;
                   System.out.print("\n"+ "Bebida: "+Carta.getPrecioBebida());
                   varPrecioTotal = varPrecioComida + varPrecioBebida;
                   TotalesPagar.setPrecioTotal(varPrecioTotal);
                   System.out.print("\n"+ "Comida: "+TotalesPagar.getPrecioTotal());
                   break; // break es opcional
                   
               case "Jugo Natural De Fresa" :
                   Carta.setPrecioBebida(3500);// Declaraciones
                   varPrecioBebida=3500;
                   System.out.print("\n"+ "Bebida: "+Carta.getPrecioBebida());
                   varPrecioTotal = varPrecioComida + varPrecioBebida;
                   TotalesPagar.setPrecioTotal(varPrecioTotal);
                   System.out.print("\n"+ "Comida: "+TotalesPagar.getPrecioTotal());
                   break; // break es opcional
                   
               case "Jugo Natural De Mora" :
                   Carta.setPrecioBebida(3300);// Declaraciones
                   varPrecioBebida=3300;
                   System.out.print("\n"+ "Bebida: "+Carta.getPrecioBebida());
                   varPrecioTotal = varPrecioComida + varPrecioBebida;
                   TotalesPagar.setPrecioTotal(varPrecioTotal);
                   System.out.print("\n"+ "Comida: "+TotalesPagar.getPrecioTotal());
                   break; // break es opcional
                   
               case "Jugo Natural De Lulo" :
                   Carta.setPrecioBebida(3000);// Declaraciones
                   varPrecioBebida=3000;
                   System.out.print("\n"+ "Bebida: "+Carta.getPrecioBebida());
                   varPrecioTotal = varPrecioComida + varPrecioBebida;
                   TotalesPagar.setPrecioTotal(varPrecioTotal);
                   System.out.print("\n"+ "Comida: "+TotalesPagar.getPrecioTotal());
                   break; // break es opcional
                   //  default :
                   // Declaraciones
           }
      
     
      jtrMensaje.setText("Que disfrute de nuestras delicias!!");
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void jComboBoxComidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxComidasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxComidasActionPerformed

    private void jComboBoxBebidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxBebidasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxBebidasActionPerformed

    private void BotonFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonFacturaActionPerformed
    
        //Instrucciones al botón para ir a la siguiente vista
        vistaTotalPagar vistaPagar = new vistaTotalPagar(this,true);
        vistaPagar.setVisible(true);
        dispose();
    }//GEN-LAST:event_BotonFacturaActionPerformed

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
            java.util.logging.Logger.getLogger(vistaCarta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vistaCarta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vistaCarta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vistaCarta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vistaCarta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonFactura;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JComboBox<String> jComboBoxBebidas;
    private javax.swing.JComboBox<String> jComboBoxComidas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jtrMensaje;
    // End of variables declaration//GEN-END:variables

}
