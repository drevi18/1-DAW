public interface Estado {
    public Estado siguiente();
    public String print();
}

public class Parado implements Estado {
    // Por eficiencia, implementamos ya el patrón singleton
    private static final Parado instance = new Parado();

    public static Parado getInstance() {
        return instance;
    }

    private Parado() {}

    public Estado siguiente() {
        return Arrancando.getInstance();
    }

    public String print() {
        return "Parado";
    }
}

public class Arrancando implements Estado {
    // Por eficiencia, implementamos ya el patrón singleton
    private static final Arrancando instance = new Arrancando();

    public static Arrancando getInstance() {
        return instance;
    }

    private Arrancando() {}

    public Estado siguiente() {
        return EnMarcha.getInstance();
    }

    public String print() {
        return "Arrancando";
    }
}

public class EnMarcha implements Estado {
    // Por eficiencia, implementamos ya el patrón singleton
    private static final EnMarcha instance = new EnMarcha();

    public static EnMarcha getInstance() {
        return instance;
    }

    private EnMarcha() {}

    public Estado siguiente() {
        return Parado.getInstance();
    }

    public String print() {
        return "En Marcha";
    }
}

public class Metro {
    private Estado estado;

    public Metro() {
        estado = Parado.getInstance();
    }

    public String print() {
        return estado.print();
    }

    public void cambiaEstado() {
        estado = estado.siguiente();
    }

    public static void main(String[] args) {
        Metro m = new Metro();

        System.out.println("Estado = " + m.print());
        m.cambiaEstado();
        System.out.println("Estado = " + m.print());
        m.cambiaEstado();
        System.out.println("Estado = " + m.print());
        m.cambiaEstado();
        System.out.println("Estado = " + m.print());
        m.cambiaEstado();
        System.out.println("Estado = " + m.print());
    }
}