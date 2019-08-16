/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Controlador;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import modelo.*;

/**
 *
 * @author sebas
 */
public class VentanaHistorias extends javax.swing.JFrame {

    private final Controlador controlador;
    private final JFrame previo;
    private Paciente paciente;

    public VentanaHistorias(Controlador controlador, JFrame previo) {
        this.controlador = controlador;
        this.previo = previo;
        initComponents();
        limpiar();
    }
    
    private void limpiar(){
        DefaultComboBoxModel modeloComboPacientes = new DefaultComboBoxModel(this.controlador.listarPacientes().toArray());
        this.comboPacientes.setModel(modeloComboPacientes);
        
        // deselecciono el combo
        this.comboPacientes.setSelectedIndex(-1);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        comboPacientes = new javax.swing.JComboBox<>();
        lblPaciente = new javax.swing.JLabel();
        lblListaHistorias = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnVer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Historias");

        jScrollPane1.setViewportView(jList1);

        comboPacientes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboPacientesItemStateChanged(evt);
            }
        });

        lblPaciente.setText("Seleccione el paciente");

        lblListaHistorias.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblListaHistorias.setText("Lista de historias clinicas");

        btnAgregar.setText("Agregar");
        btnAgregar.setToolTipText("agregar una nueva historia");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnVer.setText("Ver");
        btnVer.setToolTipText("seleccionar una historia para poder visualizarla");
        btnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addComponent(comboPacientes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPaciente)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lblListaHistorias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnVer)
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPaciente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblListaHistorias)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnVer))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnVerActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        this.paciente= (Paciente) this.comboPacientes.getSelectedItem();
        if (this.paciente != null) {
            VentanaHistoriasABM vhABM = new VentanaHistoriasABM(this.controlador, this, this.paciente);
            this.setVisible(false);
            vhABM.setLocationRelativeTo(null);
            vhABM.setResizable(false);
            vhABM.setVisible(true);
        }
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void comboPacientesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboPacientesItemStateChanged


        // TODO add your handling code here:
    }//GEN-LAST:event_comboPacientesItemStateChanged


    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnVer;
    private javax.swing.JComboBox<String> comboPacientes;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblListaHistorias;
    private javax.swing.JLabel lblPaciente;
    // End of variables declaration//GEN-END:variables
}
