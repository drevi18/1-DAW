
import java.util.Scanner;

public class ejercicioPRG2_23 {
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);

        //Acepta 100 números y muestra cuantos de dichos números son iguales, menores o mayores que 0

        int may=0,men=0,ig=0,num=0,i=0;
    for(i=0;i<=5;i++){
            System.out.println("Introduce un número");
            num= tec.nextInt();
        if(num==0){
            ig+=1;
        }else if (num<0) {
            men+=1;
        }else if (num>0) {
            may+=1;
        }
    }

        System.out.println(men+ " Son menores a 0 ");
        System.out.println(may+" Son mayores a 0");
        System.out.println(ig+" Son iguales a 0");
    }
}
