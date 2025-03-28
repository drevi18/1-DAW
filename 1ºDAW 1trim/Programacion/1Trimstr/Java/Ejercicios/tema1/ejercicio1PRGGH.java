import java.util.Scanner;

public class ejercicio1PRGGH {
    public static void main(String[] args) {
        Scanner tec = new Scanner (System.in);

    //1- Muestra por pantalla la suma de tres números enteros, introducidos por teclado.
     
    int a,b,c;
    System.out.println("Introduce el primer número:");
    a= tec.nextInt();
    System.out.println("Introduce el segundo número:");
    b= tec.nextInt();
    System.out.println("Introduce el tercer número:");
    c= tec.nextInt();

    int suma= a+b+c;

    System.out.println("Resultado suma: "+ suma);




    }
}
