public class Cuotas {
    private int fecha;    
    private byte tipo;

    public Cuotas(){
        this.fecha=00000000;
        this.tipo=0;
    }
    public Cuotas(int fecha, byte tipo){
        this.fecha=fecha;
        this.tipo=tipo;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public String getTipo() {
        String estado="";
        switch (tipo) {
            case 1:
                estado= "Pagado";
            break;
            case 2:
                estado="Devuelto";
            break;
            case 3:
                estado="Pendiente";
            break;
            }
        return estado;
    }

    public void setTipo(byte tipo) {
        this.tipo = tipo;
    }
    
}
