import java.util.Scanner;
public class ejercicioPRG2_2 {
        public static void main(String[]args){
            Scanner tec= new Scanner(System.in);
            //Algoritmo que lee tresz números y nos dice cuál es el mayor.
    
            double n1,n2, n3;
            System.out.println("Introduce el primer número:");
            n1=tec.nextDouble();
            System.out.println("Introduce el segundo número:");
            n2=tec.nextDouble();
            System.out.println("Introduce el tercer número:");
            n3=tec.nextDouble();
    
            if (n1>n2&&n2>n3){
                System.out.println(n1+" Es mayor");
            }else if(n1<n2&&n2>3){
                System.out.println(n2+" Es mayor");
            }else{
                System.out.println(n3+" Es mayor");}
    
        }
    }
        
    
