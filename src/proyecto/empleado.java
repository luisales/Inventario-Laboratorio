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
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * hola luis ya no  
 */
public class empleado extends javax.swing.JFrame {

    public static String cod;
    public empleado() {
        initComponents();
        setLocationRelativeTo(null);
        this.jPanel1.setVisible(false);
        this.labelmod.setVisible(false);
        this.labelreg.setVisible(false);
        this.btnActualizar.setVisible(false);
        this.btnguardar.setVisible(true);
        this.btnbuscar.setVisible(true);
        this.labelcod.setVisible(false);
        this.txtcodigo.setVisible(false);
        
        mostrarDatos("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ModificarMenuItem = new javax.swing.JPopupMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        txtnombre1 = new javax.swing.JTextField();
        labelemp = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        txtape2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtape1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txttel = new javax.swing.JTextField();
        txtid = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtcorreo1 = new javax.swing.JTextField();
        labelrol = new javax.swing.JLabel();
        txtrol = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        dataRol = new javax.swing.JTable();
        labelmod = new javax.swing.JLabel();
        labelreg = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JButton();
        txtnombre3 = new javax.swing.JTextField();
        labelcod = new javax.swing.JLabel();
        RegresarBtn = new javax.swing.JButton();
        btnguardar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        btnMostrarT = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnbuscar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbEmpleado = new javax.swing.JTable();

        jMenuItem2.setText("Modificar bb :*");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        ModificarMenuItem.add(jMenuItem2);

        ModificarMenuItem.getAccessibleContext().setAccessibleName("Modificar");
        ModificarMenuItem.getAccessibleContext().setAccessibleDescription("ModificarMenuItem");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Primer nombre: ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        txtnombre1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtnombre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombre1ActionPerformed(evt);
            }
        });
        txtnombre1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombre1KeyTyped(evt);
            }
        });
        getContentPane().add(txtnombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 130, -1));

        labelemp.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        labelemp.setText("Empleado");
        getContentPane().add(labelemp, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Segundo nombre: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, -1, -1));

        txtcodigo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(txtcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 70, -1));

        txtape2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtape2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtape2KeyTyped(evt);
            }
        });
        getContentPane().add(txtape2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 190, 160, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Segundo apellido: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Primer apellido:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 184, -1));

        txtape1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtape1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtape1KeyTyped(evt);
            }
        });
        getContentPane().add(txtape1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 130, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Telefono:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        txttel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txttel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttelKeyTyped(evt);
            }
        });
        getContentPane().add(txttel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 250, -1));

        txtid.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 294, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("Identidad:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, 20));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setText("Correo:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, -1));

        txtcorreo1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtcorreo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcorreo1ActionPerformed(evt);
            }
        });
        getContentPane().add(txtcorreo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 294, -1));

        labelrol.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelrol.setText("Rol:");
        getContentPane().add(labelrol, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, -1, -1));

        txtrol.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(txtrol, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 400, 59, -1));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, 21, -1));

        dataRol.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        dataRol.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dataRolMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(dataRol);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, 240, 110));

        labelmod.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        labelmod.setText("Modificar Empleado");
        getContentPane().add(labelmod, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, -1));

        labelreg.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        labelreg.setText("Registrar Empleado");
        getContentPane().add(labelreg, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, -1));

        btnActualizar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 560, -1, -1));

        txtnombre3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtnombre3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombre3KeyTyped(evt);
            }
        });
        getContentPane().add(txtnombre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 140, 160, -1));

        labelcod.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelcod.setText("Codigo de empleado: ");
        getContentPane().add(labelcod, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        RegresarBtn.setText("Regresar");
        RegresarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarBtnActionPerformed(evt);
            }
        });
        getContentPane().add(RegresarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 575, -1, -1));

        btnguardar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnguardar.setText("Guardar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 560, 162, -1));

        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 120, 160, 30));

        lblNombre.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblNombre.setText("Nombre: ");
        getContentPane().add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 120, -1, -1));

        btnMostrarT.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnMostrarT.setText("Mostrar Todo");
        btnMostrarT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarTActionPerformed(evt);
            }
        });
        getContentPane().add(btnMostrarT, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 170, -1, -1));

        btnbuscar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnbuscar.setText("Buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        tbEmpleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbEmpleado.setComponentPopupMenu(ModificarMenuItem);
        jScrollPane2.setViewportView(tbEmpleado);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btnbuscar)
                .addGap(42, 42, 42)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 100, 520, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

        void mostrarDatos( String valor){
        DefaultTableModel modelo  = new DefaultTableModel(); 
        
        modelo.addColumn("Código");
        modelo.addColumn("Nombre");
        tbEmpleado.setModel(modelo);
        String sql = "";
        if(valor.equals(""))
        {
        sql = "Select * from empleado";
        }
        else{
        sql = "Select * from empleado where primerNombreEmpleado like  '"+valor+"%' ";
        }
        String []datos = new String[2];
        
        Conectar con=new Conectar();
        Connection reg=con.getConnection();
        
        try {
            Statement st = reg.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
            datos[0] = rs.getString(1);
            datos[1] = rs.getString(2);
            modelo.addRow(datos);
            
            }
            tbEmpleado.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(empleado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        mostrar();
        this.jPanel1.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        Conectar con=new Conectar();
        Connection reg=con.getConnection();
        try
        {
            PreparedStatement obj=reg.prepareStatement("UPDATE Empleado SET primerNombreEmpleado='"+this.txtnombre1.getText()+"',segundoNombreEmpleado='"+this.txtnombre3.getText()+"', primerApellidoEmpleado='"+this.txtape1.getText()+"',segundoApellidoEmpleado='"+this.txtape2.getText()+"',telefonoEmpleado='"+this.txttel.getText()+"', correoEmpleado='"+this.txtcorreo1.getText()+"', identidadEmpleado='"+this.txtid.getText()+"' WHERE codigoEmpleado='"+this.txtcodigo.getText()+"'");
            obj.executeUpdate();
            JOptionPane.showMessageDialog(null, "Guardado con exito");
            
            mostrarDatos("");
            
            this.txtnombre1.setText("");
            this.txtnombre3.setText("");
            this.txtape1.setText("");
            this.txtape1.setText("");
            this.txtape2.setText("");
            this.txttel.setText("");
            this.txtcorreo1.setText("");
            this.txtid.setText("");            
            this.txtBuscar.setText("");
            this.btnActualizar.setVisible(false);
        }
        catch(SQLException ex)
        {
            Logger.getLogger(empleado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        
        String nombre = this.txtnombre1.getText().toUpperCase(); 
     
        if(nombre.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Llene el campo nombre");
            return;
        }
        
        Conectar con=new Conectar();
        Connection reg=con.getConnection();

        try
        {
             String primerNombreEmpleado = "";
             String sql = "select * FROM empleado where primerNombreEmpleado ='" +nombre+"'"; 
             Statement st = reg.createStatement();
             ResultSet rs = st.executeQuery(sql);
             
             while(rs.next())
             {
                 primerNombreEmpleado = rs.getString("primerNombreEmpleado");
             }
            
            if(nombre.equals(primerNombreEmpleado))
            {
            JOptionPane.showMessageDialog(null, "Empleado ya existente");
            }
            else
            {
            PreparedStatement obj=reg.prepareStatement("INSERT INTO empleado(primerNombreEmpleado, segundoNombreEmpleado, primerApellidoEmpleado, segundoApellidoEmpleado,telefonoEmpleado, correoEmpleado, identidadEmpleado, codigoRol) values(?,?,?,?,?,?,?,?)");
            obj.setString(1,nombre);
            obj.setString(2,this.txtnombre3.getText().toUpperCase());
            obj.setString(3,this.txtape1.getText().toUpperCase());
            obj.setString(4,this.txtape2.getText().toUpperCase());
            obj.setString(5,this.txttel.getText().toUpperCase());
            obj.setString(6,this.txtcorreo1.getText().toUpperCase());
            obj.setString(7,this.txtid.getText().toUpperCase());
            obj.setString(8,this.txtrol.getText().toUpperCase());
            obj.executeUpdate();
            JOptionPane.showMessageDialog(null, "Empleado Registrado.");
            
            this.txtnombre1.setText("");
            this.txtnombre3.setText("");
            this.txtape1.setText("");
            this.txtape2.setText("");
            this.txttel.setText("");
            this.txtcorreo1.setText("");
            this.txtid.setText("");
            this.txtrol.setText("");
            
            }
            
            mostrarDatos("");
            
        }
        catch(SQLException ex)
        {
            Logger.getLogger(empleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        ResultSet rx = Conectar.getTabla("select * from Empleado where identidadEmpleado='"+this.txtid.getText()+"'");
        
        try {
            if(rx.next())
            {
                this.cod=rx.getString("codigoEmpleado");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(empleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnguardarActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
       mostrarDatos(txtBuscar.getText());
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void dataRolMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dataRolMouseClicked

    }//GEN-LAST:event_dataRolMouseClicked

    private void txttelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelKeyTyped
        // TODO add your handling code here:
        char validar=evt.getKeyChar();
        
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
        }//validacion solo numeros
    }//GEN-LAST:event_txttelKeyTyped

    private void txtnombre1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombre1KeyTyped
        // TODO add your handling code here:
        char validar=evt.getKeyChar();
        
        if(Character.isDigit(validar)){
            getToolkit().beep();
            evt.consume();
        }//validacion solo letras
    }//GEN-LAST:event_txtnombre1KeyTyped

    private void txtnombre3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombre3KeyTyped
        // TODO add your handling code here:
        char validar=evt.getKeyChar();
        
        if(Character.isDigit(validar)){
            getToolkit().beep();
            evt.consume();
        }//validacion solo letras
    }//GEN-LAST:event_txtnombre3KeyTyped

    private void txtape1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtape1KeyTyped
        // TODO add your handling code here:
        char validar=evt.getKeyChar();
        
        if(Character.isDigit(validar)){
            getToolkit().beep();
            evt.consume();
        } //Validacion solo letras
    }//GEN-LAST:event_txtape1KeyTyped

    private void txtape2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtape2KeyTyped
        // TODO add your handling code here:
        char validar=evt.getKeyChar();
        
        if(Character.isDigit(validar)){
            getToolkit().beep();
            evt.consume();
        }//Validacion solo letras
    }//GEN-LAST:event_txtape2KeyTyped

    private void txtnombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombre1ActionPerformed

    private void RegresarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarBtnActionPerformed
        // TODO add your handling code here:
        MenuPrincipal men = new MenuPrincipal();

        men.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_RegresarBtnActionPerformed

    private void btnMostrarTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarTActionPerformed
        mostrarDatos("");
        this.txtBuscar.setText("");

    }//GEN-LAST:event_btnMostrarTActionPerformed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        int fila = tbEmpleado.getSelectedRow();
        if(fila >=0)
        {
            this.btnActualizar.enable(true);
            this.txtcodigo.setText(tbEmpleado.getValueAt(fila,0).toString());
            this.txtnombre1.setText(tbEmpleado.getValueAt(fila,1).toString());

            
            this.btnActualizar.setVisible(true);
            
        }
        else{
        JOptionPane.showMessageDialog(null,"no selecciono fila");
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void txtcorreo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcorreo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcorreo1ActionPerformed

    private void mostrar()
    {
        DefaultTableModel modelo2 = new DefaultTableModel();
        ResultSet rx = Conectar.getTabla("select * from rol");
        modelo2.setColumnIdentifiers(new Object[]{"Codigo Rol","Nombre Rol"});
        try
        {
            while(rx.next()){
                modelo2.addRow(new Object[]{rx.getString("codigoRol"), rx.getString("nombreRol")});
            }
            this.dataRol.setModel(modelo2);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
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
            java.util.logging.Logger.getLogger(empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new empleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPopupMenu ModificarMenuItem;
    private javax.swing.JButton RegresarBtn;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnMostrarT;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JTable dataRol;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelcod;
    private javax.swing.JLabel labelemp;
    private javax.swing.JLabel labelmod;
    private javax.swing.JLabel labelreg;
    private javax.swing.JLabel labelrol;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JTable tbEmpleado;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtape1;
    private javax.swing.JTextField txtape2;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtcorreo1;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtnombre1;
    private javax.swing.JTextField txtnombre3;
    private javax.swing.JTextField txtrol;
    private javax.swing.JTextField txttel;
    // End of variables declaration//GEN-END:variables
}
