import java.util.Scanner;

/*Una comunidad de vecinos tiene 9 pisos y un local. Realiza un programa que controle las elecciones a presidente de la comunidad: 
cada vecino puede votar al vecino que quiera. Valida que el voto es correcto */
public class PRG5_13 {
 public static void main(String[] args) {
     Scanner tec= new Scanner(System.in);
     int []v= new int[10];
     int []p= new int[10];

     for (int i = 0; i < p.length; i++) {
         p[i]=i+1;
         System.out.println("pisos: "+p[i]);
     }


        System.out.println("De que piso eres? ");
        int pis= tec.nextInt();
        for (int i = 0; i < p.length; i++) {
            if (p[i]==0) {
                System.out.println("Ya has votado");
            } 
        } 
            System.out.println("a que vecino quieres votar?");
            int vot=tec.nextInt();
            v[vot]++;    
            p[pis]=0;
           
      
        
     for (int i = 0; i < v.length; i++) {
        System.out.println("El piso "+i+" tiene "+v[i]+" votos");
    }
 }
}
