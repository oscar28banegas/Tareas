/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpersEncapsulamiento;

/**
 *
 * @author Oscar A. Bueso B.
 */
public class Ciudadano {
  
  // Nombre del ciudadano
  private String nombre;
  
  private int edad;
  
  private int experiencia;
  
  public void establecerNombre(String _nombre){
    this.nombre = _nombre;
  }
  
  public String obtenerNombre(){
    return nombre;
  }
  
  public void establecerEdad(int _edad){
    this.edad = _edad;
  }
  
  public int obtenerEdad(){
    return edad;
  }
  
  public void establecerExp(int _experiencia){
    this.experiencia = _experiencia;
  }
  
  public int obtenerExp(){
    return experiencia;
  }
  
}
