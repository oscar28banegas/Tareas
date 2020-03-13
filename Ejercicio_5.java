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
public class Ejercicio_5 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    String[][] arr = new String[5][4]; // array de 3 filas por 2 columnas
    arr[0][0] = "Jahaciel";
    arr[0][1] = "Castellanos";
    arr[0][2] = "Industrial";
    arr[0][3] = "Tegucigalpa";
    arr[1][0] = "Yovany";
    arr[1][1] = "Ordoñez";
    arr[1][2] = "Computación";
    arr[1][3] = "Tegucigalpa";
    arr[2][0] = "Cristopher";
    arr[2][1] = "Izaguirre";
    arr[2][2] = "Industrial";
    arr[2][3] = "Pto. Cortés";
    arr[3][0] = "Allison";
    arr[3][1] = "Chacón";
    arr[3][2] = "Computación";
    arr[3][3] = "Tegucigalpa";
    arr[4][0] = "Yerty";
    arr[4][1] = "Ventura";
    arr[4][2] = "Industrial";
    arr[4][3] = "Pto. Cortés";
    int fila, columna;
    
    for(fila = 0; fila < 5; fila++) {
      
      System.out.print("Fila: " + fila + "  ");
      for(columna = 0; columna < 4; columna++) {
        System.out.printf(arr[fila][columna] + "   ");
      }
      System.out.println();
}
  }
  
}
