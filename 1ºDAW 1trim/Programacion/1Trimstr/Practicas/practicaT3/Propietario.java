//charat

/**
 
Autora: Sara Gómez Torres
Descripción: Una clase la cual almacena información sobre el propietario

Fecha: 03/12/2024

Entrada: nombre y dni del propietario

Proceso: almacena la información

Salida: la muestra en el programa principal cuando se requiere

**/
public class Propietario {
    private String nombre;
    private int DNI;
    private char letradni;


    public Propietario(){
        this.nombre=" ";
        this.DNI=00000000;
        this.letradni=' ';
    }
    public Propietario(String nombre, int DNI, char letradni){
        this.nombre=nombre;
        this.DNI= DNI;
        this.letradni=letradni;

    }

    public Propietario(Propietario p){
        this.nombre=p.nombre;
        this.DNI=p.DNI;
        this.letradni=p.letradni;
        }

    public String toString(){
        String información;
        información=this.nombre+" "+this.DNI+this.letradni;
        return información;
        }
    

    public String getNombre(){
        return this.nombre;
    }
    public int getDNI(){
        return this.DNI;
    }
    public char getLetradni(){
        return this.letradni;
    }
    public void setDni(){ 
    }
    public void setNombre(){
    }
    public void setLetradni(){
    }

}
