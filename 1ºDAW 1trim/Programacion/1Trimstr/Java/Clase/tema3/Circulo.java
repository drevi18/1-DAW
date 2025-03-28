

public class Circulo {
    private Punto centro;
    private double radio;

    public Circulo(){
        centro=new Punto();
        radio=1;
    }

    public Circulo(Punto parametro1, double parametro2){
        centro=parametro1;
        if(parametro2<=0){
            radio=1;
        }else
            radio=parametro2;

    }
    public void muestra(){
        centro.muestra();
        System.out.println("Radio = "+radio);
        System.out.println("Area = "+area());
    }
    public double area(){
        double area=radio+radio+Math.PI;
        return area;
    }
    /*protected void finalize(){
        System.out.println("Adios");
    }*/


    public static void main(String[] args) {
        int po;
        Punto popo =new Punto(4,5);
        Circulo coco = new Circulo(popo,-6.0);
        
        coco.muestra();
    }
}
