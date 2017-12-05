package Strings;

import Metodos.Metodos;
import java.io.IOException;
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

    public AlfaNum() throws IOException{

        boolean val = false;
        int num;

        System.out.print("Ingresa un número: ");
        String cadena = tec.nextLine();
        cadena = Metodos.test_esNumber(cadena);
        num = Integer.parseInt(cadena);
        System.out.println(num);

    }

    

    public static void main(String[] args) throws IOException {
        new AlfaNum();
    }
}
