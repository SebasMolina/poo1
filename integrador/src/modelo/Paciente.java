package modelo;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

@Entity
@DiscriminatorValue("pacientes")
public class Paciente extends Persona {
    
    private String historial;
    @OneToMany(mappedBy = "pacienteH")
    private List<Historia> historiaClinica;
    @OneToMany(mappedBy = "paciente")
    private List<Cita> listaCitas;

    public Paciente() {
        this.historiaClinica = new ArrayList<>();
        this.listaCitas = new ArrayList<>();
    }
    
    public Paciente (String dni, String nombre, String apellido,String telefono, String mail, Date fechaNacimiento, String calle, String numero, String localidad, String provincia, String historial) {
        super.setDni(dni);
        super.setNombres(nombre);
        super.setApellidos(apellido);
        super.setTelefono(telefono);
        super.setMail(mail);
        super.setFechaNacimiento(fechaNacimiento);
        Domicilio d = new Domicilio(calle, numero, localidad, provincia);
        super.setDomicilio(d);
        this.historial = historial;
        this.historiaClinica = new ArrayList<>();
        this.listaCitas = new ArrayList<>();      
    }
    
    public String getHistorial() {
        return historial;
    }

    public void setHistorial(String historial) {
        this.historial = historial;
    }

    public List<Historia> getHistoriaClinica() {
        return historiaClinica;
    }

    public void setHistoriaClinica(List<Historia> historiaClinica) {
        this.historiaClinica = historiaClinica;
    }

    public List<Cita> getListaCitas() {
        return listaCitas;
    }

    public void setListaCitas(List<Cita> listaCitas) {
        this.listaCitas = listaCitas;
    }

    public void agregarHistoriaClinica(Historia h) {
        this.historiaClinica.add(h);
    }

    public void quitarHistoriaClinica(Historia h) {
        this.historiaClinica.remove(h);
    }
    
    public void agregarCitas(Cita c) {
        this.listaCitas.add(c);
    }

    public void quitarCitas(Cita c) {
        this.listaCitas.remove(c);
    }
    
    
    @Override
    public String toString() {
        return "(" + super.getDni() +  ") " + super.getApellidos() + " " + super.getNombres();
    }
}
