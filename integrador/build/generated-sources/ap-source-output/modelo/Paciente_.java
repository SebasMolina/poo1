package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Cita;
import modelo.Historia;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-08-19T18:40:19")
@StaticMetamodel(Paciente.class)
public class Paciente_ extends Persona_ {

    public static volatile ListAttribute<Paciente, Historia> historiaClinica;
    public static volatile ListAttribute<Paciente, Cita> listaCitas;
    public static volatile SingularAttribute<Paciente, String> historial;

}