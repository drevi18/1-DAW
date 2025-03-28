
import java.util.Scanner;

public class ejercicio13PRGGH {
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);

        //Realiza un programa que evalúe el 
        //polinomio: 6x4-x2+3x-5 para un valor determinado 
        //de x. Visualizar el resultado como se indica a continuación: 6x^4-x^2+3x-5=resultado.
        
        System.out.println("Introduce el valor de x: ");
        int x= tec.nextInt();
        int polin= (6*(x^4))-(x^2)+(3*x)-5;
        System.out.println("6x^4-x^2+3x-5="+polin);

    }
}
