/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareamodulo_iii;

/**
 *
 * @author Oscar A. Bueso B.
 */
public class TareaModulo_III {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    ///Creando el objeto persona 
    Estudiante alumno = new Estudiante();
    alumno.setNombre("Oscar");
    alumno.setApellido("Bueso");
    alumno.setEdad (34);
    alumno.setSexo ("M");
    
    System.out.println("Nombre: " + alumno.getNombre() );
    System.out.println("apellido: " + alumno.getApellido() );
    System.out.println("Edad: " + alumno.getEdad() );
    System.out.println("Sexo: " + alumno.getSexo() );
}
  
public static class Estudiante{
//Private hace que los atributos sean accedidos dentro de la clase
    private String nombre;
    private String apellido;
    private int edad;
    private String sexo;   
    
//Métodos públicos para acceder a los datos
    public String getNombre(){
        return nombre;
    }
    
    public String getApellido(){
        return apellido;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public String getSexo(){
        return sexo;
    }

    //Métodos públicos para establecer los datos
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
  }
  
}
