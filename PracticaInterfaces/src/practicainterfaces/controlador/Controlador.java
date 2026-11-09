/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicainterfaces.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import practicainterfaces.dao.PersonaDao;
import practicainterfaces.modelo.Persona;
import practicainterfaces.vista.VistaPrincipal;

/**
 *
 * @author faian-medina
 */
public class Controlador implements ActionListener {
    private PersonaDao personaDao;
    private VistaPrincipal vista;
    
    public void registrar(){
        String nombre=vista.getNombre();
        String edad=vista.getEdad();
        Persona p=new Persona(nombre, edad);
        boolean registro=personaDao.registrar(p);
        if (registro){
            vista.actualizarTabla(nombre, edad);
        }else{
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==vista.getBotonRegistro()){
            registrar();
        }
    }

    public Controlador(PersonaDao personaDao, VistaPrincipal vista) {
        this.personaDao = personaDao;
        this.vista = vista;
        vista.agregarListener(this);
    }
    
    
}
