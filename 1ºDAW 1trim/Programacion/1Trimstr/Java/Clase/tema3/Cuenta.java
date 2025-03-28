public class Cuenta {
    private double saldo;

    public Cuenta() {
        saldo = 0.0;
    }

    public Cuenta(double param) {
        saldo = param;
    }

    public boolean reintegro(double param) {
        boolean resultado = false;
        if (param <= saldo) { 
            saldo = saldo - param;
            resultado = true;

        }
        return resultado;
    }

    public void ingreso(double param) {
        saldo = saldo + param;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double param) {
        saldo = param;
    }

    public static class TestCuenta {
        public static void main(String[] args) {
            
            double aux;

            Cuenta a = new Cuenta();
            Cuenta b = new Cuenta(10.5);

            aux = a.getSaldo();
            System.out.println("El saldo de a es: " + aux);
            System.out.println("El saldo de b es: " + b.getSaldo());

            a.ingreso(10);
            b.reintegro(5.5);

            System.out.println("El saldo de a es: " + a.getSaldo());
            System.out.println("El saldo de b es: " + b.getSaldo());
        }
    }
}
