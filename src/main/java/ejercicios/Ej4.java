/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author imad
 */
public class Ej4 {

    public static void main(String[] args) {
        //Declaracion de objeto
        Scanner teclado = new Scanner(System.in);
        //Declaracion de variables
        int opcionEleccionMenuUsuario = 0;
        //Si esta variable es false el usuario sale del menu
        boolean eleccionUsuarioSalirPrograma = true;
        String eleccionSiNoUsuario = "";
        //Control de valor introducido correcto se pone false cuando es correcto
        boolean controlIntroduccionDatoCorrecto = true;

        do {
            mostrarMenu();
            do {
                try {
                    opcionEleccionMenuUsuario = teclado.nextInt();
                    controlIntroduccionDatoCorrecto = false;
                } catch (InputMismatchException ime) {
                    System.out.println("Introduce sólo números");
                    teclado.nextLine();
                    controlIntroduccionDatoCorrecto = true;
                }
            } while (controlIntroduccionDatoCorrecto);

            switch (opcionEleccionMenuUsuario) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    teclado.nextLine();
                    System.out.println("¿Desea salir?");
                    eleccionSiNoUsuario = teclado.nextLine();

                    if (eleccionSiNoUsuario.equalsIgnoreCase("Si")) {
                        eleccionUsuarioSalirPrograma = false;
                    }
                    break;
            }
        } while (eleccionUsuarioSalirPrograma);

    }

   private static void mostrarMenu() {
        System.out.println("Elige una opcion del menu\n"
                + "1) Cuenta atras\n"
                + "2) Juego de dados\n"
                + "3) Salir");
    }
}
