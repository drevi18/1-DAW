import java.util.ArrayList;
import java.util.Scanner;

public class tecPal {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        ArrayList<Palabras> voc = new ArrayList<>();
        String palabra;

        System.out.println("Introduce la palabra en castellano ");
        String cast = tec.nextLine();
        System.out.println("Introduce la palabra en inglés ");
        String ing = tec.nextLine();
        System.out.println("Introduce la palabra en francés ");
        String fran = tec.nextLine();

        Palabras pal = new Palabras(cast, ing, fran);
        voc.add(pal);

        System.out.println("[1] Buscar palabra castellano");
        System.out.println("[2] Buscar palabra inglés");
        System.out.println("[3] Buscar palabra francés");
        int menu = tec.nextInt();
        tec.nextLine(); // Limpieza de buffer

        switch (menu) {
            case 1:
                System.out.println("Introduce palabra para buscar");
                palabra = tec.nextLine();
                buscarCast(voc, palabra);
                break;

            case 2:
                System.out.println("Introduce palabra para buscar");
                palabra = tec.nextLine();
                buscarIng(voc, palabra);
                break;

            case 3:
                System.out.println("Introduce palabra para buscar");
                palabra = tec.nextLine();
                buscarFran(voc, palabra);
                break;

            default:
                System.out.println("Opción no válida.");
        }
    }

    public static void buscarCast(ArrayList<Palabras> voc, String palabra) {
        boolean encontrada = false;
        for (Palabras p : voc) {
            if (p.getCast().equalsIgnoreCase(palabra)) {
                System.out.println("Palabra encontrada: " + p.getCast() + " - " + p.getIng() + " - " + p.getFran());
                encontrada = true;
            }
        }
        if (!encontrada) {
            System.out.println("Palabra no encontrada en castellano.");
        }
    }

    public static void buscarIng(ArrayList<Palabras> voc, String palabra) {
        boolean encontrada = false;
        for (Palabras p : voc) {
            if (p.getIng().equalsIgnoreCase(palabra)) {
                System.out.println("Palabra encontrada: " + p.getCast() + " - " + p.getIng() + " - " + p.getFran());
                encontrada = true;
            }
        }
        if (!encontrada) {
            System.out.println("Palabra no encontrada en inglés.");
        }
    }

    public static void buscarFran(ArrayList<Palabras> voc, String palabra) {
        boolean encontrada = false;
        for (Palabras p : voc) {
            if (p.getFran().equalsIgnoreCase(palabra)) {
                System.out.println("Palabra encontrada: " + p.getCast() + " - " + p.getIng() + " - " + p.getFran());
                encontrada = true;
            }
        }
        if (!encontrada) {
            System.out.println("Palabra no encontrada en francés.");
        }
    }
}
