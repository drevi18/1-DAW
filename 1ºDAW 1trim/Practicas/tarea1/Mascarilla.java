package Practicas.tarea1;

public abstract class Mascarilla implements Interfaz {
    protected double  precio;
    public Mascarilla(){
        precio=0;    
    }
    public Mascarilla(double precio){
        this.precio=precio;
    }

    public abstract void setPrecio();

    public double getPrecio(){
            return precio;
    }

    public double getparteIVA(){
        double siniva, resto;
        resto=precio*getiva()/100;
        siniva=precio-resto;
        return siniva;
    }

    protected  abstract int getiva();
}
