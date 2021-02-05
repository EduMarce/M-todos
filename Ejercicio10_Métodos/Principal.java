/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio10_Métodos;

import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class Principal {

    public static void main(String[] args) {
        int array[] = {7, 4, 2, 100, 8, 0, 9, 5, 120, 300};
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número a buscar: ");
        int numero = sc.nextInt();
        if(buscarNumero(numero, array)){
          System.out.println("El número fue encontrado");
        }
        else{
            System.out.println("El número no fue encontrado");
        }
        
    }
    
    public static boolean  buscarNumero(int n, int listaNumeros[]){
        int contador = 0;
        int k = 0;
        boolean encontrado = false;
      for(int i=0;i<listaNumeros.length;i++){
        if(n == listaNumeros[i]){
          contador++;
        }
        if(contador>0){
            k++;
            
          encontrado = true; break;
        }
        else{
            k++;
            
          encontrado = false;
        }
        
      }
      System.out.println("VECES QUE SE BUSCÓ EL NÚMERO: " + k);
      return encontrado;
    }

}
