public class Autor {
    private String nombre;
    private int añonac;
    private int AÑOACT=2024;


    public Autor(){
        nombre=" ";
        añonac=0000;
    }

    public Autor(String nombre, int añonac){
        this.nombre=nombre;
        this.añonac=añonac;
    }

    public int getEdadAutor(){
        AÑOACT-=añonac;
        return AÑOACT;
    }

    public String getDescAutor(){
        return "El autor llamado "+nombre+" tiene como caracteristica sus portadas alegres";
    }


}
