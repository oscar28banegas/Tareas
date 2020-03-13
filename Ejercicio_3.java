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
public class Ejercicio_3 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
  // Dadas las variables de tipo int M = 6, T = 1, K = -10 indicar si la evaluación 
  // de estas expresiones daría como resultado verdadero o falso:
  // M > T
  // T / K == -5
  // (M + T == 7) || (M-T == 5)
  
  // Declaración de variables
  
    int M = 6;
    int T = 1;
    int K = -10;
    
    boolean respuesta;
    
    //Primera incognita
    if ( M > T ){
      respuesta = true;
      System.out.println("M > T: " + respuesta);
    }
    else{
      respuesta = false;
      System.out.println("M > T: " + respuesta);
    }
    
    //Segunda incognita
    if ( (T / K) == -5 ){
      respuesta = true;
      System.out.println("(T / K) == -5: " + respuesta);
    }
    else{
      respuesta = false;
      System.out.println("(T / K) == -5: " + respuesta);
    }
    
    //Tercera incognita
    if ( (M+T == 7) || (M-T == 5)){
      respuesta = true;
      System.out.println("(M + T == 7) ||: (M - T == 5): " + respuesta);
    }
    else{
      respuesta = false;
      System.out.println("(M + T == 7) ||: (M - T == 5): " + respuesta);
    }
  }
  
}
