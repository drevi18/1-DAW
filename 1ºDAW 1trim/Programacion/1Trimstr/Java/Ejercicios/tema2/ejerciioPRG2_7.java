
import java.util.Scanner;

public class ejerciioPRG2_7{
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);

        System.out.println("inrtoduc etu calificación con: i,s,b,n,S");
        char nota= tec.next().charAt(0);

        switch (nota){
            case 'i':
                System.out.println("Insuficiente");
                break;
            case 's':
                System.out.println("Suficiente");
                break;
            case 'b':
                System.out.println("Bien");
                break;
            case 'n':
                System.out.println("Notable");
                break;
            case 'S':
                System.out.println("Sobresaliente");
                break;
            default:
                System.out.println("La nota es de un tipo erróneo. Inténtalo de nuevo.");
                 break;
        }
    }
}