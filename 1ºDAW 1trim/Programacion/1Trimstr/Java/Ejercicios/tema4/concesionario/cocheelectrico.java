package concesionario;

public class cocheelectrico extends coche implements Electrico{
    protected String dueño;
    public cocheelectrico(){
        dueño=" ";
        contador++;
    }

    public cocheelectrico(String dueño){
        this.dueño=dueño;
        contador++;
    }


    @Override
    public void cargarBateria() {
        System.out.println("Cargando vehiculo");
    }


}
