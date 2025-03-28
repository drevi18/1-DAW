package concesionario;

public class  coche extends Vehiculo{
    protected String dueño;
    
    public coche(){
        dueño=" ";
        contador++;
    }

    public coche(String dueño){
        this.dueño=dueño;
        contador++;
    }
    @Override
    public void arrancar() {
        System.out.println("Coche arrancado");
    }

    @Override
    public void detener() {
        System.out.println("El coche se ha detenido");
    }
    
}
