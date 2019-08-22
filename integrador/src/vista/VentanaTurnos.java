/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Controlador;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modelo.*;

public class VentanaTurnos extends javax.swing.JFrame {

    private final Controlador controlador;
    private final JFrame previo;
    private Cita cita;
    private Object[] listaTurnosDia;
    
    public VentanaTurnos(Controlador c, JFrame p) {
        this.controlador = c;
        this.previo = p;
        this.cita = new Cita();
        initComponents();      
        limpiar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSeleccionarTurno = new javax.swing.JButton();
        comboEspecialidad = new javax.swing.JComboBox<>();
        lblEspecialidad = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaTurnos = new javax.swing.JList();
        dateSeleccion = new rojeru_san.componentes.RSDateChooser();
        comboDoctores = new javax.swing.JComboBox<>();
        lblDoctores = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        btnCrear = new javax.swing.JButton();
        btnSeleccionarFecha = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Turnos");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        btnSeleccionarTurno.setText("Seleccionar Turno");
        btnSeleccionarTurno.setToolTipText("Editar turno");
        btnSeleccionarTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarTurnoActionPerformed(evt);
            }
        });

        comboEspecialidad.setToolTipText("");
        comboEspecialidad.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboEspecialidadItemStateChanged(evt);
            }
        });

        lblEspecialidad.setText("Seleccione una especialidad:");

        jScrollPane1.setViewportView(listaTurnos);

        dateSeleccion.setToolTipText("seleccionar la fecha que desea");
        dateSeleccion.setName(""); // NOI18N

        comboDoctores.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboDoctoresItemStateChanged(evt);
            }
        });

        lblDoctores.setText("Seleccione un doctor:");

        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("TURNOS");

        btnCrear.setText("Crear Turnos");
        btnCrear.setToolTipText("Tiene que confirmar la fecha para que muestre los turnos");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        btnSeleccionarFecha.setText("Seleccionar");
        btnSeleccionarFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarFechaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSeleccionarTurno)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblDoctores)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnSeleccionarFecha))
                                    .addComponent(dateSeleccion, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                                    .addComponent(lblEspecialidad, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboEspecialidad, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(comboDoctores, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 35, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEspecialidad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDoctores)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboDoctores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dateSeleccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrear)
                    .addComponent(btnSeleccionarFecha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSeleccionarTurno)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        cerrar();
    }//GEN-LAST:event_formWindowClosing

    private void btnSeleccionarTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarTurnoActionPerformed
        // TODO add your handling code here:
        this.cita = (Cita)listaTurnos.getSelectedValue();
        VentanaTurnosABM vcABM = new VentanaTurnosABM(this.controlador, this, this.cita);
        this.setVisible(true);
        vcABM.setLocationRelativeTo(null);
        vcABM.setResizable(false);
        vcABM.setVisible(true);
    }//GEN-LAST:event_btnSeleccionarTurnoActionPerformed

    private void comboEspecialidadItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboEspecialidadItemStateChanged
        // TODO add your handling code here:
        Especialidad e = (Especialidad) comboEspecialidad.getSelectedItem();
        mostrarDoctor();
        if (e!=null){
            verTurnosDia(dateSeleccion.getDatoFecha());
        } else {
            deshabilitarBotonCrear();
        }
    }//GEN-LAST:event_comboEspecialidadItemStateChanged

    private void comboDoctoresItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboDoctoresItemStateChanged
        // TODO add your handling code here:
        Medico m = (Medico) comboDoctores.getSelectedItem();
        if (m!=null){
            btnSeleccionarTurno.setEnabled(true);
            this.cita.setMedico(m);
            verTurnosDoctor(m);
        } else {
            deshabilitarBotonCrear();
            btnSeleccionarTurno.setEnabled(false);
            this.listaTurnos.setListData(new String[0]);    //limpia la lista
        }
        
    
    }//GEN-LAST:event_comboDoctoresItemStateChanged

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        // TODO add your handling code here:
        Medico m = (Medico)comboDoctores.getSelectedItem();
        if(comboEspecialidad.getSelectedIndex()!=-1 && comboDoctores.getSelectedIndex()!=-1){
            crearTurnos();
            btnSeleccionarTurno.setEnabled(true);
            verTurnosDoctor(m);
        }
        
    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnSeleccionarFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarFechaActionPerformed
        // TODO add your handling code here:
        Especialidad e = (Especialidad) comboEspecialidad.getSelectedItem();
        mostrarDoctor();
        if (e!=null){
            verTurnosDia(dateSeleccion.getDatoFecha());
            deshabilitarBotonCrear();
        }   
    }//GEN-LAST:event_btnSeleccionarFechaActionPerformed

    private void limpiar(){
        DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel(this.controlador.listarEspecialidades().toArray());
        this.comboEspecialidad.setModel(modeloCombo);
        this.comboEspecialidad.setSelectedIndex(-1);
        this.comboDoctores.setSelectedIndex(-1);
        this.dateSeleccion.setFormatoFecha("dd/MM/yyyy");
        this.dateSeleccion.setDatoFecha(new Date());
        btnSeleccionarTurno.setEnabled(false);
    }
    
    public void mostrarDoctor(){
        Especialidad e = (Especialidad) comboEspecialidad.getSelectedItem();
        if (e != null){
            DefaultComboBoxModel modeloComboMedicos = new DefaultComboBoxModel(e.getMedico().toArray());
            this.comboDoctores.setModel(modeloComboMedicos);
            this.comboDoctores.setSelectedIndex(-1);
        }
        
    }

    private void deshabilitarBotonCrear(){
        this.btnCrear.setEnabled(false);
    }
    
    private void cerrar(){
        this.previo.setVisible(true);
        this.dispose();
    }
        
    private void verTurnosDia(Date d){
        //TURNOS POR DIA NO IMPORTA DOCTOR
        this.listaTurnosDia= this.controlador.listarTurnos(d);
        //guardo en el 
        this.listaTurnos.setListData(this.listaTurnosDia);
    }
    
    private void verTurnosDoctor(Medico m){
        Object[] aux = this.controlador.listarTurnos(m, this.listaTurnosDia);
        this.listaTurnos.setListData(aux);
        if (aux.length==0){
            this.btnCrear.setEnabled(true);
            this.btnSeleccionarTurno.setEnabled(false); //no hay turnos no esta habilitado
        }
        
    }
    
    private void crearTurnos(){
    //ya tengo seleccionado el doctor y voy a crear citas vacias para ese doctor
    Date a = new Date();
        if((dateSeleccion.getDatoFecha()).getDay()>= a.getDay()){
            Calendar dia = Calendar.getInstance();//crear una instancia de calendario se usa para hora empieza
            Calendar aux = Calendar.getInstance();//instancia para horatermina 
            dia.setTime(dateSeleccion.getDatoFecha()); //dia que seleccione en el combo

            dia.set(Calendar.HOUR_OF_DAY,this.cita.getMedico().getHorarioInicio().getHours());
            dia.set(Calendar.MINUTE,this.cita.getMedico().getHorarioInicio().getMinutes());
            aux.setTime(dateSeleccion.getDatoFecha()); //dia que seleccione en el combo
            aux.set(Calendar.HOUR_OF_DAY,this.cita.getMedico().getHorarioInicio().getHours());
            aux.set(Calendar.MINUTE,this.cita.getMedico().getHorarioInicio().getMinutes()+this.cita.getMedico().getTiempoTurno());
            int rango = (this.cita.getMedico().getHorarioFinal().getHours()
                        -this.cita.getMedico().getHorarioInicio().getHours())*60;
            int cantTurnosDia = rango/this.cita.getMedico().getTiempoTurno();
            for (int i=1;i<=cantTurnosDia;i++){
                this.controlador.agregarTurno(this.cita.getMedico(), dia.getTime(), aux.getTime());
                aux.add(Calendar.MINUTE, this.cita.getMedico().getTiempoTurno());
                dia.add(Calendar.MINUTE, this.cita.getMedico().getTiempoTurno());
            }
        //se pueden crear duplicados
        }
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnSeleccionarFecha;
    private javax.swing.JButton btnSeleccionarTurno;
    private javax.swing.JComboBox<String> comboDoctores;
    private javax.swing.JComboBox<String> comboEspecialidad;
    private rojeru_san.componentes.RSDateChooser dateSeleccion;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDoctores;
    private javax.swing.JLabel lblEspecialidad;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JList listaTurnos;
    // End of variables declaration//GEN-END:variables
}