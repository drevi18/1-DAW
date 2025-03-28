

public class ejer12 {
    public static void main(String[] args) {
        
        System.out.println(maximocomun(24, 62));
        System.out.println(maximocomun(50, 75));
        System.out.println(maximocomun(75, 50));
        System.out.println(maximocomun(40, 20));
    }

    public static int maximocomun(int n1, int n2) {
        int resultado;
        
        if (n1%n2 ==0) {
            resultado = n2;
        } else {
            resultado = maximocomun(n2, n1%n2);
        }
        return resultado;
}
}
