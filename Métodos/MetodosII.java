/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Métodos;



/**
 *
 * @author eduardo
 */
public class MetodosII {
    public static void main(String[]args){
      
      MetodosII objeto = new MetodosII(); //Un objeto de tipo MetodosII(nombre de la clase)      
      objeto.mostrandoNombre("Eduardo Marcelo");
      objeto.mostrandoEdad(18);
      
    }
    public void mostrandoNombre(String nombre){
       System.out.println("Mi nombre es: " + nombre);
    }
    public void mostrandoEdad(int edad){
       System.out.println("Tengo " + edad + " años.");
    }
}
