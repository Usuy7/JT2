package Strings;
import Metodos.Metodos;
import java.util.Scanner;

/**
 *
 * @author AlumMati
 */

/*
Escribir un programa en java que pida una frase al usuario y le diga cuántas palabras hay
en esa frase (consideraremos que entre cada dos palabras únicamente meten un espacio).
*/
public class CountWords {
    
    public CountWords(){
        
        Scanner tec = new Scanner (System.in);
        
        System.out.print("Introduce tu frase: ");
        String sentence = tec.nextLine();
        int cont = Metodos.CountWords(sentence);
        System.out.print("Palabras: " + cont);
    }
    
    public static void main(String[] args) {
        new CountWords();
    }
}
