package juegos;
import java.util.Scanner;

public class enraya {
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);
        String [][]matrz= new String[3][3];

        int f=0, c=0;

        for (int i = 0; i < matrz.length; i++) {
            for (int j = 0; j <matrz[i].length; j++) {
                matrz[i][j]="-";
            }
        }

        Mostrar(matrz);

        
        for (int i = 0; i < 9; i++) {

            PrimJug(f, c, matrz);
            Mostrar(matrz);   
            SegJug(f, c, matrz);  
            Mostrar(matrz);       
        }
        System.out.println("Ya se ha terminado el juego, no quedan movimientos ");
    }

    public static void Mostrar(String matrz[][]){
        for (int i = 0; i < matrz.length; i++) {
            for (int j = 0; j < matrz[i].length; j++) {
                System.out.print(matrz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void PrimJug(int f, int c, String matrz[][]){
        Scanner tec=new Scanner(System.in);

        System.out.println("¡Hola jugador 1! Donde quieres colocar tu ficha, primero la fila luego la columna");
        f=tec.nextInt();
        c=tec.nextInt();
        String comp="-";
        boolean list=true;
        for (int i = 0; i < matrz.length; i++) {
            for (int j = 0; j < matrz[i].length; j++) {
                if (f==i&&c==j) {
                    do{
                    if (matrz[i][j].equals(comp)){ 
                        matrz[i][j]="X";
                        list=false;
                    }else{ 
                        System.out.println("Esta casilla ya ha sido rellenada");
                        System.out.println("Di donde quieres colocar tu ficha, primero la fila luego la columna");
                         f=tec.nextInt();
                         c=tec.nextInt();
                        list=false;
                    }
                    }while (list==true);            
                }
            }
        }
    }

    public static void SegJug(int f, int c, String matrz[][]){
        Scanner tec=new Scanner(System.in);
        System.out.println("¡Hola jugador 2! Donde quieres colocar tu ficha, primero la fila luego la columna");
        f=tec.nextInt();
        c=tec.nextInt();
        
        String comp="-";
        boolean list=true;
        for (int i = 0; i < matrz.length; i++) {
            for (int j = 0; j < matrz[i].length; j++) {
                if (f==i&&c==j) {
                    do{
                    if (matrz[i][j].equals(comp)){ 
                        matrz[i][j]="0";
                        list=false;
                    }else {
                        System.out.println("Esta casilla ya ha sido rellenada");
                        System.out.println("Di donde quieres colocar tu ficha, primero la fila luego la columna");
                         f=tec.nextInt();
                         c=tec.nextInt();
                        list=false;
                    }
                    }while (list==true);            
                }
            }
        }
    }
}