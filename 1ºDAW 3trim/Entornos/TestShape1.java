
import java.util.Scanner;

public class TestShape1 {
    public static void main(String []args)
    {
    Scanner tec = new Scanner(System.in);
    final int CUADRADO = 1;
    final int CIRCULO = 2;
    final int TRIANGULO = 3;
    int shape;
    double size;
   
    do{
    System.out.print("Indique su figura(1=CUADRADO, 2=CIRCULO,3=TRIANGULO RECTANGULO): ");
    shape=tec.nextInt();
    System.out.print("Indique su tamaño: ");
    size=tec.nextByte();
    }while (shape!=CUADRADO && shape!=CIRCULO && shape!=TRIANGULO);
   
    Shape figura = new Shape(shape,size);
    System.out.println("Area=" + figura.area());
    }
   }

