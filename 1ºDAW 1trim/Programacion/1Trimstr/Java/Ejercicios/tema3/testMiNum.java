
import java.util.Scanner;

public class testMiNum {
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);

        System.out.println("Introduce un número: ");
        int num= tec.nextInt();

        MiNumero mn= new MiNumero(num);

        System.out.println("El doble: "+mn.doble()+" el triple: "+mn.triple()+" el cuadruple: "+mn.cuadruple());
    }
}
