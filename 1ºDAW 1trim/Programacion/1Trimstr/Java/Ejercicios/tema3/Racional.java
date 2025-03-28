public class Racional {
    
    private int numerador;
    private int denominador;


    public Racional(){
        numerador=0;
        denominador=1;
    }

    public Racional(int num,int den){
        numerador=num;
        denominador=den;

    }

    public int getNumerador(){
        return this.numerador;
    }
    

    public int getDenominador(){
        return this.denominador;
    }

    public Racional(Racional r){
        this.numerador=r.getNumerador();
        this.denominador=r.getDenominador();

    }

    public Racional multiplicacion(Racional r){
        Racional resultado= new Racional();

        resultado.numerador= this.numerador*r.numerador;
        resultado.denominador= this.denominador*r.denominador;

        return resultado;
    }

    public Racional suma(Racional r){
        Racional resultSuma= new Racional();

        resultSuma.numerador= (this.numerador*r.denominador)+(this.denominador*r.numerador);
        resultSuma.denominador= this.denominador*r.denominador;

        return resultSuma;
    }

    public Racional resta(Racional r){
        Racional resultadoResta= new Racional();

        resultadoResta.numerador= (this.numerador*r.denominador)-(this.denominador*r.numerador);
        resultadoResta.denominador= this.denominador*r.denominador;

        return resultadoResta;
    }

    public String toString(){
        return numerador+" / "+denominador;
    }
}
