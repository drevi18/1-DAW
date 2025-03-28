/**
 
Autora: Sara Gómez Torres
Descripción: Una clase la cual almacena información sobre el vehiculo

Fecha: 03/12/2024

Entrada: nombre y dni del propietario

Proceso: almacena la información

Salida: la muestra en el programa principal cuando se requiere

**/
public class Vehiculo {
    private String marca;
    private String modelo;
    private int añofab;
    private double km;
    private  Propietario propietario;
    private int AÑOACT=2024;

    public Vehiculo(){
        this.marca=" ";
        this.modelo=" ";
        this.añofab=0;
        this.km=0;
        this.propietario= new Propietario();
    }

    public Vehiculo(String marca, String modelo, int añofab, double km){
        this.marca=marca;
        this.modelo=modelo;
        this.añofab=añofab;
        this.km=km;
        this.propietario=new Propietario();   
    }

    public String toString(){
        String informacion;
        informacion=this.marca+" marca "+this.modelo+" modelo "+this.añofab+" año "+this.km+" km "+propietario.toString();
        return informacion;
    }

    public double recorrer(double distrec){
        double resultado;
        resultado=km*distrec;
        return resultado;
    }

    public String valorResidual(){
        int añomat;
        String valor=" ";
        añomat=AÑOACT-this.añofab;
        switch (añomat) {
            case 0:
            valor= "El valor fiscal es 100% ";
                break;
            case 1:
            valor= "El valor fiscal es 84%";
                break;
            case 2:
            valor= "El valor fiscal es 67%";

                break;
            case 3:     
            valor= "El valor fiscal es 56%";

                break;
            case 4:     
            valor= "El valor fiscal es 47%";

                break; 
            case 5:     
            valor= "El valor fiscal es 39%";

                break;
            case 6:     
            valor= "El valor fiscal es 34%";

                break;
            case 7:    
            valor= "El valor fiscal es 28%";

                break;
            case 8:
            valor= "El valor fiscal es 24%";

                break;     
            case 9:
            valor= "El valor fiscal es 19%";

                break;     
            case 10:
            valor= "El valor fiscal es 17%";

                break;     
            case 11:
            valor= "El valor fiscal es 13%";
    
                    break;     
            case 12:
            valor= "El valor fiscal es 10%";
    
                    break;   
        }
        return valor;
    }

    public boolean esMasViejo(Vehiculo nuevo){
        boolean viejo;
        if(this.añofab>nuevo.añofab){
            viejo= false;
        } else{
            viejo=true;
        }
        return viejo;
    }
}
