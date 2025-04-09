
public class Copia {
    /**
     * numero de las copias 
     */
    private Integer n_cop;
    /**
     * comentarios obre la copia
     */
    private String comentario;
    /**
     * el estado de la copia
     */
    private String estado;
    /**
     * objeto de tipo obra
     */
    private Obra ob;
    /**
     *  constructor vacío
     */
    public Copia(){
        n_cop=null;
        comentario=" ";
        estado=" ";
        ob=null;
    }

    /**
     * @param n_cop
     * @param com
     * @param es
     * @param ob
     * 
     * constructor normal
     */
    public Copia( String com, String es, Obra ob){
        this.n_cop++;
        this.comentario=com;
        this.estado=es;
        this.ob=ob;

    }

    /**
     * @param cod
     * @param nombre
     * 
     * método para confirmar la copia
     */
    public void obraCopia(int cod, String nombre){
        System.out.println("Se ha hecho una copia de la obra");
    }

    /**
     * @return
     * 
     * devuelve las copias que se han generado de una obra en concreto
     */
    public Integer getCopias(Obra ob){
        

        return n_cop;
    }

    @Override
    public String toString() {
        return "La copia tiene "+n_cop+" el comentario: "+comentario+" el estado: "+estado+" y es de tipo"+ob;
    }
}
