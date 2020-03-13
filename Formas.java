/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpers;

import java.text.DecimalFormat;

/**
 *
 * @author Oscar A. Bueso B.
 */
public class Formas {
  
  //Atributos
  private String dibujar;
  private double medida = 0.00;
  
  DecimalFormat formato1 = new DecimalFormat("#.00");
  
  public Formas(){
    //Constructor sin parametros
  }
  
  //Establecer y obtener
  public void establecerNombre (String dibujar){
    this.dibujar = dibujar;
  }
  
  public String obtenerNombre(){
    return this.dibujar;
  }
  
  //Establecer y obtener
  public void establecerMedida (double medida){
    this.medida = medida;
  }
  
  public double obtenerMedida(){
    return this.medida;
  }
  
  public void imprimirInformacion(){
    System.out.print("Nombre: " + dibujar + " ");
    System.out.println("Medida: " + formato1.format(medida) + " cm.");
  }
  
}
