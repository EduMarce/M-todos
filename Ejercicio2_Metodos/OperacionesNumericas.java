/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2_Metodos;

import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class OperacionesNumericas {
     double N1, N2;
     double suma, resta;
    
    public void pideNumeros(){//Sin retorno ni parámetros
      Scanner sc = new Scanner(System.in);
      System.out.print("Ingrese el primer número: ");
      N1 = sc.nextDouble();
      System.out.print("Ingrese el segundo número: ");
      N2 = sc.nextDouble();
    }
    
    public void sumaNumeros(){
       suma = N1 + N2;
    }
    
    public void restaNumeros(){
        resta = N1- N2;
    }
    
    public void muestraResultados(){
      System.out.print("\nLa suma es: " + suma);
      System.out.print("\nLa resta es: " + resta);
    }
}
