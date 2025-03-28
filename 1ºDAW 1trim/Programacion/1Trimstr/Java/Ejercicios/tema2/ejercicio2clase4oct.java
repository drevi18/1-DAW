
import java.util.Scanner;

public class ejercicio2clase4oct {
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);
        
    int a,b,c;
    System.out.println("Introduce el primer número");
    a= tec.nextInt();
    System.out.println("Introduce el segundo número");
    b= tec.nextInt();
    System.out.println("Introduce el tercer número");
    c= tec.nextInt();

    if(a==b&&b==c){
    System.out.println("Todos son iguales"); 
        }else if(a>b&&a>c){
        System.out.println(a+" Es mayor");
        }else if(b>a&&b>c){
            System.out.println(b+" Es mayor");
            }else{
                System.out.println(c+" Es mayor");}
    }
}

