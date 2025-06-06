import java.util.Scanner;

public class binario {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Introduce un número para comprobar si es binario:");
        int num = tec.nextInt();

        if (esBinario(num) == true) {
            System.out.println("Es binario");
        } else {
            System.out.println("No es binario");
        }
    }

    public static boolean esBinario(int num) {
        boolean resultado = true;

        if (num != 0) {
            int ultimoDigito = num % 10;

            if (ultimoDigito != 0 && ultimoDigito != 1) {
                resultado = false;
            } else {
                resultado = esBinario(num / 10);
            }
        }
        return resultado;
    }

}
