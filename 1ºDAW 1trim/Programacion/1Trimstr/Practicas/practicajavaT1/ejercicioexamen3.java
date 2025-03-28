
import java.util.Scanner;

public class ejercicioexamen3 {
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);
        //Realice el análisis y un programa que, dado un número de tres cifras, averigüe si es un
        //número Amstrong. Un número es Amstrong cuando la suma de cada uno de los números que lo
        //componen elevado al número de dígitos de dicho número da como resultado el propio número. Ejemplo:

        /*Entrada: pedir 3 números al usuario
         Proceso: calcular si es amstrong
         Salida: evaluar y comentar el resultado*/

        int a;
        System.out.println("Introduce un número de 3 cífras: ");
        a= tec.nextInt();
    
        int num1 = (a / 100); 
        int num2 = (a / 10) % 10; 
        int num3 = a  % 10; 

        int suma= (num1*num1*num1)+(num2*num2*num2)+(num3*num3*num3);
        System.out.println((suma==a)?"El número es Amstrong": "El número no es Amstrong");

    }
}
