
import java.util.Scanner;

public class ejercicio6PRGGH {
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);

        //6-Escribir un programa que calcule el volumen y el área de una esfera.(v=4/3PIr3, s=4PIr2)

        double rad, v, a;

        System.out.println("Introduce el radio de la esfera: ");
        rad = tec.nextDouble();
        
        v = (4.0/3.0) * Math.PI * (rad*rad*rad);
        System.out.println("Volumen: "+v);
        a = 4*Math.PI*(rad+rad);
        System.out.println("Área: "+a);

    }
    
}
