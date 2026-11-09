/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial2correccion.controller;

import java.util.ArrayList;
import parcial2correccion.dao.IDepartamentoDao;
import parcial2correccion.dao.IEmpleadoDao;
import parcial2correccion.model.Departamento;
import parcial2correccion.model.Empleado;
import parcial2correccion.model.ProfesorCatedra;
import parcial2correccion.model.ProfesorPlanta;
import parcial2correccion.view.View;
import parcial2correccion.view.Vista;

/**
 *
 * @author faian-medina
 */
public class Controlador {

    private IDepartamentoDao departamentoDao;
    private IEmpleadoDao empleadoDao;
    private Vista vista;
    private View vistaInterfaz;

    public void iniciar() {
        int indice = 0;
        while (indice != 6) {
            indice = vista.menu();
            switch (indice) {
                case 1 -> {
                    registrarDepartamento();
                }
                case 2 -> {
                    registrarProfesorPlanta();
                }
                case 3 -> {
                    registrarProfesorCatedra();
                }
                case 4 -> {
                    reporteGeneral();
                }
                case 5 -> {
                    reporteDepartamento();
                }
                case 6 -> {
                    System.exit(0);
                }
            }
        }

    }
    
    public void registrarBoton(){
        vistaInterfaz.getBotonDepartamento().addActionListener(e->registrarDepartamento());
    } 
    
    public void registrarDepartamento(){
        String nombre=vistaInterfaz.getDepartamentoNombreTextField();
        String cod=vistaInterfaz.getDepartamentoCodigoTextField();
        Departamento d=new Departamento(cod, nombre);
        for (Departamento de:departamentoDao.mostrarTodo()){
            if(de.getCodigo().equals(d.getCodigo())){
                return;
            }
        }
        departamentoDao.registrar(d);
    }
    public void registrarProfesorPlanta(){
        String nombre=vista.pedirTexto("Ingrese el nombre");
        String correo=vista.pedirTexto("Correo:");
        String documento=vista.pedirTexto("Documento:");
        for(Empleado e:empleadoDao.mostrarTodo()){
            if(e.getDocumento().equals(documento)){
                vista.mostrarMensaje("Ya hay un registro con este documento.");
                return;
            }
        }
        double salario=vista.pedirDouble("Salario:");
        int proyectos=vista.pedirInt("cantidad proyectos:");
        String codigo=vista.pedirTexto("Seleccione un departamento: "+departamentoDao.toString());
        Departamento d=departamentoDao.buscarPorCodigo(codigo);
        ProfesorPlanta pp=new ProfesorPlanta(salario, proyectos, nombre, documento, correo, d);
        empleadoDao.registrar(pp);
    }
    public void registrarProfesorCatedra(){
        String nombre=vista.pedirTexto("Ingrese el nombre");
        String correo=vista.pedirTexto("Correo:");
        String documento=vista.pedirTexto("Documento:");
        for(Empleado e:empleadoDao.mostrarTodo()){
            if(e.getDocumento().equals(documento)){
                vista.mostrarMensaje("Ya hay un registro con este documento.");
                return;
            }
        }
        double salarioHoras=vista.pedirDouble("Salario:");
        int horasTrabajadas=vista.pedirInt("cantidad proyectos:");
        String codigo=vista.pedirTexto("Seleccione un departamento: "+departamentoDao.toString());
        Departamento d=departamentoDao.buscarPorCodigo(codigo);
        ProfesorCatedra pc= new ProfesorCatedra(salarioHoras, horasTrabajadas, nombre, documento, correo, d);
        empleadoDao.registrar(pc);
    }
    public void reporteGeneral(){
        ArrayList<Empleado> empleados=empleadoDao.mostrarTodo();
        double suma=0;
        for(Empleado e:empleados){
            vista.mostrarMensaje(e.toString()+" salario total: "+e.calcularSalario());
            suma+=e.calcularSalario();
        }
        vista.mostrarMensaje("La nomina general es de: "+suma);
    }
    public void reporteDepartamento(){
        vista.mostrarMensaje("Departamentos:");
        vista.mostrarMensaje(departamentoDao.toString());
        String codigo=vista.pedirTexto("Ingrese el codigo del departamento:");
        Departamento d=departamentoDao.buscarPorCodigo(codigo);
        ArrayList<Empleado> empleados=empleadoDao.mostrarTodo();
        double suma=0;
        for(Empleado e:empleados){
            if(e.getDepartamento().equals(d)){
                vista.mostrarMensaje(e.toString()+" Salario total: "+e.calcularSalario());
                suma+=e.calcularSalario();
            }
        }
        vista.mostrarMensaje("La nomina total del departamento con condigo "+codigo+", es de: "+suma);
    }

    public Controlador(IDepartamentoDao departamentoDao, IEmpleadoDao empleadoDao, Vista vista) {
        this.departamentoDao = departamentoDao;
        this.empleadoDao = empleadoDao;
        this.vista = vista;
    }
    
    
}
