package Practicas.tarea1;

public class MascarillaQuirurgica extends Mascarilla {
    private static int iva=4;
    private double precioMaximo=0.62;

    public MascarillaQuirurgica(){}

    public MascarillaQuirurgica(double precio, double precioMaximo){
        super(precio);
        this.precioMaximo=precioMaximo;
    }

    @Override
    public void setPrecio() {

    }

    @Override
    public String toString(){
        System.out.println(precio+iva+getparteIVA());
        return null;
    }
    
    @Override
    protected int getiva() {
        return iva;
    }
    public double getPrecioMaximo() {
        return precioMaximo;
    }

    public void setPrecioMaximo() {
    }



}
