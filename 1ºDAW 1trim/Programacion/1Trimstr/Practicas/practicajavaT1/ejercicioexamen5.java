
import java.util.Scanner;

public class ejercicioexamen5 {
 public static void main(String[] args) {
     Scanner tec= new Scanner(System.in);

     //Realice un programa que lee un carácter por teclado y nos muestra uno de estos mensajes: “Es un dígito o letra” o “Es otro carácter”.

     char a;
     System.out.println("Introduce un carácter:");
     a = tec.next().charAt(0);


     System.out.println((a<='9' && a>='0'?"Es un número": (a>='a'&& a<='z'?"Es una letra":"Es otro carácter")));
 }   
}
