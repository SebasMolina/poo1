package modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Domicilio;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-08-22T10:32:31")
@StaticMetamodel(Persona.class)
public abstract class Persona_ { 

    public static volatile SingularAttribute<Persona, String> apellidos;
    public static volatile SingularAttribute<Persona, Domicilio> domicilio;
    public static volatile SingularAttribute<Persona, String> mail;
    public static volatile SingularAttribute<Persona, Date> fechaNacimiento;
    public static volatile SingularAttribute<Persona, Integer> id;
    public static volatile SingularAttribute<Persona, String> telefono;
    public static volatile SingularAttribute<Persona, String> dni;
    public static volatile SingularAttribute<Persona, String> nombres;

}