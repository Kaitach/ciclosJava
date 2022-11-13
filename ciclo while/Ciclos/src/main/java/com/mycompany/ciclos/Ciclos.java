
package com.mycompany.ciclos;

import javax.swing.JOptionPane;


public class Ciclos {

    public static void main(String[] args) {
    int condicion;
    
    condicion = Integer.parseInt(JOptionPane.showInputDialog("Para detener este bucle digite '7' "));
       
   
    
    while  (condicion != 7){
       
     condicion = Integer.parseInt(JOptionPane.showInputDialog("Para detener este bucle digite '7' "));        
    }
    System.out.println("Bucle terminado");

       }
}