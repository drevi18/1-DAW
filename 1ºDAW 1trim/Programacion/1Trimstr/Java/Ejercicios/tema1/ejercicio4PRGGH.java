
import java.util.Scanner;

public class ejercicio4PRGGH {
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);

        //4- Lee dos números, calculando y escribiendo el valor de su suma, resta, producto y división.

        double num1,num2;   
        System.out.println("Escribe el primer número;");
        num1= tec.nextDouble();
        System.out.println("Número 1= "+ num1);
        
        System.out.println("Escribe el segundo número;");
        num2= tec.nextDouble();
        System.out.println("Número 2= "+ num2);

        double suma= num1+num2;
        System.out.println("Suma: "+ suma);

        double resta= num1-num2;
        System.out.println("Resta: "+ resta);

        double producto= num1%num2;
        System.out.println("Producto: "+ producto);

        double division= num1/num2;
        System.out.println("División: "+ division);
    }
}
