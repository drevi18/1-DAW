import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);
        System.out.println("Hola, estoy aqui para responder tus dudas, por favor indícame como te llamas: ");
        String nombre= tec.nextLine();

        String respuesta;
        do { 
            
            System.out.println("HoOla "+nombre+" por favor hazme una pregunta (CITA/DATO/ANÉCDOTA/*en blaco para acabar) ");
                respuesta= tec.nextLine();
                switch (respuesta) {
                    case "CITA" :
                    System.out.println("Si piensas que los usuarios de tus programas son idiota, sólo los idiotas usarán tus programas");
                    break;
                    case "DATO" :
                    System.out.println("El código binario es el lenguajde de las máquinas");
                    break;
                    case "ANECDOTA" :
                    System.out.println("Ada lovelace fue una matemática británica considerada la primera persona que escribió un algoritmo destinado a ser procesado por una máquina");
                    break;
                    default: System.out.println("Vuelve a decirme que quieres saber");
                    
                }
        } while (!respuesta.equals(""));

        
        
    }
}
