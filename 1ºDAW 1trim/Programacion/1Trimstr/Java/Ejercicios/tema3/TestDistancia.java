
import java.util.Scanner;

public class TestDistancia {
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);

        System.out.println("Introduce la distancia en millas: ");
        double millas= tec.nextDouble();

        Distancia dist = new Distancia(millas);

        System.out.println("Millas a metros= "+dist.millasAMetros());
        System.out.println("Millas a metros= "+dist.millasAKilometros());
    }
}
