
import java.util.Scanner;

public class apuntesporisaca {
    public static void main(String[] args) {

// ------------------------------------------
// Apuntes sobre Java
// ------------------------------------------


// 1. Uso de char con Scanner
    // Para leer un carácter, se puede utilizar el método next(). 
    // Este método captura la entrada del usuario como un String y se puede obtener el primer carácter usando charAt(0).
    // Ejemplo:
    
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una letra: ");
        char letra = scanner.next().charAt(0); // Captura el primer carácter ingresado
        System.out.println("Has ingresado la letra: " + letra);
        

// 2. Operador Ternario para determinar el número par
    // Se utiliza para verificar si un número es par y calcular el siguiente número par.
    // Ejemplo:

        int num = 5; // Puedes cambiar el valor para probar
        int siguientePar = (num % 2 == 0) ? num + 2 : num + 1;
        System.out.println("El siguiente número par es: " + siguientePar);


// 3. Uso de Math.PI
    // Math.PI es una constante que representa el valor de pi (π), usado en cálculos relacionados con círculos y geometría.
    // Ejemplo:

        double radio = 5; // Radio de un círculo
        double circunferencia = 2 * Math.PI * radio; // Cálculo de la circunferencia de un círculo
        System.out.println("La circunferencia del círculo es: " + circunferencia);


// 4. Uso de Math.pow()
    // Math.pow(base, exponente) se utiliza para elevar un número (base) a la potencia de otro número (exponente).
    // Ejemplo:

        double base = 2;
        double exponente = 3;
    double resultado = Math.pow(base, exponente); // 2 elevado a la 3, que es 8
    System.out.println(base + " elevado a " + exponente + " es: " + resultado);


// 5. Uso de Math.sqrt()
    // Math.sqrt() se utiliza para calcular la raíz cuadrada de un número.
    // Ejemplo:

        double numeroRaiz = 16; // Número del que se desea calcular la raíz cuadrada
        double raizCuadrada = Math.sqrt(numeroRaiz); // Calcula la raíz cuadrada de 16
        System.out.println("La raíz cuadrada de " + numeroRaiz + " es: " + raizCuadrada);


// 6. Inversión de un número
    // Para invertir un número de 4 dígitos (por ejemplo, 1234 se convierte en 4321), se puede usar la siguiente técnica:
    // - Dividir el número en sus dígitos usando operaciones matemáticas y luego recomponerlo en orden inverso.
    // Ejemplo:
    
        int x = 1234; // Número a invertir
        int num1 = (x / 1000); // Primer dígito (miles)
        int num2 = (x / 100) % 10; // Segundo dígito (centenas)
        int num3 = (x / 10) % 10; // Tercer dígito (decenas)
        int num4 = (x % 10); // Último dígito (unidades)

    // Recompose el número invertido:

        int numeroInvertido = num4 * 1000 + num3 * 100 + num2 * 10 + num1;
        System.out.println("El número invertido es: " + numeroInvertido);


//cerrar el scanner
    scanner.close();
    scanner.close();
    }
}
