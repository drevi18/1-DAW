package Referencia;

   //REFERENCIA

public class Circulo{
 public static void main(String[] args) {
    double area;
    double perimetro[]={78};

    area = Calculo(5 , perimetro);
    System.out.println(area + " "+perimetro[0]);
 }

 public static double Calculo(double radio, double perimetro[]){
    perimetro[0]= 2 * Math.PI * radio;

    return Math.PI * radio * radio; 
 }


}
