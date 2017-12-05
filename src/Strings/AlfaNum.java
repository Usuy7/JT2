package Strings;

import Metodos.Metodos;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author AlumMati
 */
public class AlfaNum {

    static Scanner tec = new Scanner(System.in);

    public AlfaNum() throws IOException {

        boolean val = false;
        int num;

        System.out.print("Ingresa una palabra: ");
        String cadena = tec.nextLine();
        cadena = Metodos.test_esLetra(cadena);
        System.out.println(cadena);
    }

    public static void main(String[] args) throws IOException {
        new AlfaNum();
    }
}
