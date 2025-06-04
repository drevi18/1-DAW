public abstract  class Mascarillas implements Interfaz{
    protected float precio;

    public Mascarillas(){
        this.precio=0;
    }

    public Mascarillas(int precio){
        super();
        this.precio= precio;

    }

    public float GetPrecio(){
        return this.precio;
    }
}
