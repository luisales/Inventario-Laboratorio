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
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

public class Clientes extends javax.swing.JFrame {

    /**
     * Creates new form Clientes
     */
    public Clientes() {
        
        initComponents();
        this.setLocationRelativeTo(this);
        this.txtcodigoIdCliente.setEnabled(false);
        this.jLabel9.setEnabled(false);
        this.jPanel1.setVisible(false);
        this.txtcodigoFacultad.setEnabled(false);
        this.btnActualizar.setEnabled(false);
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

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
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
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        dataRol = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btnMostrarT = new javax.swing.JButton();
        btnbuscar = new javax.swing.JButton();
        lblNombre = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbCliente = new javax.swing.JTable();
        btnActualizar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtcodigoIdCliente = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtidCliente = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        RegresarBtn_Clientes = new javax.swing.JButton();

        jMenuItem1.setText("Modificar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        jMenuItem3.setText("Ingresar");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem3);

        jMenuItem2.setText("Eliminar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Ingreso Clientes");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, -1, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Primer nombre");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Segundo nombre");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Codigo facultad");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Segundo apellido");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, -1, -1));

        txtprimerNombre.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtprimerNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtprimerNombreKeyPressed(evt);
            }
        });
        getContentPane().add(txtprimerNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 134, -1));

        txtcodigoFacultad.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtcodigoFacultad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcodigoFacultadKeyPressed(evt);
            }
        });
        getContentPane().add(txtcodigoFacultad, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 39, -1));

        txtsegundoNombre.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
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
        getContentPane().add(txtsegundoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 120, 134, -1));

        txtsegundoApellido.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtsegundoApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtsegundoApellidoKeyPressed(evt);
            }
        });
        getContentPane().add(txtsegundoApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 170, 134, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("Primer apellido");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        txtprimerApellido.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtprimerApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtprimerApellidoKeyPressed(evt);
            }
        });
        getContentPane().add(txtprimerApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 134, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("Telefono");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, -1, -1));

        txttelefonoCliente.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txttelefonoCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txttelefonoClienteKeyPressed(evt);
            }
        });
        getContentPane().add(txttelefonoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, 180, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setText("Correo");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        txtcorreoCliente.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtcorreoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcorreoClienteActionPerformed(evt);
            }
        });
        getContentPane().add(txtcorreoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 200, -1));

        btnguardar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnguardar.setText("Guardar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 410, -1, -1));

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
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 40, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 310, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMostrarT.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnMostrarT.setText("Mostrar Todo");
        btnMostrarT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarTActionPerformed(evt);
            }
        });
        jPanel2.add(btnMostrarT, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 72, -1, -1));

        btnbuscar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnbuscar.setText("Buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });
        jPanel2.add(btnbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 72, 148, -1));

        lblNombre.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblNombre.setText("Nombre: ");
        jPanel2.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 27, -1, -1));

        txtBuscar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        jPanel2.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 24, 160, -1));

        tbCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbCliente.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tbCliente.setComponentPopupMenu(jPopupMenu1);
        jScrollPane2.setViewportView(tbCliente);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 356, 297));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 50, 390, 450));

        btnActualizar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 410, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setText("Código");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        txtcodigoIdCliente.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtcodigoIdCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcodigoIdClienteKeyPressed(evt);
            }
        });
        getContentPane().add(txtcodigoIdCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 134, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel10.setText("Id.");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));

        try {
            txtidCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####-#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtidCliente.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(txtidCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 200, 40));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 20, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 726, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 445, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 730, 450));

        RegresarBtn_Clientes.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        RegresarBtn_Clientes.setText("Regresar");
        RegresarBtn_Clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarBtn_ClientesActionPerformed(evt);
            }
        });
        getContentPane().add(RegresarBtn_Clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

        void mostrarDatos( String valor){
        DefaultTableModel modelo  = new DefaultTableModel(); 
        
        modelo.addColumn("Codigo");
        modelo.addColumn("Primer Nombre");
        modelo.addColumn("Segundo Nombre");
        modelo.addColumn("Primer Apellido");
        modelo.addColumn("Segundo Apellido");
        modelo.addColumn("Codigo Facultad");
        modelo.addColumn("Telefono");
        modelo.addColumn("Correo");
        modelo.addColumn("Identidad");
        tbCliente.setModel(modelo);
        String sql = "";
        if(valor.equals(""))
        {
        sql = "Select * from cliente";
        }
        else{
        sql = "Select * from cliente where primerNombreCliente like  '"+valor+"%' ";
        }
        String []datos = new String[9];
        
        Conectar con=new Conectar();
        Connection reg=con.getConnection();
        
        try {
            Statement st = reg.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
            datos[0] = rs.getString(1);
            datos[1] = rs.getString(2);
            datos[2] = rs.getString(3);
            datos[3] = rs.getString(4);
            datos[4] = rs.getString(5);
            datos[5] = rs.getString(6);
            datos[6] = rs.getString(7);
            datos[7] = rs.getString(8);
            datos[8] = rs.getString(9);
            modelo.addRow(datos);
            
            }
            tbCliente.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed

        if(this.txtprimerNombre.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Llene el campo primer nombre");
            return;
        }
        if(this.txtprimerApellido.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Llene el campo primer apellido");
            return;
        }
        if(this.txtcodigoFacultad.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Llene el campo codigo facultad");
            return;
        }
        if(this.txtidCliente.getText().equals("    -    -     "))
        {
            JOptionPane.showMessageDialog(null, "Llene el campo identidad");
            return;
        }
        String email="^[_a-z0-9-]+(\\.[_a-z0-9-]+)*@" +"[a-z0-9-]+(\\.[a-z0-9-]+)*(\\.[a-z]{2,4})$";
        Pattern pattern = Pattern.compile(email);
        String correo = this.txtcorreoCliente.getText();
        if(correo!=null)
        {
            Matcher matcher=pattern.matcher(correo);
            if(matcher.matches())
            {
                
            }
            else{
                JOptionPane.showMessageDialog(null, "Correo no valido");
                return;
            }
        }
        Conectar con=new Conectar();
        Connection reg=con.getConnection();
        
        try{
                PreparedStatement obj = reg.prepareStatement("INSERT INTO cliente (primerNombreCliente,segundoNombreCliente,primerApellidoCliente,segundoApellidoCliente,codigoFacultad,telefonoCliente,correoCliente, identidadCliente) values(?,?,?,?,?,?,?,?)");
                
                obj.setString(1,this.txtprimerNombre.getText());
                obj.setString(2,this.txtsegundoNombre.getText());
                obj.setString(3,this.txtprimerApellido.getText());
                obj.setString(4,this.txtsegundoApellido.getText());
                obj.setString(5,this.txtcodigoFacultad.getText());
                obj.setString(6,this.txttelefonoCliente.getText());
                obj.setString(7,this.txtcorreoCliente.getText());
                obj.setString(8,this.txtidCliente.getText());
                obj.executeUpdate();
                JOptionPane.showMessageDialog(null, "Guardado con exito");
        }
        
        catch(SQLException ex)
        {
            Logger.getLogger(facultad.class.getName()).log(Level.SEVERE,null,ex);
        }
        
        
        this.txtcodigoIdCliente.setText("");
            this.txtcodigoIdCliente.setEnabled(false);
            this.txtprimerNombre.setText("");
            this.txtsegundoNombre.setText("");
            this.txtprimerApellido.setText("");
            this.txtsegundoApellido.setText("");
            this.txtcodigoFacultad.setText("");
            this.txtcorreoCliente.setText("");
            this.txttelefonoCliente.setText("");        
            this.txtBuscar.setText("");
            this.txtidCliente.setText("");

        mostrarDatos("");        
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        mostrar();
        this.jPanel1.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void dataRolMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dataRolMouseClicked
        int fila=this.dataRol.getSelectedRow();
        if(fila>=0)
        {
            this.txtcodigoFacultad.setText(this.dataRol.getValueAt(fila, 0).toString());
        }
        this.jPanel1.setVisible(false);
    }//GEN-LAST:event_dataRolMouseClicked

    private void RegresarBtn_ClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarBtn_ClientesActionPerformed
        // TODO add your handling code here:
        MenuPrincipal men = new MenuPrincipal();
      

        men.setVisible(true);
        this.dispose();
        
        
    }//GEN-LAST:event_RegresarBtn_ClientesActionPerformed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
       mostrarDatos(txtBuscar.getText());
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void btnMostrarTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarTActionPerformed
        mostrarDatos("");
        this.txtBuscar.setText("");
    }//GEN-LAST:event_btnMostrarTActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed

        String email="^[_a-z0-9-]+(\\.[_a-z0-9-]+)*@" +"[a-z0-9-]+(\\.[a-z0-9-]+)*(\\.[a-z]{2,4})$";
        Pattern pattern = Pattern.compile(email);
        String correo = this.txtcorreoCliente.getText();
        if(correo!=null)
        {
            Matcher matcher=pattern.matcher(correo);
            if(matcher.matches())
            {
                
            }
            else{
                JOptionPane.showMessageDialog(null, "Correo no valido");
                return;
            }
        }
        Conectar con=new Conectar();
        Connection reg=con.getConnection();
        try
        {
            PreparedStatement obj=reg.prepareStatement("UPDATE Cliente SET primerNombreCliente='"+this.txtprimerNombre.getText()+"',segundoNombreCliente='"+this.txtsegundoNombre.getText()+"', primerApellidoCliente='"+this.txtprimerApellido.getText()+"',segundoApellidoCliente='"+this.txtsegundoApellido.getText()+"',codigoFacultad='"+this.txtcodigoFacultad.getText()+"',telefonoCliente='"+this.txttelefonoCliente.getText()+"', correoCliente='"+this.txtcorreoCliente.getText()+"', identidadCliente='"+this.txtidCliente.getText()+"' WHERE codigoIdCliente='"+this.txtcodigoIdCliente.getText()+"'");
            obj.executeUpdate();
            JOptionPane.showMessageDialog(null, "Guardado con exito");
            
            mostrarDatos("");
            this.txtcodigoIdCliente.setText("");
            this.txtcodigoIdCliente.setEnabled(false);
            this.txtprimerNombre.setText("");
            this.txtsegundoNombre.setText("");
            this.txtprimerApellido.setText("");
            this.txtsegundoApellido.setText("");
            this.txtcodigoFacultad.setText("");
            this.txtcorreoCliente.setText("");
            this.txttelefonoCliente.setText("");        
            this.txtBuscar.setText("");
            this.txtidCliente.setText("");
            this.btnActualizar.setEnabled(false);
            this.btnguardar.setEnabled(true);
        }
        catch(SQLException ex)
        {
            Logger.getLogger(empleado.class.getName()).log(Level.SEVERE, null, ex);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        int fila = tbCliente.getSelectedRow();
        if(fila >=0)
        {
            this.btnguardar.setEnabled(false);
            this.btnActualizar.setEnabled(true);
            this.txtcodigoIdCliente.setText(tbCliente.getValueAt(fila,0).toString());
            this.txtprimerNombre.setText(tbCliente.getValueAt(fila,1).toString());
            this.txtsegundoNombre.setText(tbCliente.getValueAt(fila,2).toString());
            this.txtprimerApellido.setText(tbCliente.getValueAt(fila,3).toString());
            this.txtsegundoApellido.setText(tbCliente.getValueAt(fila,4).toString());
            this.txtcodigoFacultad.setText(tbCliente.getValueAt(fila,5).toString());
            this.txttelefonoCliente.setText(tbCliente.getValueAt(fila,6).toString());
            this.txtcorreoCliente.setText(tbCliente.getValueAt(fila,7).toString());
            this.txtidCliente.setText(tbCliente.getValueAt(fila,8).toString());
            
            this.btnActualizar.setVisible(true);
            this.txtcodigoIdCliente.setVisible(true);
            this.jLabel9.setVisible(true);
        }
        else{
        JOptionPane.showMessageDialog(null,"no selecciono fila");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void txtcodigoIdClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcodigoIdClienteKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodigoIdClienteKeyPressed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        this.btnActualizar.setEnabled(false);
        this.btnguardar.setEnabled(true);
        this.txtcodigoIdCliente.setText("");
        this.txtcodigoIdCliente.setEnabled(false);
        this.txtprimerNombre.setText("");
            this.txtsegundoNombre.setText("");
            this.txtprimerApellido.setText("");
            this.txtsegundoApellido.setText("");
            this.txtcodigoFacultad.setText("");
            this.txtcorreoCliente.setText("");
            this.txttelefonoCliente.setText("");        
            this.txtBuscar.setText("");
            this.txtidCliente.setText("");        
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        
        Conectar con=new Conectar();
        Connection reg=con.getConnection();
        try
        {
            int fila = tbCliente.getSelectedRow();
            String codigo ="";
            codigo = tbCliente.getValueAt(fila,0).toString();
            PreparedStatement obj=reg.prepareStatement("Delete from cliente Where codigoIdCliente='"+codigo+"'");
            obj.executeUpdate();
            mostrarDatos("");
            this.tbCliente.setEnabled(true);
            this.btnActualizar.setEnabled(false);
        }
        catch(SQLException ex)
        {
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void txtcorreoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcorreoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcorreoClienteActionPerformed

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
    
    private void mostrar()
    {
        DefaultTableModel modelo2 = new DefaultTableModel();
        ResultSet rx = Conectar.getTabla("select * from facultad");
        modelo2.setColumnIdentifiers(new Object[]{"Codigo Facultad","Nombre Facultad"});
        try
        {
            while(rx.next()){
                modelo2.addRow(new Object[]{rx.getString("codigoFacultad"), rx.getString("nombreFacultad")});
            }
            this.dataRol.setModel(modelo2);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RegresarBtn_Clientes;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnMostrarT;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JTable dataRol;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JTable tbCliente;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtcodigoFacultad;
    private javax.swing.JTextField txtcodigoIdCliente;
    private javax.swing.JTextField txtcorreoCliente;
    private javax.swing.JFormattedTextField txtidCliente;
    private javax.swing.JTextField txtprimerApellido;
    private javax.swing.JTextField txtprimerNombre;
    private javax.swing.JTextField txtsegundoApellido;
    private javax.swing.JTextField txtsegundoNombre;
    private javax.swing.JTextField txttelefonoCliente;
    // End of variables declaration//GEN-END:variables
}
