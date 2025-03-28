
import java.util.Scanner;

    public class chatgpt8{
        public static void main(String[] args) {
            
    Scanner tec= new Scanner(System.in);

    //Escribe un programa que convierta una distancia en metros a kilómetros, pies y millas. Usa las siguientes tasas de conversión:

    //entrada: distancia en metros 
    //proceso: factor de conversiones pasar distintas distancias
    //salida: distintas distancias
    float met,kil,pie,mill;
    System.out.println("Introduce la distancia en metros");
    met= tec.nextFloat();

    float ConvKil= 1;
    float ConvKilMetr= 1000;
    float ConvPies= 1;
    float ConvPiesMetr= 0.3048f;
    float ConvMillas= 1;
    float ConvMillasMetr= 1609.34f;

    kil= ConvKil*met/ConvKilMetr;
    pie= ConvPies*met/ConvPiesMetr;
    mill= ConvMillas*met/ConvMillasMetr;

    System.out.println("Kilometros: "+ kil +" Pies: "+ pie +" Mill: "+ mill);
        }
    }
    