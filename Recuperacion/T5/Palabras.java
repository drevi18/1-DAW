public class Palabras {
    private String Cast;
    private String Ing;
    private String Fran;
    
    public Palabras(){
        this.Cast=" ";
    }
    public Palabras(String cast, String ing, String fran){
        this.Cast= cast;
        this.Ing= ing;
        this.Fran= fran;
    }

    public String getIng(){
        return this.Ing;
    }
    public String getCast(){
        return this.Cast;
    }
    public String getFran(){
        return this.Fran;
    }

}
