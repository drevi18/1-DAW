
import java.util.Date;


public abstract class Obra {
    protected Integer cod;
    protected String nombre;
    protected Date anyo;

    public Obra(){
        cod=null;
        nombre=" ";
        anyo=null;
    }

    public Obra(int cod, String nombre){
        this.cod=cod;
        this.nombre=nombre;
        // this.anyo=anyo;
    }

    public abstract int getCod();

    public abstract String toString();
}
