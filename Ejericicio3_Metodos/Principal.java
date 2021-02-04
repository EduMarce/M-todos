/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejericicio3_Metodos;

/**
 *
 * @author eduardo
 */
public class Principal {
    public static void main(String[]args){
        DatosAlumno EDU = new DatosAlumno();
        EDU.pideDatos();
        EDU.muestraDatos();
        EDU.estado();
        
        System.out.println(" ");
        
        DatosAlumno CIRO = new DatosAlumno();
        CIRO.pideDatos();
        CIRO.muestraDatos();
        CIRO.estado();
      
    }
}
