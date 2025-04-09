import java.util.Vector;

public class ContenedorOrdenado<T> {
    private Vector<T> datos;

    
    public ContenedorOrdenado() {
        datos = new Vector<T>();
    }

    
    public ContenedorOrdenado(int cap) {
        datos = new Vector<T>(cap);
    }

    
    private boolean contenedorLleno() {
        return datos.size() == datos.capacity();
    }

    public void anyadeDatoOrdenado(T dato) {
        if (dato instanceof Comparable) {
            int i = 0;
            while (i < datos.size() && ((Comparable<T>) dato).compareTo(datos.get(i)) > 0) {
                i++;
            }
            datos.add(i, dato);
        } else {
            datos.add(dato); 
        }
    }
    
    

    
    public T getDatoPos(int pos) {
        if (pos >= 0 && pos < datos.size()-1) {
            return datos.elementAt(pos);
        }
        return null; 
    }

    
    public void eliminarDato(T dato) {
        datos.remove(dato);
    }

    
    public int numElementos() {
        return datos.size();
    }

    
    public boolean buscarDato(T dato) {
        return datos.contains(dato);
    }

    
    public int buscarDatoPos(T dato) {
        return datos.indexOf(dato)+1;
    }

    @Override
    public String toString() {
        return "ContenedorOrdenado [datos=" + datos + "]";
    }
}
