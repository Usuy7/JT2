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

        String sentence, word;
        word = tec.nextLine();
        word = Metodos.test_esAlfaNumerica(word);
        System.out.println(word);

        

    }

    public static void main(String[] args) {
        new AlfaNum();
    }
}
