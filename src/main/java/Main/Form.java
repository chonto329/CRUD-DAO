/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Main;

import Controller.FuncionarioController;
import Domain.Funcionario;
import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Juan
 */
public class Form extends javax.swing.JFrame {

    String columns[] = {"Tipo Identificacion", "Identidicación", "Nombres", "Apellidos", "Estado Civil", "Teléfono", "Sexo", "Fecha Nacimiento", "Direccion"};
    FuncionarioController fc = new FuncionarioController();

    public Form() {
        initComponents();
        setTitle("Funcionarios");
        setLocationRelativeTo(null);
        cargarTabla();
    }

    //METODO DE CARGAR TABLA
    private void cargarTabla() {
        DefaultTableModel model = new DefaultTableModel();
        for (String column : columns) {
            model.addColumn(column);
        }
        tabla.setModel(model);

        try {
            List<Funcionario> funcionarios = fc.obtenerFuncionario();
            if (funcionarios.isEmpty()) {
                return;
            }
            model.setRowCount(funcionarios.size());
            int row = 0;
            for (Funcionario funcionario : funcionarios) {
                model.setValueAt(funcionario.getTipo(), row, 0);
                model.setValueAt(funcionario.getCedula(), row, 1);
                model.setValueAt(funcionario.getNombre(), row, 2);
                model.setValueAt(funcionario.getApellido(), row, 3);
                model.setValueAt(funcionario.getEstado(), row, 4);
                model.setValueAt(funcionario.getTelefono(), row, 5);
                model.setValueAt(funcionario.getSexo(), row, 6);
                model.setValueAt(funcionario.getFecha_naci(), row, 7);
                model.setValueAt(funcionario.getDireccion(), row, 8);
                row++;

            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    //METODO DE LIMPIAR CAMPOS
    private void limpiar() {
        txtCedula.setEnabled(true);
        btnGuardar.setEnabled(true);
        txtTipo.setSelectedItem("Seleccionar");
        txtCedula.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtEstado.setSelectedItem("Seleccionar");
        txtTelefono.setText("");
        txtSexo.setSelectedItem("Seleccionar");
        txtFecha.setDate(null);
        txtDireccion.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        table = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        txtTipo = new javax.swing.JComboBox<>();
        txtEstado = new javax.swing.JComboBox<>();
        txtSexo = new javax.swing.JComboBox<>();
        btnCancelar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btnGuardar = new javax.swing.JButton();
        txtFecha = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        table.setBackground(new java.awt.Color(1, 23, 43));
        table.setForeground(new java.awt.Color(0, 102, 102));
        table.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Funcionarios");

        jLabel2.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tipo Cedula");

        jLabel3.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Identificación");

        txtCedula.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txtCedula.setBorder(null);

        jLabel4.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombres");

        txtNombre.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txtNombre.setBorder(null);

        jLabel5.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Apellidos");

        txtApellido.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txtApellido.setBorder(null);

        jLabel6.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Estado Civil");

        jLabel7.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Teléfono");

        txtTelefono.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txtTelefono.setBorder(null);

        jLabel8.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Sexo");

        jLabel9.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Fecha Nacimiento");

        jLabel10.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Direccion");

        txtDireccion.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txtDireccion.setBorder(null);

        txtTipo.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txtTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Cedula", "Certificados de nacionalidad", "Colombianos exterior" }));
        txtTipo.setBorder(null);

        txtEstado.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txtEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Solter@", "Casad@", "Divorciad@", "Separad@", "Viud@", "Union libre" }));
        txtEstado.setBorder(null);

        txtSexo.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txtSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Masculino", "Femenino" }));
        txtSexo.setBorder(null);

        btnCancelar.setBackground(new java.awt.Color(148, 86, 74));
        btnCancelar.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(null);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(148, 86, 74));
        btnEliminar.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorder(null);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnActualizar.setBackground(new java.awt.Color(148, 86, 74));
        btnActualizar.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setText("Actualizar");
        btnActualizar.setBorder(null);
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabla);

        btnGuardar.setBackground(new java.awt.Color(148, 86, 74));
        btnGuardar.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.setBorder(null);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        txtFecha.setDateFormatString("yyyy/MM/dd");
        txtFecha.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N

        javax.swing.GroupLayout tableLayout = new javax.swing.GroupLayout(table);
        table.setLayout(tableLayout);
        tableLayout.setHorizontalGroup(
            tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tableLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jScrollPane2)
                .addGap(91, 91, 91))
            .addGroup(tableLayout.createSequentialGroup()
                .addGap(396, 396, 396)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(tableLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                .addGroup(tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tableLayout.createSequentialGroup()
                            .addGroup(tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8))
                            .addGap(286, 286, 286))
                        .addComponent(txtSexo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTelefono)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tableLayout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(9, 9, 9))
                        .addComponent(txtDireccion)
                        .addComponent(jLabel9)
                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tableLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel10)))
                .addGap(128, 128, 128))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tableLayout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(158, 158, 158))
        );
        tableLayout.setVerticalGroup(
            tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tableLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tableLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4))
                    .addGroup(tableLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(tableLayout.createSequentialGroup()
                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addGap(14, 14, 14)
                        .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(tableLayout.createSequentialGroup()
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(table, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(table, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //BOTON DE CANCELAR
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnCancelarActionPerformed
    // BOTON DE GUARDAR DATOS 
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        String tipo = txtTipo.getSelectedItem().toString();
        String estado = txtEstado.getSelectedItem().toString();
        String sexo = txtSexo.getSelectedItem().toString();

        if (tipo.equals("Seleccionar")) {
            JOptionPane.showMessageDialog(null, "Seleccione el tipo identificación");
            txtTipo.requestFocus();
        } else if (txtCedula.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Digite la identificación");
            txtCedula.requestFocus();
        } else if (txtNombre.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Digite los nombres");
            txtNombre.requestFocus();
        } else if (txtApellido.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Digite los apellidos");
            txtApellido.requestFocus();
        } else if (estado.equals("Seleccionar")) {
            JOptionPane.showMessageDialog(null, "Seleccione el estado civil");
            txtEstado.requestFocus();
        } else if (txtTelefono.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Digite el telefono");
            txtTelefono.requestFocus();
        } else if (sexo.equals("Seleccionar")) {
            JOptionPane.showMessageDialog(null, "Seleccione el sexo");
            txtSexo.requestFocus();
        } else if (txtFecha.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Digite la fecha de nacimiento");
            txtFecha.requestFocus();
        } else if (txtDireccion.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Digite la direccion");
            txtDireccion.requestFocus();
        } else {
            String dia = Integer.toString(txtFecha.getCalendar().get(Calendar.DAY_OF_MONTH));
            String mes = Integer.toString(txtFecha.getCalendar().get(Calendar.MONTH) + 1);
            String año = Integer.toString(txtFecha.getCalendar().get(Calendar.YEAR));
            String fecha = año + "/" + mes + "/" + dia;
            System.out.println(mes);
            Funcionario funcionario = new Funcionario();
            funcionario.setTipo(tipo);
            funcionario.setCedula(Long.valueOf(txtCedula.getText().trim()));
            funcionario.setNombre(txtNombre.getText().trim());
            funcionario.setApellido(txtApellido.getText().trim());
            funcionario.setEstado(estado);
            funcionario.setTelefono(Long.valueOf(txtTelefono.getText().trim()));
            funcionario.setSexo(sexo);
            funcionario.setFecha_naci(fecha);
            funcionario.setDireccion(txtDireccion.getText().trim());
            try {
                fc.crear(funcionario);
                JOptionPane.showConfirmDialog(null, "Funcionario Guardado con exito ",
                        "Guardar Funcionario", JOptionPane.YES_OPTION, JOptionPane.INFORMATION_MESSAGE);
                limpiar();
                cargarTabla();

            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

    }//GEN-LAST:event_btnGuardarActionPerformed

    //METODO PARA SELECCIONAR LOS CAMPOS DE LA TABLA
    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked

        btnGuardar.setEnabled(false);
        txtCedula.setEnabled(false);
        int seleccionar = tabla.rowAtPoint(evt.getPoint());
        txtTipo.setSelectedItem(String.valueOf(tabla.getValueAt(seleccionar, 0)));
        txtCedula.setText(String.valueOf(tabla.getValueAt(seleccionar, 1)));
        txtNombre.setText(String.valueOf(tabla.getValueAt(seleccionar, 2)));
        txtApellido.setText(String.valueOf(tabla.getValueAt(seleccionar, 3)));
        txtEstado.setSelectedItem(String.valueOf(tabla.getValueAt(seleccionar, 4)));
        txtTelefono.setText(String.valueOf(tabla.getValueAt(seleccionar, 5)));
        txtSexo.setSelectedItem(String.valueOf(tabla.getValueAt(seleccionar, 6)));

        try {
            String selec_fecha = String.valueOf(tabla.getValueAt(seleccionar, 7));
            java.util.Date fecha;
            SimpleDateFormat s = new SimpleDateFormat("yyyy/MM/dd");
            fecha = (java.util.Date) s.parse(selec_fecha);
            txtFecha.setDate(fecha);

            txtDireccion.setText(String.valueOf(tabla.getValueAt(seleccionar, 8)));
        } catch (ParseException ex) {
            Logger.getLogger(Form.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tablaMouseClicked

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        String tipo = txtTipo.getSelectedItem().toString();
        String estado = txtEstado.getSelectedItem().toString();
        String sexo = txtSexo.getSelectedItem().toString();

        if (tipo.equals("Seleccionar")) {
            JOptionPane.showMessageDialog(null, "Seleccione el tipo identificación");
            txtTipo.requestFocus();
        } else if (txtCedula.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Digite la identificación");
            txtCedula.requestFocus();
        } else if (txtNombre.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Digite los nombres");
            txtNombre.requestFocus();
        } else if (txtApellido.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Digite los apellidos");
            txtApellido.requestFocus();
        } else if (estado.equals("Seleccionar")) {
            JOptionPane.showMessageDialog(null, "Seleccione el estado civil");
            txtEstado.requestFocus();
        } else if (txtTelefono.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Digite el telefono");
            txtTelefono.requestFocus();
        } else if (sexo.equals("Seleccionar")) {
            JOptionPane.showMessageDialog(null, "Seleccione el sexo");
            txtSexo.requestFocus();
        } else if (txtFecha.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Digite la fecha de nacimiento");
            txtFecha.requestFocus();
        } else if (txtDireccion.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Digite la direccion");
            txtDireccion.requestFocus();
        } else {
            String dia = Integer.toString(txtFecha.getCalendar().get(Calendar.DAY_OF_MONTH));
            String mes = Integer.toString(txtFecha.getCalendar().get(Calendar.MONTH) + 1);
            String año = Integer.toString(txtFecha.getCalendar().get(Calendar.YEAR));
            System.out.println(mes);
            String fecha = año + "/" + mes + "/" + dia;
            Funcionario funcionario = new Funcionario();
            funcionario.setTipo(tipo);
            funcionario.setCedula(Long.valueOf(txtCedula.getText().trim()));
            funcionario.setNombre(txtNombre.getText().trim());
            funcionario.setApellido(txtApellido.getText().trim());
            funcionario.setEstado(estado);
            funcionario.setTelefono(Long.valueOf(txtTelefono.getText().trim()));
            funcionario.setSexo(sexo);
            funcionario.setFecha_naci(fecha);
            funcionario.setDireccion(txtDireccion.getText().trim());
            try {
                fc.actualizarFuncionario(Long.valueOf(txtCedula.getText()), funcionario);
                JOptionPane.showConfirmDialog(null, "Funcionario Actualizado con exito ",
                        "Actualizar Funcionario", JOptionPane.YES_OPTION, JOptionPane.INFORMATION_MESSAGE);

                limpiar();
                cargarTabla();

            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (txtCedula.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Digite la identificación");
            txtCedula.requestFocus();
        } else {
            int opc = JOptionPane.showConfirmDialog(null, "Esta seguro de eliminar el funcionario ",
                    "Eliminar Funcionario", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

            if (opc == 0) {
                try {
                    fc.eliminarFuncionario(Long.valueOf(txtCedula.getText()));
                    JOptionPane.showConfirmDialog(null, "Funcionario eliminado con exito ",
                            "Eliminar Funcionario", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
                    limpiar();
                    cargarTabla();
                } catch (SQLException ex) {
                    Logger.getLogger(Form.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else {
                limpiar();
            }
        }


    }//GEN-LAST:event_btnEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabla;
    private javax.swing.JPanel table;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JComboBox<String> txtEstado;
    private com.toedter.calendar.JDateChooser txtFecha;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JComboBox<String> txtSexo;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JComboBox<String> txtTipo;
    // End of variables declaration//GEN-END:variables
}
