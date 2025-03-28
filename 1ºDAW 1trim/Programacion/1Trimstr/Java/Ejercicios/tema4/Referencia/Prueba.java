package Referencia;

public class Prueba{
    public static void main(String[] args) {
     double []coseno ={3};
     double seno= funcion(30, coseno);
 
     System.out.println("seno "+seno+ " coseno "+coseno[0]);
    }
     public static double funcion (double x, double[]cos){
         cos[0]= Math.cos(x);
 
         return Math.sin(x);
     }
 }