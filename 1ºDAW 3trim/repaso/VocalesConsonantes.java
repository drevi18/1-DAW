/*
Enunciado:
Escribe un programa que reciba una cadena de texto y cuente cuántas vocales y cuántas consonantes contiene.
El programa debe ignorar los espacios y distinguir correctamente entre letras y otros caracteres.
La salida debe mostrar el número total de vocales y consonantes encontrados.
*/

import java.util.Scanner;

public class VocalesConsonantes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una cadena: ");
        String cadena = sc.nextLine().toLowerCase();

        int vocales = 0;
        int consonantes = 0;

        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            if (Character.isLetter(c)) {
                if ("aeiou".indexOf(c) != -1) {
                    vocales++;
                } else {
                    consonantes++;
                }
            }
        }

        System.out.println("Número de vocales: " + vocales);
        System.out.println("Número de consonantes: " + consonantes);
    }
}

