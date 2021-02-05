/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio9_Métodos;

import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class Principal {

    public static void main(String[] args) {
        //Objetos
        Scanner sc = new Scanner(System.in); //Objeto de tipo Scanner
        Seleccion operacion = new Seleccion(); // objeto operacion de tipo Seleccion(nombre de la clase)

        //Usuario
        System.out.print("Ingrese el primer número: ");
        double N1 = sc.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double N2 = sc.nextDouble();
        System.out.println("\tOPCIONES");
        System.out.println("1. SUMA\n2. RESTA\n3. MULTIPLICACIÓN\n4. DIVISIÓN");
        System.out.print("\nIngrese una opción: ");
        int opcion;
        do {
            opcion = sc.nextInt();
            if (opcion <= 0 || opcion > 4) {
                System.out.print("Ingrese nuevamente la opción: ");
            } else {
                switch (opcion) {
                    case 1:
                        operacion.suma(N1, N2);
                        break;

                    case 2:
                        operacion.resta(N1, N2);
                        break;

                    case 3:
                        operacion.multiplica(N1, N2);
                        break;

                    case 4:
                        operacion.divide(N1, N2);
                        break;
                }
            }

        } while (opcion <= 0 || opcion > 4);

    }
}
