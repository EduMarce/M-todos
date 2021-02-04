/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4_Metodos;

import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class Calificaciones {
    
    double notas[] = new double[5]; //He creado un nuevo arreglo de tipo double con 5 posiciones

    public void pedirNotas() {
        Scanner sc = new Scanner(System.in); //Hemos creado un nuevo objeto de tipo Scanner 

        System.out.println("\tINGRESO DE NOTAS:");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
        }
    }
    
    public void mostrarNotas() {
        for (int i = 0; i < notas.length; i++) {
            System.out.print("\nNota N°" + (i + 1) + ": " + notas[i]);
        }
    }
    
}
