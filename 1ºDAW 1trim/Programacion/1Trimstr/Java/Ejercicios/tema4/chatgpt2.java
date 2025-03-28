
import java.util.Scanner;

public class chatgpt2 {
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);

        System.out.println("Introduce un número");


    }

    public static int Pares(int num){
        if (num==0) {
            return 0;
        } else {
            int digito = num % 10;
            int esPar = (digito % 2 == 0) ? 1 : 0; 
    
            return esPar + Pares(num / 10); 
        }
    }
}
