
import java.util.Scanner;

public class ejercicioPRG2_3 {
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);

        //Algoritmo que lee tres números cualesquiera y los escribe ordenados de forma ascendente.

        double n1,n2,n3;
        System.out.println("Introduce el primer número");
        n1= tec.nextDouble();
        System.out.println("Intrioduce el segundo número");
        n2= tec.nextDouble();
        System.out.println("Intrioduce el tercer número");
        n3= tec.nextDouble();

        if(n1>n2&&n2>n3){
            System.out.println(n1+">"+n2+">"+n3);
        } else if (n1>n2&&n2<n3) {
            System.out.println(n1+">"+n3+">"+n2);
        }else if (n2>n1&&n1>n3){
            System.out.println(n2+">"+n1+">"+n3);
        }else if (n2>n1&&n1<n3) {
            System.out.println(n2+">"+n3+">"+n1);
        }else if (n3>n1&&n1>n2){
            System.out.println(n3+">"+n1+">"+n2);
        }else if (n3>n1&&n1>n2) {
            System.out.println(n3+">"+n2+">"+n1);
        }
            
    }
}
