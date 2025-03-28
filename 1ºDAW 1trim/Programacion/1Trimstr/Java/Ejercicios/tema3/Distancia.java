public class Distancia {
    private double distbas, METROS=1852, KILOMETROS=1.61;
    
    public Distancia(){
        distbas=0;
    }

    public Distancia( double mill){
        distbas=mill;
    }


    public double millasAMetros(){
        double resultado;
        resultado= distbas*METROS;
        return resultado;
    }

    public double millasAKilometros(){
        double resultado;
        resultado= distbas*KILOMETROS;
        return resultado;
    }


}
