/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dao.Persistencia;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import modelo.*;

/**
 *
 * @author claudio
 * Clase que interactua con la vista y la capa de persistencia.
 * Funciona como una capa de servicios (es posible desacoplar en dos capas).
 * 
 * Idea:
 * UI -- Controlador -- Persistencia (DAO) -- Modelo
 * 
 * En aplicaciones complejas:
 * UI -- Controlador -- Servicio -- Persistencia (DAO) -- Modelo
 * 
 * Existen situaciones que se usan servicios y DAOs por cada clase del modelo.
 * 
 * Con JPA la parte de Persistencia se puede obviar o armar un DAO genérico.
 * En este proyecto se usa un DAO genérico (Clase Persistencia).
 * 
 * Esta NO ES una implementacion de controlador cuya tarea es capturar acciones de las vistas.
 * 
 */
public class Controlador {

    Persistencia persistencia;    

    public Controlador(Persistencia p) {
        this.persistencia = p;
    }
    
    public void agregarPaciente(String dni, String nombres, String apellidos, String telefono, String mail, String fechaNacimiento, String calle, String numero, String localidad, String provincia, String historial) {
        this.persistencia.iniciarTransaccion();
        try {
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
            Paciente p = new Paciente(dni, nombres.toUpperCase(), apellidos.toUpperCase(), telefono, mail, formatoFecha.parse(fechaNacimiento), calle.toUpperCase(), numero, localidad.toUpperCase(), provincia.toUpperCase(), historial.toUpperCase());
            // si es un departamento valido
            this.persistencia.insertar(p);
            this.persistencia.confirmarTransaccion();
        } catch (ParseException ex) {
            this.persistencia.descartarTransaccion();
            System.out.println("Error al capturar fecha");
        }
    }
    
    public List listarPacientes() {
        // retorno valores ordenados de la consulta
        return this.persistencia.buscarTodos(Paciente.class);
        //return this.persistencia.buscarTodosOrdenadosPor(Paciente.class, Paciente_.apellidos);
    }
    
    public Persona buscarPaciente(Long id) {
        return this.persistencia.buscar(Persona.class, id);
    }
    
