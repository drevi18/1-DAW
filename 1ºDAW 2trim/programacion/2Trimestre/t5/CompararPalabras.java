import java.util.Scanner;

public class CompararPalabras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String claveSecreta = "java";

        System.out.print("Adivina la palabra secreta: ");
        String intento = sc.nextLine();

        if (intento.equals(claveSecreta)) {
            System.out.println("¡Correcto! Has adivinado la palabra secreta.");
        } else {
            System.out.println("Incorrecto, intenta de nuevo.");
        }

        sc.close();
    }
}

