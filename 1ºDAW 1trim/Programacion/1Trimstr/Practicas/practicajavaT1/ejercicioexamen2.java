
import java.util.Scanner;

public class ejercicioexamen2 {
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);
        //Realice el análisis y un programa que aplicando el teorema de Pitágoras compruebe e
        //indique en qué casos se cumple el teorema


        /*Entrada:Información de los respectivos triángulos
        Proceso: comparar la información con el teórema 
        Salida: decir que casos si se cumplen*/

        //caso1
        float a1,b1,c1;
        System.out.println("Introduce el lado a del 1 triángulo:");
        a1= tec.nextFloat();
        System.out.println("Introduce el lado b del 1 triángulo:");
        b1=tec.nextFloat();
        System.out.println("Introduce el lado c del 1 trángulo:");
        c1=tec.nextFloat();
        float suma1 = (a1*a1)+(b1*b1);
        float comp1 = c1*c1;
        System.out.println((suma1==comp1)?"El triángulo 1 cumple pitágoras": "El triángulo 1 no cumple pitágoras");

        tec.close();
        }
}
