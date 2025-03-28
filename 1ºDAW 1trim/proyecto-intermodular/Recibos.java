public class Recibos {
    private byte tipo;

    public  Recibos(){
        this.tipo=0;
    }
    public  Recibos(byte tipo){
        this.tipo=tipo;

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
