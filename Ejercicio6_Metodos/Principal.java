/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio6_Metodos;

import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class Principal {
    public static void main(String[]args){
      Scanner sc = new Scanner(System.in);  
      operacionesNumericas objeto = new operacionesNumericas();
      //Variables
      double N1, N2;
      System.out.print("Introduce dos números: ");
      N1 = sc.nextDouble();
      N2 = sc.nextDouble();
      objeto.multiplica(N1,N2);
      objeto.divide(N1, N2);
      objeto.mostrarResultados();
    }
}
