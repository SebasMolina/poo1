/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Controlador;

/**
 *
 * @author sebas
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    private final Controlador controlador;
    /**
     * Creates new form VentanaPrincipal
     * @param c
     */


    public VentanaPrincipal(Controlador c) {
        this.controlador = c;
        initComponents();
    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_doctores = new javax.swing.JButton();
        btn_pacientes = new javax.swing.JButton();
        btn_citas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ventana Principal");
        setMaximumSize(new java.awt.Dimension(500, 500));
        setSize(new java.awt.Dimension(300, 0));

        btn_doctores.setText("Doctores");
        btn_doctores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_doctoresActionPerformed(evt);
            }
        });

        btn_pacientes.setText("Pacientes");
        btn_pacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pacientesActionPerformed(evt);
            }
        });

        btn_citas.setText("Citas");
        btn_citas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_citasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_citas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_pacientes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                    .addComponent(btn_doctores, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_doctores)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_pacientes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_citas)
                .addContainerGap(171, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_doctoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_doctoresActionPerformed
        // TODO add your handling code here:
        VentanaDoctores vd = new VentanaDoctores(this.controlador, this);
        this.setVisible(false);
        vd.setLocationRelativeTo(null);
        vd.setResizable(false);
        vd.setVisible(true);
    }//GEN-LAST:event_btn_doctoresActionPerformed

    private void btn_pacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pacientesActionPerformed
        // TODO add your handling code here:
        VentanaPacientes vp = new VentanaPacientes(this.controlador, this);
        this.setVisible(true);
        vp.setLocationRelativeTo(null);
        vp.setResizable(false);
        vp.setVisible(true);
    }//GEN-LAST:event_btn_pacientesActionPerformed

    private void btn_citasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_citasActionPerformed
        // TODO add your handling code here:
        VentanaCitas vc = new VentanaCitas(this.controlador, this);
        this.setVisible(false);
        vc.setLocationRelativeTo(null);
        vc.setResizable(false);
        vc.setVisible(true);
    }//GEN-LAST:event_btn_citasActionPerformed

    /**
     * @param args the command line arguments
     */

    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_citas;
    private javax.swing.JButton btn_doctores;
    private javax.swing.JButton btn_pacientes;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
