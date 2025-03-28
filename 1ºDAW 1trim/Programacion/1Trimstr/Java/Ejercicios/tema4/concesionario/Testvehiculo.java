package concesionario;

import java.util.Scanner;

public class Testvehiculo {
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);
        String dueño;

        System.out.println("Que vehiculo quieres añadir?");
        System.out.println("[1] Coche ");
        System.out.println("[2] Electrico");
        System.out.println("[3 Moto]");
        int respuesta= tec.nextInt();

        switch (respuesta) {
            case 1:
                System.err.println("Dime el nombre del sueño del vehiculo");
                dueño= tec.next();
                coche c1= new coche(dueño);

                c1.arrancar();
                c1.detener();
                break;
            case 2:
                System.err.println("Dime el nombre del dueño del vehiculo");
                dueño= tec.next();
                cocheelectrico ce1= new cocheelectrico(dueño);

                ce1.arrancar();
                ce1.detener();
                ce1.cargarBateria();
                break;
            case 3:
                System.err.println("Dime el nombre del sueño del vehiculo");
                dueño= tec.next();
                moto m1= new moto(dueño);

                m1.arrancar();
                m1.detener();
                break;
            default:
                System.out.println("Introduce una opción válida");
        }

        System.out.println("Que quieres hacer ahora?");
        System.out.println("[1] Añadir otro vehículo ");
        System.out.println("[2] Contar vehiculos ");
        System.out.println("[0] Salir");
        int respuesta2= tec.nextInt();
    }
}
