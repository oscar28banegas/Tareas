/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareamodulo_ii;

/**
 *
 * @author Oscar A. Bueso B.
 */
public class Recursos {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    metodosJava textos = new metodosJava(); //Instancia de la clase Mensajes
    textos.Mensaje();                  //Llamar los métodos en esa clase por medio de objeto mensajes
    textos.nota(80);                   //Llamar el segundo método
    textos.division(11, 4);
    textos.lista(10);
    }
   
    public static class metodosJava{
    //Metodo que no recibe parametro
      public void Mensaje() {
      System.out.println("Estoy aprendiendo, pero seré el mejor programador del mundo");
    }
    
    //Método que  recibe parámetro entero para imprimir un valor
    public void nota(int valor) {
      if (valor > 69){
        System.out.println("Nota aprobada");
        }else{
        System.out.println("Nota reprobada");
        }
      }
    
    //Método que  recibe dos parámetros enteros para calcular una division
    public void division( double num1, double num2 ){
      double div = 0;
      if (num2 != 0){
        div = num1 / num2;
        System.out.println("El resultado de la division es: " + div);
      }
    }
    
    // Cuarto método
    public void lista(int x){
      for (int i = 1; i <= x; i++)
      {
        System.out.println(i);
      }
    }
    }
}
