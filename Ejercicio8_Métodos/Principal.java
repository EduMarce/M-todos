/*
    Crear dos métodos: uno que reciba como argumento un número entero, y nos permita
    rellenar un arreglo con ese número recibido en secuencias de 5. El otro método 
    será para mostrar el arreglo
*/
package Ejercicio8_Métodos;

import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class Principal {
    public static void main(String[]args){
      Scanner sc = new Scanner(System.in);
      System.out.println("\tLISTA DE 10 NÚMEROS (DE 5 EN 5)");
      System.out.print("Digite el primer número de la lista: ");
      int primerValor = sc.nextInt();
      int listaNumeros[] = Datos.rellenarArreglo(primerValor);
      Datos.imprimirArreglo(listaNumeros);
    }
    
}
