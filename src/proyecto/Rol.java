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
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author luisa
 */
public class Rol extends javax.swing.JFrame {
 String permisos="";
    /**
     * Creates new form Rol
     */
    public Rol() {
        initComponents();
       this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel8 = new javax.swing.JLabel();
        btnguardar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        chkEmpleados = new javax.swing.JCheckBox();
        chkUsuarios = new javax.swing.JCheckBox();
        chkPrestamos = new javax.swing.JCheckBox();
        chkInventario = new javax.swing.JCheckBox();
        txtnombre = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        lblCodigo1 = new javax.swing.JLabel();
        chkClientes = new javax.swing.JCheckBox();
        chkMantenimientos = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        txtBuscar = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbMarcas = new javax.swing.JTable();
        btnActualizar = new javax.swing.JButton();
        RegresarBtn = new javax.swing.JButton();

        jMenuItem1.setText("Modificar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel8.setText("Mantenimiento Rol");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 47, -1, -1));

        btnguardar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnguardar.setText("Guardar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Nombre del rol:");

        chkEmpleados.setText("Registrar Empleados");
        chkEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkEmpleadosActionPerformed(evt);
            }
        });

        chkUsuarios.setText("Registrar Usuarios");

        chkPrestamos.setText("Prestamo de Laboratorios");

        chkInventario.setText("Manejar Inventario");

        txtnombre.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });
        txtnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreKeyTyped(evt);
            }
        });

        txtCodigo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtCodigo.setEnabled(false);
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });
        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoKeyTyped(evt);
            }
        });

        lblCodigo1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblCodigo1.setText("Codigo:");

        chkClientes.setText("Registro Clientes");

        chkMantenimientos.setText("Mantenimientos");
        chkMantenimientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkMantenimientosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(lblCodigo1)
                        .addGap(11, 11, 11)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(chkClientes)
                                .addGap(30, 30, 30))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(chkUsuarios)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkPrestamos)
                            .addComponent(chkInventario)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1)
                        .addGap(4, 4, 4)
                        .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(chkEmpleados)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chkMantenimientos)))
                .addGap(170, 170, 170))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCodigo1)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkEmpleados)
                    .addComponent(chkMantenimientos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkInventario)
                    .addComponent(chkUsuarios))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(chkPrestamos)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 410, 210));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });
        jPanel2.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 160, 30));

        lblNombre.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblNombre.setText("Nombre del rol: ");
        jPanel2.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        tbMarcas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbMarcas.setComponentPopupMenu(jPopupMenu1);
        jScrollPane2.setViewportView(tbMarcas);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 500, 400));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, 520, 530));

        btnActualizar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.setEnabled(false);
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, -1, -1));

        RegresarBtn.setText("Regresar");
        RegresarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarBtnActionPerformed(evt);
            }
        });
        getContentPane().add(RegresarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreActionPerformed

    private void chkEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkEmpleadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkEmpleadosActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
       
       if(this.txtnombre.getText().equals(""))
        {
          JOptionPane.showMessageDialog(null, "Llene todos los campos");
          return;
        }
       if(this.chkEmpleados.isSelected()==false&&this.chkUsuarios.isSelected()==false&&this.chkInventario.isSelected()==false&&this.chkPrestamos.isSelected()==false)       
       {
          JOptionPane.showMessageDialog(null, "Seleccione por lo menos un tipo de permiso");
          return; 
       }
      Conectar con=new Conectar();
      Connection reg=con.getConnection();    

        try
           {
               
             String rol = this.txtnombre.getText().toUpperCase();
             String nombreRol = "";
             String sql = "select * FROM rol where nombreRol ='" +rol+"'"; 
             Statement st = reg.createStatement();
             ResultSet rs = st.executeQuery(sql);
             while(rs.next())
             {
                 nombreRol = rs.getString("nombreRol");
             }
            
            if(rol.equals(nombreRol))
             {
               JOptionPane.showMessageDialog(null, "Rol ya existente");
             }
        
            else
                 {  
            if(this.chkEmpleados.isSelected())
           permisos=permisos+"A";
       if(this.chkUsuarios.isSelected())
           permisos=permisos+"B";
       if(this.chkClientes.isSelected())
           permisos=permisos+"C";
       if(this.chkMantenimientos.isSelected())
           permisos=permisos+"D";
        if(this.chkInventario.isSelected())
           permisos=permisos+"E";
        if(this.chkPrestamos.isSelected())
           permisos=permisos+"F";
            
            PreparedStatement obj=reg.prepareStatement("INSERT INTO rol(nombreRol, permisosRol) values(?,?)");
            obj.setString(1,rol);
            obj.setString(2,permisos);
            obj.executeUpdate();
            JOptionPane.showMessageDialog(null, "Guardado con exito");
            permisos="";
            mostrarDatos("");
                 }
           }
        catch(SQLException ex)
           {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
           }
        
    }//GEN-LAST:event_btnguardarActionPerformed

    private void txtnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyTyped
        // TODO add your handling code here:
         char c = evt.getKeyChar();
        
        if((c < 'a' || c > 'z') && (c < 'A' || c > 'Z' )) evt.consume();
    }//GEN-LAST:event_txtnombreKeyTyped

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        
        Conectar con=new Conectar();
        Connection reg=con.getConnection();
        
        if(this.txtnombre.getText().equals(""))
        {
          JOptionPane.showMessageDialog(null, "Llene todos los campos");
          return;
        }
       if(this.chkEmpleados.isSelected()==false&&this.chkUsuarios.isSelected()==false&&this.chkInventario.isSelected()==false&&this.chkPrestamos.isSelected()==false)       
       {
          JOptionPane.showMessageDialog(null, "Seleccione por lo menos un tipo de permiso");
          return; 
       }
      
       
       if(this.chkEmpleados.isSelected())
           permisos=permisos+"A";
       if(this.chkUsuarios.isSelected())
           permisos=permisos+"B";
       if(this.chkClientes.isSelected())
           permisos=permisos+"C";
       if(this.chkMantenimientos.isSelected())
           permisos=permisos+"D";
        if(this.chkInventario.isSelected())
           permisos=permisos+"E";
        if(this.chkPrestamos.isSelected())
           permisos=permisos+"F";
        
        
        try
        {
            PreparedStatement obj=reg.prepareStatement("UPDATE rol SET nombreRol='"+this.txtnombre.getText()+"',permisosRol='"+permisos+"'WHERE codigoRol='"+this.txtCodigo.getText()+"'");
            obj.executeUpdate();
            JOptionPane.showMessageDialog(null, "Guardado con exito");
            permisos="";
            mostrarDatos("");

            this.txtCodigo.setText("");
            this.txtnombre.setText("");
            this.chkEmpleados.setSelected(false);
            this.chkUsuarios.setSelected(false);
            this.chkInventario.setSelected(false);
            this.chkPrestamos.setSelected(false);
            this.txtBuscar.setText("");
            

        }
        catch(SQLException ex)
        {
            Logger.getLogger(marca.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnActualizarActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void txtCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyTyped
        char c = evt.getKeyChar();

        if((c < '0' || c > '9')) evt.consume();
    }//GEN-LAST:event_txtCodigoKeyTyped

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        mostrarDatos(txtBuscar.getText());
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void RegresarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarBtnActionPerformed
        // TODO add your handling code here:
        Mantenimientos men = new Mantenimientos();

        men.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_RegresarBtnActionPerformed

    private void chkMantenimientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkMantenimientosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkMantenimientosActionPerformed

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
            java.util.logging.Logger.getLogger(Rol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rol().setVisible(true);
            }
        });
    }
    
    void mostrarDatos( String valor){
        DefaultTableModel modelo  = new DefaultTableModel(); 
        
        modelo.addColumn("Codigo");
        modelo.addColumn("Nombre");
        modelo.addColumn("Permisos");
        tbMarcas.setModel(modelo);
        String sql = "";
        if(valor.equals(""))
        {
        sql = "Select * from rol";
        }
        else{
        sql = "Select * from rol where nombreRol like  '"+valor+"%' ";
        }
        String []datos = new String[3];
        
        Conectar con=new Conectar();
        Connection reg=con.getConnection();
        
        try {
            Statement st = reg.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
            datos[0] = rs.getString(1);
            datos[1] = rs.getString(2);
            datos[2] = rs.getString(3);
            modelo.addRow(datos);
            
            }
            tbMarcas.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(marca.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RegresarBtn;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JCheckBox chkClientes;
    private javax.swing.JCheckBox chkEmpleados;
    private javax.swing.JCheckBox chkInventario;
    private javax.swing.JCheckBox chkMantenimientos;
    private javax.swing.JCheckBox chkPrestamos;
    private javax.swing.JCheckBox chkUsuarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCodigo1;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JTable tbMarcas;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}
