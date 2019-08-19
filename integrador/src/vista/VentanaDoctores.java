/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Controlador;
import javax.swing.JFrame;
import modelo.Medico;

/**
 *
 * @author sebas
 */
public class VentanaDoctores extends javax.swing.JFrame {
    
    private final Controlador controlador;
    private final JFrame previo;
    private Medico medico;
    
    public VentanaDoctores(Controlador c, JFrame p) {
        this.controlador = c;
        this.previo = p;
        initComponents();      
        limpiar(); 
    }
    public void limpiar() {
        // pueblo la lista
        this.listaDoctores.setListData(this.controlador.listarDoctores().toArray());        
        // deselecciono la lista
        this.listaDoctores.clearSelection();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_titulo_lista = new javax.swing.JLabel();
        btn_agregar = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaDoctores = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Doctores");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        lbl_titulo_lista.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_titulo_lista.setText("LISTA DE DOCTORES");

        btn_agregar.setText("Agregar Doctor");
        btn_agregar.setToolTipText("Agregar  un nuevo doctor");
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });

        btn_editar.setText("Editar Doctor");
        btn_editar.setToolTipText("Seleccione un doctor y edite");
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });

        listaDoctores.setToolTipText("");
        listaDoctores.setName(""); // NOI18N
        listaDoctores.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaDoctoresValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listaDoctores);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_titulo_lista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_agregar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_titulo_lista)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_agregar)
                    .addComponent(btn_editar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        this.previo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        // TODO add your handling code here:

        VentanaDoctoresABM vdABM = new VentanaDoctoresABM(this.controlador, this);
        this.setVisible(false);
        vdABM.setLocationRelativeTo(null);
        vdABM.setResizable(false);
        vdABM.setVisible(true);

    }//GEN-LAST:event_btn_agregarActionPerformed

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
        // TODO add your handling code here:
        // verificamos que la lista tenga un item seleccionado
        if (!this.listaDoctores.isSelectionEmpty()) {
            VentanaDoctoresABM vdABM = new VentanaDoctoresABM(this.controlador, this, this.medico);
            this.setVisible(false);
            vdABM.setLocationRelativeTo(null);
            vdABM.setResizable(false);
            vdABM.setVisible(true);
        }
    }//GEN-LAST:event_btn_editarActionPerformed

    private void listaDoctoresValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaDoctoresValueChanged
        // verificamos que la lista tenga un item seleccionado
        if (!this.listaDoctores.isSelectionEmpty()) {
            this.medico = (Medico) this.listaDoctores.getSelectedValue();
        }
    }//GEN-LAST:event_listaDoctoresValueChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_editar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_titulo_lista;
    private javax.swing.JList listaDoctores;
    // End of variables declaration//GEN-END:variables

}
