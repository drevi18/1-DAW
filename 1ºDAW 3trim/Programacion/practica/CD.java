
public class CD extends Obra{
    private Integer n_can;

    public CD(){
        n_can=null;
    }

    public CD(int n_can, int cod){
        this.n_can=n_can;
        this.cod=cod;
    }

    @Override
    public int getCod() {
        return cod;
    }

    @Override
    public String toString() {
        return "La obra es un cd "+nombre+cod+n_can;
    }

}
