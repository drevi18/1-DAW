package Practicas.tarea1;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);

        MascarillaQuirurgica mq1= new MascarillaQuirurgica();
        RestoMascarillas rm1= new RestoMascarillas();

        System.out.println("Dime que quieres hacer");
        System.out.println("[1] Crear mascarilla quirúrgica");
        System.out.println("[2] Mostrar mascarilla quirúrgica ");
        System.out.println("[3] Vender mascarillas quirúrgica ");
        System.out.println("[4] Crear mascarilla de otro tipo ");
        System.out.println("[5] Mostrar mascarilla de otro tipo ");
        System.out.println("[6] Vender mascarilla de otro tipo ");
        System.out.println("[0] Salir ");
        int x= tec.nextInt();

        while (x!=0) {
            
            switch (x) {
                case 1:
                
                    System.out.println("Introduce el precio de la mascarilla");
                    double pm1= tec.nextInt();
                    
                    System.out.println("Establece el precio máximo de venta");
                    double pmM1= tec.nextInt();
                    boolean resultado;
                    
                        // if (pm1>=pmM1){
                        //     do { 
                        //     System.out.println("Introduce un precio apto para la mascarilla");
                        //      pm1= tec.nextInt();
                        //      resultado=true;
                        //     if (pm1<=pmM1){
                        //         resultado=false;
                        //     }
                        //     } while (resultado==false);  
                        // }         
                    mq1= new MascarillaQuirurgica(pm1,pmM1);

                    break;
                case 2:
                    System.out.println(mq1.toString());

                    break;

                case 3:
                    System.out.println("Cuantas mascarillas quieres vender: ");
                    int vendmasq=tec.nextInt();

                    double venta=(mq1.getPrecio()+mq1.getiva())*vendmasq;

                    System.out.println("Cantidad: "+vendmasq+" Precio total: "+venta+" IVA: "+mq1.getiva());

                    break;
                case 4:
                        System.out.println("Que tipo de mascarilla quieres crear: ");
                        String tipo=tec.next();
                        System.out.println("Dime el precio de la mascarilla");
                        int prm1=tec.nextInt();
                        rm1= new RestoMascarillas(tipo,prm1);
                    break;
                case 5:
                System.out.println(rm1.toString());
                    break;
                case 6:
                System.out.println("Cuantas mascarillas quieres vender: ");
                int vrm=tec.nextInt();

                double v2=(rm1.getPrecio()+rm1.getiva())*vrm;

                System.out.println("Cantidad: "+vrm+" Precio total: "+v2+" IVA: "+rm1.getiva());
                    break;
                case 0:
                System.out.println("Adiós");
                    break;
                
                default:
                System.out.println("Introduce un número válido");
                    break;
            }
        }
    }
}
