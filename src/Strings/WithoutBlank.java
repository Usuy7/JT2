package Strings;

import java.util.Scanner;

/**
 *
 * @author AlumMati
 */

/*
Escribir un programa en java que pida una frase al usuario y 
la visualice después de eliminar todos los espacios en blanco.
*/
public class WithoutBlank {
    
    public WithoutBlank(){
        
        Scanner tec = new Scanner (System.in);
        String sentence, new_sentence = "";
        
        System.out.println("Ingresa una frase: ");
        sentence = tec.nextLine();
        
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) != ' '){
                new_sentence += sentence.charAt(i);
            } 
        }
        System.out.println(new_sentence);
    }
    
    public static void main(String[] args) {
        new WithoutBlank();
    }
}
