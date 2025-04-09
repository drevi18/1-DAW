package imp;

public class Empleado {
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String fechaNacimiento;
    private double sueldoBase;

    public Empleado(String nombre, String primerApellido, String segundoApellido, String fechaNacimiento, double sueldoBase) {
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.fechaNacimiento = fechaNacimiento;
        this.sueldoBase = sueldoBase;
    }

    public double getSueldo() {
        return sueldoBase;
    }

    public String getNombreCompleto() {
        return nombre + " " + primerApellido + " " + segundoApellido;
    }
}
