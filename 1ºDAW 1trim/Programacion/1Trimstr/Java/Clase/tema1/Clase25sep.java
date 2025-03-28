
import java.util.Scanner;

public class Clase25sep {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        /*Ejercicio: Con DN, MN, AN día, mes y año de nacimiento de una persona y DA, MA, AA días, mes
        y año actual. Expresar si tiene 18 años cumplidos. */

        int aa= 2024;
        int ma= 9;
        int da= 25;
        int an, mn, dn;

        System.out.println("Introduce tu año de nacimiento:");
        an= teclado.nextInt();
        System.out.println("Introduce tu mes de nacimiento:");
        mn= teclado.nextInt();
        System.out.println("Introduce tu día de nacimiento:");
        dn= teclado.nextInt();


        System.out.print((aa-an > 18 || aa-an==18 && ma>mn|| aa-an ==18 && ma==mn && da>dn)?"Mayor de edad":"Menor de edad");


    }

}
