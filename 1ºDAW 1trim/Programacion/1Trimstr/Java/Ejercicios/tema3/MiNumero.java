public class MiNumero {

    private int numero;
    
    public MiNumero(){
        this.numero=0;
    }
    public MiNumero(int num){
        this.numero=num;
    }

    public int doble(){
        int d;
        d=numero+numero;
       return d;
    }
    public int triple(){
        int t;
        t=numero+numero+numero;
       return t;
    }
    public int cuadruple(){
        int c;
        c=numero+numero+numero+numero;
       return c;
    }
}
