package concesionario;

public abstract class Vehiculo {
    protected String marca;
    protected String modelo;
    protected int velocidadmax;
    protected static int contador;

    public abstract void arrancar();
    public abstract void detener();


    public void contadorVehiculos(){
        
    }
}
