import java.util.Scanner;

public class ejercicioPRG2_22 {
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);

        //Algoritmo que lee un número entero y positivo N y escribe los N primeros términos de la sucesión de Fibonacci. 
        //La sucesión se caracteriza porque cada término es igual a la suma de sus dos anteriores, a0=1; a1=1; an=an-1 + an-2

        System.out.println("Introduce un número entero positivo: ");
        int num= tec.nextInt();

        int term1=0;
        int term2=0;
        if (num>0) {
            for (int i=0; i<1; i++){
                term1= num-1;
                term2= term1-2;
                
            }
        }
        System.out.println("Algoritmo: "+term1+ " y "+term2);
    }    
}
