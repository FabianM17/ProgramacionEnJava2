/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial2correccion.model;

/**
 *
 * @author faian-medina
 */
public abstract class Empleado {
    //En el parcial no se me ocurrio para nada la idea de hacer clases abstractas, pense a hacer herencia de una clase normal pero siento que eso me complico las cosas
    
    private String nombre;
    private String documento;
    private String correo;
    private Departamento departamento;
    
    //Esto es muy util ya que asi podemos llamar directamente a esta clase y no hace falta tener que trabajar con las otras 2 a la vez.
    public abstract double calcularSalario();
    public abstract String getTipo();

    public Empleado(String nombre, String documento, String correo, Departamento departamento) {
        this.nombre = nombre;
        this.documento = documento;
        this.correo = correo;
        this.departamento = departamento;
    }

    public Empleado() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", documento=" + documento + ", correo=" + correo + ", departamento=" + departamento + '}';
    }
    
    
    
}
