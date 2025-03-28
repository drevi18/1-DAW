public class Punto {
    
    private int x=0;
    private int y=0;

    public Punto(){
        y=0;
        x=0;
        
    }
    public Punto(int parametro1, int parametro2){
        x=parametro1;
        y=parametro2;
    }
    public void muestra(){
        System.out.println("centro("+x+","+y+")");
    }
}
