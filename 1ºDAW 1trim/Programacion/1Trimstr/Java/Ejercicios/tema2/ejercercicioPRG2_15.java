
import java.util.Scanner;

public class ejercercicioPRG2_15{
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);
        //Acepta las notas de tres evaluaciones y calcula la media si están todas aprobadas. Si tiene una suspendida, 
        //se pide la nota de recuperación y si esta es 5, 6 o 7 su nota final es un 5, y si es 8, 9 o 10 la nota final 
        //es un 6, en otro caso será un 4. Si ha suspendido más de una evaluación se le pide la nota de suficiencia que es la nota final.

        int n1,n2,n3,suspensos=0;
        System.out.println("Introduce la nota de la primera evaluación:");
        n1= tec.nextInt();
        if(n1 < 5){
            suspensos++;
        }
        System.out.println("Introduce la nota de la segunda evaluación:");
        n2= tec.nextInt();
        if(n2 < 5){
            suspensos++;
        }
        System.out.println("Introduce la nota de la tercera evaluación:");
        n3= tec.nextInt();
        if(n3 < 5){
            suspensos++;
        }

        int mediaaprobados,recu1=0,recu2=0,recu3=0,notrecu1=0,notrecu2=0,notrecu3=0, mediarecu1,mediarecu2,mediarecu3;
       
        if (suspensos == 0){
             mediaaprobados= (n1+n2+n3)/3;
            System.out.println("La media es: "+mediaaprobados);}

        if (suspensos == 2){
            System.out.println("Introduce la nota de suficiencia");
            int notsuf= tec.nextInt();
            System.out.println(notsuf+" es la nota final");}


            
            if (n1<5) {
                System.out.println("La primera evaluación está suspendida introduce la nota de la recuperación:");
                 recu1= tec.nextInt();
            }else if (n2<5) {
                System.out.println("La segunda evalueación está suspendida introduce la nota de la recuperación:");
                 recu2= tec.nextInt();
            }else if (n3<5) {
                System.out.println("La tercera evalueación está suspendida introduce la nota de la recuperación:");
                 recu3= tec.nextInt();
            } 
    
        switch (recu1) {
            case 5:  case 6: case 7:
            notrecu1= 5;
            break;
            case 8:  case 9: case 10:
            notrecu1= 6;
            break;
            case 1:  case 2: case 3: case 4:
            notrecu1=4;
            break;
        }
        switch (recu2) {
            case 5:  case 6: case 7:
            notrecu2= 5;
            break;
            case 8:  case 9: case 10:
            notrecu2= 6;
            break;
            case 1:  case 2: case 3: case 4:
            notrecu2=4;
            break;
        }
        switch (recu3) {
            case 5:  case 6: case 7:
            notrecu3= 5;
            break;
            case 8:  case 9: case 10:
            notrecu3= 6;
            break;
            case 1:  case 2: case 3: case 4:
            notrecu3=4;
            break;
        }
    

        if (recu1>=4){
            mediarecu1= (notrecu1+n2+n3)/3;
            System.out.println("La media con la recuperación del primer trimestre es: "+mediarecu1);}
        if (recu2>=4) {
            mediarecu2= (n1+notrecu2+n3)/3;
            System.out.println("La media con la recuperación del segundo trimestre es: "+mediarecu2);}
        if(recu3>=4){
            mediarecu3= (n1+n2+notrecu3)/3;
            System.out.println("La media con la recuperación del tercer trimestre es: "+mediarecu3);}
    }
}
