package modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Medico;
import modelo.Paciente;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-08-19T18:40:19")
@StaticMetamodel(Cita.class)
public class Cita_ { 

    public static volatile SingularAttribute<Cita, Date> horaTermina;
    public static volatile SingularAttribute<Cita, Boolean> asistencia;
    public static volatile SingularAttribute<Cita, Paciente> paciente;
    public static volatile SingularAttribute<Cita, Medico> medico;
    public static volatile SingularAttribute<Cita, Integer> id;
    public static volatile SingularAttribute<Cita, Date> horaComienzo;
    public static volatile SingularAttribute<Cita, Boolean> disponible;

}