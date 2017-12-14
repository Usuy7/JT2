package Strings;

import Metodos.Metodos;
import java.io.IOException;
import java.util.Arrays;
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

        Scanner tec = new Scanner(System.in);

        String sentence, word;
        int cont = 0;

        System.out.print("Introduce una frase: ");
        sentence = tec.nextLine();
        sentence += " ";

        System.out.print("Ingresa la palabra a buscar: ");
        word = tec.nextLine();
        word = word.toLowerCase();

        cont = (int) countString(sentence, word);

        if (cont == 0) {
            System.out.println("La palabra " + word + " no aparece");
        } else if (cont == 1) {
            System.out.println("La palabra " + word + " aparece " + cont + " vez");
        } else if (cont > 1) {
            System.out.println("La palabra " + word + " aparece " + cont + " veces");
        }

    }

    public static long countString(String sentence, String word) {
        return Arrays.stream(sentence.split("[ ,\\.'']")).filter(s -> s.equals(word)).count();
    }

    public int CountWord(String sentence, String word) {

        int pos, cont = 0;
        int finDeLinea = sentence.length() - 1;

        //Uso el string indexOf para que busque la 1º posición dónde aparece, o -1 si no la encuentra
        pos = sentence.indexOf(word);

        for (int i = 0; i < finDeLinea; i++) {
            //Mientras que la encuentre, que las vaya contando
            while (pos != -1 && (!Character.isLetter(word.charAt(pos - 1)) || !Character.isLetter(word.charAt(pos + word.length())))) {
                cont++;
                //Sigue buscando a partir de la 1º posición
                pos = sentence.indexOf(word, pos + word.length());
            }
        }

        return cont;
    }

    public static void main(String[] args) throws IOException {
        new CountWord();
    }
}
