/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Controlador;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modelo.*;

/**
 *
 * @author sebas
 */
public class VentanaTurnosPaciente extends javax.swing.JFrame {

    private final Controlador controlador;
    private final JFrame previo;
    private Paciente p;
    
    public VentanaTurnosPaciente(Controlador c, JFrame p) {
        this.controlador = c;
        this.previo = p;
        initComponents();
        limpiar();
    }

    public VentanaTurnosPaciente(Controlador c, JFrame p,Paciente paciente) {
        this.controlador = c;
        this.previo = p;
        this.p = paciente;
        initComponents();
        limpiar();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPaciente = new javax.swing.JLabel();
        lblListaTurnos = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaTurnos = new javax.swing.JList();
        btnCancelar = new javax.swing.JButton();
        btnConfirmar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lista de turnos");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        lblPaciente.setText("Paciente:");

        lblListaTurnos.setText("Lista de turnos:");

        listaTurnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaTurnosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listaTurnos);

        btnCancelar.setText("Cancelar Cita");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnConfirmar.setText("Confirmar Asistencia");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(lblPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblListaTurnos)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(btnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addComponent(btnConfirmar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPaciente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblListaTurnos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnConfirmar))
                .addContainerGap(95, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        Cita c = (Cita) this.listaTurnos.getSelectedValue();
        
        if(!this.listaTurnos.isSelectionEmpty()){
            int eleccion = JOptionPane.showConfirmDialog(rootPane, 
                "Desea cancelar la cita?",
                "Cancelar Cita",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
            if (eleccion == JOptionPane.YES_OPTION){
                c.setDisponible(true);
                this.p.quitarCitas(c);
                //c.setPaciente(null);
                this.controlador.editarTurno(c);
            }
        }
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        cerrar();
    }//GEN-LAST:event_formWindowClosing

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        // TODO add your handling code here:
        Cita c = (Cita) this.listaTurnos.getSelectedValue();
        if(!this.listaTurnos.isSelectionEmpty()){
            c.setAsistencia(true);
            this.controlador.editarTurno(c);
            JOptionPane.showMessageDialog(rootPane, "Se confirmo la asistencia",
                    "Confirmar Asistencia", JOptionPane.INFORMATION_MESSAGE);
            limpiar();
        }
        
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void listaTurnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaTurnosMouseClicked
        // TODO add your handling code here:
        if(!this.listaTurnos.isSelectionEmpty()){
            this.btnConfirmar.setEnabled(true);
            this.btnCancelar.setEnabled(true);
        }
    }//GEN-LAST:event_listaTurnosMouseClicked

    /**
     * @param args the command line arguments
     */
    
    private void limpiar(){
        this.lblPaciente.setText(this.lblPaciente.getText()+" "+this.p.getApellidos()+" "+this.p.getNombres());
        this.listaTurnos.setSelectedIndex(-1);
        this.listaTurnos.setListData(this.controlador.listarTurnos(p));
        this.btnConfirmar.setEnabled(false);
        this.btnCancelar.setEnabled(false);
    }

    private void cerrar(){
        this.previo.setVisible(true);
        this.dispose();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblListaTurnos;
    private javax.swing.JLabel lblPaciente;
    private javax.swing.JList listaTurnos;
    // End of variables declaration//GEN-END:variables
}
