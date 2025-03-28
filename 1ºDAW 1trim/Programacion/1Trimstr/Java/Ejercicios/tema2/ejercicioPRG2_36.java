
import java.util.Scanner;

public class ejercicioPRG2_36 {
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);
        //Algoritmo que lee dos números enteros, positivos y distintos y nos dice si el mayor es múltiplo del menor o, lo que es lo mismo, si el menor es divisor del mayor

        int n1, n2;
        System.out.println("Inroduce el primer número");
        n1= tec.nextInt();
        System.out.println("Inroduce el segundo número");
        n2= tec.nextInt();
        
        do { 
            System.out.println("Inroduce el segundo número");
            n2= tec.nextInt();
            
        } while (n1==n2);
    }
}