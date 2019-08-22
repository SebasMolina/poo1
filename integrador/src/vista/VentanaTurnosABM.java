/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Controlador;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modelo.*;

/**
 *
 * @author sebas
 */
public class VentanaTurnosABM extends javax.swing.JFrame {
    
    private final Controlador controlador;
    private final JFrame previo;
    private Cita cita;

    public VentanaTurnosABM(Controlador c, JFrame p) {
        initComponents();
        this.controlador = c;
        this.previo = p;
        limpiar();
    }
    
    public VentanaTurnosABM(Controlador c, JFrame p, Cita ci) {
        initComponents();
        this.controlador = c;
        this.previo = p;
        this.cita = ci;
        limpiar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPaciente = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        comboPaciente = new javax.swing.JComboBox();
        comboMedico = new javax.swing.JComboBox();
        lblMedico = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        lblComienza = new javax.swing.JLabel();
        lblTermina = new javax.swing.JLabel();
        lblHoraComienza = new javax.swing.JLabel();
        lblHoraTermina = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Detalle Turno");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        lblPaciente.setText("Paciente:");

        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("DETALLES TURNO");

        lblMedico.setText("Doctor:");

        btnGuardar.setText("Guardar cambios");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        lblComienza.setText("Comienza:");

        lblTermina.setText("Termina: ");

        lblHoraComienza.setText("08:00");

        lblHoraTermina.setText("08:30");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPaciente)
                            .addComponent(lblMedico))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboMedico, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboPaciente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 101, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblComienza)
                                .addGap(18, 18, 18)
                                .addComponent(lblHoraComienza)
                                .addGap(31, 31, 31)
                                .addComponent(lblTermina)
                                .addGap(18, 18, 18)
                                .addComponent(lblHoraTermina))
                            .addComponent(btnGuardar, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPaciente)
                    .addComponent(comboPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMedico))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblComienza)
                    .addComponent(lblTermina)
                    .addComponent(lblHoraComienza)
                    .addComponent(lblHoraTermina))
                .addGap(18, 18, 18)
                .addComponent(btnGuardar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        //aca guardar cambios 
        this.cita.setDisponible(false);
        this.cita.setPaciente((Paciente)this.comboPaciente.getSelectedItem());
        if (this.comboPaciente.getSelectedIndex()!= -1){
            JOptionPane.showMessageDialog(rootPane, 
                        "El turno se agrego de forma exitosa",
                        "Agregar Turno",
                        JOptionPane.INFORMATION_MESSAGE);
        //agregar el paciente a la cita
            this.controlador.editarTurno(this.cita);
            
        }
        cerrar();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        cerrar();
    }//GEN-LAST:event_formWindowClosing

    private void limpiar(){
        
        DefaultComboBoxModel modeloComboPacientes = new DefaultComboBoxModel(this.controlador.listarPacientes().toArray());
        this.comboPaciente.setModel(modeloComboPacientes);
        this.comboMedico.addItem(this.cita.getMedico());
        this.comboPaciente.setSelectedIndex(-1);
        //las horas saco de la lista que seleccione
        //formateo la hora para que quede lindo
        this.lblHoraComienza.setText(String.valueOf(this.cita.getHoraComienzo().getHours())+
        ":"+String.valueOf(this.cita.getHoraComienzo().getMinutes()));
        this.lblHoraTermina.setText(String.valueOf(this.cita.getHoraTermina().getHours())+
        ":"+String.valueOf(this.cita.getHoraTermina().getMinutes()));
        
    }

    //cerrar ventana
    private void cerrar(){
        this.previo.setVisible(true);
        this.dispose();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox comboMedico;
    private javax.swing.JComboBox comboPaciente;
    private javax.swing.JLabel lblComienza;
    private javax.swing.JLabel lblHoraComienza;
    private javax.swing.JLabel lblHoraTermina;
    private javax.swing.JLabel lblMedico;
    private javax.swing.JLabel lblPaciente;
    private javax.swing.JLabel lblTermina;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
