/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulamiento;

import helpersEncapsulamiento.Ciudadano;

/**
 *
 * @author Oscar A. Bueso B.
 */
public class EncapsulamientoCiudadano {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
  // Instanciar la clase Ciudadano
    Ciudadano ciudadano = new Ciudadano();
    
    //Establecer Nombre
    ciudadano.establecerNombre("Oscar Bueso");
    //Imprimir el valor del nombre
    System.out.println("Nombre del Ciudadano: " + ciudadano.obtenerNombre());
    
    //Establecer edad
    ciudadano.establecerEdad(25);
    //Imprimir el valor de la edad
    System.out.println("Edad: " + ciudadano.obtenerEdad());
        
    //Establecer experiencia
    ciudadano.establecerExp(5);
    //Imprimir Experiencia
    System.out.println("Experiencia: " +ciudadano.obtenerExp());
    
  }
  
}
