
import java.util.Scanner;

public class ejercicio7PRGGH {
    public static void main(String[] args) {
        Scanner tec= new Scanner (System.in);

        /*7-Toma como dato de entrada un número que corresponde a la longitud 
        de un radio y nos calcula y escribe la longitud de la circunferencia, 
        el área del círculo y el volumen de la esfera que se corresponden con dicho radio. l=2pr a=pr2 v=4/3 p r3*/

        double rad, lon, vol, are;

        System.out.println("Introduce el radio de la esfera: ");
        rad = tec.nextDouble();
        lon=2*Math.PI*rad;
        are= Math.PI*rad*2;
        vol= (4/3)+Math.PI*(rad*rad*rad);
        System.out.println("Longitud: "+lon+" Área: "+are+ " Volumen: "+vol);


    }
    
}