    public void editarEmpleado(Paciente p, String dni, String nombres, String apellidos, String telefono, String mail, String fechaNacimiento, String calle, String numero, String localidad, String provincia, String historial) {
        if (p != null) {
            this.persistencia.iniciarTransaccion();
            try {
                SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
                p.setDni(dni);
                p.setNombres(nombres.toUpperCase());
                p.setApellidos(apellidos.toUpperCase());
                p.setTelefono(telefono);
                p.setMail(mail);
                p.setFechaNacimiento(formatoFecha.parse(fechaNacimiento));
                Domicilio d = p.getDomicilio();
                d.setCalle(calle.toUpperCase());
                d.setNumero(numero.toUpperCase());
                d.setLocalidad(localidad.toUpperCase());
                d.setProvincia(provincia.toUpperCase());
                p.setHistorial(historial);
                
                this.persistencia.modificar(p);
                this.persistencia.confirmarTransaccion();
            } catch (ParseException ex) {
                this.persistencia.descartarTransaccion();
            }
        }
    }
/*
    public List listarEmpleados() {
        // retorno valores ordenados de la consulta
        return this.persistencia.buscarTodosOrdenadosPor(Empleado.class, Empleado_.apellidos);
    }

    public Empleado buscarEmpleado(Long id) {
        return this.persistencia.buscar(Empleado.class, id);
    }

    

    public void editarEmpleado(Empleado e, String nombres, String apellidos, String fechaIngreso, String calle, String numero, String localidad, String provincia, Departamento departamento) {
        if (e != null) {
            this.persistencia.iniciarTransaccion();
            try {
                SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
                e.setNombres(nombres.toUpperCase());
                e.setApellidos(apellidos.toUpperCase());
                e.setFechaIngreso(formatoFecha.parse(fechaIngreso));
                Direccion d = e.getDireccion();
                d.setCalle(calle.toUpperCase());
                d.setNumero(numero.toUpperCase());
                d.setLocalidad(localidad.toUpperCase());
                d.setProvincia(provincia.toUpperCase());
                // relacion bidireccional
                // quito empleado de su departamento original
                if (e.getDepartamento() != null) {
                    Departamento departamentoViejo = e.getDepartamento();
                    departamentoViejo.eliminarEmpleado(e);
                    this.persistencia.modificar(departamentoViejo);
                }                
                // cambio a nuevo departamento
                e.setDepartamento(departamento);
                // agrego a nuevo departamento
                departamento.agregarEmpleado(e);
                this.persistencia.modificar(e);
                this.persistencia.modificar(departamento);                
                this.persistencia.confirmarTransaccion();
            } catch (ParseException ex) {
                this.persistencia.descartarTransaccion();
            }
        }
    }

    public int eliminarEmpleado(Empleado e) {
        if (e.getProyectos().isEmpty()) {
            this.persistencia.iniciarTransaccion();
            Departamento d = e.getDepartamento();
            d.eliminarEmpleado(e);
            e.setDepartamento(null);
            this.persistencia.eliminar(e);
            this.persistencia.modificar(d);
            this.persistencia.confirmarTransaccion();
            return 0;
        } else {
            return 1;
        }
        // que pasa con un empleado que es gerente?
        // no debo manejar esa parte de la relacion para eliminar un empleado?
    }

    public List listarProyectos() {
        return this.persistencia.buscarTodos(Proyecto.class);
    }

    public Proyecto buscarProyecto(Long id) {
        return this.persistencia.buscar(Proyecto.class, id);
    }

    public void agregarProyecto(String descripcion) {
        this.persistencia.iniciarTransaccion();
        Proyecto p = new Proyecto(descripcion.toUpperCase());
        this.persistencia.insertar(p);
        this.persistencia.confirmarTransaccion();
    }

    public void editarProyecto(Proyecto p, String descripcion) {
        this.persistencia.iniciarTransaccion();
        p.setDescripcion(descripcion);
        this.persistencia.modificar(p);
        this.persistencia.confirmarTransaccion();
    }
    
    public int eliminarProyecto(Proyecto p) {
        if (p.getEmpleados().isEmpty()) {
            this.persistencia.iniciarTransaccion();
            this.persistencia.eliminar(p);
            this.persistencia.confirmarTransaccion();
            return 0;
        } else {
            return 1;
        }
    }

    public void cancelarProyecto(Proyecto p) {
        this.persistencia.iniciarTransaccion();
        p.setFechaBaja(new Date());
        this.persistencia.modificar(p);
        this.persistencia.confirmarTransaccion();
    }

    public void agregarEmpleadoProyecto(Proyecto p, Empleado e) {
        // como uso un set no necesito controlar por duplicados
        // recuerden que set no permite duplicados
        this.persistencia.iniciarTransaccion();
        p.agregarEmpleado(e);
        this.persistencia.modificar(e);
        this.persistencia.modificar(p);
        this.persistencia.confirmarTransaccion();
    }

    public void quitarEmpleadoProyecto(Proyecto p, Empleado e) {
        this.persistencia.iniciarTransaccion();
        p.quitarEmpleado(e);
        this.persistencia.modificar(e);
        this.persistencia.modificar(p);
        this.persistencia.confirmarTransaccion();
    }
    
    public List listarDepartamentos() {
        //return this.persistencia.buscarTodos(Departamento.class);
        return this.persistencia.buscarTodosOrdenadosPor(Departamento.class, Departamento_.denominacion);
    }

    public Departamento buscarDepartamento(Long id) {
        return this.persistencia.buscar(Departamento.class, id);
    }

    public void agregarDepartamento(String denominacion, Empleado gerente) {
        this.persistencia.iniciarTransaccion();
        Departamento d = new Departamento(denominacion.toUpperCase(), gerente);
        this.persistencia.insertar(d);
        this.persistencia.confirmarTransaccion();
    }
    
    public void editarDepartamento(Departamento d, String denominacion, Empleado gerente) {
        this.persistencia.iniciarTransaccion();
        d.setDenominacion(denominacion.toUpperCase());
        d.setGerente(gerente);
        this.persistencia.modificar(d);
        this.persistencia.confirmarTransaccion();
    }
    
    public int eliminarDepartamento(Departamento p) {
        // elimino si no existen empleados en el departamento
        if (p.getEmpleados().isEmpty()) {
            this.persistencia.iniciarTransaccion();
            this.persistencia.eliminar(p);
            this.persistencia.confirmarTransaccion();
            return 0;
        } else {
            return 1;
        }
    }
    
    */
    
}