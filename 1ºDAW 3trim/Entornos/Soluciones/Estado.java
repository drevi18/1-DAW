public interface Estado {
    public Estado siguiente();
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
}

public class Metro {
    private Estado estado;

    public void cambiaEstado() {
        if (estado instanceof Parado) {
            estado = estado.siguiente();
        } else if (estado instanceof EnMarcha) {
            estado = estado.siguiente();
        } else if (estado instanceof Parado) {
            estado = Parado.getInstance();
        } else if (estado instanceof Arrancando) {
            estado = estado.siguiente();
        } else {
            throw new RuntimeException("Estado desconocido");
        }
    }
}