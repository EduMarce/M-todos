/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio7_Métodos;

/**
 *
 * @author eduardo
 */
public class datosPersona {
    //Atributos (variables)
    String nombre; //Atributo de la clase
    
    //Método para darle el nombre a una Persona.
    public void dameNombre(String nombre){ //Parámetro del método //Le estamos pasando a Pepe
     this.nombre = nombre; //el atributo almacena el nombre de Pepe
    }
    public String devuelveNombre(){
     return nombre; 
    }
}
