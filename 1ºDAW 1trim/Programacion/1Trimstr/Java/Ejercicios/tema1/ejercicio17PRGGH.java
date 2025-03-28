import java.util.Scanner;

public class ejercicio17PRGGH {
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);

        //17-Escriba un programa que calcule la suma y la media de cuatro enteros introducidos por teclado

        int num1,num2,num3,num4;
        System.out.println("Introduce la primera nota:");
        num1= tec.nextInt();
        System.out.println("Introduce la segunda nota:");
        num2= tec.nextInt();
        System.out.println("Introduce la tercera nota:");
        num3= tec.nextInt();
        System.out.println("Introduce la cuarta nota:");
        num4= tec.nextInt();

        int suma= num1+num2+num3+num4;
        System.out.println("Suma: "+suma);

        int med= suma/4;
        System.out.println("Media: "+med);
    }
}
