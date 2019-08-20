package modelo;


import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name="historias")
public class Historia {
    @Id
    @SequenceGenerator(name="sec_departamentos",initialValue=1,allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="sec_departamentos")
    private int id;
    @ManyToOne
    private Paciente pacienteH;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date fecha;
    private String descripcion;
    @OneToOne
    private Medico medico;

    public Paciente getPaciente() {
        return pacienteH;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setPaciente(Paciente paciente) {
        this.pacienteH = paciente;
    }
    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Medico getMedico() {
        return medico;
    }
    public void setMedico(Medico medico) {
        this.medico = medico;
    }
    
    public Historia() {
                
    }

    public Historia(Paciente paciente, Date fecha, String descripcion, Medico medico) {
        this.pacienteH = paciente;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.medico = medico;
    }

    @Override
    public String toString() {
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        //fomato fecha
        //La base de datos NO guarda la hora
        return formatoFecha.format(fecha) + " --- " + this.medico.getApellidos() + ' ' + this.medico.getNombres();
        //fecha + apellido + nombre
    }
    
}
