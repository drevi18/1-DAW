package Utilidades.Mates;
public class Sumar{
    private int num1;
    private int num2;

    public Sumar (){
        this.num1=0;
        this.num2=0;
    }

    public Sumar (int num1, int num2){
        this.num1=num1;
        this.num2=num2;

    }

    public int getsuma(){
        return num1+num2;
    }
}