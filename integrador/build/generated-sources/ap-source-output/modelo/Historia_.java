package modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Medico;
import modelo.Paciente;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-08-18T23:42:07")
@StaticMetamodel(Historia.class)
public class Historia_ { 

    public static volatile SingularAttribute<Historia, String> descripcion;
    public static volatile SingularAttribute<Historia, Date> fecha;
    public static volatile SingularAttribute<Historia, Paciente> paciente;
    public static volatile SingularAttribute<Historia, Medico> medico;
    public static volatile SingularAttribute<Historia, Integer> id;

}