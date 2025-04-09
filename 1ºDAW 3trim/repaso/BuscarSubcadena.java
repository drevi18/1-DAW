/*
Enunciado:
Escribe un programa que reciba dos cadenas de texto: una cadena principal y una subcadena.
El programa debe contar cuántas veces aparece la subcadena dentro de la cadena principal
e indicar la posición (índice) de su primera aparición. Si no se encuentra, debe devolver -1.
*/

import java.util.Scanner;

public class BuscarSubcadena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la cadena principal: ");
        String cadena = sc.nextLine();

        System.out.print("Introduce la subcadena a buscar: ");
        String subcadena = sc.nextLine();

        int contador = 0;
        int index = cadena.indexOf(subcadena);
        int primeraAparicion = index;

        while (index != -1) {
            contador++;
            index = cadena.indexOf(subcadena, index + 1);
        }

        if (primeraAparicion == -1) {
            System.out.println("La subcadena no se encontró.");
        } else {
            System.out.println("La subcadena aparece " + contador + " veces.");
            System.out.println("Primera aparición en el índice: " + primeraAparicion);
        }
    }
}
