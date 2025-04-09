
public class Libro extends Obra{
    private Integer n_pag;

    public Libro(){
        n_pag=null;
    }
    public Libro(int n_pag, int cod){
        this.n_pag=n_pag;
        this.cod=cod;
    }

    
    @Override
    public int getCod() {
        return cod;
    }

    @Override
    public String toString() {
        return "La obra es un cd "+nombre+cod+n_pag;
    }
}
