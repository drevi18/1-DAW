
import java.util.Scanner;


public class ejercicio2PRGGH {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);    
        //2- Muestra por pantalla la suma de tres números reales, introducidos por teclado.

        double a, b, c;
        System.out.println("Introduce el primer número real: ");
        a = tec.nextDouble();
        System.out.println("Introduce el segundo número real: ");
        b = tec.nextDouble();
        System.out.println("Introduce el tercer número real: ");
        c = tec.nextDouble();

        double suma= a+b+c;
        System.out.println("Resultado: "+ suma);

    }
}
