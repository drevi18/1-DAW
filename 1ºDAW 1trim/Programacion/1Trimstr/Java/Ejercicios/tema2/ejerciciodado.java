
import java.util.Scanner;

public class ejerciciodado {
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);

        //almacena los resultados de un dado

        System.out.println("Cuantas veces se tira el dado?");
        int tir= tec.nextInt();
        int dado;
        int d1=0,d2=0,d3=0,d4=0,d5=0,d6=0;
        for(int i=1; i<=tir;i++){
            dado=(int)(Math.random()*6+1);
            System.out.println(dado);
            switch (dado) {
                case 1:
                    d1+=1;
                        break;
                case 2:
                    d2+=1;
                        break;
                case 3:
                    d3+=1;
                        break;
                case 4:
                    d4+=1;
                        
                        break;
                case 5:
                    d5+=1;
                        break;
                case 6:
                    d6+=1;
                        break;
            }
        }
        System.out.println("El número 6 sale:" +d6);
        System.out.println("El número 5 sale:" +d5);
        System.out.println("El número 4 sale:" +d4);
        System.out.println("El número 3 sale:" +d3);
        System.out.println("El número 2 sale:" +d2);
        System.out.println("El número 1 sale:" +d1);
    }
}
