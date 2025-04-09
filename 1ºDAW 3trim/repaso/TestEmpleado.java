// Enunciado:
// Cree una clase Empleado y una subclase Encargado. Los encargados reciben un 10% más de sueldo base que un empleado normal. 
// Implemente dichas clases en un paquete sobrescribe y sobrescriba el método getSueldo() para ambas clases. 
// Las variables miembro no pueden ser accesibles desde el exterior.

class Empleado {
    private double sueldoBase;
    
    public Empleado(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public double getSueldo() {
        return sueldoBase;
    }
}

class Encargado extends Empleado {
    
    public Encargado(double sueldoBase) {
        super(sueldoBase);
    }

    @Override
    public double getSueldo() {
        return super.getSueldo() * 1.10; // 10% más que un empleado normal
    }
}

public class TestEmpleado {
    public static void main(String[] args) {
        Empleado emp = new Empleado(3000);
        Encargado enc = new Encargado(3000);

        System.out.println("Sueldo de empleado: " + emp.getSueldo());
        System.out.println("Sueldo de encargado: " + enc.getSueldo());
    }
}