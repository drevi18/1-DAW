
import java.util.Scanner;


public class c1 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        //ejer1 
        System.out.println("Introduce una frase");
        String f1 = tec.nextLine();
        int cont = 0;

        for (int i = 0; i < f1.length(); i++) {
            char letra= f1.charAt(i);
            if (letra == 'a') {
                cont ++;
            }
        }

        System.out.println("En la frase "+f1+" hay en total "+cont+" a");

        System.out.println(f1.toUpperCase());

        System.out.println("Introduce otra frase");
        String f2= tec.nextLine();

        if (f1.equalsIgnoreCase(f2)) {
            System.out.println("Si, son iguales");
        } else 
            System.out.println("Son diferentes frases ");




    }
}
