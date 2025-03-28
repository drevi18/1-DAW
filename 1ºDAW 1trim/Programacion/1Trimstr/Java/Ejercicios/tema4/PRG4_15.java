import java.util.Scanner;

public class PRG4_15 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dame el capital");
        double capital = scanner.nextDouble();

        System.out.println("Dame el interes");
        double interes = scanner.nextDouble();

        System.out.println("Dame los años");
        int agnos = scanner.nextInt();

        System.out.println(Capital(capital, interes, agnos));
    }


    public static double Capital(double capital, double interes, int agnos){
        double resultado;

        if (agnos==0) {
            resultado = capital;
        } else {
            resultado = (Capital(capital * interes / 100 + capital , interes , agnos - 1 ));
            System.out.println("Hola");
        }

        return resultado;
    }
}
