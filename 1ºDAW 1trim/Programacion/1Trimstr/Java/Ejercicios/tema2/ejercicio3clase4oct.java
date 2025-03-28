
import java.util.Scanner;

public class ejercicio3clase4oct {
    public static void main(String[]args){
        Scanner tec= new Scanner(System.in);

    int a,b,c;
    System.out.println("Introduce el primer número");
    a= tec.nextInt();
    System.out.println("Introduce el segundo número");
    b= tec.nextInt();
    System.out.println("Introduce el tercer número");
    c= tec.nextInt();

    if (a<b){
        if(b<c)
        System.out.println(a+","+b+","+c);
    else if(a<c)
        System.out.println(a+","+c+","+b);
    else
        System.out.println(c+","+a+","+b);
    
    
    }
    

    }
}
