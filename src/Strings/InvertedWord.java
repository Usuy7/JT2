package Strings;

import java.util.Scanner;

/**
 *
 * @author AlumMati
 */

/*
Programa que pida una palabra, y la devuela del revés.
*/

public class InvertedWord {
    
    public InvertedWord(){
        
        Scanner tec = new Scanner (System.in);
        
        String word, new_word = "";
        
        System.out.print("Ingresa una palabra: ");
        word = tec.nextLine();
        
        for (int i = word.length()-1 ; i >= 0 ; i--) {
            new_word += word.charAt(i);
        }
        System.out.println(new_word);
    }
    
    public static void main(String[] args) {
        new InvertedWord();
    }
}
