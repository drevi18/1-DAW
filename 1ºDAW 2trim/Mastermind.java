

import java.util.Random;
import java.util.Scanner;

public class Mastermind {
    
    public static void main(String[] args) {
        String []col= {"R", "G", "B", "Y", "O", "P", "F", "A"};
        String []codigo = new String[8];
        Scanner tec = new Scanner(System.in);
        boolean ganado = false;
        int tot=8;
        String c1,c2,c3,c4;
        
        System.out.println("¡Bienvenido a Mastermind!");
        System.out.println("Colores disponibles: R (Rojo), V (Verde), B (Blanco), Y (Amarillo), N (Naranja), F (Fucsia), N (Negro), A (azul)");
        
        for (int intento = 0; intento < 10; intento++) {
            System.out.println("Dime el primer color");
            c1=tec.nextLine();
            tec.nextLine();
            System.out.println("Dime el segundo color");
            c2=tec.nextLine();
            tec.nextLine();
            System.out.println("Dime el tercer color");
            c3=tec.nextLine();
            tec.nextLine();
            System.out.println("Dime el cuarto color");
            c4=tec.nextLine();
            
            int correctPosition = 0, correctColor = 0;
            boolean[] checkedSecret = new boolean[tot];
            boolean[] checkedGuess = new boolean[tot];
            
            for (int i = 0; i < tot; i++) {
                if (adivina[i].equals(codigo[i])) {
                    correctPosition++;
                    checkedSecret[i] = true;
                    checkedGuess[i] = true;
                }
            }
            
            for (int i = 0; i < tot; i++) {
                if (!checkedGuess[i]) {
                    for (int j = 0; j < tot; j++) {
                        if (!checkedSecret[j] && adivina[i].equals(secretCode[j])) {
                            correctColor++;
                            checkedSecret[j] = true;
                            break;
                        }
                    }
                }
            }
            
            System.out.println("Colores en la posición correcta: " + correctPosition);
            System.out.println("Colores correctos pero en posición incorrecta: " + correctColor);
            
            if (correctPosition == tot) {
                System.out.println("¡Felicidades! Has adivinado el código secreto.");
                won = true;
                break;
            }
        }
        
        if (!won) {
            System.out.println("Lo siento, no adivinaste el código. Era: " + String.join("", secretCode));
        }
        
    }
    
    static String[] generateSecretCode() {
        int tot=8;
        Random rand = new Random();
        String[] code = new String[tot];
        for (int i = 0; i < tot; i++) {
            code[i] = COLORS[rand.nextInt(COLORS.length)];
        }
        return code;
    }
}


