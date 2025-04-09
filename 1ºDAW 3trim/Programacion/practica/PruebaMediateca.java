
/*Descripción: main del ejercicio
 * Autor: Sara Gómez Torres
 * Fecha: 09/04/2025
 */ 

import java.util.ArrayList;
import java.util.Scanner;


public class PruebaMediateca {
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);
        
        ArrayList<Socio> s1= new ArrayList<>();
        Socio soc= new Socio();
        ArrayList<Obra> o1= new ArrayList<>();
        ArrayList<Copia> c1= new ArrayList<>();
        Copia cop= new Copia();
        Autor autor= new Autor();

        String nombreautor, pais;


        boolean salir=false;

        do { 
            System.out.println("------MENU------");
            System.out.println("[1] Añadir un socio ");
            System.out.println("[2] Añadir una obra ");
            System.out.println("[3] Añadir una copia de una obra");
            System.out.println("[4] Prestar una copia a un socio");
            System.out.println("[5] Mostrar las obras de un tipo determinado");
            System.out.println("[6] Mostrar las copias de una obra");
            int opcion= tec.nextInt();


            switch (opcion) {
                case 1:
                   System.out.println("Introduce el nombre del Socio");
                   String nsoc= tec.nextLine();
                   tec.nextLine();

                   System.out.println("Introduce el número del Socio");
                   int num= tec.nextInt();

                   soc= new Socio(nsoc, num);
                   s1.add(soc);

                    break;

                case 2:

                System.out.println("Introduce el nombre de la Obra");
                String nob= tec.nextLine();

                System.out.println("Introduce el código de la obra");
                int cob= tec.nextInt();

                // System.out.println("Introduce el año de la obra");
                // Date aob= tec.nextdate();
                
                System.out.println("Di el tipo de la obra");
                System.out.println("[1] CD");
                System.out.println("[2] Libro");
                System.out.println("[3] Película");
                int tipoobr= tec.nextInt();

                    switch (tipoobr) {
                        case 1:
                            System.out.println("Nombre del autor");
                            nombreautor= tec.nextLine();
                            tec.nextLine();
                            System.out.println("País del autor");
                            pais= tec.nextLine();

                            autor= new Autor(pais,nombreautor , cob);
                            System.out.println("");
                            System.out.println("Cuantas canciones tiene?");
                            int n_can= tec.nextInt();
                            CD cd= new CD(n_can,cob);
                            o1.add(cd);
                            break;

                        case 2:
                            System.out.println("Nombre del autor");
                            nombreautor= tec.nextLine();
                            tec.nextLine();
                            System.out.println("País del autor");
                            pais= tec.nextLine();

                            autor= new Autor(pais,nombreautor , cob);

                            System.out.println("Cuantas páginas tiene?");
                            int n_pag= tec.nextInt();
                            Libro lb= new Libro(n_pag, cob);
                            o1.add(lb);

                            break;

                        case 3:
                            System.out.println("Nombre del autor");
                            nombreautor= tec.nextLine();
                            tec.nextLine();
                            System.out.println("País del autor");
                            pais= tec.nextLine();

                            autor= new Autor(pais,nombreautor , cob);

                            System.out.println("Cuanto dura?");
                            int dur= tec.nextInt();
                            Pelicula pel= new Pelicula(dur, cob);
                            o1.add(pel);
                            break;
                        default:
                            System.out.println("Elige una obra válida");
                }

                   
                    break;

                case 3:
                    Boolean copia=false;
                    System.out.println("Introduce el código de la obra a la cual quieres hacerle copia");
                    int cocop= tec.nextInt();
                    int pos = -1;

                    for (int i = 0; i < o1.size() && pos == -1; i++) {
                       
                        if(cocop == o1.get(i).getCod())
                         pos = i;
                         copia=true;

                    }

                    if(copia==true){

                    System.out.println("Introduce un comentario sobre la copia");
                    String comt= tec.nextLine();
                    tec.nextLine();
                    System.out.println("Introduce el estado de la copia");
                    String est= tec.nextLine();

                    cop= new Copia(comt,est,o1.get(pos));
                    c1.add(cop);

                    }
                
                   
                    break;

                case 4:
                    System.out.println("NO FURULA");
                   
                    break;

                case 5:

                    System.out.println("Dime el tipo de obra que quieres ver");

                    System.out.println("[1] CD");
                    System.out.println("[2] Libro");
                    System.out.println("[3] Película");
                    int obratipo= tec.nextInt();
    
                        switch (obratipo) {
                            case 1:
                                for (int i = 0; i < o1.size(); i++) {
                                    if (o1.get(i) instanceof CD) {
                                        System.out.println("Es un CD"+o1.toString());
                                    }
                                }

                                break;
    
                            case 2:

                                for (int i = 0; i < o1.size(); i++) {
                                    if (o1.get(i) instanceof Libro) {
                                        System.out.println("Es un Libro"+o1.toString());
                                    }
                                }

                                break;
    
                            case 3:
    
                                for (int i = 0; i < o1.size(); i++) {
                                    if (o1.get(i) instanceof Pelicula) {
                                        System.out.println("Es una Pelicula"+o1.toString());
                                    }
                                }

                                break;
                            default:
                                System.out.println("Elige una obra válida");
                    }
                   
                    break;

                case 6:

                    Boolean copia2=false;
                    System.out.println("Introduce el código de la obra para ver cuantas copias tiene");
                    int cocop2= tec.nextInt();
                    int pos2 = -1;

                    for (int i = 0; i < o1.size() && pos2 == -1; i++) {
                       
                        if(cocop2 == o1.get(i).getCod())
                         pos2 = i;
                         copia2=true;

                    }

                    if(copia2==true){
                        cop.getCopias(o1.get(pos2));

                    }
                  
                    break;
                

                default:
                    salir=true;
                    System.out.println("Adios");
                  
            }
            
        } while (salir==false);

    }
}
