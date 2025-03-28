
import java.util.Scanner;

public class ejercicioPRG2_1{
    public static void main(String[]args){
        Scanner tec= new Scanner(System.in);
        //Algoritmo que lee dos números y nos dice cuál es el mayor o si son iguales.

        double n1,n2;
        System.out.println("Introduce el primer número:");
        n1=tec.nextDouble();
        System.out.println("Introduce el segundo número:");
        n2=tec.nextDouble();

        if (n1>n2){
            System.out.println(n1+" Es mayor");
        }else if(n1<n2){
            System.out.println(n2+" Es mayor");
        }else{
            System.out.println("Son iguales");}

    }
}