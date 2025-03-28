import java.util.Scanner;

public class ejercicioPRG2_10 {
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);

        //Acepta 4 números por teclado y muestra el mayor por pantalla.

        System.out.println("Introduce el primer número:");
        float num1 =tec.nextFloat();
        System.out.println("Introduce el segundo número:");
        float num2 =tec.nextFloat();
        System.out.println("Introduce el tercer número:");
        float num3 =tec.nextFloat();
        System.out.println("Introduce el cuarto número:");
        float num4 =tec.nextFloat();

        float may= num1;
        if (num2>may&&num3<num2&&num4<num2) {
            may= num2;
            System.out.println("El mayor es: "+may);
        }else if(num3>may&&num2<num3&&num4<num3){
            may= num3;
            System.out.println("El mayor es: "+may);
        }else if(num4>may&&num2<num4&&num3<num4){
            may= num4;
            System.out.println("El mayor es: "+may);       
        }else if(may>num2&&may>num3&&may>num4){
            System.out.println("El mayor es: "+may);       
        }
    }
}
