/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package parcial2correccion.dao;

import java.util.ArrayList;
import parcial2correccion.model.Departamento;

/**
 *
 * @author faian-medina
 */
public interface IDepartamentoDao {
    public boolean registrar(Departamento d);
    public Departamento buscarPorCodigo(String codigo);
    public ArrayList<Departamento> mostrarTodo();
}
