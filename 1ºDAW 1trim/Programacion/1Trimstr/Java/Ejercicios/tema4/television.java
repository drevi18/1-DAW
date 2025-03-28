public class television extends Dispositivo implements Conectividad{
    private int volumen;
    @Override
    public void encender() {
        System.out.println("Televisión encendida");
    }

    @Override
    public void apagar() {
        System.out.println("Televisión apagada");
    }

    @Override
    public void conectarWifi() {
        System.out.println("Televisión conectada");
    }

    @Override
    public void desconectarWifi() {
        System.out.println("Televisión desconectada");
    }
    
    public void getvolumen(int volumen){
        switch (volumen) {
            case 1:
            System.out.println("Sin volumen");
            break;
            case 2:
            System.out.println("Volumen bajo");
            break;
            case 3:
            System.out.println("Volumen normal");
            break;
            case 4:
            System.out.println("Volumen alto");
            break;
        }
    }

}
