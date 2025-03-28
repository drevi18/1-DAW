package Practicas.tarea4;
// Ejemplo
// ************Contador********

import java.util.Scanner;

public class contador {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num;

        System.out.print("Dame numero inicial diferente de 0: ");
        num=in.nextInt();

        System.out.println("Contador descendente: ");
        Contador(num);
    }
    public static int Contador(int num){
        int resultado=0;

        if (num==0) {
            System.out.println("He llegado al caso base");
        } else {
            
            System.out.println(num);
            resultado =Contador(num-1);
        }
        return resultado;
    }

}
