/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1_Metodos;
import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class Ejercicio_1 {
    //Datos Persona (Atributos: Variables)
    String nombre;
    String estadoCivil;
    int edad;
    
    public void leerDatos(){ //método sin retorno ni parametros
      Scanner teclado = new Scanner(System.in);
      System.out.print("Ingrese su nombre: ");
      nombre = teclado.nextLine();
      System.out.print("Ingrese su edad: ");
      edad = teclado.nextInt();
      System.out.print("Ingrese su estado civil: ");
      estadoCivil = teclado.next();
    }  
    
    public void mostrarDatos(){
      System.out.print("\nEl nombre es: " + nombre);
      System.out.print("\nLa edad es: " + edad);
      System.out.print("\nEl estado civil es: " + estadoCivil + " ");
      
    }
    
}
