
import java.util.Scanner;

public class ejerciciocalse22oct {
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);

        //compara dos fechas 
        
        int d1,m1,a1,d2,m2,a2;
        System.out.println("Introduce la priemra fecha ");
        System.out.println("Día");
        d1= tec.nextInt();
        System.out.println("Mes");
        m1= tec.nextInt();
        System.out.println("Año");
        a1= tec.nextInt();
        System.out.println("INtroduce la segunda fecha ");
        System.out.println("Día");
        d2= tec.nextInt();
        System.out.println("Mes");
        m2= tec.nextInt();
        System.out.println("Año");
        a2= tec.nextInt();

        int fecha1= a1*10000+m1*1000+d1;
        int fecha2= a2*10000+m2*1000+d2;
        
        if (fecha1==fecha2){
            System.out.println("Es la misma fecha");
        }else if(fecha1>fecha2){
            System.out.println(fecha1+" Es más grande");
        }else 
            System.out.println(fecha2+"Es más grande");
    }
}
