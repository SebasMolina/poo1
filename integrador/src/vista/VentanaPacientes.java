/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Controlador;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;

/**
 *
 * @author sebas
 */
public class VentanaPacientes extends javax.swing.JFrame {
    
    private final Controlador controlador;
    private final JFrame previo;
    
    public VentanaPacientes(Controlador c, JFrame p) {
        this.controlador = c;
        this.previo = p;
        initComponents();      
        limpiar(); 
    }

    private void limpiar () {
        // pueblo la lista
        this.listaPacientes.setListData(this.controlador.listarPacientes().toArray());        
        // deselecciono la lista
        this.listaPacientes.clearSelection();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaPacientes = new javax.swing.JList();
        lbl_titulo_lista = new javax.swing.JLabel();
        btn_agregar = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pacientes");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        listaPacientes.setToolTipText("");
        listaPacientes.setName(""); // NOI18N
        listaPacientes.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaPacientesValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listaPacientes);

        lbl_titulo_lista.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_titulo_lista.setText("LISTA DE PACIENTES");

        btn_agregar.setText("Agregar Paciente");
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });

        btn_editar.setText("Editar Paciente");
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_titulo_lista, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_agregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_editar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                .addContainerGap(22, Short.MAX_VALUE))
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
        
        VentanaPacientesABM vpABM = new VentanaPacientesABM(this.controlador, this);
        this.setVisible(false);
        vpABM.setLocationRelativeTo(null);
        vpABM.setResizable(false);
        vpABM.setVisible(true);
        
        
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void listaPacientesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaPacientesValueChanged
        // verificamos que la lista tenga un item seleccionado
        if (!this.listaPacientes.isSelectionEmpty()) {
            
        }
        /*
        if (!this.listaPacientes.isSelectionEmpty()) {
            // obtengo el item seleccionado
            Empleado empleado = (Empleado) this.listaEmpleados.getSelectedValue();
            // asigno los valores de los atributos a las caja de texto
            this.labelId.setText(empleado.getId().toString());
            this.txtApellidos.setText(empleado.getApellidos());
            this.txtNombres.setText(empleado.getNombres());
            // en el caso de fecha verifico si hay un valor            
            if (empleado.getFechaIngreso() != null ) {
                // asigno el valor del atributo fechaAlta a la caja de texto
                SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yyyy");
                this.txtFechaIngreso.setText(fecha.format(empleado.getFechaIngreso()));
            } else {
                this.txtFechaIngreso.setText("");
            }
            // obtengo la direccion
            Direccion d = empleado.getDireccion();
            // si existe una direccion cargo
            // asigno los valores de los atributos a las caja de texto
            if (d != null) {
                this.txtCalle.setText(d.getCalle());
                this.txtNumero.setText(d.getNumero());
                this.txtLocalidad.setText(d.getLocalidad());
                this.txtProvincia.setText(d.getProvincia());
            } else {
                // sino dejo vacias las cajas de texto
                this.txtCalle.setText("");
                this.txtNumero.setText("");
                this.txtLocalidad.setText("");
                this.txtProvincia.setText("");
            }
            // si el departamento no existe
            System.out.println(empleado.getDepartamento());
            if (empleado.getDepartamento() != null) {
                this.comboDepartamentos.setSelectedItem(empleado.getDepartamento());
            } else {
                this.comboDepartamentos.setSelectedItem(null);
            }
        }

        // TODO add your handling code here: */
    }//GEN-LAST:event_listaPacientesValueChanged

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
        // TODO add your handling code here:
        // verificamos que la lista tenga un item seleccionado
        if (!this.listaPacientes.isSelectionEmpty()) {
        VentanaPacientesABM vpABM = new VentanaPacientesABM(this.controlador, this);
        this.setVisible(true);
        vpABM.setLocationRelativeTo(null);
        vpABM.setResizable(false);
        vpABM.setVisible(true);
        }
    }//GEN-LAST:event_btn_editarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_editar;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_titulo_lista;
    private javax.swing.JList listaPacientes;
    // End of variables declaration//GEN-END:variables

}
