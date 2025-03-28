package taller;

public class coche extends Vehiculo {
    private int numpuert;

    public coche(){
        numpuert=0;
    }

    public coche(String modelo, String marca, int vmax, int numpuert) {
        super(modelo, marca,  vmax);  
        this.numpuert = numpuert; 
    }

    public int getNumpuert() {
        return numpuert;
    }

    public void setNumpuert(int numpuert) {
        this.numpuert = numpuert;
    }

    @Override
    public String toString(){
        return "El coche es del modelo "+modelo+" marca "+marca+" vmax "+vmax+" y con "+numpuert+" puertas";
    }
}
