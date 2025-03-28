/*Programa que lea un vector numérico de 10 elementos y rote todas sus componentes un lugar hacia el final del vector desplazando la última componente al primer lugar */
public class PRG5_8 {
    public static void main(String[] args) {
        int []v= new int[10];

        for (int i = 0; i < v.length; i++) {
            v[i]=i;
        }
        
        Mostrar(v);
        System.out.println(" ");
        for (int i = 0; i < v.length; i++) {
            int aux=0;
            if(v[i]==v[0]){
                v[i]=v[9];
            } else if(v[i]<=v[0]){
                System.out.println("si");
                v[i]=i-1;
            }
        }
        Mostrar(v);
    }
    public static void Mostrar (int v[]){
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);
        }
    }
}
