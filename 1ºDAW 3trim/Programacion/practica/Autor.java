
public class Autor {
    private String pais;
    private String nombre;
    private Integer cod;

    public Autor(){
        pais=" ";
        nombre=" ";
        cod=null;
    }

    public Autor(String pais,String nombre, int cod){
        this.pais=pais;
        this.nombre=nombre;
        this.cod=cod;
    }

    @Override
    public String toString() {
        return "El autor de nombre "+nombre+" de país "+pais;
    }
}
