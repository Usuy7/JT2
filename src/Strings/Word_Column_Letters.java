package Strings;

import java.util.Scanner;

/**
 *
 * @author AlumMati
 */
/*
Escribir un programa en java que pida una frase al usuario y la visualice por palabras en
una columna, indicando cuantas letras tiene cada palabra.
Hola como estas 
Hola 4
como 4
estas 5
 */
public class Word_Column_Letters {

    public Word_Column_Letters() {

        Scanner tec = new Scanner(System.in);

        String sentence, word = "";
        int letters = 0;

        System.out.print("Introduce una frase: ");
        sentence = tec.nextLine();
        sentence += " ";

        boolean palabra = false;
        int finDeLinea = sentence.length() - 1;

        for (int i = 0; i < sentence.length(); i++) {

            if (Character.isLetter(sentence.charAt(i))) {
                palabra = true;
                System.out.print(sentence.charAt(i));
                letters++;
                //  || Character.isLetter(sentence.charAt(i)) && i == finDeLinea
            } else if (!Character.isLetter(sentence.charAt(i)) && palabra) {

                System.out.println(" = " + letters);
                palabra = false;
                letters = 0;
            }
        }
    }

    public static void main(String[] args) {
        new Word_Column_Letters();
    }
}
