/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Controlador;
import javax.swing.JFrame;
import modelo.*;

/**
 *
 * @author sebas
 */

public class VentanaDoctoresABM extends javax.swing.JFrame {

    private final Controlador controlador;
    private final JFrame previo;
    private Medico medico;
    private boolean constructor;
    private VentanaDoctores a;
    
    public VentanaDoctoresABM(Controlador c, JFrame p) {
        this.controlador = c;
        this.previo = p;
        this.constructor = true;
        this.a = (VentanaDoctores) p;
        initComponents();
        limpiar();
    }
    
    public VentanaDoctoresABM(Controlador c, JFrame p, Medico m) {
        this.controlador = c;
        this.previo = p;
        this.constructor = false;
        this.a = (VentanaDoctores) p;
        this.medico = m;
        initComponents();
        limpiar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNumero = new javax.swing.JLabel();
        lblMail = new javax.swing.JLabel();
        lblFechaNac = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        txtDni = new javax.swing.JTextField();
        txtCalle = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        lblDni = new javax.swing.JLabel();
        lblCalle = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtFechaNac = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtLocalidad = new javax.swing.JTextField();
        lblApellido = new javax.swing.JLabel();
        lblLocalidad = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        txtProvincia = new javax.swing.JTextField();
        lblTelefono = new javax.swing.JLabel();
        lblProvincia = new javax.swing.JLabel();
        txtMail = new javax.swing.JTextField();
        lblMatricula = new javax.swing.JLabel();
        txtMatricula = new javax.swing.JTextField();
        lblComienza = new javax.swing.JLabel();
        txtComienza = new javax.swing.JTextField();
        lblHorarioTurno = new javax.swing.JLabel();
        lblTermina = new javax.swing.JLabel();
        txtTermina = new javax.swing.JTextField();
        comboEspecialidades = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Detalle Doctor");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        lblNumero.setText("Nº:");

        lblMail.setText("Mail: ");

        lblFechaNac.setText("F. Nacimiento:");

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        txtDni.setToolTipText("Inserte el Dni sin puntos");

        txtCalle.setToolTipText("");

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        lblDni.setText("DNI: ");

        lblCalle.setText("Calle:");

        txtNombre.setToolTipText("");

        txtFechaNac.setToolTipText("");

        lblNombre.setText("Nombre:");

        txtNumero.setToolTipText("");

        txtApellido.setToolTipText("");

        txtLocalidad.setToolTipText("");

        lblApellido.setText("Apellido:");

        lblLocalidad.setText("Localidad:");

        txtTelefono.setToolTipText("");

        txtProvincia.setToolTipText("");

        lblTelefono.setText("Telefono:");

        lblProvincia.setText("Provincia:");

        txtMail.setToolTipText("");

        lblMatricula.setText("Matricula");

        lblComienza.setText("Comienza:");

        txtComienza.setText("08:00");

        lblHorarioTurno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHorarioTurno.setText("HORARIO TURNO");

        lblTermina.setText("Termina:");

        txtTermina.setText("10:00");

        jLabel1.setText("Especialidad:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHorarioTurno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAgregar)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpiar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTelefono)
                            .addComponent(lblApellido)
                            .addComponent(lblMail)
                            .addComponent(lblFechaNac)
                            .addComponent(lblDni)
                            .addComponent(lblLocalidad)
                            .addComponent(lblProvincia)
                            .addComponent(lblCalle)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblMatricula)
                                .addComponent(lblNombre))
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(lblComienza)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboEspecialidades, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCalle, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(lblNumero)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumero, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE))
                            .addComponent(txtMail, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtLocalidad)
                            .addComponent(txtProvincia)
                            .addComponent(txtApellido, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtDni)
                            .addComponent(txtMatricula)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtComienza, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblTermina)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTermina, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
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
                    .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMatricula))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblHorarioTurno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtComienza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblComienza)
                    .addComponent(txtTermina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTermina))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboEspecialidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar)
                    .addComponent(btnAgregar))
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
            this.controlador.agregarDoctor(this.txtDni.getText(), this.txtMatricula.getText(), this.txtComienza.getText(), this.txtTermina.getText(), this.txtNombre.getText(), this.txtApellido.getText(), this.txtTelefono.getText(),this.txtMail.getText(), this.txtFechaNac.getText(), this.txtCalle.getText(), this.txtNumero.getText(), this.txtLocalidad.getText(), this.txtProvincia.getText(), (Especialidad) this.comboEspecialidades.getSelectedItem());
        } else {
            //this.controlador.editarDoctor();
        } 
        limpiar(); //limpia pantalla ABM
        this.a.limpiar(); //actualiza lista de pacientes

    }//GEN-LAST:event_btnAgregarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.previo.setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    private void limpiar() {
        // limpio las cajas de texto y labels
        this.txtDni.setText("");
        this.txtMatricula.setText("");
        this.txtNombre.setText("");
        this.txtApellido.setText("");
        this.txtTelefono.setText("");
        this.txtMail.setText("");
        this.txtFechaNac.setText("");
        this.txtCalle.setText("");
        this.txtNumero.setText("");
        this.txtLocalidad.setText("");
        this.txtProvincia.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> comboEspecialidades;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblCalle;
    private javax.swing.JLabel lblComienza;
    private javax.swing.JLabel lblDni;
    private javax.swing.JLabel lblFechaNac;
    private javax.swing.JLabel lblHorarioTurno;
    private javax.swing.JLabel lblLocalidad;
    private javax.swing.JLabel lblMail;
    private javax.swing.JLabel lblMatricula;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblProvincia;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTermina;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCalle;
    private javax.swing.JTextField txtComienza;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtFechaNac;
    private javax.swing.JTextField txtLocalidad;
    private javax.swing.JTextField txtMail;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtProvincia;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTermina;
    // End of variables declaration//GEN-END:variables
}
