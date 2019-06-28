package modelo;


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
    private Paciente paciente;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fecha;
    private String descripcion;
    @OneToOne
    private Medico medico;

    public Paciente getPaciente() {
        return paciente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
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
    
    
}
