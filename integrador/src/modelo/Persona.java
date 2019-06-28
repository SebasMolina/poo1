package modelo;


import java.util.Date;
import javax.persistence.*;


@Entity
@Table(name="personas")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "TipoPersona")
public abstract class Persona {
    @Id
    @SequenceGenerator(name="sec_personas",initialValue=1,allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="sec_personas")
    private int id;
    private String dni;
    private String nombres;
    private String apellidos;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaNacimiento;
    private String telefono;
    private String mail;
    @Embedded
    private Domicilio domicilio;

    protected Persona() {
    }
    
    public int getid() {
        return id;
    }
    
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }
    
    @Override
    public String toString() {
        return "(" + this.dni +  ") " + this.apellidos + " " + this.nombres;
    }
    
}
