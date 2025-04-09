// Enunciado:
// Compile el siguiente código y en caso de que no compile indique por qué: 
// class Prueba{ 
//    protected String nombre; 
//    protected int ID; 
//    public String getIdent(){return nombre;} 
//    public int getIdent(){return ID;} 
// }

public class Prueba {
    protected String nombre;
    protected int ID;
    
    // El problema es que no pueden haber dos métodos con el mismo nombre y la misma firma (parámetros).
    // Los dos métodos getIdent tienen el mismo nombre y no se pueden sobrecargar solo por el tipo de retorno.
    
    public String getIdentNombre() {
        return nombre;
    }

    public int getIdentID() {
        return ID;
    }
    
    public static void main(String[] args) {
        Prueba p = new Prueba();
        p.nombre = "Juan";
        p.ID = 123;

        System.out.println("Nombre: " + p.getIdentNombre());
        System.out.println("ID: " + p.getIdentID());
    }
}
