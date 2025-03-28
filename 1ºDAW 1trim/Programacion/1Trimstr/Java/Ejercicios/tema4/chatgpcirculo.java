
import java.util.Scanner;

public class chatgpcirculo {
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);

        System.out.println("Introduce el radio del circulo");
        double radio=tec.nextInt();

        double area[]={0};
        double volumen= calcularVol(radio, area);
        System.out.println("Vol: "+volumen);

    }

    public static double calcularVol(double radio, double []area){
        area[0]= 4*Math.PI*Math.pow(radio, 2);
        System.out.println("area: "+area[0]);
        return 4/3* Math.PI*Math.pow(radio, 3);
    }
}
