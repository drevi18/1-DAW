
import java.util.Scanner;

public class ejercicio15PRGGH {
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);

        //Escribir un programa que lea un carácter y muestre su código ASCII en decimal y hexadecimal.

        char carct;
        System.out.println("Introduce un carácter:");
        carct= tec.next().charAt(0);

        int dec=(int)carct;
        String hex= Integer.toHexString(dec);
        int ascii= carct;

        System.out.println("ASCII en decimal: " + ascii+" ASCII en hexadecimal: "+hex);
    }
}
