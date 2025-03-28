import java.util.Scanner;

public class ejercicio10PRGGH {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        //10-Algoritmo que lee el precio final pagado por un producto y 
        //su precio de tarifa y nos calcula el porcentaje de descuento que le ha sido aplicado.

        float preciotarif, preciofin, des;
        System.out.println("Indica el precio tarifa del producto:");
        preciotarif = tec.nextFloat();
        System.out.println("Indica el precio final del producto:");
        preciofin= tec.nextFloat();

        des= 100 * (preciotarif - preciofin) / preciotarif;
        System.out.println("descuento: "+des+"%");


    }
}
