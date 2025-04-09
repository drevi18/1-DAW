/*
Enunciado:
Escribe un programa que reciba una cadena que represente una fecha en formato dd/mm/aaaa
y devuelva otra cadena con la fecha en formato "dd de <nombre del mes> de aaaa".
Además, el programa debe validar que el formato de la fecha sea correcto antes de convertirla.
*/

import java.util.Scanner;

public class FormatearFecha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una fecha (dd/mm/aaaa): ");
        String fecha = sc.nextLine();

        String[] partes = fecha.split("/");

        if (partes.length != 3) {
            System.out.println("Formato incorrecto.");
            return;
        }

        int dia, mes, anio;
        try {
            dia = Integer.parseInt(partes[0]);
            mes = Integer.parseInt(partes[1]);
            anio = Integer.parseInt(partes[2]);
        } catch (NumberFormatException e) {
            System.out.println("La fecha contiene caracteres inválidos.");
            return;
        }

        if (dia < 1 || dia > 31 || mes < 1 || mes > 12) {
            System.out.println("Fecha no válida.");
            return;
        }

        String[] meses = {
            "", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
        };

        String fechaFormateada = dia + " de " + meses[mes] + " de " + anio;
        System.out.println("Fecha formateada: " + fechaFormateada);
    }
}

