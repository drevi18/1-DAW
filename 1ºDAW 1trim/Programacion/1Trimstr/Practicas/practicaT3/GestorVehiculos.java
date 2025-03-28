/**
 
Autora: Sara Gómez Torres
Descripción: El programa principal donde interactua el usurario

Fecha: 03/12/2024

**/
import java.util.Scanner;

public class GestorVehiculos {
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);

        Vehiculo v= null;
        Propietario p= null;
        int menu;

        // esto es un bucle que asegura que el usurario introduce antes que nada los datos del del propietario y del vehículo
        /*  do { 
            System.out.println("Introduce que quieres hacer: ");
            System.out.println("Insertar vehículo con su propietario (1) ");
            System.out.println("Mostrar información del vehículo y propietario (2)");
            System.out.println("Cambia titular del vehículo (3) ");
            System.out.println("Aumentar kilometraje vehículo (4) ");
            System.out.println("Mostrar valor fiscal del vehículo (5)");
            System.out.println("Salir (0)");
            menu= tec.nextInt();

            switch (menu) {
                case 1 :
                    System.out.println("Introduce el nombre del propietario y se vehículo");
                    System.out.println("---------------------------------------------");
                    System.out.println("Introduce el nombre del propietario:");
                    String nombre= tec.next();
                    System.out.println("Introduce el número del DNI:");
                    int DNI= tec.nextInt();
                    System.out.println("Introduce la letra del DNI:");
                    char letradni= tec.next().charAt(0);
                    System.out.println("Introduce la marca del vehículo:");
                    String marca= tec.next();
                    System.out.println("Introdice el modelo del vehículo:");
                    String modelo= tec.next();
                    System.out.println("Introduce el año de fabricación:");
                    int añofab= tec.nextInt();
                    System.out.println("Introduce su kilometraje:");
                    double km= tec.nextDouble();
    
                    v= new Vehiculo(marca,modelo,añofab,km);
                    p= new Propietario(nombre,DNI,letradni);
                    break;
            }
            
        } while (menu!=1);
          System.out.println(" ");*/
        do { 
            
        
        System.out.println(" Introduce que quieres hacer: ");
        System.out.println(" -Insertar vehículo con su propietario (1) ");
        System.out.println(" -Mostrar información del vehículo y propietario (2)");
        System.out.println(" -Cambia titular del vehículo (3) ");
        System.out.println(" -Aumentar kilometraje vehículo (4) ");
        System.out.println(" -Mostrar valor fiscal del vehículo (5)");
        System.out.println(" -Calcular letra DNI (6)");
        System.out.println(" -Introducir otro vehículo y calcular el más viejo (7)");
        System.out.println(" -Salir (0)");
        menu= tec.nextInt();
        switch (menu) {
            case 1 :
            System.out.println(" ");
            System.out.println(" ");
                System.out.println(" Introduce el nombre del propietario y se vehículo");
                System.out.println("---------------------------------------------");
                System.out.println(" -Introduce el nombre del propietario:");
                String nombre= tec.next();
                System.out.println(" -Introduce el número del DNI:");
                int DNI= tec.nextInt();
                System.out.println(" -Introduce la letra del DNI:");
                char letradni= tec.next().charAt(0);
                System.out.println(" -Introduce la marca del vehículo:");
                String marca= tec.next();
                System.out.println(" -Introdice el modelo del vehículo:");
                String modelo= tec.next();
                System.out.println(" -Introduce el año de fabricación:");
                int añofab= tec.nextInt();
                System.out.println(" -Introduce su kilometraje:");
                double km= tec.nextDouble();

                v= new Vehiculo(marca,modelo,añofab,km);
                p= new Propietario(nombre,DNI,letradni);
                    break;
            case 2:
                System.out.println(" ");
                System.out.println(" ");
                System.out.println("Vehículo información: "+v.toString()+" Propietario información: "+p.toString());
                    break;
            case 3:
            System.out.println(" ");
            System.out.println(" ");
                System.out.println(" Introduce el nombre del nuevo propietario:");
                String nombre2= tec.next();
                System.out.println(" Introduce el número del DNI:");
                int DNI2= tec.nextInt();
                System.out.println(" Introduce la letra del DNI:");
                char letradni2= tec.next().charAt(0);
            
                p= new Propietario(nombre2,DNI2,letradni2);
                    break;
            case 4:
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" Introduce su nuevo kilometraje:");
                double km2= tec.nextDouble();
                v.recorrer(km2);
                    break;
            case 5:
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(v.valorResidual());
                    break;
            case 6:
                int operación;
                operación= p.getDNI()%23;
                String tabla= "TRWAGMYFPDXBNJZSQVHLCKE";
                System.out.println("La letra del dani es: "+tabla.charAt(operación));
                    break;
            case 7:
                System.out.println(" -Introduce la marca del vehículo:");
                String marca2= tec.next();
                System.out.println(" -Introdice el modelo del vehículo:");
                String modelo2= tec.next();
                System.out.println(" -Introduce el año de fabricación:");
                int añofab2= tec.nextInt();
                System.out.println(" -Introduce su kilometraje:");
                double km3= tec.nextDouble();
                v= new Vehiculo(marca2,modelo2,añofab2,km3);

                System.out.println("El primer coche es más viejo? "+v.esMasViejo(v));
                    break;
            default:
                System.out.println("Introduce un número válido");
        }
        } while (menu!=0);
            System.out.println("Adiós");

    }
}
