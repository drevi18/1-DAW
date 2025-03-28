
import java.util.Scanner;


public class ejercicio1clase4oct {
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);
    
    //Algoritmo que lee dos números y nos dice cuál es el mayor o si son iguales


    int a,b;
    System.out.println("Introduce el primer número: ");    
    a= tec.nextInt();
    System.out.println("Introduce el segundo número: ");
    b= tec.nextInt();


    if (a==b)
        System.out.println("Son iguales");

        else if(a>b)
        System.out.println(a+" Es mayor que "+b);
        
            else 
            System.out.println(b+" Es mayor que "+a);


    }
    


}
