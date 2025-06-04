
import java.util.Scanner;

public class SalarioNeto{
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int parar = 1;
        do { 
            
            System.out.println("Introduce las horas trabajadas");
            int horas = tec.nextInt();
            System.out.println("Introduce a cuanto se cobra cada hora");
            int dinero = tec.nextInt();
            System.out.println(CalHorExtr(horas, dinero));
            System.out.println("Si quieres dejar de introducir datos responde [0]");
            System.out.println("Si quieres seguir introduciendo datos responde [1]");
            parar = tec.nextInt();
            
        } while (parar !=0);
        System.out.println("Chao");
    }


    public static double CalHorExtr(int horas, int dinero){
        int normhor = 38 * dinero, horextr = horas - 38;
        double tarfextr = dinero * 1.5, salariolimp, salarioimp=0;

        if (horextr <= 0) {
            salariolimp = normhor;
        }else {
            salariolimp =  normhor + (horextr * tarfextr);
        }

        if (salariolimp <= 500) {
           salarioimp = salariolimp;
        }else if (salariolimp >=501 && salariolimp<= 900) {
            salarioimp = 500 + (salariolimp - 500) * 0.75;
        }else {
            salarioimp = 500 + 400 * 0.75 + (salariolimp - 900) * 0.55;
        }
        return  salarioimp;
    }
}