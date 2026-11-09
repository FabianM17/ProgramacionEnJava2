/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package parcial2correccion.dao;

import java.util.ArrayList;
import parcial2correccion.model.Empleado;

/**
 *
 * @author faian-medina
 */
public interface IEmpleadoDao {
   public boolean registrar(Empleado e);
   public Empleado buscarPorDocumento(String documento);
   public ArrayList<Empleado> mostrarTodo();
}
