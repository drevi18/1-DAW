public class Metro {
    private int estado;
    static final private int PARADO = 0;
    static final private int EN_MARCHA = 1;
    static final private int PARANDO = 2;
    static final private int ARRANCANDO = 3;
    public Metro(){estado = PARADO;}
    public String print(){
    String resultado;
    if(estado==PARADO) {
    resultado = "PARADO";
    } else if(estado==ARRANCANDO) {
    resultado = "ARRANCANDO";
    } else if(estado==EN_MARCHA) {
    resultado = "EN_MARCHA";
    } else if(estado==PARANDO) {
    resultado = "PARANDO";
    } else {
    throw new RuntimeException("Estado desconocido");
    }
    return resultado;
    }
    public void cambiaEstado() {
    if(estado==PARADO) {
    estado = ARRANCANDO;
    } else if(estado==EN_MARCHA) {
    estado = PARANDO;
    } else if(estado==PARANDO) {
    estado = PARADO;
    } else if(estado==ARRANCANDO) {
    estado = EN_MARCHA;
    } else {
    throw new RuntimeException("Estado desconocido");
    }
    }
   }
