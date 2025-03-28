
import java.util.Scanner;

public class ejercicio5PRGGH {
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);

        //5- Acepta un número entero y muestra por pantalla el número par(mayor) más próximo.

        int num;   
        System.out.println("Escribe un número entero;");
        num= tec.nextInt();

        System.out.println((num%2 ==0)? num +2 : num+1);
    }
}
