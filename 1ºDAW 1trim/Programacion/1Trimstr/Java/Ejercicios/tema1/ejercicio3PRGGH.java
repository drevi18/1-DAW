
import java.util.Scanner;

public class ejercicio3PRGGH {
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);

        //3- Muestra por pantalla la nota media de 3 notas reales, introducidos por teclado.

        float a,b,c;

        System.out.println("Introduce la primera nota: ");
        a= tec.nextFloat();
        System.out.println("Introduce la segunda nota: ");
        b= tec.nextFloat();
        System.out.println("Introduce la tercera nota: ");
        c= tec.nextFloat();

        float  media = (a+b+c)/3;
        System.out.println("La nota media es: "+ media);
    }
}
