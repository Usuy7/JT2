package Strings;

import java.util.Scanner;

/**
 *
 * @author AlumMati
 */

/*
Escribir un programa en java que pida el nombre de una persona (que puede ser compuesto) y sus dos apellidos, 
y nos saque por pantalla las iniciales (de su/s nombre/s) junto con las dos iniciales de sus dos apellidos.
 */
public class Names {

    public Names() {

        Scanner tec = new Scanner(System.in);
        String name;

        System.out.println("Ingresa tu nombre completo: ");
        name = tec.nextLine();
        name = name.toUpperCase();

        for (int i = 0; i < name.length(); i++) {

            if (i == 0){
                System.out.print(name.charAt(0) + ".");
            } else if (name.charAt(i) == ' ') {
                System.out.print(name.charAt(i + 1) + ".");
            }
        }
    }

    public static void main(String[] args) {
        new Names();
    }
}
