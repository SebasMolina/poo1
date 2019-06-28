package modelo;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

@Entity
@DiscriminatorValue("medicos")
public class Medico extends Persona {

    private String numeroMatricula;
    @ManyToMany
    private List<Especialidad> especialidad;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date horarioInicio;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date horarioFinal;
    private int tiempoTurno;

    public Medico() {
        this.especialidad = new ArrayList<>();
    }
    
    public String getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(String numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public List<Especialidad> getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(List<Especialidad> especialidad) {
        this.especialidad = especialidad;
    }

    

    public Date getHorarioInicio() {
        return horarioInicio;
    }

    public void setHorarioInicio(Date horarioInicio) {
        this.horarioInicio = horarioInicio;
    }

    public Date getHorarioFinal() {
        return horarioFinal;
    }

    public void setHorarioFinal(Date horarioFinal) {
        this.horarioFinal = horarioFinal;
    }

    public int getTiempoTurno() {
        return tiempoTurno;
    }

    public void setTiempoTurno(int tiempoTurno) {
        this.tiempoTurno = tiempoTurno;
    }
    
    public void agregarEspecialidad(Especialidad e) {
        this.especialidad.add(e);
    }

    public void quitarEspecialidad(Especialidad e) {
        this.especialidad.remove(e);
    }
}
