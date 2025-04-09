
public class Pelicula extends  Obra{
    private Integer duracion;

    public Pelicula(){
        duracion=null;
    }
    
    public Pelicula(int d, int cod){
        this.duracion=d;
        this.cod=cod;
    }

    
    @Override
    public int getCod() {
        return cod;
    }

    @Override
    public String toString() {
        return "La obra es un cd "+nombre+cod+duracion;
    }
}
