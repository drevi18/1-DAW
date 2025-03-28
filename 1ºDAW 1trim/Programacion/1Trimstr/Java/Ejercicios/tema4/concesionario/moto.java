package concesionario;

public class moto extends Vehiculo {
    protected String dueño;
    
    public moto(){
        dueño=" ";
        contador++;
    }

    public moto(String dueño){
        this.dueño=dueño;
        contador++;
    }
    @Override
    public void arrancar() {
        System.out.println("Moto arrancado");

    }

    @Override
    public void detener() {
        System.out.println("La moto se ha detenido");
    }
    
}

    
