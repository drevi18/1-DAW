import java.util.ArrayList;
import java.util.Scanner;

public class arr2 {
    static Scanner tec = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            num.add(i * 10);  // [0,10,20,30,40]
        }

        // Cambiar en i==0 sin problema (antes de modificaciones de tamaño)
        int aux = num.get(0);
        num.set(0, 5);
        num.set(4, aux);  // la posición 5 no existe aún, es índice 4

        // Añadir 25 cuando i==2
        num.add(2, 25);  // inserta 25 en la posición 2 desplazando lo demás

        // Para eliminar el 40 recorremos en un segundo for para no romper índice
        for (int i = 0; i < num.size(); i++) {
            if (num.get(i) == 40) {
                num.remove(i);
                break;  // si solo hay uno, salimos para evitar problemas de índice
            }
        }

        // Mostrar resultado
        for (int i = 0; i < num.size(); i++) {
            System.out.println(num.get(i));
        }
    }
}
