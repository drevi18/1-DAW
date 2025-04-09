/*
Enunciado:
Desarrolla un programa que lea una cadena de texto y muestre la cadena invertida.
A continuación, deberá indicar si la cadena original es un palíndromo (se lee igual al derecho que al revés),
ignorando mayúsculas y minúsculas.
*/

import java.util.Scanner;

public class InvertirYPalindromo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una cadena: ");
        String original = sc.nextLine();

        String invertida = new StringBuilder(original).reverse().toString();

        System.out.println("Cadena invertida: " + invertida);

        String originalLimpia = original.replaceAll("\\s+", "").toLowerCase();
        String invertidaLimpia = new StringBuilder(originalLimpia).reverse().toString();

        if (originalLimpia.equals(invertidaLimpia)) {
            System.out.println("La cadena es un palíndromo.");
        } else {
            System.out.println("La cadena no es un palíndromo.");
        }
    }
}
