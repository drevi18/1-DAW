
import java.util.Scanner;

public class PRG5_1 {

    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);

        String s1= new String();
        String s2= new String();

        System.out.println(" Introduce una frase o palabra");
        s1= tec.nextLine();
        

        for (int i = s1.length() -1;  i>=0 ; i--) {
            char guarda;
            guarda= s1.charAt(i);
            s2+=guarda;
        }

        System.out.println("La frase "+s1+" al revés es "+s2);


    }
}