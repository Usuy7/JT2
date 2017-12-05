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

public class CountWords {
    
    public CountWords() throws IOException {
        
        Scanner tec = new Scanner (System.in);
        
        System.out.print("Introduce una frase: ");
        String sentence = tec.nextLine();
        sentence = Metodos.test_esLetra(sentence);
        
        System.out.println("Ingresa la palabra a buscar: ");
        String word = tec.nextLine();
        word = Metodos.test_esLetra(word);
        
        
    }
    
    public static void main(String[] args) throws IOException {
        new CountWords();
    }
}
