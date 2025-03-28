/*Aceptar una matriz cuadrada de números enteros, de dimensión 3 (3 filas y 3 columnas) y 
calcula la suma de los elementos de la diagonal principal() y de la secundaria(/) */
public class PRG5_M1{
    public static void main(String[] args) {
        int [][]matrz= new int[3][3];

        for (int i = 0; i < matrz.length; i++) {
            for (int j = 0; j < matrz[i].length; j++) {
                matrz[i][j]=i+j+1;
            }
        }
        Mostrar(matrz);
    }

    public static void Mostrar(int matrz[][]){
        for (int i = 0; i < matrz.length; i++) {
            for (int j = 0; j < matrz[i].length; j++) {
                System.out.print(matrz[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("La suma de la diagonal principal es "+SumaPrinc(matrz));
        System.out.println("La suma de la diagonal secundaria es "+SumaSec(matrz));
    }

    public static int SumaPrinc(int matrz[][]){
        int suma=0;
        for (int i = 0; i < matrz.length; i++) {
            for (int j = 0; j < matrz[i].length; j++) {
                if (i==j) {
                    suma+=matrz[i][j];
                }
            }
        }
        return suma;
    }

    public static int SumaSec(int matrz[][]){
        int suma=0;
        for (int i = 0; i < matrz.length; i++) {
            suma += matrz[i][matrz.length - 1 - i]; 
        }
        return suma;    
    }
}
