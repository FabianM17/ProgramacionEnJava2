/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicainterfaces;

import practicainterfaces.controlador.Controlador;
import practicainterfaces.dao.PersonaDao;
import practicainterfaces.vista.VistaPrincipal;

/**
 *
 * @author faian-medina
 */
public class PracticaInterfaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersonaDao dao=new PersonaDao();
        VistaPrincipal vista=new VistaPrincipal();
        Controlador controlador=new Controlador(dao,vista);
        vista.setVisible(true);
        
    }
    
}
