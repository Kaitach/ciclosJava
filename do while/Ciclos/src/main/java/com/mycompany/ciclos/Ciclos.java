
package com.mycompany.ciclos;

import javax.swing.JOptionPane;

public class Ciclos {

    public static void main(String[] args) {
        int numero;

        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Para detener este bucle digite '500' "));
        } while (numero != 500);
        {

        }
        System.out.println("Bucle terminado");

    }
}