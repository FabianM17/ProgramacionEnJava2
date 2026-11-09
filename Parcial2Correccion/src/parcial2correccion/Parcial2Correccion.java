/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parcial2correccion;

import parcial2correccion.controller.Controlador;
import parcial2correccion.dao.DepartamentoDao;
import parcial2correccion.dao.EmpleadoDao;
import parcial2correccion.view.Vista;

/**
 *
 * @author faian-medina
 */
public class Parcial2Correccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vista vista=new Vista();
        EmpleadoDao empleadoDao=new EmpleadoDao();
        DepartamentoDao departamentoDao=new DepartamentoDao();
        Controlador controlador=new Controlador(departamentoDao, empleadoDao, vista);
        controlador.iniciar();
    }
    
}
