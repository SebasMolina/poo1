/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Controlador;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modelo.*;

public class VentanaTurnos extends javax.swing.JFrame {

    private final Controlador controlador;
    private final JFrame previo;
    private Medico medico;
    private Cita cita;
    
    public VentanaTurnos(Controlador c, JFrame p) {
        this.controlador = c;
        this.previo = p;
        initComponents();      
        limpiar();
        crear(); 
        //cuando entro en la ventana creo los turnos
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSeleccionarTurno = new javax.swing.JButton();
        comboEspecialidad = new javax.swing.JComboBox<>();
        lblEspecialidad = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaTurnos = new javax.swing.JList<>();
        dateSeleccion = new rojeru_san.componentes.RSDateChooser();
        comboDoctores = new javax.swing.JComboBox<>();
        lblDoctores = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();

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
        dateSeleccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dateSeleccionMouseClicked(evt);
            }
        });

        comboDoctores.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboDoctoresItemStateChanged(evt);
            }
        });

        lblDoctores.setText("Seleccione un doctor:");

        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("TURNOS");

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
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(dateSeleccion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                                    .addComponent(lblEspecialidad)
                                    .addComponent(comboEspecialidad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(comboDoctores, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(lblDoctores)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addGap(18, 18, 18)
                .addComponent(dateSeleccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        VentanaTurnosABM vcABM = new VentanaTurnosABM(this.controlador, this, this.medico,this.cita);
        this.setVisible(true);
        vcABM.setLocationRelativeTo(null);
        vcABM.setResizable(false);
        vcABM.setVisible(true);
    }//GEN-LAST:event_btnSeleccionarTurnoActionPerformed

    private void comboEspecialidadItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboEspecialidadItemStateChanged
        // TODO add your handling code here:
        mostrarDoctor();
    }//GEN-LAST:event_comboEspecialidadItemStateChanged

    private void comboDoctoresItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboDoctoresItemStateChanged
        // TODO add your handling code here:
        Medico m = (Medico) comboDoctores.getSelectedItem();
        if (m != null){
            this.medico =m;
            //aca va la parte de la lista de turnos
            crear();//? ver el evento del calendario
        } else {
            //muy pesado es este cuadro
            //JOptionPane.showMessageDialog(rootPane, "Seleccione un Doctor para ver los turnos","", JOptionPane.WARNING_MESSAGE);
        }
        
        
    }//GEN-LAST:event_comboDoctoresItemStateChanged

    private void dateSeleccionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dateSeleccionMouseClicked
        // TODO add your handling code here:
        //Ver las citas del dia seleccionado y del doctor seleccionado
        //crear(); //no iria aca seria el metodo verCitas()
    }//GEN-LAST:event_dateSeleccionMouseClicked

    private void limpiar(){
        DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel(this.controlador.listarEspecialidades().toArray());
        this.comboEspecialidad.setModel(modeloCombo);
        this.comboEspecialidad.setSelectedIndex(-1);
        this.comboDoctores.setSelectedIndex(-1);
        //lista
        this.dateSeleccion.setFormatoFecha("dd/MM/yyyy");
        this.dateSeleccion.setDatoFecha(new Date());
    }
    
    public void mostrarDoctor(){
        Especialidad e = (Especialidad) comboEspecialidad.getSelectedItem();
        if (e != null){
            DefaultComboBoxModel modeloComboMedicos = new DefaultComboBoxModel(e.getMedico().toArray());
            this.comboDoctores.setModel(modeloComboMedicos);
            this.comboDoctores.setSelectedIndex(-1);
        }
    }
    
    private void cerrar(){
        this.previo.setVisible(true);
        this.dispose();
    }
    //CREAR LOS TURNOS DESDE HOY HASTA
    //4 SEMANAS SIGUIENTES
    //ir preguntando con la base de datos.
    private void crear(){
        /*
        Calendar calendario = new GregorianCalendar();
        int mes = calendario.get(Calendar.MONTH); //para que te de el mes
        //Convert Date to Calendar
	private Calendar dateToCalendar(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar;
	}
	//Convert Calendar to Date
	private Date calendarToDate(Calendar calendar) {
		return calendar.getTime();
	}
        */
        
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSeleccionarTurno;
    private javax.swing.JComboBox<String> comboDoctores;
    private javax.swing.JComboBox<String> comboEspecialidad;
    private rojeru_san.componentes.RSDateChooser dateSeleccion;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDoctores;
    private javax.swing.JLabel lblEspecialidad;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JList<String> listaTurnos;
    // End of variables declaration//GEN-END:variables
}