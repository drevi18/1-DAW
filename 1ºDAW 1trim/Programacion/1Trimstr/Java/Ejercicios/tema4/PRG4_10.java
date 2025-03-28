import java.util.Scanner;

    //RECURSIVIDAD
    
public class PRG4_10 {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Dime el numero");
       int numero = scanner.nextInt();
       System.out.println("Dime la base");
       int base = scanner.nextInt();

       System.out.println("El resultado es "+ baseNumero(numero, base));
    }

    public static int baseNumero(int numero, int base){
      int resultado;
        if (numero < base) {
            resultado = numero;

        } else {
            resultado = baseNumero(numero / base, base)*10+numero%base;
        }
        return resultado;
    }
}