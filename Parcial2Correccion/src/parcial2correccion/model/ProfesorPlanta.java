/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial2correccion.model;

/**
 *
 * @author faian-medina
 */
public class ProfesorPlanta extends Empleado {

    private double sueldoBase;
    private int cantidadProyectos;
    
    @Override
    public double calcularSalario() {
        return sueldoBase;
    }

    @Override
    public String getTipo() {
        return "Planta";
    }

    public ProfesorPlanta(double sueldoBase, int cantidadProyectos, String nombre, String documento, String correo, Departamento departamento) {
        super(nombre, documento, correo, departamento);
        this.sueldoBase = sueldoBase;
        this.cantidadProyectos = cantidadProyectos;
    }

    public ProfesorPlanta() {
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public int getCantidadProyectos() {
        return cantidadProyectos;
    }

    public void setCantidadProyectos(int cantidadProyectos) {
        this.cantidadProyectos = cantidadProyectos;
    }

    @Override
    public String toString() {
        return "ProfesorPlanta{" + "sueldoBase=" + sueldoBase + ", cantidadProyectos=" + cantidadProyectos + '}';
    }

    
    
    
    
}
