package Strings;

import Metodos.Metodos;
import java.util.Scanner;

/**
 *
 * @author AlumMati
 */
/**
 * Algoritmo que cuenta cuántas veces aparece una palabra. Por ejemplo, si la
 * frase es “el programa en java pide el dato al usuario” y la palabra es “el”,
 * el programa me dirá “la palabra ,el, aparece 2 veces en la frase”.
 */
public class AlfaNum {

    static Scanner tec = new Scanner(System.in);

    public AlfaNum() {

        boolean val = false;
        int num;

        System.out.print("Ingresa un número: ");
        num = tec.nextInt();

        String cadena = String.valueOf(num);
        num = Integer.parseInt(cadena);
        System.out.println(num);

    }

    public static String test_esNumber(String cadena) {

        boolean val = false;

        cadena = cadena.toLowerCase();

        do {

            while (cadena.equals("")) {
                System.out.print("Ingresa algún dato: ");
                cadena = tec.nextLine();
            }

            for (int i = 0; i < cadena.length(); i++) {

                val = true;

                if (!Character.isLetter(cadena.charAt(i))) {
                    val = false;
                }
            }
            if (!val) {
                System.out.print("Error, ingresa una cadena alfabetica: ");
                cadena = tec.nextLine();
            }
        } while (!val);

        return cadena;
    }

    public static void main(String[] args) {
        new AlfaNum();
    }
}
