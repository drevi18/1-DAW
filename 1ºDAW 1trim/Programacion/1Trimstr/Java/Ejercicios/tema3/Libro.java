public class Libro {
    
    private String titulo;
    private String ISBN;
    private int añopub;
    private Autor autor;
    private int AÑOACT=2024;

    public Libro(){ 
        titulo=" ";
        ISBN=" ";
        añopub=0;
        this.autor= new Autor();
    }

    public Libro(String titulo, String ISBN, int añopub){
        this.titulo=titulo;
        this.ISBN=ISBN;
        this.añopub=añopub;
        this.autor= new Autor();
     }

     public int getAñoPubLib(){
        AÑOACT-=añopub;
            return AÑOACT;
     }

     public void getDescLib(){
        System.out.println("El libro con nombre "+titulo+" escrito por "+autor+" de edad "+autor.getEdadAutor()+" nos cuenta la historia de....");
     }

}
