/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Clientes extends javax.swing.JFrame {

    /**
     * Creates new form Clientes
     */
    public Clientes() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtprimerNombre = new javax.swing.JTextField();
        txtcodigoFacultad = new javax.swing.JTextField();
        txtsegundoNombre = new javax.swing.JTextField();
        txtsegundoApellido = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtprimerApellido = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txttelefonoCliente = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtcorreoCliente = new javax.swing.JTextField();
        btnguardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Ingreso Clientes");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Primer nombre");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Segundo nombre");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Codigo facultad");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Segundo apellido");

        txtprimerNombre.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtprimerNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtprimerNombreKeyPressed(evt);
            }
        });

        txtcodigoFacultad.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtcodigoFacultad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcodigoFacultadKeyPressed(evt);
            }
        });

        txtsegundoNombre.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtsegundoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsegundoNombreActionPerformed(evt);
            }
        });
        txtsegundoNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtsegundoNombreKeyPressed(evt);
            }
        });

        txtsegundoApellido.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtsegundoApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtsegundoApellidoKeyPressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Primer apellido");

        txtprimerApellido.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtprimerApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtprimerApellidoKeyPressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Telefono");

        txttelefonoCliente.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txttelefonoCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txttelefonoClienteKeyPressed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Correo");

        txtcorreoCliente.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        btnguardar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnguardar.setText("Guardar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel4)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtprimerNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtprimerApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcodigoFacultad, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(137, 137, 137)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txtsegundoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(txtsegundoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txttelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(txtcorreoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(238, 238, 238))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnguardar)
                        .addGap(348, 348, 348))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(txtprimerNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtsegundoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtsegundoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtprimerApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txtcodigoFacultad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txttelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtcorreoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(btnguardar)
                .addGap(55, 55, 55))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        
        Conectar con=new Conectar();
        Connection reg=con.getConnection();
        
        try{
                PreparedStatement obj = reg.prepareStatement("INSERT INTO cliente (primerNombreCliente,segundoNombreCliente,primerApellidoCliente,segundoApellidoCliente,codigoFacultad,telefonoCliente,correoCliente) values(?,?,?,?,?,?,?)");
                
                obj.setString(1,this.txtprimerNombre.getText());
                obj.setString(2,this.txtsegundoNombre.getText());
                obj.setString(3,this.txtprimerApellido.getText());
                obj.setString(4,this.txtsegundoApellido.getText());
                obj.setString(5,this.txtcodigoFacultad.getText());
                obj.setString(6,this.txttelefonoCliente.getText());
                obj.setString(7,this.txtcorreoCliente.getText());
                obj.executeUpdate();
                JOptionPane.showMessageDialog(null, "Guardado con exito");
        }
        
        catch(SQLException ex)
        {
            Logger.getLogger(facultad.class.getName()).log(Level.SEVERE,null,ex);
        }
        
    }//GEN-LAST:event_btnguardarActionPerformed

    private void txtsegundoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsegundoNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsegundoNombreActionPerformed

    private void txtprimerNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprimerNombreKeyPressed
        char c=evt.getKeyChar(); 
             
         
          if(Character.isDigit(c)) { 
              getToolkit().beep(); 
               
              evt.consume(); 
               
              JOptionPane.showMessageDialog(null, "Ingrese solo letras");
              this.txtprimerNombre.setText(""); 
          }
    }//GEN-LAST:event_txtprimerNombreKeyPressed

    private void txtsegundoNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsegundoNombreKeyPressed
        char c=evt.getKeyChar(); 
             
         
          if(Character.isDigit(c)) { 
              getToolkit().beep(); 
               
              evt.consume(); 
               
              JOptionPane.showMessageDialog(null, "Ingrese solo letras");
              this.txtsegundoNombre.setText(""); 
          }
    }//GEN-LAST:event_txtsegundoNombreKeyPressed

    private void txtprimerApellidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprimerApellidoKeyPressed
        char c=evt.getKeyChar(); 
             
         
          if(Character.isDigit(c)) { 
              getToolkit().beep(); 
               
              evt.consume(); 
               
              JOptionPane.showMessageDialog(null, "Ingrese solo letras");
               this.txtprimerApellido.setText("");
          }
    }//GEN-LAST:event_txtprimerApellidoKeyPressed

    private void txtsegundoApellidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsegundoApellidoKeyPressed
        char c=evt.getKeyChar(); 
             
         
          if(Character.isDigit(c)) { 
              getToolkit().beep(); 
               
              evt.consume(); 
               
              JOptionPane.showMessageDialog(null, "Ingrese solo letras");
               this.txtsegundoApellido.setText("");
          }
    }//GEN-LAST:event_txtsegundoApellidoKeyPressed

    private void txtcodigoFacultadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcodigoFacultadKeyPressed
        char a=evt.getKeyChar();
        if(Character.isLetter(a))
        {
           
            getToolkit().beep(); 
               
            evt.consume(); 
               
            JOptionPane.showMessageDialog(null, "Ingrese solo Numeros");
            this.txtcodigoFacultad.setText("");
        }
    }//GEN-LAST:event_txtcodigoFacultadKeyPressed

    private void txttelefonoClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelefonoClienteKeyPressed
        char a=evt.getKeyChar();
        if(Character.isLetter(a))
        {
           
            getToolkit().beep(); 
               
            evt.consume(); 
               
            JOptionPane.showMessageDialog(null, "Ingrese solo Numeros");
            this.txttelefonoCliente.setText("");
        }
    }//GEN-LAST:event_txttelefonoClienteKeyPressed

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
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Clientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnguardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtcodigoFacultad;
    private javax.swing.JTextField txtcorreoCliente;
    private javax.swing.JTextField txtprimerApellido;
    private javax.swing.JTextField txtprimerNombre;
    private javax.swing.JTextField txtsegundoApellido;
    private javax.swing.JTextField txtsegundoNombre;
    private javax.swing.JTextField txttelefonoCliente;
    // End of variables declaration//GEN-END:variables
}
