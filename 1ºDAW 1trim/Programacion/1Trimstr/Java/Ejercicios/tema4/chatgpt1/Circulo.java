package chatgpt1;

public class Circulo extends Figurageo{
    private double radio;

    public Circulo(){
        radio=0;   
    }
    public Circulo(double radio){
        this.radio=radio;
    }
    @Override
    public double calcularArea() {
        double area;
        area=Math.PI*(radio*radio);
        return area;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro;
        perimetro= 2*radio*Math.PI;
        return perimetro;
    }
    
}
