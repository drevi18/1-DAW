package Utilidades.Mates;

public class  TestUtilidades {
    public static void main(String[] args) {
        
        int num1=10, num2=3;

        Sumar s1= new Sumar(num1,num2);
        Potenciar p1= new Potenciar(num1,num2);

        System.out.println("SUMA: " + s1.getsuma());
        System.out.println("POTENCIA " + p1.getPotencia());
    
    }
}

