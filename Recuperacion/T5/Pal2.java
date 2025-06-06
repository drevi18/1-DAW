public class Pal2 {
    private String Cast;
    private String Ing;
    private String Fran;
    
    public Pal2(){
        this.Cast=" ";
    }
    public Pal2(String cast, String ing, String fran){
        this.Cast= cast;
        this.Ing= ing;
        this.Fran= fran;
    }

    public String getIng(){
        return Ing;
    }
    public String getCast(){
        return Cast;
    }
    public String getFran(){
        return Fran;
    }

    @Override
    public String toString() {
        return "Palabras: "+Cast+" "+Ing+" "+Fran;
    }    

}


