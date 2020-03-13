/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraccion;

import helpersAbstraccion.*;
//import helpersAbstraccion.Honduras;

/**
 *
 * @author Oscar A. Bueso B.
 */
public class abstraccionPais {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    
    Honduras hn = new Honduras();
    CostaRica cr = new CostaRica();
    Guatemala gt = new Guatemala();
    
    System.out.print(hn.getPais());
    System.out.println(" tiene por Presidente a " + hn.getPresidente());
    System.out.print(cr.getPais());
    System.out.println(" tiene por Presidente a " + cr.getPresidente());
    System.out.print(gt.getPais());
    System.out.println(" tiene por Presidente a " + gt.getPresidente());
  }
  
}
