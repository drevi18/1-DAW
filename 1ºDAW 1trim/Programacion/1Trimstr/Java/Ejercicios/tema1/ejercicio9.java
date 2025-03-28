
import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
       Scanner tec = new Scanner(System.in);

    float c,r,f,k;
    System.out.println("Introduce grados centigrados:");
    c = tec.nextFloat();

    r = (80*c)/100;
    f = (180*c)/100;
    k = c+273;

    System.out.println("Centigrados: " + c + " Reamur: "+ r + " Farenheit: "+ f + " Kelvin: " + k);


    }
}


