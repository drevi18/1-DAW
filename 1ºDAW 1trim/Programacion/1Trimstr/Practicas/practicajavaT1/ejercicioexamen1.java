public class ejercicioexamen1 {
    public static void main(String[] args) {
        //Pruebe el siguiente código; si le parece que no funciona correctamente modifíquelo hasta
        //que funcione como debería, pero sin modificar el tipo de dato de c1 y c2.

    short c1 = 30; //no se toca
    short c2 = 6000; //no se toca
    long c3;
    c3 = c2 * c1;
    System.out.println(c1 + " * " + c2 + " = " + c3);


        /*¿Qué tipo de error genera esté código en un principio? ¿Por qué no se obtiene el resultado
        esperado? ¿Cómo lo has corregido? 
        Genera un error de compatibilidad debido a la longitud de la información que está dentro de la variable, ya que no puede almacenar esa cantidad de datos. 
        Lo he corregido simlemente haciendo un cambio de variable de short, donde no cabia la información, a long para que pudiese guardar todo correctamente */


    }
}
