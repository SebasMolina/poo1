/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Controlador;
import javax.swing.JFrame;

/**
 *
 * @author sebas
 */
public class VentanaDoctores extends javax.swing.JFrame {
    
    private final Controlador controlador;
    private final JFrame previo;
    
    public VentanaDoctores(Controlador c, JFrame p) {
        this.controlador = c;
        this.previo = p;
        initComponents();      
//      limpiar(); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_titulo_lista = new javax.swing.JLabel();
        btn_agregar = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaPacientes = new javax.swing.JList();

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
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });

        btn_editar.setText("Editar Doctor");
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
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
        if (!this.listaPacientes.isSelectionEmpty()) {
            VentanaPacientesABM vpABM = new VentanaPacientesABM(this.controlador, this);
            this.setVisible(true);
            vpABM.setLocationRelativeTo(null);
            vpABM.setResizable(false);
            vpABM.setVisible(true);
        }
    }//GEN-LAST:event_btn_editarActionPerformed

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_editar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_titulo_lista;
    private javax.swing.JList listaPacientes;
    // End of variables declaration//GEN-END:variables

}
