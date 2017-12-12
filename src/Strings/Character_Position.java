package Strings;
import java.util.Scanner;

/**
 *
 * @author AlumMati
 */

/*
Codificar un programa en java que pida una frase y un entero al usuario y escriba por
pantalla el carácter que hay en esa posición en la frase, o un mensaje de error si la frase es
más corta que la posición que nos pide el usuario.
 */
public class Character_Position {

    public Character_Position() {

        Scanner tec = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String sentence = tec.nextLine();

        System.out.print("Introduce la posición que deseas ver: ");
        int pos = tec.nextInt();

        while (0 > pos || pos > (sentence.length() - 1)) {
            System.out.print("The position is out of range, try again: ");
            pos = tec.nextInt();
        }

        char caract = sentence.charAt(pos);
        System.out.println("El cáracter que corresponde a esa posición es: " + caract);
    }

    public static void main(String[] args) {
        new Character_Position();
    }
}