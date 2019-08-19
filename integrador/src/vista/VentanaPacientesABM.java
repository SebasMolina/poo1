/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Controlador;
import java.text.SimpleDateFormat;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modelo.*;

/**
 *
 * @author sebas
 */
public class VentanaPacientesABM extends javax.swing.JFrame {

    private final Controlador controlador;
    private final JFrame previo;
    private Paciente paciente;
    private boolean constructor;
    private VentanaPacientes a;
    
    public VentanaPacientesABM(Controlador c, JFrame p) {
        this.controlador = c;
        this.constructor = true;
        this.previo = p;
        this.a = (VentanaPacientes) p;
        initComponents();
        limpiar();
        btnEliminar.setVisible(false);
    }
    
    public VentanaPacientesABM(Controlador c, JFrame p, Paciente pa) {
        this.controlador = c;
        this.constructor = false;
        this.previo = p;
        this.paciente = pa;
        this.a = (VentanaPacientes) p;
        initComponents();
        mostrar(); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtDni = new javax.swing.JTextField();
        lblDni = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        lblApellido = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        lblTelefono = new javax.swing.JLabel();
        txtMail = new javax.swing.JTextField();
        lblMail = new javax.swing.JLabel();
        lblFechaNac = new javax.swing.JLabel();
        txtCalle = new javax.swing.JTextField();
        lblCalle = new javax.swing.JLabel();
        txtFechaNac = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        txtLocalidad = new javax.swing.JTextField();
        lblLocalidad = new javax.swing.JLabel();
        txtProvincia = new javax.swing.JTextField();
        lblProvincia = new javax.swing.JLabel();
        lblNumero = new javax.swing.JLabel();
        lblHistorial = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtHistorial = new javax.swing.JTextArea();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Detalle Paciente");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        txtDni.setToolTipText("Inserte el Dni sin puntos");

        lblDni.setText("DNI: ");

        txtNombre.setToolTipText("");

        lblNombre.setText("Nombre:");

        txtApellido.setToolTipText("");

        lblApellido.setText("Apellido:");

        txtTelefono.setToolTipText("");

        lblTelefono.setText("Telefono:");

        txtMail.setToolTipText("ejemplo@ejemplo.com");

        lblMail.setText("Mail: ");

        lblFechaNac.setText("F. Nacimiento:");

        txtCalle.setToolTipText("");

        lblCalle.setText("Calle:");

        txtFechaNac.setToolTipText("dd/mm/aaaa");

        txtNumero.setToolTipText("");

        txtLocalidad.setToolTipText("");

        lblLocalidad.setText("Localidad:");

        txtProvincia.setToolTipText("");

        lblProvincia.setText("Provincia:");

        lblNumero.setText("Nº:");

        lblHistorial.setText("Historial:");

        btnLimpiar.setText("Limpiar");
        btnLimpiar.setToolTipText("limpiar pantalla");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnAgregar.setText("Agregar");
        btnAgregar.setToolTipText("agregar paciente");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        txtHistorial.setColumns(20);
        txtHistorial.setRows(5);
        txtHistorial.setToolTipText("pregunte cosas de interes. Por ej: si es diabético");
        jScrollPane1.setViewportView(txtHistorial);

        btnEliminar.setText("Eliminar");
        btnEliminar.setToolTipText("eliminar paciente");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTelefono)
                            .addComponent(lblApellido)
                            .addComponent(lblMail)
                            .addComponent(lblFechaNac)
                            .addComponent(lblNombre)
                            .addComponent(lblDni)
                            .addComponent(lblLocalidad)
                            .addComponent(lblProvincia)
                            .addComponent(lblCalle)
                            .addComponent(lblHistorial))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCalle, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(lblNumero)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumero))
                            .addComponent(txtMail, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtLocalidad)
                            .addComponent(txtProvincia)
                            .addComponent(txtApellido, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtDni)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregar)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpiar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDni))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblApellido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefono))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFechaNac)
                    .addComponent(txtFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCalle)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNumero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLocalidad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProvincia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHistorial)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar)
                    .addComponent(btnAgregar)
                    .addComponent(btnEliminar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        // modifico
        if(this.constructor){
            this.controlador.agregarPaciente(this.txtDni.getText(), this.txtNombre.getText(), this.txtApellido.getText(), this.txtTelefono.getText(),this.txtMail.getText(), this.txtFechaNac.getText(), this.txtCalle.getText(), this.txtNumero.getText(), this.txtLocalidad.getText(), this.txtProvincia.getText(), this.txtHistorial.getText());
        } else {
            this.controlador.editarPaciente(this.paciente, this.txtDni.getText(),this.txtNombre.getText(), this.txtApellido.getText(), this.txtTelefono.getText(), this.txtMail.getText(), this.txtFechaNac.getText(), this.txtCalle.getText(), this.txtNumero.getText(), this.txtLocalidad.getText(), this.txtProvincia.getText(), this.txtHistorial.getText());
        }
        JOptionPane.showMessageDialog(rootPane, 
                    "El paciente se agrego de forma exitosa",
                    "Agregar Paciente",
                    JOptionPane.INFORMATION_MESSAGE);
        this.a.limpiar();
        cerrar();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        this.previo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (this.paciente != null) {
            int eleccion = JOptionPane.showConfirmDialog(rootPane, 
                "Desea eliminar el Paciente?",
                "Eliminar Paciente",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
            if (eleccion == JOptionPane.YES_OPTION){
                int i = this.controlador.eliminarPaciente(this.paciente);
                this.a.limpiar();
                cerrar();
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed
    private void mostrar() {
        // limpio las cajas de texto y labels
        this.btnLimpiar.setVisible(false);
        this.btnAgregar.setText("Guardar cambios");
        this.btnAgregar.setToolTipText("Editar Paciente");
        //datos
        this.txtDni.setText(this.paciente.getDni());
        this.txtNombre.setText(this.paciente.getNombres());
        this.txtApellido.setText(this.paciente.getApellidos());
        this.txtTelefono.setText(this.paciente.getTelefono());
        this.txtMail.setText(this.paciente.getMail());
        SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yyyy");
        this.txtFechaNac.setText(fecha.format(this.paciente.getFechaNacimiento()));
        Domicilio d = new Domicilio();
        d = this.paciente.getDomicilio();
        this.txtCalle.setText(d.getCalle());
        this.txtNumero.setText(d.getNumero());
        this.txtLocalidad.setText(d.getLocalidad());
        this.txtProvincia.setText(d.getProvincia());
        this.txtHistorial.setText(this.paciente.getHistorial());
    }
    private void limpiar() {
        // limpio las cajas de texto y labels
        this.txtDni.setText("");
        this.txtNombre.setText("");
        this.txtApellido.setText("");
        this.txtTelefono.setText("");
        this.txtMail.setText("");
        this.txtFechaNac.setText("");
        this.txtCalle.setText("");
        this.txtNumero.setText("");
        this.txtLocalidad.setText("");
        this.txtProvincia.setText("");
        this.txtHistorial.setText("");
    }
    
    public void cerrar(){
        this.previo.setVisible(true);
        this.dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblCalle;
    private javax.swing.JLabel lblDni;
    private javax.swing.JLabel lblFechaNac;
    private javax.swing.JLabel lblHistorial;
    private javax.swing.JLabel lblLocalidad;
    private javax.swing.JLabel lblMail;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblProvincia;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCalle;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtFechaNac;
    private javax.swing.JTextArea txtHistorial;
    private javax.swing.JTextField txtLocalidad;
    private javax.swing.JTextField txtMail;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtProvincia;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
