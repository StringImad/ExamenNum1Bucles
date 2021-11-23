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
public class Ej3 {

    public static void main(String[] args) {
        //declaracion de variables
        String valorAIntroducidoPorUsuario = "";
        String valorBIntroducidoPorUsuario = "";
        String valorCIntroducidoPorUsuario = "";
        boolean comprobarIntroduccionIncorrectaUsuario = false;
        double x, x2;
        int valorA = 0, valorB = 0, valorC = 0;
        //Bucle de repticion si los datos introducidos no permiten el calculo
        do {
            //Bucle control de introduccion correcta de valores
            do {
                try {
                    valorAIntroducidoPorUsuario = JOptionPane.showInputDialog("Introduce el valor de A");
                    valorA = Integer.parseInt(valorAIntroducidoPorUsuario);
                    comprobarIntroduccionIncorrectaUsuario = false;
                } catch (NumberFormatException ex) {
                    //Mensaje de error
                    JOptionPane.showMessageDialog(null, "Formato incorrecto:\n"
                            + "Por favor ingrese un valor valido", "Error de formato",
                            JOptionPane.ERROR_MESSAGE);
                    comprobarIntroduccionIncorrectaUsuario = true;
                }
            } while (comprobarIntroduccionIncorrectaUsuario);
            do {
                try {
                    valorBIntroducidoPorUsuario = JOptionPane.showInputDialog("Introduce el valor de B");
                    valorB = Integer.parseInt(valorBIntroducidoPorUsuario);

                    comprobarIntroduccionIncorrectaUsuario = false;

                } catch (NumberFormatException ex) {
                    //Mensaje de error
                    JOptionPane.showMessageDialog(null, "Formato incorrecto:\n"
                            + "Por favor ingrese un valor valido", "Error de formato",
                            JOptionPane.ERROR_MESSAGE);
                    comprobarIntroduccionIncorrectaUsuario = true;
                }
            } while (comprobarIntroduccionIncorrectaUsuario);
            do {
                try {
                    valorCIntroducidoPorUsuario = JOptionPane.showInputDialog("Introduce el valor de C");
                    valorC = Integer.parseInt(valorCIntroducidoPorUsuario);

                    comprobarIntroduccionIncorrectaUsuario = false;

                } catch (NumberFormatException ex) {
                    //Mensaje de error
                    JOptionPane.showMessageDialog(null, "Formato incorrecto:\n"
                            + "Por favor ingrese un valor valido", "Error de formato",
                            JOptionPane.ERROR_MESSAGE);
                    comprobarIntroduccionIncorrectaUsuario = true;
                }
            } while (comprobarIntroduccionIncorrectaUsuario);
        } while ((Math.pow(valorB, 2) - 4 * valorA * valorC < 0));

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
