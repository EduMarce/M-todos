/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Métodos;

/**
 *
 * @author eduardo
 */
public class MetodosIII {//Llave que abre la clase
    int edad = 18;
    String nombre = "Eduardo";
    double sueldo = 2500;
    public static void main(String[]args){ // Método Principal
      MetodosIII objeto  = new MetodosIII();
      System.out.println("Mi nombre es: " + objeto.mostrandoNombre());
      System.out.println("Edad: " + objeto.mostrandoEdad());
      System.out.println("Mi sueldo es: " + objeto.mostrandoSueldo()+ " soles." );
            
    }
    
    int mostrandoEdad(){
     return edad;
    }
    String mostrandoNombre(){
     return nombre;
    }
    double mostrandoSueldo(){
     return sueldo;
    }
}//LLave que cierra la clase
