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
public class Ejercicio_2 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Declaración de variables
    double suma;
    double resta;
    double multiplicacion;
    double division = 0;
    double mod;
    
    double num1 = 6;
    double num2 = 4;
    
    //Operacion Suma
    suma = num1 + num2;
    
    //Operacion Resta
    resta = num1 - num2;
    
    //Operacion Multiplicación
    multiplicacion = num1 * num2;
    
    //Operacion División
    if (num2 != 0){
      division = num1 / num2;
    }
    
    //Operacion Division mod
    mod = num1 % num2;
    
    System.out.println("La suma es: " + suma);
    System.out.println("La resta es: " + resta);
    System.out.println("La multiplicacion es: " + multiplicacion);
    System.out.println("La division es: " + division);
    System.out.println("La division modal es: " + mod);
  }
  
}
