/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial2correccion.dao;

import java.util.ArrayList;
import parcial2correccion.model.Empleado;

/**
 *
 * @author faian-medina
 */
public class EmpleadoDao implements IEmpleadoDao{
    private ArrayList<Empleado> empleados;

    @Override
    public boolean registrar(Empleado e) {
        empleados.add(e);
        return true;
    }

    @Override
    public Empleado buscarPorDocumento(String documento) {
        for (Empleado em:empleados){
            if(em.getDocumento().equals(documento)){
                return em;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Empleado> mostrarTodo() {
        return empleados;
    }

    public EmpleadoDao() {
        this.empleados = new ArrayList<>();
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }
    
    
}
