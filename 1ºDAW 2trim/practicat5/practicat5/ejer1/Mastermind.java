package practicat5.ejer1;

// Autor: Sara

import java.util.Scanner;

public class Mastermind {
    
    public static void main(String[] args) {
        String [][]matrz= new String[4][4];

        String []sol=new String[4];
        String [] resp= new String[4];
        
        Scanner tec = new Scanner(System.in);
        boolean ganado = false;
        String solucion, orden;
        int cont=0;
        
        System.out.println("¡Bienvenido a Mastermind!");
        
        for (int i = 0; i < matrz.length; i++) {
            for (int j = 0; j <matrz[i].length; j++) {
                matrz[i][j]="-";
            }
        }
        
        Mostrar(matrz);
        
        System.out.println("Colores disponibles: R (Rojo), V (Verde), B (Blanco), Y (Amarillo), N (Naranja), F (Fucsia), N (Negro), A (azul)");
        System.out.println(" ");
        System.out.println("Primero dime el orden de la respuesta");
        for (int i = 0; i <resp.length; i++) {
            System.out.println("Introduce un color");
            orden=tec.nextLine();
            

            resp[i]=orden;
        }
        
        System.out.println("Ya has registrado el orden correcto, ahora... ¡A jugar!");
        do{
            for (int intento = 0; intento < 4; intento++) {
                for (int i = 0; i <sol.length; i++) {
                    System.out.println("Introduce un color");
                    solucion=tec.nextLine();
        
                    sol[i]=solucion;
                    
                }
                Comprobar(sol, resp);

                
            }
        }while (ganado==false);

        System.out.println("Muy bien has ganado");
    }


    public static void Mostrar(String matrz[][]){
        for (int i = 0; i < matrz.length; i++) {
            for (int j = 0; j < matrz[i].length; j++) {
                System.out.print(matrz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void Comprobar( String solucion[], String orden[]){
        int cont=0;
        
        for (int i = 0; i < orden.length; i++) {
                if(solucion[i].equals(orden[i])){
                    System.out.println("El color "+i+"en la posición "+solucion[i]+" es correcto");
                    cont++;
                }else 
                    System.out.println("El color "+i+"en la posición "+solucion[i]+" es incorrecto");
                
            }
            if (cont<4) {
                System.out.println("Sigue intentándolo");
            }else 
                System.out.println("Has ganado");
        }
    }


