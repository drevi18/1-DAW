
import java.util.Random;


public class vector {
    public static void main(String[] args) {
        
        final int N=10;
        int []v= new int[N];
        Random random= new Random();
        double media;
        int max,minim;
        for (int i = 0; i <= v.length; i++) {
            v[i]=random.nextInt(N);
            max=v[0];
            minim=v[0];
            media=v[0];
            for (i = 1; i < N;i++) { 
                if(v[i]>max)
                max=v[1];
                if(v[1]<minim)
                minim=v[i];
                media=v[i];
            }
            System.out.println("El máximo es "+max+" El minimo "+minim+" la media "+media);
        }
    }
}
