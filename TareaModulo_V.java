/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareamodulo_v;

import helpers.*;

/**
 *
 * @author Oscar A. Bueso B.
 */
public class TareaModulo_V {
  
   /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Instanciamiento
    Circulo circulo = new Circulo();
    Linea linea = new Linea();
    Triangulo triangulo = new Triangulo();
    Cuadrado cuadrado = new Cuadrado();
    
    System.out.println("Forma n° 1: ");
    circulo.imprimirInformacion();
    
    System.out.println("Forma n° 2");
    linea.imprimirInformacion();
    
    System.out.println("Forma n° 3");
    triangulo.imprimirInformacion();
    
    System.out.println("Forma n° 4");
    cuadrado.imprimirInformacion();
    
  }
  
}
