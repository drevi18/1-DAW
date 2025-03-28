import java.util.Random;
import java.util.Scanner;

public class AdivinaElNumero {
    public static void main(String[] args) {
        Random rand = new Random();
        int numeroSecreto = rand.nextInt(100) + 1; // Genera un número entre 1 y 100
        Scanner sc = new Scanner(System.in);
        int intento;
        int intentos = 0;
        
        System.out.println("¡Adivina el número entre 1 y 100!");

        do {
            System.out.print("Introduce tu número: ");
            intento = sc.nextInt();
            intentos++;

            if (intento < numeroSecreto) {
                System.out.println("Muy bajo. Intenta de nuevo.");
            } else if (intento > numeroSecreto) {
                System.out.println("Muy alto. Intenta de nuevo.");
            } else {
                System.out.println("¡Correcto! Has adivinado el número en " + intentos + " intentos.");
            }
        } while (intento != numeroSecreto);
    } 
}

