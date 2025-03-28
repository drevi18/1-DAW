/*Repetir el ejercicio anterior ordenando los 100 nombres ascendentemente 
antes de realizar las sucesivas consultas, que en este caso se harán de forma dicotómica */

import java.util.Scanner;

public class PRG5_16 {
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);
        String []v= new String[4];
        String nom,bus, fin="*";

        for (int i = 0; i < v.length; i++) {
            System.out.println("Introduce un nombre para la lista ");
            nom= tec.nextLine();

            v[i]=nom;
        }

        Ordenar(v);
        
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

    public static void Ordenar(String v[]){
        for (int i = 0; i < v.length-1; i++) {
            for (int j = 0; j < v.length-1; j++) {
                if(v[j].compareTo(v[j+1])>0){
                    String aux =v[j];
                    v[j]=v[j+1];
                    v[j+1]=aux;
                }
            }
        }
    }
}
