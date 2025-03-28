public class Cine {
    private  String titulo;
    private int entrtot;
    private double precentr;
    private int entrvend;

    public Cine(){
        titulo=" ";
        entrtot= 0;
        precentr=0;
    }
    
    public Cine(String titulo, int entradas, double  precio){
        this.titulo=titulo;
        entrtot=entradas;
        precentr=precio;
    }

    public void venderEntradas(int n){
        entrvend+=n;
        entrtot-=n;
    }

    public double mostrarIngresos(){
        double ingresos;
        ingresos= entrvend*precentr;
        return ingresos;
    }

    public void mostrarInformacion(){
        System.out.println("Para la película "+titulo+" con precio de entrada "+precentr+" quedan disponibles "+entrtot+" entradas");
    }
}
