
package com.mycompany.ciclos;

import javax.swing.JOptionPane;

/**
 *
 * @author fou-k
 */
public class Ciclos {

  public static void main(String[] args) {
    int tabla;
    
    tabla = Integer.parseInt(JOptionPane.showInputDialog("Que tabla desea saber? "));
       
   
    
    for (int i=1; i<11; i++){
        System.out.print("\n"  + i  +   " X " + tabla + ": "  + (i*tabla) );
        
    }

       }
}
