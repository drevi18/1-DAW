package taller;

public class moto extends Vehiculo {
    private int cilind;

    public moto(){
        cilind=0;
    }

    public moto(String modelo, String marca, int vmax, int cilind) {
        super(modelo, marca,  vmax);  
        this.cilind=cilind;
    }

    public int getCilind() {
        return cilind;
    }

    public void setCilind(int cilind) {
        this.cilind = cilind;
    }

    @Override
    public String toString(){
        return "El coche es del modelo "+modelo+" marca "+marca+" vmax "+vmax+" y con "+cilind+" cilindrada";
    }
}