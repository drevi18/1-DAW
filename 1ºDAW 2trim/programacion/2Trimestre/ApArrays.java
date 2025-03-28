
public class ApArrays {
    public static void main(String[] args) {
        // Apuntes sobre Cadenas y Arrays en Java

// 1. Cadenas de caracteres (Clase String)
// Declaración de cadenas
String cad1 = "Hola";
String cad2 = new String("Mundo");
System.out.println(cad1 + " " + cad2);

// Concatenación de cadenas
String saludo = cad1.concat(" ").concat(cad2);
System.out.println(saludo);

// Métodos útiles de String
System.out.println("Longitud: " + cad1.length()); // Número de caracteres
System.out.println("Carácter en pos 1: " + cad1.charAt(1)); // Accede a un carácter
System.out.println("Subcadena: " + cad1.substring(1, 3)); // Extrae parte de la cadena
System.out.println("Mayúsculas: " + cad1.toUpperCase()); // Convierte a mayúsculas
System.out.println("Minúsculas: " + cad1.toLowerCase()); // Convierte a minúsculas
System.out.println("Sin espacios: " + " Hola ".trim()); // Elimina espacios iniciales y finales

// Conversión de otros tipos a String
int numero = 123;
String textoNumero = String.valueOf(numero);
System.out.println("Número como texto: " + textoNumero);

// 2. Arrays (Estructuras estáticas)
// Declaración y acceso a un array de enteros
int[] numeros = {5, 10, 15, 20};
System.out.println("Primer número: " + numeros[0]);

// Recorrer un array con for
for (int i = 0; i < numeros.length; i++) {
    System.out.println("Número en posición " + i + ": " + numeros[i]);
}

// Recorrer un array con for-each
for (int num : numeros) {
    System.out.println("Número: " + num);
}

// Arrays multidimensionales (matriz de 3x3)
int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
System.out.println("Elemento en [1][2]: " + matriz[1][2]);

// Recorrer una matriz con bucles anidados
for (int i = 0; i < matriz.length; i++) {
    for (int j = 0; j < matriz[i].length; j++) {
        System.out.print(matriz[i][j] + " ");
    }
    System.out.println();
}

// 3. Expresiones regulares en Strings
String email = "usuario@example.com";
boolean valido = email.matches("^[A-Za-z0-9+_.-]+@(.+)$"); // Verifica formato de email
System.out.println("Email válido: " + valido);

// 4. División de una cadena (split)
String listaNombres = "Juan,Pedro,Maria";
String[] nombres = listaNombres.split(",");
for (String nombre : nombres) {
    System.out.println("Nombre: " + nombre);
}

    }
}
