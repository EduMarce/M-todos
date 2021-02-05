/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio6_Metodos;

/**
 *
 * @author eduardo
 */
public class operacionesNumericas {
   
   double multiplicacion, division;
   
   public void divide(double N1, double N2){
     division = N1/ N2;
   }
   
   public void multiplica(double N1, double N2){
     multiplicacion = N1*N2;
   }
   
   public void mostrarResultados(){
    System.out.print("El resultado de multiplicar los dos número es: " + multiplicacion);
    System.out.print("\nEl resultado de dividir los dos número es: " + division + "\n");
   }
}
