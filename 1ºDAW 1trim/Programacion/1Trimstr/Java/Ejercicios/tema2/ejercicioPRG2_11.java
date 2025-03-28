import java.util.Scanner;

public class ejercicioPRG2_11{
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);

        //Acepta fecha en formato numérico y muestra por pantalla el mes en formato alfabético (Enero, Febrero,...).

        System.out.println("Introduce el día:");
        int dia = tec.nextInt();
        System.out.println("Introduce el mes:");
        int mes = tec.nextInt();
        System.out.println("Introduce el año");
        int año= tec.nextInt();

    }
}