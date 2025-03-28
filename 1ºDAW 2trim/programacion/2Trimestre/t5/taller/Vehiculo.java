package taller;

public abstract class Vehiculo {
    protected String modelo;
    protected String marca;
    protected int vmax; 

    public Vehiculo(){
        modelo=" ";
        marca=" ";
        vmax=0;
    }
    public Vehiculo(String modelo, String marca, int vmax){
        this.modelo=modelo;
        this.marca=marca;
        this.vmax=vmax;
    }
    
    
    public abstract String toString();
}
