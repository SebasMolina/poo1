package modelo;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@DiscriminatorValue("medicos")
public class Medico extends Persona {

    private String numeroMatricula;
    @ManyToMany
    private List<Especialidad> especialidad;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date horarioInicio;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date horarioFinal;
    private int tiempoTurno;

    public Medico() {
        this.especialidad = new ArrayList<>();
    }
    
    public Medico(String dni, String matricula, Date horaComienza, Date horaTermina, String nombres, String apellidos, String telefono, String mail, Date fechaNacimiento, String calle, String numero, String localidad, String provincia, Especialidad especialidad, int tiempoTurno) {
        super.setDni(dni);
        this.numeroMatricula = matricula;
        this.horarioInicio = horaComienza;
        this.horarioFinal = horaTermina;
        super.setNombres(nombres);
        super.setApellidos(apellidos);
        super.setTelefono(telefono);
        super.setMail(mail);
        super.setFechaNacimiento(fechaNacimiento);
        Domicilio d = new Domicilio(calle, numero, localidad, provincia);
        super.setDomicilio(d);
        this.especialidad = new ArrayList<>();
        this.tiempoTurno= tiempoTurno;
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
    @Override
    public String toString() {
        //agregamos                                              M.N al string o no?
        return super.getApellidos() + ' ' + super.getNombres() + " " + numeroMatricula;
    }
    
}
