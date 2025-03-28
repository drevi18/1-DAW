package Practicas.tarea1;

public class RestoMascarillas extends Mascarilla {

    private static int iva=21;
    private String tipoMascarilla;

    public RestoMascarillas(){}
    public RestoMascarillas(String nombre,double precio ){
        super(precio);
        this.tipoMascarilla=nombre;
    }

    protected int getIVA(){
        return iva;
    }
    
    @Override
    public String toString(){
        System.out.println(tipoMascarilla+precio+iva+getparteIVA());
        return null;
    }

    @Override
    public void setPrecio() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    protected int getiva() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public String getTipoMascarilla() {
        return tipoMascarilla;
    }

    public void setTipoMascarilla(String tipoMascarilla) {
        this.tipoMascarilla = tipoMascarilla;
    }



    
}
