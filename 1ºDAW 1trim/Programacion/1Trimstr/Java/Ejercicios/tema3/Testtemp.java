
import java.util.Scanner;

public class Testtemp {
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);

        Temperatura temp= new Temperatura(12.3, 14.5);

        System.out.println("14,3 fahrenheit son: "+temp.fahrenheitToCelsius());
        System.out.println("12,3 celsius son: "+temp.celsiusToFahrenheit());

    }
}
