import java.util.Scanner;

public class tecCine{
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);

        System.out.println("Introduce el título de la película:");
        String titulo= tec.next();
        System.out.println("Cuantas entradas se van a poner a la venta:");
        int entrtot= tec.nextInt();
        System.out.println("Precio por entrada:");
        double precentr= tec.nextDouble();
        
        Cine c= new Cine(titulo, entrtot, precentr);
        
        System.out.println("Cuantas entradas vas a querer?: ");
        int entr= tec.nextInt();
        c.venderEntradas(entr);

        System.out.println("Para la película "+titulo+" se han generado "+c.mostrarIngresos()+" euros de ingresos ");
        c.mostrarInformacion();
    }

}