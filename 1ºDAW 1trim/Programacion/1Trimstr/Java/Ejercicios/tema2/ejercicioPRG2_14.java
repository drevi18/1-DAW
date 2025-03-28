
import java.util.Scanner;

public class ejercicioPRG2_14 {
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);
        //Acepta 5 caracteres que forman una palabra y comprueba si es palíndroma. (Ej.: SACAS)

        System.out.println("Introduce 5 carácteres:");
        char a,b,c,d,e;
        String palindroma;
        palindroma= tec.next();

        a= palindroma.charAt(0);
        b= palindroma.charAt(1);
        c= palindroma.charAt(2);
        d= palindroma.charAt(3);
        e= palindroma.charAt(4);
        
        if(a==e&&b==d){
            System.out.println(palindroma+" es palíndroma");
        }else
        System.out.println("No es palindorma");
    }
}
