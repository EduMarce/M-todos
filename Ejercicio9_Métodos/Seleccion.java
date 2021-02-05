/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio9_Métodos;

/**
 *
 * @author eduardo
 */
public class Seleccion {
   
    //Variables
    double suma, resta, multiplicación, división;
    
    //Métodos
    public void suma(double N1, double N2){
      suma = N1 +N2;
      System.out.println("La suma es: " + suma); 
    }
    
    public void resta(double N1, double N2){
      resta = N1 - N2;
      System.out.println("La resta es: " + resta);
    }
    
    public void divide(double N1, double N2){
      división = N1 / N2;
      System.out.println("La división es: " + división);
    }
    
    public void multiplica(double N1, double N2){
      multiplicación = N1 * N2;
      System.out.println("La múltiplicación es: "  + multiplicación);
    }
    
   
}
