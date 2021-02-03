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
public class MétodosI {
    public static void main(String[]args){ //Método Principal
        MétodosI objeto = new MétodosI(); // Objeto de tipo MétodosI(Nombre de la clase)
        objeto.metodoMensaje();
        objeto.metodoMensaje2();
        System.out.println("Ejecuntado main");
    }
    
    public void metodoMensaje(){
       System.out.println("Mostrando Mensaje...");
    }
    public void metodoMensaje2(){
       System.out.println("Mostrando otro mensaje...");
    }
}
