// Enunciado:
// Realice una función que dada una fecha de nacimiento de una persona indique cuántos años tiene.

// public class CalculadoraEdad {

//     public static int calcularEdad(LocalDate fechaNacimiento) {
//         LocalDate fechaActual = LocalDate.now();
//         Period periodo = Period.between(fechaNacimiento, fechaActual);
//         return periodo.getYears();
//     }

//     public static void main(String[] args) {
//         LocalDate fechaNacimiento = LocalDate.of(1990, 5, 15); // Ejemplo de fecha de nacimiento
//         int edad = calcularEdad(fechaNacimiento);
//         System.out.println("La edad es: " + edad + " años");
//     }

import java.util.Calendar;
import java.util.Date;

public class CalculadoraEdadConDate {

    public static int calcularEdad(Date fechaNacimiento) {
        Calendar fechaNac = Calendar.getInstance();
        fechaNac.setTime(fechaNacimiento);

        Calendar hoy = Calendar.getInstance();

        int edad = hoy.get(Calendar.YEAR) - fechaNac.get(Calendar.YEAR);

        // Comprobamos si todavía no ha cumplido años en el año actual
        if (hoy.get(Calendar.MONTH) < fechaNac.get(Calendar.MONTH) || 
           (hoy.get(Calendar.MONTH) == fechaNac.get(Calendar.MONTH) && 
            hoy.get(Calendar.DAY_OF_MONTH) < fechaNac.get(Calendar.DAY_OF_MONTH))) {
            edad--;
        }

        return edad;
    }

    public static void main(String[] args) {
        // Crear fecha de nacimiento: 15 de mayo de 1990
        Calendar cal = Calendar.getInstance();
        cal.set(1990, Calendar.MAY, 15); // Meses van de 0 a 11

        Date fechaNacimiento = cal.getTime();
        int edad = calcularEdad(fechaNacimiento);

        System.out.println("La edad es: " + edad + " años");
    }
}

