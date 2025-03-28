package Utilidades.Mates;

public class Potenciar {
    public int num1;
    public int num2;

    public Potenciar(){
        this.num1=0;     
        this.num2=0;     
    }
    
    public Potenciar(int num1, int num2){
        this.num1=num1;     
        this.num2=num2;     
    }

    public int getPotencia(){
        for (int i = 1; i < num2; i++) {
            num1+= num1;            
        }
        return num1;
    }
}

