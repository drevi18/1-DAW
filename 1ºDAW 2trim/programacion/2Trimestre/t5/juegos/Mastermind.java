package juegos;

import java.util.Random;
import java.util.Scanner;

public class Mastermind {
    static final String[] COLORS = {"R", "G", "B", "Y", "O", "P"};
    static final int CODE_LENGTH = 4;
    
    public static void main(String[] args) {
        String[] secretCode = generateSecretCode();
        Scanner sc = new Scanner(System.in);
        boolean won = false;
        
        System.out.println("¡Bienvenido a Mastermind!");
        System.out.println("Colores disponibles: R (Rojo), G (Verde), B (Azul), Y (Amarillo), O (Naranja), P (Púrpura)");
        
        for (int attempts = 0; attempts < 10; attempts++) {
            System.out.println("Intento " + (attempts + 1) + "/10. Ingresa tu combinación (ej: RGBY):");
            String[] guess = sc.next().toUpperCase().split("");
            
            if (guess.length != CODE_LENGTH) {
                System.out.println("Entrada inválida. Intenta de nuevo.");
                attempts--;
                continue;
            }
            
            int correctPosition = 0, correctColor = 0;
            boolean[] checkedSecret = new boolean[CODE_LENGTH];
            boolean[] checkedGuess = new boolean[CODE_LENGTH];
            
            for (int i = 0; i < CODE_LENGTH; i++) {
                if (guess[i].equals(secretCode[i])) {
                    correctPosition++;
                    checkedSecret[i] = true;
                    checkedGuess[i] = true;
                }
            }
            
            for (int i = 0; i < CODE_LENGTH; i++) {
                if (!checkedGuess[i]) {
                    for (int j = 0; j < CODE_LENGTH; j++) {
                        if (!checkedSecret[j] && guess[i].equals(secretCode[j])) {
                            correctColor++;
                            checkedSecret[j] = true;
                            break;
                        }
                    }
                }
            }
            
            System.out.println("Colores en la posición correcta: " + correctPosition);
            System.out.println("Colores correctos pero en posición incorrecta: " + correctColor);
            
            if (correctPosition == CODE_LENGTH) {
                System.out.println("¡Felicidades! Has adivinado el código secreto.");
                won = true;
                break;
            }
        }
        
        if (!won) {
            System.out.println("Lo siento, no adivinaste el código. Era: " + String.join("", secretCode));
        }
        
        sc.close();
    }
    
    static String[] generateSecretCode() {
        Random rand = new Random();
        String[] code = new String[CODE_LENGTH];
        for (int i = 0; i < CODE_LENGTH; i++) {
            code[i] = COLORS[rand.nextInt(COLORS.length)];
        }
        return code;
    }
}

