
import java.util.Scanner;

// Ejercicio clase 

public class ejercicio3 {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        float r1, r2, r3, media;
        r1 = tec.nextFloat();
        r2 = tec.nextFloat();
        r3 = tec.nextFloat();
        media = (r1+r2+r3)/3;
        System.out.println(media);

    }
}
