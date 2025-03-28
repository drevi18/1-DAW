import java.util.Scanner;

public class ejercicioextra {
        public static void main(String[] args) {
            Scanner tec= new Scanner(System.in);

        /*Un laboratorio químico español ha empezado a colaborar con un 
        empresa británica de suministros por lo que necesita un programa que pase las 
        edidas de capacidad (volumen) tomadas en el sistema británico o imperial (barriles, galones, 
        cuartos, pintas, gills y onzas líquidas imperiales o británicas) a litros. Realiza dicho programa. 
        La tabla de equivalencias sería: Barriles Galones Cuartos Pintas Gills Onzas líquidas Litros 1 35 140 280 1120 5600 159,11315*/

        //Entrada: pedir medidas en sistema británico o imprial
        //Proceso: hago factores de conversion para pasar cada unidad a litros
        //Salida: pasar barriles a litros

        double barr,gal,cuar,pint,gill,onz;
        System.out.println("Dame barriles:");
        barr =tec.nextDouble();
        System.out.println("Dame galones:");
        gal =tec.nextDouble();
        System.out.println("Dame cuartos:");
        cuar =tec.nextDouble();
        System.out.println("Dame pintas:");
        pint =tec.nextDouble();
        System.out.println("Dame gills:");
        gill =tec.nextDouble();
        System.out.println("Dame onzas:");
        onz =tec.nextDouble();

        double ConstBarr= 1;
        double ConstGal= 35;
        double ConstCuar= 140;
        double ConstPint= 280;
        double ConstGill= 1120;
        double ConstOnz= 5600;
        double ConsLit= 159.11315;

        double litBarr= barr*ConsLit/ConstBarr;
        double litGal= gal*ConsLit/ConstGal;
        double litCuar= cuar*ConsLit/ConstCuar;
        double litPint= pint*ConsLit/ConstPint;
        double litOnz= onz*ConsLit/ConstOnz;
        
        double suma= litBarr+litGal+litCuar+litPint+litOnz;
        System.out.println("Litros totales: "+suma);

        }

    }
