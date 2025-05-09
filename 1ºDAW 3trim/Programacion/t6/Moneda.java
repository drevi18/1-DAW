public class Moneda extends Sorteo{
    
    @Override
    public int lanzar() {
        return (int)(Math.random() * 2);
    }
    
}
 