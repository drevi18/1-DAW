// Autor: Sara
//Propósito: Ejercicio clase
public class Clase19sep {
public static void main(String[] args) {
    float unFloat = 0.17F;
    double unDouble = -0.175;
    double otroDouble = 5.02E8;
    int x = 5;
    String texto = "Hola";
    String cadena = "a a";

        
        System.out.printf("unFloat%f", unFloat);
        System.out.printf("unDouble%f", unDouble);
        System.out.printf("otroDouble%f", otroDouble);
        System.out.printf("otroDouble%.2f", otroDouble);

        // El printf hace que no hayan saltos de linea mientras quw en el println si agrega el salto de lineas
        //Ahora vamos a añadir unos saltos de lineas con el printf
        //Para agregan saltos entre lineas se utiliza el \n
            System.out.printf("unFloat%f\n", unFloat);
            System.out.printf("unDouble%f\n", unDouble);

        // Tenemos que poner en orden % para que los valores que pongamos fuera coincidan si no no se podrá ejecutar
        System.out.printf("unDouble%f\n y %d y %s\n", unDouble, x, texto);
    
        // .length() sirve para contra los carácteres que tiene la string que hemos asignado 
        System.out.println(cadena+"="+cadena.length());
        
    }
        public class Rangos {
     {

        System.out.println(Math.sqrt(-1)); //NaN
        System.out.println(1.1e200*1.1e200); //Infinity
        System.out.println(-1.1e200*1.1e200); //- Infinity
        }
    }
    
}

