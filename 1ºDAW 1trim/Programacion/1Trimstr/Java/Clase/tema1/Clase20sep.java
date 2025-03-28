public class Clase20sep {

//esto va con el programa que permite comprobar los tipos de ednumerados
// enum hace que una variable tenga 3 opciones
enum Semaforo {verde, rojo, ambar};
    public static void main(String[] args) {
    System.out.println("\"(Hola)\'\t\\");

    // El charAt nos enseña lo que le pedimos con el número lo que está en esa posición
    System.out.println(("Hola".charAt(1)));
    
    // Tipos de datos complejos
    System.out.println(Integer.parseInt("123"));
    System.out.println(Long.parseLong("165"));
    System.out.println(Byte.parseByte("12"));
    System.out.println(Short.parseShort("55"));
    System.out.println(Float.parseFloat("55.66"));
    System.out.println(Double.parseDouble("5.5e6"));

    // Este programa permite comprobar los tipos enumerados
    Semaforo miSemaforo = Semaforo.verde;
    System.out.println("Puedo pasar? " + miSemaforo);
    System.out.println("Puedo pasar? " + (miSemaforo == Semaforo.verde));

    char c = 'a', c2;
    int I = 23, i2;
    short s;
    double d;
    i2 = c;
    //s = c; es un error
    d = c;      
    s = 678;
    double dou = 123.67;
    int dest = (int)dou;
    dou = 3.40282347e+50;
    float fl = (float) dou;
    int in = 257;
    byte b;
    b = (byte) in;


    int x = 1==10? 5:10;
    System.out.println(x);

    }
}
    


