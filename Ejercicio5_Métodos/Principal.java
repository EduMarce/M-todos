/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio5_Métodos;

/**
 *
 * @author eduardo
 */
public class Principal {
    public static void main(String[]args){
    
    datosEmpleados E1 = new datosEmpleados();
    E1.dameNombre("Eduardo"); //Le pasamos un argumento al método
    E1.dameEdad(18);
    E1.dameSueldo(2450.5);
    }
}
