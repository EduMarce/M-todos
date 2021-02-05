/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio8_Métodos;

/**
 *
 * @author eduardo
 */
public class Datos {

    public static int[] rellenarArreglo(int numero) { //Parametro: numero
        int arreglo[] = new int[10]; //Indicamos que el arreglo tiene 10 posiciones
        for (int i = 0; i < arreglo.length; i++) { // En esta parte empezamos a rellanar el arreglo
            arreglo[i] = numero;  //la primera posisicón del arreglo va almacenar el número que está como parametro en este método
            numero += 5;  // (20 + 5 = 25)  >> (25+ 5 = 30) >> (30+5 = 35) >> así hasta que ya no haya posciones en el arreglo
        }
        return arreglo;  // retornamos una referencia del arreglo
    }

    public static void imprimirArreglo(int listaNumeros[]) {
        System.out.println("\tIMPRIMIENDO EL ARREGLO");
        for (int i = 0; i < listaNumeros.length; i++) {
            System.out.print("Valor" + (i+1)+ " : " + listaNumeros[i] +"\n");
        }
    }
}
