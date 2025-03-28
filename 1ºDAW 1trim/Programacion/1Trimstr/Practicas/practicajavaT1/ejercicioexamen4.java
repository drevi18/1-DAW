
import java.util.Scanner;

public class ejercicioexamen4 {
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);
        /*Un ingeniero estima que el coste de una carretera es de 5000$ por cada milla. Haga un
        programa que pregunte la longitud de la carretera deseada (en pies) y calcule el precio total
        estimado en dólares y en euros. (Nota: 1 milla equivale a 5280 pies). Declare la variable pies
        como entera y como real y compruebe las diferencias de coste obtenidas para una carretera de
        15000 pies. Realice el análisis y el banco de pruebas.*/


        /*Entrada: Pies de la carretera
        Proceso: precio total en eur/dol 
        Salida: mostrar el coste en dolares y euros*/

        float DolarxMilla= 5000;
        float MillaesPies= 5280;
        float Constmill= 1;
        float ConstDol= 1.09f;
        float ConstEur= 1.87f;

        float longcarr;
        System.out.println("Introduce la longitud de la carretera en pies:");
        longcarr= tec.nextFloat();

        float millcarr= Constmill*longcarr/MillaesPies;
        float dolarcarr= millcarr*DolarxMilla/Constmill;
        float eurcarr= dolarcarr*ConstEur/ConstDol;

        System.out.println("La carretera costará "+dolarcarr+" dolares y "+eurcarr+" euros");

        //Declare la variable pies como entera y como real y compruebe las diferencias de coste obtenidas para una carretera de 15000 pies. 

        int piesent= 15000;
        float piesreal= 15000;
        
        float millpiesent= piesent/MillaesPies;
        float millpiesreal= piesreal/MillaesPies;

        float dolarpiesent= millpiesent*DolarxMilla/Constmill;
        float dolarpiesreal= millpiesreal*DolarxMilla/Constmill;

        System.out.println("la carretera con números enteros ha costado: "+(int)dolarpiesent+" dolares");
        System.out.println("la carretera con números reales ha costado: "+dolarpiesreal+" dolares");

        







    }
}
