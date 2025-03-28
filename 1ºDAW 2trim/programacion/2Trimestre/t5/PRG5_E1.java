
import java.util.ArrayList;
import java.util.Scanner;



/*Calcula la media de las notas introducidas por teclado con un ArrayList, el programa finalizara la petición de notas con la entrada -1. */
public class PRG5_E1 {
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);
        ArrayList<Integer> n= new ArrayList<>();
        boolean comp=true;
        int cont=0, suma=0;

        do { 
            System.out.println("Introduce la nota");
            int nota=tec.nextInt();
            if (nota<0) {
                comp=false;
            }else{
            n.add(nota);
            suma+=nota;
            cont++;
            }
        } while (comp==true);

        System.out.println("Se han introducido las siguientes notas: ");
        Mostrar(n);
        int media=Media(cont, suma);
        System.out.println("La media de todas las notas es: "+ media);
    }

    

    public static void Mostrar(ArrayList<Integer> n){
        for (int i = 0; i < n.size(); i++) {
            System.out.println(n.get(i));
        }
    }

    public static int Media(int cont, int suma){
        int media=0;
        media=suma/cont;
        return media;
    }
}
