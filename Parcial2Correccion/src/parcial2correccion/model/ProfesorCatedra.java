/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial2correccion.model;

/**
 *
 * @author faian-medina
 */
public class ProfesorCatedra extends Empleado{
    private double valorHora;
    private int horasTrabajadas;

    @Override
    public double calcularSalario() {
        return valorHora*horasTrabajadas;
    }

    @Override
    public String getTipo() {
        return "Catedra";
    }

    public ProfesorCatedra(double valorHora, int horasTrabajadas, String nombre, String documento, String correo, Departamento departamento) {
        super(nombre, documento, correo, departamento);
        this.valorHora = valorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    public ProfesorCatedra() {
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public String toString() {
        return "ProfesorCatedra{" + "valorHora=" + valorHora + ", horasTrabajadas=" + horasTrabajadas + '}';
    }    
    
}
