
import java.util.Scanner;

public class ejercicio8PRGGH {
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);

        //8-Acepta un número entero de 4 cifras y lo muestra invertido por pantalla.
        
        int x;
        System.out.println("Introduce un número de 4 cifras:");
        x= tec.nextInt();
        int num1= (x/1000);
        int num2=(x/100)%10;
        int num3=(x/10)%10;
        int num4=(x%10);
        System.out.println(num4*1000 + num3*100 + num2*10 + num1);
    }
}
