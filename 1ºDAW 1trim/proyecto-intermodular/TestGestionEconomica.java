import java.util.Scanner;

public class TestGestionEconomica {
    public static void main(String[] args) {
        Scanner tec=new Scanner(System.in);

        
        System.out.println("Inrtroduce el cotrato de la empresa");
        String contrato=tec.next();
        System.out.println("Inrtroduce la fecha de firma del comtrato de la empresa");
        int fecha=tec.nextInt();
        Empresas emp= new Empresas(fecha,contrato);
        

        System.out.println("   ");
        System.out.println("   ");
        System.out.println("   ");
        
        System.out.println("El contrato "+emp.getContratos()+" fué firmado el "+emp.getFirmados());

        System.out.println("   ");
        System.out.println("   ");
        System.out.println("   ");

        System.out.println("Introduce en que estado está el recibo ");
        System.out.println("[1] Pagado ");
        System.out.println("[2] Devuelto");
        System.out.println("[3] Pendiente");
        byte estadorecibo=tec.nextByte();
        Recibos rec= new Recibos(estadorecibo);

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        
        System.out.println("El esatdo del recibo es: "+rec.getTipo());

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        
        System.out.println("Introduce el código de la comunidad");
        int codcom=tec.nextInt();
        System.out.println("Introduce el DNI del propietario, sin la letra");
        int DNI=tec.nextInt();
        System.out.println("Introduce el banco donde está asociada la cuenta de la comunidad");
        String banco=tec.next();
        Comunidad com= new Comunidad(codcom);
        Propietario prop= new Propietario(DNI);
        Cuentas cuent= new Cuentas(banco);

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        
        System.out.println("El propietario "+prop.getDNI()+" de la comunidad "+com.getCodigo()+" tiene asociado el banco "+cuent.getBancos());

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        
        System.out.println("Introduce la fecha de la cuota");
        int fechacuota=tec.nextInt();
        System.out.println("Introduce como se encuentra la cuota");
        System.out.println("[1] Pagado");
        System.out.println("[2] Devuelto");
        System.out.println("[3] Pendiente");
        byte estcuota=tec.nextByte();
        Cuotas cuot=new Cuotas(fechacuota, estcuota);
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        
        System.out.println("La cuota con fecha "+cuot.getFecha()+" su estado es "+cuot.getTipo());
    }
}
