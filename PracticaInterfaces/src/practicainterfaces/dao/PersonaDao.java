/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicainterfaces.dao;

import java.util.ArrayList;
import practicainterfaces.modelo.Persona;

/**
 *
 * @author faian-medina
 */
public class PersonaDao implements IPersonaDao {
    ArrayList<Persona> personas;

    @Override
    public boolean registrar(Persona p) {
        try {
            personas.add(p);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public PersonaDao() {
        this.personas = new ArrayList<>();
    }

    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Persona> personas) {
        this.personas = personas;
    }
    
    
    

}
