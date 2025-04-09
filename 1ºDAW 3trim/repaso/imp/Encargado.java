package imp;

public class Encargado extends Empleado {

    public Encargado(String nombre, String primerApellido, String segundoApellido, String fechaNacimiento, double sueldoBase) {
        super(nombre, primerApellido, segundoApellido, fechaNacimiento, sueldoBase);
    }

    @Override
    public double getSueldo() {
        return super.getSueldo() * 1.10;
    }
}

