import java.util.Scanner;

public class LanzarDado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String respuesta;

        do {
            int dado = (int) (Math.random() * 6) + 1; // Genera un número entre 1 y 6
            System.out.println("Has sacado un: " + dado);
            System.out.print("¿Quieres lanzar el dado otra vez? (s/n): ");
            respuesta = sc.next().toLowerCase();
        } while (respuesta.equals("s"));

        System.out.println("¡Gracias por jugar!");
        sc.close();
    }
}

