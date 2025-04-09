package imp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear objetos
        Empleado emp1 = new Empleado("Laura", "García", "López", "12/04/1990", 2000);
        Encargado enc1 = new Encargado("Carlos", "Pérez", "Ramírez", "25/08/1985", 2500);

        // Mostrar sueldos
        System.out.println("Sueldo del empleado: " + emp1.getSueldo());
        System.out.println("Sueldo del encargado: " + enc1.getSueldo());

        // Usar métodos de UtilidadesCadena
        Scanner sc = new Scanner(System.in);
        System.out.print("\nIntroduce una frase: ");
        String frase = sc.nextLine();

        System.out.println("\n" + UtilidadesCadena.letrasNoAparecen(frase));
        System.out.println("Palabras con al menos 4 vocales distintas: " +
                UtilidadesCadena.contarPalabrasCon4Vocales(frase));

        // Prueba de conversión de fecha
        String fecha = "09/02/2015";
        int fechaEntera = UtilidadesCadena.convertirFecha(fecha);
        System.out.println("\nFecha " + fecha + " convertida a entero: " + fechaEntera);

        sc.close();
    }
}
