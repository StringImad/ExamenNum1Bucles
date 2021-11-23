/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author imad
 */
public class Ej1 {

    public static void main(String[] args) {
        //declaracion de variables

        String valorAIntroducidoPorUsuario;
        String valorBIntroducidoPorUsuario;
        String valorCIntroducidoPorUsuario;

        double x;
        double x2;
        int valorA, valorB, valorC;

        valorAIntroducidoPorUsuario = JOptionPane.showInputDialog("Introduce el valor de A");
        valorBIntroducidoPorUsuario = JOptionPane.showInputDialog("Introduce el valor de B");
        valorCIntroducidoPorUsuario = JOptionPane.showInputDialog("Introduce el valor de C");

        valorA = Integer.parseInt(valorAIntroducidoPorUsuario);
        valorB = Integer.parseInt(valorBIntroducidoPorUsuario);
        valorC = Integer.parseInt(valorCIntroducidoPorUsuario);

        if (valorA == 0 && valorB == 0) {
            System.out.println("No tiene solucion");
        } else if (valorA == 0 && valorB != 0) {
            x = -valorC / valorB;

            System.out.println("La solucion es: x=" + x);
        } else {
            if (Math.pow(valorB, 2) - 4 * valorA * valorC < 0) {
                System.out.println("Los valores suministrados no permiten el calculo");
            } else {
                x = (-valorB + Math.sqrt((valorB * valorB) - (4 * valorA * valorC))) / (2 * valorA);
                x2 = (-valorB - Math.sqrt((valorB * valorB) - (4 * valorA * valorC))) / (2 * valorA);
                System.out.println("Valor de x= " + x + " valor de x2=" + x2);
            }
        }

    }
}
