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
 * @author Velasquez
 */
public class Periferico extends javax.swing.JFrame {

    /**
     * Creates new form Periferico
     */
    public Periferico() {
        initComponents();
        this.setLocationRelativeTo(null);
        mostrarDatos("");
       this.btnActualizar.setEnabled(false);
    }

    void mostrarDatos( String valor){
        DefaultTableModel modelo  = new DefaultTableModel(); 
        
        modelo.addColumn("C.Periferico");
        modelo.addColumn("C.Marca");
        modelo.addColumn("C.TipoPerfiferico");
        modelo.addColumn("C.Equipo");
        tbPeriferico.setModel(modelo);
        String sql = "";
        if(valor.equals(""))
        {
        sql = "Select * from perifericos";
        }
        else{
        sql = "Select * from perifericos where codigoEquipo like  '"+valor+"%' ";
        }
        String []datos = new String[5];
        
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
            
            modelo.addRow(datos);
            
            }
            tbPeriferico.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(Periferico.class.getName()).log(Level.SEVERE, null, ex);
        }
    }  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        txtequipo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lblCodigo1 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtmarca = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txttipoperiferico = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        btnIngresar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jPanele = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        dataRolequipo = new javax.swing.JTable();
        jPanelm = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        dataRolmarca = new javax.swing.JTable();
        jPanelt = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        dataRoltipoperiferico = new javax.swing.JTable();
        jCheckBox1 = new javax.swing.JCheckBox();
        RegresarBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtBuscar = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbPeriferico = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();

        jMenuItem1.setText("Modificar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        jMenuItem2.setText("Eliminar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem2);

        jMenuItem3.setText("Insertar");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtequipo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtequipo.setEnabled(false);
        txtequipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtequipoActionPerformed(evt);
            }
        });
        jPanel1.add(txtequipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 60, -1));

        jButton1.setText("jButton1");
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 19, 35));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Codigo de Equipo:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        lblCodigo1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblCodigo1.setText("Codigo Periférico:");
        jPanel1.add(lblCodigo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        txtCodigo.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
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
        jPanel1.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 110, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Codigo de Marca:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        txtmarca.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtmarca.setEnabled(false);
        txtmarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmarcaActionPerformed(evt);
            }
        });
        jPanel1.add(txtmarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 60, -1));

        jButton2.setText("jButton1");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 19, 35));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("Codigo de Tipo Periférico:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        txttipoperiferico.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txttipoperiferico.setEnabled(false);
        txttipoperiferico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttipoperifericoActionPerformed(evt);
            }
        });
        jPanel1.add(txttipoperiferico, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, 60, -1));

        jButton3.setText("jButton1");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, 19, 35));

        btnIngresar.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 380, 130, 35));

        btnActualizar.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 380, 130, -1));

        dataRolequipo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        dataRolequipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dataRolequipoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dataRolequipoMouseEntered(evt);
            }
        });
        jScrollPane4.setViewportView(dataRolequipo);

        javax.swing.GroupLayout jPaneleLayout = new javax.swing.GroupLayout(jPanele);
        jPanele.setLayout(jPaneleLayout);
        jPaneleLayout.setHorizontalGroup(
            jPaneleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPaneleLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPaneleLayout.setVerticalGroup(
            jPaneleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPaneleLayout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanele, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 200, 80));

        dataRolmarca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        dataRolmarca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dataRolmarcaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dataRolmarcaMouseEntered(evt);
            }
        });
        jScrollPane5.setViewportView(dataRolmarca);

        javax.swing.GroupLayout jPanelmLayout = new javax.swing.GroupLayout(jPanelm);
        jPanelm.setLayout(jPanelmLayout);
        jPanelmLayout.setHorizontalGroup(
            jPanelmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelmLayout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );
        jPanelmLayout.setVerticalGroup(
            jPanelmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelmLayout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanelm, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, 200, 80));

        dataRoltipoperiferico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        dataRoltipoperiferico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dataRoltipoperifericoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dataRoltipoperifericoMouseEntered(evt);
            }
        });
        jScrollPane3.setViewportView(dataRoltipoperiferico);

        javax.swing.GroupLayout jPaneltLayout = new javax.swing.GroupLayout(jPanelt);
        jPanelt.setLayout(jPaneltLayout);
        jPaneltLayout.setHorizontalGroup(
            jPaneltLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneltLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPaneltLayout.setVerticalGroup(
            jPaneltLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPaneltLayout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanelt, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, 200, 80));

        jCheckBox1.setText("NULO");
        jCheckBox1.setEnabled(false);
        jPanel1.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 80, -1));

        RegresarBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        RegresarBtn.setText("Regresar");
        RegresarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarBtnActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtBuscar.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
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
        jPanel2.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 160, 30));

        lblNombre.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        lblNombre.setText("Nombre: ");
        jPanel2.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        tbPeriferico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbPeriferico.setComponentPopupMenu(jPopupMenu1);
        jScrollPane2.setViewportView(tbPeriferico);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 500, 420));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel8.setText("Mantenimiento Periferico");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RegresarBtn)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8)
                        .addGap(157, 157, 157)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel8)
                        .addGap(31, 31, 31)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(RegresarBtn)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        mostrar1();
        this.jPanele.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtequipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtequipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtequipoActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void txtCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyTyped
        char c = evt.getKeyChar();

        if((c < '0' || c > '9')) evt.consume();
    }//GEN-LAST:event_txtCodigoKeyTyped

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed

        String equipo = null;
        if(this.txtequipo.getText().equals(""))
        {
            equipo=null;
        }
        else
        {
            equipo=this.txtequipo.getText();
        }

        Conectar con=new Conectar();
        Connection reg=con.getConnection();

        try
        {
            PreparedStatement obj=reg.prepareStatement("INSERT INTO perifericos(codigoMarca, codigoTipoPeriferico, codigoEquipo, estadoPeriferico) values(?, ?, ?, ?)");
                obj.setString(1,this.txtmarca.getText());
                obj.setString(2,this.txttipoperiferico.getText());
                obj.setString(3, equipo);
                obj.setString(4,"DISPONIBLE");
            obj.executeUpdate();
            JOptionPane.showMessageDialog(null, "Periférico Ingresado");

            this.txtCodigo.setText("");
            this.txtmarca.setText("");
            this.txttipoperiferico.setText("");
            this.txtequipo.setText("");

            mostrarDatos("");

        }
        catch(SQLException ex)
        {
            Logger.getLogger(Periferico.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        
        String equipo=null;
        Conectar con=new Conectar();
        Connection reg=con.getConnection();
        if(this.txtequipo.getText().equals(""))
        {
            equipo=null;
        }
        else
        {
            equipo=this.txtequipo.getText();
        }
        try
        {
            PreparedStatement obj=reg.prepareStatement("UPDATE perifericos SET codigoMarca='"+this.txtmarca.getText()+"',codigoTipoPeriferico='"+this.txttipoperiferico.getText()+"',codigoEquipo='"+equipo+"' WHERE codigoPeriferico='"+this.txtCodigo.getText()+"'");
            obj.executeUpdate();
            JOptionPane.showMessageDialog(null, "Guardado con exito");
            mostrarDatos("");

            this.txtCodigo.setText("");
            this.txtmarca.setText("");
            this.txttipoperiferico.setText("");
            this.txtequipo.setText("");
            this.txtBuscar.setText("");
            this.btnActualizar.setEnabled(false);
            this.btnIngresar.setEnabled(true);

        }
        catch(SQLException ex)
        {
            Logger.getLogger(Periferico.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void RegresarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarBtnActionPerformed
        // TODO add your handling code here:
        Mantenimientos men = new Mantenimientos();

        men.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_RegresarBtnActionPerformed

    private void txtmarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmarcaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        mostrar();
        this.jPanelm.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txttipoperifericoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttipoperifericoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttipoperifericoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        mostrar2();
        this.jPanelt.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void dataRoltipoperifericoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dataRoltipoperifericoMouseClicked
        int fila=this.dataRoltipoperiferico.getSelectedRow();
        if(fila>=0)
        {
            this.txttipoperiferico.setText(this.dataRoltipoperiferico.getValueAt(fila, 0).toString());
        }
        this.jPanelt.setVisible(false);
    }//GEN-LAST:event_dataRoltipoperifericoMouseClicked

    private void dataRoltipoperifericoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dataRoltipoperifericoMouseEntered
              // TODO add your handling code here:
    }//GEN-LAST:event_dataRoltipoperifericoMouseEntered

    private void dataRolequipoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dataRolequipoMouseClicked
        int fila=this.dataRolequipo.getSelectedRow();
        if(fila>=0)
        {
            this.txtequipo.setText(this.dataRolequipo.getValueAt(fila, 0).toString());
        }
        this.jPanele.setVisible(false); 
    }//GEN-LAST:event_dataRolequipoMouseClicked

    private void dataRolequipoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dataRolequipoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_dataRolequipoMouseEntered

    private void dataRolmarcaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dataRolmarcaMouseClicked
        int fila=this.dataRolmarca.getSelectedRow();
        if(fila>=0)
        {
            this.txtmarca.setText(this.dataRolmarca.getValueAt(fila, 0).toString());
        }
        this.jPanelm.setVisible(false);      
    }//GEN-LAST:event_dataRolmarcaMouseClicked

    private void dataRolmarcaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dataRolmarcaMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_dataRolmarcaMouseEntered

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        mostrarDatos(txtBuscar.getText());
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.jButton1.setEnabled(true);
        this.jCheckBox1.setEnabled(true);
        int fila = tbPeriferico.getSelectedRow();
        if(fila >=0)
        {
            this.btnIngresar.setEnabled(false);
            this.btnActualizar.setEnabled(true);
            this.txtCodigo.setText(tbPeriferico.getValueAt(fila,0).toString());
            this.txtmarca.setText(tbPeriferico.getValueAt(fila,1).toString());
            this.txttipoperiferico.setText(tbPeriferico.getValueAt(fila,2).toString());
            this.txtequipo.setText(tbPeriferico.getValueAt(fila,3).toString());
        }
        else{
            JOptionPane.showMessageDialog(null,"No seleccionó la fila");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        int fila = tbPeriferico.getSelectedRow();
        if(fila >=0)
        {
            Conectar con=new Conectar();
            Connection reg=con.getConnection();
            try
            {
                String codigo ="";
                codigo = tbPeriferico.getValueAt(fila,0).toString();
                PreparedStatement obj=reg.prepareStatement("Delete from perifericos Where codigoPeriferico='"+codigo+"'");
                obj.executeUpdate();
                mostrarDatos("");
            }
            catch(SQLException ex)
            {
                Logger.getLogger(facultad.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        else{
            JOptionPane.showMessageDialog(null,"No selecciono fila");
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        this.btnActualizar.setEnabled(false);
        this.btnIngresar.setEnabled(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

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
            java.util.logging.Logger.getLogger(Periferico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Periferico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Periferico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Periferico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Periferico().setVisible(true);
            }
        });
    }
    
    private void mostrar()
    {
        DefaultTableModel modelo = new DefaultTableModel();
        ResultSet rx = Conectar.getTabla("select * from marca");
        modelo.setColumnIdentifiers(new Object[]{"Codigo Marca","Nombre Marca"});
        try
        {
            while(rx.next()){
                modelo.addRow(new Object[]{rx.getString("codigoMarca"), rx.getString("nombreMarca")});
            }
            this.dataRolmarca.setModel(modelo);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    private void mostrar1()
    {
        DefaultTableModel modelo1 = new DefaultTableModel();
        ResultSet rx = Conectar.getTabla("select * from equipo");
        modelo1.setColumnIdentifiers(new Object[]{"Codigo Equipo","Numero Asignado"});
        try
        {
            while(rx.next()){
                modelo1.addRow(new Object[]{rx.getString("codigoEquipo"), rx.getString("numeroAsignado")});
            }
            this.dataRolequipo.setModel(modelo1);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    private void mostrar2()
    {
        DefaultTableModel modelo2 = new DefaultTableModel();
        ResultSet rx = Conectar.getTabla("select * from tipoPeriferico");
        modelo2.setColumnIdentifiers(new Object[]{"Codigo T.Periferico","Nombre"});
        try
        {
            while(rx.next()){
                modelo2.addRow(new Object[]{rx.getString("codigoTipoPeriferico"), rx.getString("nombrePeriferico")});
            }
            this.dataRoltipoperiferico.setModel(modelo2);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RegresarBtn;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JTable dataRolequipo;
    private javax.swing.JTable dataRolmarca;
    private javax.swing.JTable dataRoltipoperiferico;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanele;
    private javax.swing.JPanel jPanelm;
    private javax.swing.JPanel jPanelt;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblCodigo1;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JTable tbPeriferico;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtequipo;
    private javax.swing.JTextField txtmarca;
    private javax.swing.JTextField txttipoperiferico;
    // End of variables declaration//GEN-END:variables
}
