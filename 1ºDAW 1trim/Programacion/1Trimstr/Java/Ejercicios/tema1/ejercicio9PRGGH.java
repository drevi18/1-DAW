    import java.util.Scanner;
public class ejercicio9PRGGH {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        double c,r,f,k;
        System.out.println("Dame grados centígrado");
        c = tec.nextDouble();
        r = 80 * c / 100;
        f = 180 * c / 100 + 32;
        k = c + 273;

        System.out.println(" Centígrados: "+c +" Reamur: "+r +" Farenheit: "+f + " Kelvin: "+f);

    }
}
