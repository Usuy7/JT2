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

public final class CountWord {
    
    public CountWord() throws IOException {
        
        Scanner tec = new Scanner (System.in);
        
        System.out.print("Introduce una frase: ");
        String sentence = tec.nextLine();
        sentence = Metodos.test_esLetra(sentence);
        sentence = sentence.toLowerCase();
        
        System.out.print("Ingresa la palabra a buscar: ");
        String word = tec.nextLine();
        word = Metodos.test_esLetra(word);
        word = word.toLowerCase();
        
        int count = CountWord(sentence);
        
        if (count == 0){
            System.out.println("La palabra " + word + " no aparece");
        } else if (count == 1) {
            System.out.println("La palabra " + word + " aparece " + count + " vez");
        } else if (count > 1) {
            System.out.println("La palabra " + word + " aparece " + count + " veces");
        }
    }
    
    public int CountWord(String sentence){    
    int conteoPalabras = 0;    
    boolean palabra = false;
    int finDeLinea = sentence.length() - 1;

    for (int i = 0; i < sentence.length(); i++) {
        // Si el char is una letra, word = true.
        if (Character.isLetter(sentence.charAt(i)) && i != finDeLinea) {
            palabra = true;
            // Si el char no es una letra y aún hay más letras,
            // el contador continua.
        } else if (!Character.isLetter(sentence.charAt(i)) && palabra) {
            conteoPalabras++;
            palabra = false;
            // última palabra de la cadena; si no termina con una no letra ,
        } else if (Character.isLetter(sentence.charAt(i)) && i == finDeLinea) {
            conteoPalabras++;
        }
    }
    return conteoPalabras;
}
    
    public int CountWords (String sentence, String word){
        
        
        
        
        
        return 0;
    }
    
    public static void main(String[] args) throws IOException {
        new CountWord();
    }
}
