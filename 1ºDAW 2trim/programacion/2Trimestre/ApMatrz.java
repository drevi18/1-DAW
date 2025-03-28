import java.util.Arrays;
import java.util.HashSet;
import java.util.ArrayList;
public class ApMatrz {
    
    public static void main(String[] args) {
// Apuntes sobre Estructuras de Almacenamiento en Java

// 1. Vectores (Arrays Unidimensionales)
// Declaración e inicialización de un array de enteros
int[] numeros = {1, 2, 3, 4, 5};

// Acceder a elementos
System.out.println("Primer elemento: " + numeros[0]);

// Recorrer un array
for (int i = 0; i < numeros.length; i++) {
    System.out.println("Elemento en posición " + i + ": " + numeros[i]);
}

// Búsqueda lineal sin break, usando while
int buscar = 3;
boolean encontrado = false;
int i = 0;
while (i < numeros.length && !encontrado) {
    if (numeros[i] == buscar) {
        encontrado = true;
    } else {
        i++;
    }
}
System.out.println("¿Número encontrado? " + encontrado);

// Ordenación por método de burbuja
for ( i = 0; i < numeros.length - 1; i++) {
    for (int j = 0; j < numeros.length - 1 - i; j++) {
        if (numeros[j] > numeros[j + 1]) {
            int temp = numeros[j];
            numeros[j] = numeros[j + 1];
            numeros[j + 1] = temp;
        }
    }
}

// 2. Matrices (Arrays Bidimensionales)
int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

// Acceder a un elemento
System.out.println("Elemento en [1][2]: " + matriz[1][2]);

// Recorrer una matriz
for ( i = 0; i < matriz.length; i++) {
    for (int j = 0; j < matriz[i].length; j++) {
        System.out.print(matriz[i][j] + " ");
    }
    System.out.println();
}

// 3. ArrayList (Lista Dinámica)
// import java.util.ArrayList;
ArrayList<String> lista = new ArrayList<>();
lista.add("Hola");
lista.add("Mundo");
System.out.println("Primer elemento: " + lista.get(0));

// 4. HashSet (Conjunto sin duplicados)
// import java.util.HashSet;
HashSet<Integer> conjunto = new HashSet<>();
conjunto.add(10);
conjunto.add(20);
conjunto.add(10); // No se duplicará
System.out.println("Conjunto: " + conjunto);

// 5. Búsqueda Binaria (Requiere array ordenado)
// import java.util.Arrays;
Arrays.sort(numeros);
int indice = Arrays.binarySearch(numeros, 3);
System.out.println("Índice de 3: " + indice);

// 6. Ordenación con Quicksort
public static void quicksort(int[] arr, int izq, int der) {
    if (izq < der) {
        int pivote = arr[izq], i = izq, j = der, aux;
        while (i < j) {
            while (arr[i] <= pivote && i < j) i++;
            while (arr[j] > pivote) j--;
            if (i < j) {
                aux = arr[i]; arr[i] = arr[j]; arr[j] = aux;
            }
        }
        arr[izq] = arr[j];
        arr[j] = pivote;
        quicksort(arr, izq, j - 1);
        quicksort(arr, j + 1, der);
    }

}
}