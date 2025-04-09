package imp;
import java.util.Scanner;

public class preexamen1 {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== MENÚ DE OPERACIONES CON CADENAS ===");
            System.out.println("1. Contar número de vocales y consonantes");
            System.out.println("2. Invertir todas las palabras de una frase");
            System.out.println("3. Eliminar todas las apariciones de una subcadena");
            System.out.println("4. Comprobar si una palabra es palíndroma");
            System.out.println("5. Sustituir espacios múltiples por uno solo");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Introduce una cadena: ");
                    String cadena1 = sc.nextLine();
                    String resultado1 = ContarLetras(cadena1);
                    System.out.println(resultado1);
                    break;

                case 2:
                    System.out.print("Introduce una frase: ");
                    String frase2 = sc.nextLine();
                    String resultado2 = invertirPalabras(frase2);
                    System.out.println("Frase con palabras invertidas: " + resultado2);
                    break;

                case 3:
                    System.out.print("Introduce el texto original: ");
                    String original = sc.nextLine();
                    System.out.print("Introduce la subcadena a eliminar: ");
                    String subcadena = sc.nextLine();
                    String resultado3 = eliminarSubcadena(original, subcadena);
                    System.out.println("Resultado: " + resultado3);
                    break;

                case 4:
                    System.out.print("Introduce una palabra o frase: ");
                    String palabra = sc.nextLine();
                    boolean esPalin = esPalindroma(palabra);
                    System.out.println(esPalin ? "Es palíndroma." : "No es palíndroma.");
                    break;

                case 5:
                    System.out.print("Introduce una frase con muchos espacios: ");
                    String fraseEspacios = sc.nextLine();
                    String resultado5 = normalizarEspacios(fraseEspacios);
                    System.out.println("Resultado: " + resultado5);
                    break;

                case 6:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        } while (opcion != 6);

        sc.close();
    }

    public static String ContarLetras(String s1){
        String voc= new String("aeiou");
        int contvoc=0, contcon=0;
        String esp= new String(" ");
            for (int i = 0; i < s1.length(); i++) {
                boolean esVocal = false;
        
                for (int j = 0; j < voc.length(); j++) {
                    if (s1.charAt(i) == voc.charAt(j)) {
                        esVocal = true;
                    }
                }
        
                if (esVocal) {
                    contvoc++;
                } else if (s1.charAt(i) != esp.charAt(0)) {
                    contcon++;
                }
            }
        return "Tiene "+contvoc+"vocales  y "+contcon+" consonantes";
    }

    public static String invertirPalabras(String frase) {
        String[] palabras = frase.split(" ");
        StringBuilder resultado = new StringBuilder();
    
        for (String palabra : palabras) {
            StringBuilder invertida = new StringBuilder(palabra);
            resultado.append(invertida.reverse()).append(" ");
        }
    
        return resultado.toString().trim(); // Quitamos el espacio final
    }
    public static String eliminarSubcadena(String original, String subcadena) {
        return original.replace(subcadena, "");
    }
    public static boolean esPalindroma(String palabra) {
        String limpia = palabra.replaceAll("\\s+", "").toLowerCase();
        String invertida = new StringBuilder(limpia).reverse().toString();
        return limpia.equals(invertida);
    }
    public static String normalizarEspacios(String frase) {
        return frase.replaceAll("\\s+", " ").trim();
    }
                
}
