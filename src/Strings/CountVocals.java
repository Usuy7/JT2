/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;
import Metodos.Metodos;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author AlumMati
 */

/*
Escribir un programa en java que pida una frase al usuario y nos diga cuantas vocales tiene
la frase. (Vocales son todas, las minúsculas y las mayúsculas )
 */
public class CountVocals {

    public CountVocals() throws IOException {

        Scanner tec = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String sentence = tec.nextLine();
        sentence = sentence.toLowerCase();
        sentence = Metodos.test_esLetra(sentence);
        int cont = 0;

        for (int i = 0; i < sentence.length(); i++) {
            if ((sentence.charAt(i) == 'a') || (sentence.charAt(i) == 'e') || (sentence.charAt(i) == 'i') || (sentence.charAt(i) == 'o') || (sentence.charAt(i) == 'u')) {
                cont++;
            }
        }
        
        System.out.print("Vocales: " + cont);

    }

    public static void main(String[] args) throws IOException {
        new CountVocals();
    }
}
