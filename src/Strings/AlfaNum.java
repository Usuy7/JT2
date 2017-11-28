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

    public AlfaNum() {

        Scanner tec = new Scanner(System.in);

        String sentence, word = "??";
        boolean word2;

        word2 = Boolean.parseBoolean(word);
        word2 = Metodos.esAlfaNumerica(word);

        System.out.println(word2);

        if (word2 == false) {
            while (word2 == false) {
                System.out.print("Ingresa un cadena alfanúmerico: ");
                word = tec.nextLine();
                word2 = Boolean.parseBoolean(word);
                word2 = Metodos.esAlfaNumerica(word);
            }
        }

        System.out.println(word2);

    }

    public static void main(String[] args) {
        new AlfaNum();
    }
}
