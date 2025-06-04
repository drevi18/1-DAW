
import java.util.Scanner;

//Una comunidad de vecinos tiene 9 pisos y un local. Realiza un programa que controle las elecciones a
//presidente de la comunidad: cada vecino puede votar al vecino que quiera. Valida que el voto es
//correcto
public class Vecionos {
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);

        int[] pisos = new int[9];
        int[] yavota = new int[9];
        int[] votos = new int[9];
        int menu;
        int aux=0;
        boolean havotado= false;
        for (int i = 0; i < pisos.length; i++) {
            pisos[i] = i+1;
            System.out.println("Puedes votar a los pisos: "+pisos[i]);
        }

        do { 
            System.out.println("Para dejar de votar [0]");
            menu = tec.nextInt();
            if (menu != 0) {
                
           
            System.out.println("Introduce de que piso eres tu: ");            
            int dueño = tec.nextInt();
            for (int i = 0; i < yavota.length; i++) {
                if (yavota[i] == dueño) {
                    System.out.println("Su piso ya ha votado, no puede volver a votar");
                    havotado = true;
                }
            }

            yavota[aux] = dueño;
            aux++;
            if (havotado == false) {
                
                System.out.println("A que piso votas?");
                int votacion = tec.nextInt();
                if (votacion <= 0 || votacion > 9) {
                    System.out.println("Solo puede votar a los pisos mencionados");
                }else{
                for (int i = 0; i < votos.length; i++) {
                    if (pisos[i] == votacion) {
                        votos[i]++;
                    }
                }
                }
            }

        }
        } while (menu !=0);

        System.out.println("Las votaciones finales han quedado de esta manera: ");
        for (int i = 0; i < pisos.length; i++) {
            System.out.println("El piso "+pisos[i]);
            System.out.println("Tiene "+votos[i]+" votos");
        }
    }
}
