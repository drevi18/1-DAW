
import java.util.Scanner;

public class Testracional {
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);

        int menu, n1,n2,d1,d2;

        System.out.println("Introduce el primer numerador");
        n1= tec.nextInt();
        System.out.println("Introduce el primer denominador");
        d1= tec.nextInt();
        System.out.println("Introduce el segundo numerador");
        n2= tec.nextInt();
        System.out.println("Introduce el segundo denominador");
        d2= tec.nextInt();

        Racional a= new Racional(n1,d1);
        Racional b= new Racional(n2,d2);

        
        Racional resultado, resultadoSuma, resultadoResta;

        resultado= a.multiplicacion(b);
        resultadoSuma= a.suma(b);
        resultadoResta= a.resta(b);

    do { 
            
        System.out.println("Cargar 2 racionales= 1");
        System.out.println("Suma= 2");
        System.out.println("Resta=1 3");
        System.out.println("Multiplicación= 4");
        System.out.println("Salir= 0");
        menu= tec.nextInt();

        switch (menu) {
            case 1:
                
                System.out.println("Introduce el primer numerador");
                n1= tec.nextInt();
                System.out.println("Introduce el primer denominador");
                d1= tec.nextInt();
                System.out.println("Introduce el segundo numerador");
                n2= tec.nextInt();
                System.out.println("Introduce el segundo denominador");
                d2= tec.nextInt();

                a= new Racional(n1,d1);
                b= new Racional(n2,d2);

                resultado= a.multiplicacion(b);
                resultadoSuma= a.suma(b);
                resultadoResta= a.resta(b);
            break;

            case 2:
                System.out.println(resultadoSuma.getNumerador()+"/"+resultadoSuma.getDenominador());
            break;

            case 3:
                System.out.println(resultadoResta.getNumerador()+"/"+resultadoResta.getDenominador());
            break;

            case 4:
                System.out.println(resultado.getNumerador()+"/"+resultado.getDenominador());
                    
                break;
            default:
                System.out.println("Introduce un número válido");
            }
            
        } while (menu!=0);
        System.out.println("Adiós");

    }
}
