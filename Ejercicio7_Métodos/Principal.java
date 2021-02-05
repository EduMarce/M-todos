/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio7_Métodos;

import javax.swing.JOptionPane;

/**
 *
 * @author eduardo
 */
public class Principal {
    public static void main(String[]args){
    
    datosPersona objeto = new datosPersona(); //objeto de tipo datosPersona(nombre de la clase)
    String n;
    n = JOptionPane.showInputDialog("Ingrese el nombre: ");
    objeto.dameNombre(n); //Pepe
    System.out.println("El nombre es: " + objeto.devuelveNombre());
    JOptionPane.showMessageDialog(null, "El nombre es: " + objeto.devuelveNombre() );
    
        
    }
}
