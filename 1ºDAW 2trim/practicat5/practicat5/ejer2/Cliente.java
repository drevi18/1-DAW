package practicat5.ejer2;

public class Cliente {
    protected String nom;
    protected String ap;
    protected int telf;


    public Cliente(){
        nom=" ";
        ap=" ";
        telf=0;

    }
    public Cliente(String nom, String ap, int telf){
        this.nom=nom;
        this.ap=ap;
        this.telf=telf;

    }

    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
