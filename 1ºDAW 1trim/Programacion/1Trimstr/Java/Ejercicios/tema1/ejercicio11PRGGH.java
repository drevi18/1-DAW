
import java.util.Scanner;

public class ejercicio11PRGGH {
    public static void main(String[] args) {
        Scanner tec = new Scanner (System.in);

        /*Algoritmo que toma como datos de entrada el capital C en euros depositado en un banco, 
        el interés R un tanto por ciento y el tiempo T en años que estará el mencionado capital depositado 
        y nos calcula y escribe los intereses en euros que recibiremos transcurridos los T años. El cálculo se 
        realiza por medio de la fórmula del interés simple. */

        int c,t;
        System.out.println("Introduce el interés: ");
        double r;
        r= tec.nextDouble();
        System.out.println("Introduce el capital en euros:  ");
        c= tec.nextInt();
        System.out.println("Introduce el tiempo que dejaras el dinero: ");
        t= tec.nextInt();
        double i = (c*r*t)/100;
        System.out.println("Intereses: "+i);

    }
}
