/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial2correccion.dao;

import java.util.ArrayList;
import parcial2correccion.model.Departamento;

/**
 *
 * @author faian-medina
 */
public class DepartamentoDao implements IDepartamentoDao{
    
    private ArrayList<Departamento> departamentos;

    @Override
    public boolean registrar(Departamento d) {
        departamentos.add(d);
        return true;
    }

    @Override
    public Departamento buscarPorCodigo(String codigo) {
        for (Departamento de:departamentos){
            if(de.getCodigo().equals(codigo)){
                return de;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Departamento> mostrarTodo() {
        return departamentos;
    }

    public DepartamentoDao() {
        this.departamentos = new ArrayList<>();
    }

    public ArrayList<Departamento> getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(ArrayList<Departamento> departamentos) {
        this.departamentos = departamentos;
    }

    @Override
    public String toString() {
        return "DepartamentoDao{" + "departamentos=" + departamentos + '}';
    }

    
    
    
    
}
