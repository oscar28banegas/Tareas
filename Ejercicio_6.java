/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo_i;

/**
 *
 * @author Oscar A. Bueso
 */
public class Ejercicio_6 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Declaracion de variable
    int nota = 89;
    String nombreEstudiante = "Oscar";
    String obs;
    
    if (nota >= 70){
      obs = "Aprobado";
    }
    else{
      obs = "Reprobado";
    }
    
    System.out.println( "Alumno\t" + " " + "Nota\t" + "Observación");
    System.out.println( nombreEstudiante + "\t " + nota + "\t" + obs);
  }
  
}
