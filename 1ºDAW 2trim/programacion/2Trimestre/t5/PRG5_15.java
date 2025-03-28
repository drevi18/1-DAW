

import java.util.Scanner;

/*Escribe un algoritmo que carga una lista de 100 nombres en un vector NOM de 100 elementos alfanuméricos y
a continuación permite sucesivas consultas para comprobar si un nombre está o no en la lista. El final de las consultas se detectará al introducir un * */

public class PRG5_15 {
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);
        String []v= new String[2];
        String nom,bus, fin="*";

        for (int i = 0; i < v.length; i++) {
            System.out.println("Introduce un nombre para la lista ");
            nom= tec.nextLine();

            v[i]=nom;
        }
        
        do{
        System.out.println("Introduce el nombre el cual quieres buscar (introduce * para salir) ");
        bus= tec.nextLine();
        for (int i = 0; i < v.length; i++) {
            if(v[i].equals(bus)){
                System.out.println("El nombre buscado "+bus+" aparece en la posición "+i);
            }
        }
        }while (!bus.equals(fin));
    }
}
