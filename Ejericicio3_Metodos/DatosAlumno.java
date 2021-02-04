/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejericicio3_Metodos;
import javax.swing.JOptionPane;
/**
 *
 * @author eduardo
 */
public class DatosAlumno {
    //Atributos
    String nombre;
    double nota;
    
    //Métodos
    public void pideDatos(){
      nombre = JOptionPane.showInputDialog("Ingrese el Nombre: ");
      nota =  Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota: "));
    }
    
    public void estado(){
      if(nota>=11){
        JOptionPane.showMessageDialog(null,"\tALUMNO APROBADO");
      }
      else{
        JOptionPane.showMessageDialog(null, "\tALUMNO REPROBADO");
      }
    }
    
    public void muestraDatos(){
        JOptionPane.showMessageDialog(null, "El nombre del alumno es: " + nombre.toUpperCase());
        JOptionPane.showMessageDialog(null,"La calificación es: " + nota);
    }
}
