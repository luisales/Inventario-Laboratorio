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
        this.btnconf.setVisible(false);
        this.btnguardar.setVisible(false);
        this.btnbuscar.setVisible(false);
        this.labelcod.setVisible(false);
        this.txtcodigo.setVisible(false);
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
        btnmodificar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        dataRol = new javax.swing.JTable();
        labelmod = new javax.swing.JLabel();
        labelreg = new javax.swing.JLabel();
        btnconf = new javax.swing.JButton();
        btnregistrar = new javax.swing.JButton();
        btnguardar = new javax.swing.JButton();
        txtnombre3 = new javax.swing.JTextField();
        btnbuscar = new javax.swing.JButton();
        labelcod = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Primer nombre: ");

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

        labelemp.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        labelemp.setText("Empleado");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Segundo nombre: ");

        txtcodigo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        txtape2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtape2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtape2KeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Segundo apellido: ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Primer apellido:");

        txtape1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtape1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtape1KeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Telefono:");

        txttel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txttel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttelKeyTyped(evt);
            }
        });

        txtid.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("Identidad:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setText("Correo:");

        txtcorreo1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        labelrol.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelrol.setText("Rol:");

        txtrol.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnmodificar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnmodificar.setText("Modificar");
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });

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
                .addGap(0, 75, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 43, Short.MAX_VALUE))
        );

        labelmod.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        labelmod.setText("Modificar Empleado");

        labelreg.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        labelreg.setText("Registrar Empleado");

        btnconf.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnconf.setText("Actualizar");
        btnconf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconfActionPerformed(evt);
            }
        });

        btnregistrar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnregistrar.setText("Registrar");
        btnregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistrarActionPerformed(evt);
            }
        });

        btnguardar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnguardar.setText("Guardar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        txtnombre3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtnombre3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombre3KeyTyped(evt);
            }
        });

        btnbuscar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnbuscar.setText("buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        labelcod.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelcod.setText("Codigo de empleado: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelmod)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(labelemp))
                            .addComponent(labelreg)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(btnregistrar)
                        .addGap(61, 61, 61)
                        .addComponent(btnmodificar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelcod)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(230, 230, 230)
                                .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10)
                        .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel1)
                        .addGap(6, 6, 6)
                        .addComponent(txtnombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel2)
                        .addGap(4, 4, 4)
                        .addComponent(txtnombre3, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txtape1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel4)
                        .addGap(5, 5, 5)
                        .addComponent(txtape2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabel5)
                        .addGap(60, 60, 60)
                        .addComponent(txttel, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabel7)
                        .addGap(52, 52, 52)
                        .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jLabel9)
                        .addGap(51, 51, 51)
                        .addComponent(txtcorreo1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(labelrol)
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtrol, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnconf)
                                    .addComponent(btnguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(10, 10, 10)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelmod)
                    .addComponent(labelemp)
                    .addComponent(labelreg))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnregistrar)
                    .addComponent(btnmodificar))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelcod)
                    .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbuscar))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtnombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2))
                    .addComponent(txtnombre3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtape1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtape2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel5))
                    .addComponent(txttel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(txtcorreo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(labelrol))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtrol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jButton1)))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnconf)
                            .addComponent(btnguardar)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        mostrar();
        this.jPanel1.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
        this.labelemp.setVisible(false);
        this.labelreg.setVisible(false);
        this.btnguardar.setVisible(false);
        this.labelmod.setVisible(true);
        this.btnconf.setVisible(true);
        this.btnbuscar.setVisible(true);
        this.labelcod.setVisible(true);
        this.txtcodigo.setVisible(true);
        this.labelrol.setVisible(false);
        this.txtrol.setVisible(false);
        this.jButton1.setVisible(false);
        this.jPanel1.setVisible(false);
        
    }//GEN-LAST:event_btnmodificarActionPerformed

    private void btnconfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconfActionPerformed
        Conectar con=new Conectar();
        Connection reg=con.getConnection();
        try
        {
            PreparedStatement obj=reg.prepareStatement("UPDATE Empleado SET primerNombreEmpleado='"+this.txtnombre1.getText()+"',segundoNombreEmpleado='"+this.txtnombre3.getText()+"', primerApellidoEmpleado='"+this.txtape1.getText()+"',segundoApellidoEmpleado='"+this.txtape2.getText()+"',telefonoEmpleado='"+this.txttel.getText()+"', correoEmpleado='"+this.txtcorreo1.getText()+"', identidadEmpleado='"+this.txtid.getText()+"' WHERE codigoEmpleado='"+this.txtcodigo.getText()+"'");
            obj.executeUpdate();
            JOptionPane.showMessageDialog(null, "Guardado con exito");
        }
        catch(SQLException ex)
        {
            Logger.getLogger(empleado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnconfActionPerformed

    private void btnregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrarActionPerformed
        this.labelemp.setVisible(false);
        this.labelmod.setVisible(false);
        this.btnconf.setVisible(false);
        this.labelreg.setVisible(true);
        this.btnguardar.setVisible(true);
        this.btnbuscar.setVisible(false);
        this.labelcod.setVisible(false);
        this.txtcodigo.setVisible(false);
        this.labelrol.setVisible(true);
        this.txtrol.setVisible(true);
        this.jButton1.setVisible(true);
    }//GEN-LAST:event_btnregistrarActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        Conectar con=new Conectar();
        Connection reg=con.getConnection();

        try
        {
            PreparedStatement obj=reg.prepareStatement("INSERT INTO empleado(primerNombreEmpleado, segundoNombreEmpleado, primerApellidoEmpleado, segundoApellidoEmpleado,telefonoEmpleado, correoEmpleado, identidadEmpleado) values(?,?,?,?,?,?,?)");
            obj.setString(1,this.txtnombre1.getText().toUpperCase());
            obj.setString(2,this.txtnombre3.getText().toUpperCase());
            obj.setString(3,this.txtape1.getText().toUpperCase());
            obj.setString(4,this.txtape2.getText().toUpperCase());
            obj.setString(5,this.txttel.getText().toUpperCase());
            obj.setString(6,this.txtcorreo1.getText().toUpperCase());
            obj.setString(7,this.txtid.getText().toUpperCase());
            obj.executeUpdate();
            JOptionPane.showMessageDialog(null, "Guardado con exito");
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
        try
        {
            PreparedStatement obj=reg.prepareStatement("INSERT INTO empleadorol(codigoEmpleado, codigoRol) values(?,?)");
            obj.setString(1,this.cod);
            obj.setString(2,this.txtrol.getText());
            obj.executeUpdate();
        }
        catch(SQLException ex)
        {
            Logger.getLogger(empleado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnguardarActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        ResultSet rx = Conectar.getTabla("select * from Empleado where codigoEmpleado='"+this.txtcodigo.getText()+"'");
        try {
            if(rx.next())
            {
                this.txtnombre1.setText(rx.getString("primerNombreEmpleado"));
                this.txtnombre3.setText(rx.getString("segundoNombreEmpleado"));
                this.txtape1.setText(rx.getString("primerApellidoEmpleado"));
                this.txtape2.setText(rx.getString("segundoApellidoEmpleado"));
                this.txtcorreo1.setText(rx.getString("correoEmpleado"));
                this.txtid.setText(rx.getString("identidadEmpleado"));
                this.txttel.setText(rx.getString("telefonoEmpleado"));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(empleado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void dataRolMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dataRolMouseClicked
        int fila=this.dataRol.getSelectedRow();
        if(fila>=0)
        {
            this.txtrol.setText(this.dataRol.getValueAt(fila, 0).toString());
        }
        this.jPanel1.setVisible(false);
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
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btnconf;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JButton btnregistrar;
    private javax.swing.JTable dataRol;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelcod;
    private javax.swing.JLabel labelemp;
    private javax.swing.JLabel labelmod;
    private javax.swing.JLabel labelreg;
    private javax.swing.JLabel labelrol;
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
