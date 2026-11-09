/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial2correccion.view;

import java.util.Scanner;

/**
 *
 * @author faian-medina
 */
public class Vista {
    
    static Scanner sc=new Scanner(System.in);
    
    public int menu(){
        int indice=pedirInt("1)Registrar departamento. 2)Registrar profesor de planta. 3)Registrar profesor de catedra. 4)Reporte general. 5)Reporte por departamento. 6)Salir");
        return indice;
    }
    public double pedirDouble(String mensaje){
        System.out.println(mensaje);
        double indice1=sc.nextDouble();
        sc.nextLine();
        return indice1;
    }
    public int pedirInt(String mensaje){
        System.out.println(mensaje);
        int indice=sc.nextInt();
        sc.nextLine();
        return indice;
    }
    public String pedirTexto(String mensaje){
        System.out.println(mensaje);
        String indice=sc.nextLine();
        return indice;
    }
    public void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }

    public Vista() {
    }
    
    
}
