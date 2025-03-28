
import java.util.Scanner;

public class ejercicio14PRGGH {
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);

        //Escribir un programa que lea por teclado un número n y lo visualice en decimal, octal y hexadecimal.

        System.out.println("Introduce un número:");
        int x= tec.nextInt();
        String oct,hex;
        float dec;

        dec=x; 
        oct= Integer.toOctalString(x);
        hex= Integer.toHexString(x);

        System.out.println("Decimal: "+dec+" Octal: "+oct+" hexadecimal: "+hex);

    }
}
