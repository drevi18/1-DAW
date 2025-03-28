
import java.util.Scanner;

public class ejercicio12PRGGH {
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);

        //Realiza un programa que calcule las soluciones reales de una ecuación de segundo grado, de la forma: ax2+bx+c=0

        double a,b,c;
        System.out.println("Introduce el primer número: ");
        a= tec.nextDouble();
        System.out.println("Introduce el segundo número: ");
        b= tec.nextDouble();
        System.out.println("Introduce el tercer número: ");
        c= tec.nextDouble();

        double for1 = (((-b)+Math.sqrt(b*b-4*a*c))/(2*a));
        double for2 = (((-b)-Math.sqrt(b*b-(4*a*c)))/(2*a));
        System.out.println("X1= "+for1);
        System.out.println("X2: "+for2);

    }
    
}
