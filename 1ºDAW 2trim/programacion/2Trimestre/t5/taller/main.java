package taller;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);
        ArrayList<Vehiculo> v= new ArrayList<>();
        coche c= new coche();
        moto m=new moto();

        String mod, marc;
        int vmax,puert, cil;
        boolean fin=true;
do{
        System.out.println("Que quieres hacer?");
        System.out.println("[1] Añadir un coche ");
        System.out.println("[2] Añadir una moto");
        System.out.println("[3] Mostrar todos los vehículos");
        System.out.println("[0] Salir");

        int menu=tec.nextInt();

        switch (menu) {
            case 1:
                System.out.println("Añade el modelo");
                mod=tec.nextLine();
                tec.nextLine();
                System.out.println("Añade la marca ");
                marc=tec.nextLine();

                System.out.println("Añade la velocidad máxima");
                vmax=tec.nextInt();

                System.out.println("Añade las puertas");
                puert=tec.nextInt();

                c=new coche(mod,marc,vmax,puert);
                v.add(c);
                break;
            case 2:
                System.out.println("Añade el modelo");
                mod=tec.nextLine();
                tec.nextLine();
                System.out.println("Añade la marca ");
                marc=tec.nextLine();

                System.out.println("Añade la velocidad máxima");
                vmax=tec.nextInt();

                System.out.println("Añade las cilindradas");
                cil=tec.nextInt();

                m=new moto(mod,marc,vmax,cil);
                v.add(m);
                break;
            case 3:
            for (int i = 0; i < v.size(); i++) {
                System.out.println(v.get(i));
            }
                break;
            default: 
                System.out.println("Adiós");
                fin=false;
        }

    }while (fin==true);
    }
}