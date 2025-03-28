package chatgpt1;

public class Rectangulo extends Figurageo {
    private double altura;
    private double base;

    public Rectangulo (){
        altura=0;
        base=0;
    }
    public Rectangulo (double altura, double base){
        this.altura=altura;
        this.base=base;
    }
    @Override
    public double calcularPerimetro() {
        double perimetro;
        perimetro=2*altura+2*base;
        return perimetro;
    }

    @Override
    public double calcularArea() {
        double area;
        area= base*altura;
        return area;
    }
    
}
