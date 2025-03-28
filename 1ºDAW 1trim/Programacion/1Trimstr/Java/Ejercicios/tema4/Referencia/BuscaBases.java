package Referencia;

    /**
 * Autor: Denys (3D)
 * Fecha: 23/01/2025
 * Descripción: Búsqueda de la potencia de 2 mayor que un número.
 * Ejercicio: 14
 * Bloque: UD4
 */
    public class BuscaBases {
    public static void main(String[] args) {
        byte[]pow = {0};
        int x = 2, potencia = buscaSuperior(x, pow);
        System.out.println("Expnente: " + pow[0] + "\nPotencia: " + potencia);
    }

    public static int buscaSuperior(int x, byte[]pow) {
        int aux = pow[0];
        if (x < 0) {
            aux = -1;
            pow[0] = -1;
        } else {
            if (x > Math.pow(2,aux)-0.5) {
                pow[0]++;
                aux = 2 * buscaSuperior(x, pow);
            } else
                aux = 1;
        }
        
        return aux;
    }
}

