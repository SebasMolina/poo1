package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Especialidad;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-08-19T18:40:19")
@StaticMetamodel(Medico.class)
public class Medico_ extends Persona_ {

    public static volatile SingularAttribute<Medico, String> horarioInicio;
    public static volatile SingularAttribute<Medico, String> horarioFinal;
    public static volatile SingularAttribute<Medico, Integer> tiempoTurno;
    public static volatile ListAttribute<Medico, Especialidad> especialidad;
    public static volatile SingularAttribute<Medico, String> numeroMatricula;

}