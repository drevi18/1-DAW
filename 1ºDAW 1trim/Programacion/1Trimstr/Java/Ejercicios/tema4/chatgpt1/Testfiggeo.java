package chatgpt1;

import java.util.Scanner;

public class  Testfiggeo {
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);

        System.out.println("Que figura quieres crear? ");
        System.out.println("[1] Circulo ");
        System.out.println("[2] Rectángulo ");
        int respuesta= tec.nextInt();

        switch (respuesta) {
            case 1:
                    System.out.println("Introduce el radio del circulo");
                    double radio= tec.nextDouble();

                    Circulo c1= new Circulo(radio);
                    System.out.println("El Área del circuo es: "+c1.calcularArea());
                    System.out.println("El Perímetro del circulo es: "+c1.calcularPerimetro());
                break;
            case 2:
                    System.out.println("Introduce la base");
                    double base =tec.nextDouble();
                    System.out.println("Introduce la altura");
                    double altura =tec.nextDouble();

                    Rectangulo r1= new Rectangulo(altura,base);
                    System.out.println("El Área del rectángulo es: "+r1.calcularArea());
                    System.out.println("El Perímetro del rectángulo es: "+r1.calcularPerimetro());

                break;
            default:

            System.out.println("Introduce un número válido");
        }
    }
}
