package Strings;

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
public class CountWord {

    public CountWord() {

        Scanner teclado = new Scanner(System.in);

        String sentence, word;

        do {
            System.out.println("Introduce la oración: ");
            sentence = teclado.nextLine();

        } while (sentence.isEmpty());

        do {
            System.out.print("¿Qué palabra quieres contar? ");
            word = teclado.nextLine();
            
        } while (word.isEmpty());

        sentence.toLowerCase();
        word.toLowerCase();
    }
    
    public static int CountWords (String sentence, String word){
        
        int counter = 0;
        
        
        return counter;
    }

    public static void main(String[] args) {
        new CountWord();
    }
}