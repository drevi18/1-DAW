// Enunciado:
// El método x() tiene que devolver un entero pero da problemas al compilar. Reescriba el método utilizando un wrapper Double. 
// int dato; ... 
// public int metodox(){ return dato*1.1; }

public class Metodox {
    private Double dato;

    public Metodox(Double dato) {
        this.dato = dato;
    }

    public int metodox() {
        return (int)(dato * 1.1); // Convertimos el resultado a entero
    }

    public static void main(String[] args) {
        Metodox obj = new Metodox(100.0);
        System.out.println("Resultado de metodox: " + obj.metodox());
    }
}

