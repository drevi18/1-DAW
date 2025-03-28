import java.util.Scanner;

public class ejercicio16PRGGH {
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);

    //16- Realiza un programa que calcule el coste de una llamada telefónica de acuerdo a las siguientes premisas: 
    //a) Toda llamada que dure menos de tres minutos cuesta 12 céntimos. 
    //b) Cada minuto adicional a partir de los tres cuesta 9 céntimos.


    float call;
    System.out.println("Duración de la llamada en minutos:");
    call= tec.nextFloat();



    System.out.println("Total llamada:");
    System.out.println((call<=3) ? 0.12:0.12+0.09*(call-3));
   

    }
    
}
