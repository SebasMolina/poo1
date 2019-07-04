/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Controlador;
import javax.swing.JFrame;

public class VentanaCitas extends javax.swing.JFrame {

    private final Controlador controlador;
    private final JFrame previo;
    
    public VentanaCitas(Controlador c, JFrame p) {
        this.controlador = c;
        this.previo = p;
        initComponents();      
//      limpiar(); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAgregarCita = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Citas");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        btnAgregarCita.setText("Agregar Cita");
        btnAgregarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCitaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(226, 226, 226)
                .addComponent(btnAgregarCita)
                .addGap(0, 389, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(341, 341, 341)
                .addComponent(btnAgregarCita)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        this.previo.setVisible(rootPaneCheckingEnabled);
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    private void btnAgregarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCitaActionPerformed
        // TODO add your handling code here:
        VentanaCitasABM vcABM = new VentanaCitasABM(this.controlador, this);
        this.setVisible(false);
        vcABM.setLocationRelativeTo(null);
        vcABM.setResizable(false);
        vcABM.setVisible(true);
    }//GEN-LAST:event_btnAgregarCitaActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarCita;
    // End of variables declaration//GEN-END:variables

}
