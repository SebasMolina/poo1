package modelo;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;
import modelo.Medico;


@Entity
@Table(name="especialidad")
public class Especialidad {
@Id
    @SequenceGenerator(name="sec_especialidad",initialValue=1,allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="sec_especialidad")
    private int id;
    private String nombre;
    @ManyToMany(mappedBy = "especialidad")
    private List<Medico> medico;

    public Especialidad() {
        this.medico = new ArrayList<>();
    }

    public Especialidad(String nombre) {
        this.nombre = nombre;
        this.medico = new ArrayList<>();
    }
    
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Medico> getMedico() {
        return medico;
    }

    public void setMedico(List<Medico> medico) {
        this.medico = medico;
    }

    public void agregarMedico(Medico m) {
        this.medico.add(m);
    }

    public void quitarMedico(Medico m) {
        this.medico.remove(m);
    }
    
    
    
    

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
