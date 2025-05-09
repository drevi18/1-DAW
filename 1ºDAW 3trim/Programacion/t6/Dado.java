public class Dado extends Sorteo {

    @Override
    public int lanzar() {
        int num = (int)(Math.random()*6)+1;
        return num;
    }
    
}
