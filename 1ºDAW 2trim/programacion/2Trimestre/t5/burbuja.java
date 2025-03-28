import java.util.Scanner;

public class burbuja {
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);
        int []v= new int[5];
        int n;

        for (int i = 0; i < v.length; i++) {
            System.out.println("Introduce un número");
            n= tec.nextInt();

            v[i]=n;
        }
        
        Ordenar(v);
        Mostrar(v);
    }

    public static void Ordenar(int v[]){
        for (int i = 0; i < v.length-1; i++) {
            for (int j = 0; j < v.length-1; j++) {
                if (v[j]>v[j+1]) {
                    int aux=v[j];
                    v[j]=v[j+1];
                    v[j+1]=aux; 
                }
            }
        }
    }

    public static void Mostrar(int v[]){
        for (int i = 0; i < v.length; i++){
            System.out.println(v[i]);
        }
    }
}
