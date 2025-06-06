import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class tec2pal {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        ArrayList<Pal2> voc = new ArrayList<>();
        String palabra;

        
        System.out.println("Introduce la palabra en castellano ");
        String cast = tec.nextLine();
        System.out.println("Introduce la palabra en inglés ");
        String ing = tec.nextLine();
        System.out.println("Introduce la palabra en francés ");
        String fran = tec.nextLine();

        Pal2 pal = new Pal2(cast, ing, fran);
        voc.add(pal);

        boolean salir = false;
        int menu;
        do { 
            System.out.println("[0] Salir ");
            System.out.println("[1] Añadir más palabras");
            System.out.println("[2] Buscar palabra");
            System.out.println("[3] Mostrar todas las palabras");
            System.out.println("[4] Eliminar una palabra");
            menu = tec.nextInt();


            switch (menu) {
                case 0:
                    salir = true;
                    break;

                case 1:
                tec.nextLine();
                    System.out.println("Introduce la palabra en castellano ");
                    cast = tec.nextLine();
                    System.out.println("Introduce la palabra en inglés ");
                    ing = tec.nextLine();
                    System.out.println("Introduce la palabra en francés ");
                    fran = tec.nextLine();

                    Pal2 pal2 = new Pal2(cast, ing, fran);
                    voc.add(pal2);
                    break;

                case 2:
                    System.out.println("En que idioma quieres buscar la palabra?");
                    System.out.println("[1] Castellano");
                    System.out.println("[2] Inglés");
                    System.out.println("[3] Francés");
                    int idio = tec.nextInt();
                    tec.nextLine(); 

                    System.out.println("Qué palabra quieres buscar?");
                    palabra = tec.nextLine();


                    buscarPal(voc, palabra, idio);
                    break;

                case 3:
                    MostrarTod(voc);
                    break;

                case 4:
                    tec.nextLine();
                    System.out.println("Que palabra quieres eliminar?");
                    String borr= tec.nextLine();
                    Eliminar(voc, borr);

                    break;
                default:
                    System.out.println("Elige una opción del menu");
            }

        } while (salir == false);

       
    }

    public static void buscarPal(ArrayList<Pal2> voc, String palabra, int idio) {
        boolean encontrada = false;

        for (Pal2 p : voc) {
            switch (idio) {
                case 1:
                    if (p.getCast().equalsIgnoreCase(palabra)) {
                        System.out.println("Encontrada la palabra: " + p.getCast());
                        encontrada = true;
                    }
                    break;
                case 2:
                    if (p.getIng().equalsIgnoreCase(palabra)) {
                        System.out.println("Encontrada la palabra: " + p.getIng());
                        encontrada = true;
                    }
                    break;
                case 3:
                    if (p.getFran().equalsIgnoreCase(palabra)) {
                        System.out.println("Encontrada la palabra: " + p.getFran());
                        encontrada = true;
                    }
                    break;
                default:
                    System.out.println("Idioma no válido");
                    return;
            }
    }

            if (!encontrada) {
                System.out.println("Palabra no encontrada");
            }
    }

    public static void MostrarTod(ArrayList<Pal2> voc){
        for(Pal2 p : voc){
            System.out.println(p.toString());
        }
    }

    public static void Eliminar(ArrayList<Pal2> voc, String palabra){
        boolean eliminar = false;

    Iterator<Pal2> it = voc.iterator();
    while (it.hasNext()) {
        Pal2 p = it.next();
        if (p.getCast().equalsIgnoreCase(palabra) ||
            p.getIng().equalsIgnoreCase(palabra) ||
            p.getFran().equalsIgnoreCase(palabra)) {

            it.remove();
            eliminar = true;
            System.out.println("La palabra -" + palabra + "- ha sido eliminada con éxito");
        }
    }

    if (!eliminar) {
        System.out.println("Palabra no encontrada");
    }
}

}

