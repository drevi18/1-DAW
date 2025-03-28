import java.util.ArrayList;
public class apuntesmetodos {
    /*
 * APUNTES SOBRE ARRAYLIST EN JAVA
 * ---------------------------------
 * Un ArrayList es una estructura de datos en Java que permite almacenar elementos dinámicamente.
 * A diferencia de los arrays tradicionales, su tamaño puede cambiar durante la ejecución del programa.
 * 
 * Importación necesaria:
 * import java.util.ArrayList;
 */
    public static void main(String[] args) {
        // Crear un ArrayList de tipo String
        ArrayList<String> nombres = new ArrayList<>();

        // Agregar elementos al ArrayList
        nombres.add("Juan");
        nombres.add("María");
        nombres.add("Carlos");

        // Acceder a elementos por índice
        System.out.println("Primer nombre: " + nombres.get(0));

        // Modificar un elemento
        nombres.set(1, "Ana");

        // Eliminar un elemento
        nombres.remove("Carlos");

        // Tamaño del ArrayList
        System.out.println("Tamaño del ArrayList: " + nombres.size());

        // Recorrer el ArrayList con un bucle for
        System.out.println("Lista de nombres:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        // Verificar si un elemento existe
        if (nombres.contains("Juan")) {
            System.out.println("Juan está en la lista.");
        }
    }
}

/*
 * MÉTODOS ÚTILES DE ARRAYLIST
 * ----------------------------
 * add(elemento) -> Agrega un elemento al final.
 * add(index, elemento) -> Inserta en una posición específica.
 * get(index) -> Obtiene el elemento en la posición index.
 * set(index, elemento) -> Modifica un elemento en una posición.
 * remove(index) / remove(Object) -> Elimina por índice o por objeto.
 * size() -> Retorna el número de elementos.
 * contains(elemento) -> Verifica si un elemento existe.
 * isEmpty() -> Verifica si está vacío.
 * clear() -> Borra todos los elementos.
 */
