
import java.util.Scanner;

public class R1
{
 public static double basis(double base){
 return base*10; //40 horas * 10 dolares la hora
 }
 public static double extra(double base){
 return (base-40)*10; // horas extras * 10 dolares la hora
 }
 //Problema: antes de refactorizar
 public static void main(String []args)
 {
 Scanner tec = new Scanner(System.in);
 final byte TEXAS = 0;
 final double TX_RATE = 0.9; //modificación sueldo base
 final byte OHIO = 1;
 final double OH_RATE = 1;//modificación sueldo base
 final byte MAINE = 2;
 final double MN_RATE = 1.1;//modificación sueldo base
 byte state;
 double rate, calc=0, amt,
 base=40, //40 horas semanales
 points=0; //punto conseguidos

 do{
 System.out.print("Indique su estado (0=TEXAS, 1=OHIO, 2=MAINE):");
 state=tec.nextByte();
 }while (state!=TEXAS && state!=OHIO && state!=MAINE);

 if (state == TEXAS) {
 rate = TX_RATE;
 amt = base * TX_RATE;
 calc = 2*basis(amt) + extra(amt)*1.05;
 }
 else if ((state == OHIO) || (state == MAINE)) {
 rate = (state == OHIO) ? OH_RATE : MN_RATE;
 amt = base * rate;
 calc = 2*basis(amt) + extra(amt)*1.05;
 if (state == OHIO) {
 points = 2;
 }
 else {
 rate = 1;
 amt = base;
 calc = 2*basis(amt) + extra(amt)*1.05;
 }
 }
 System.out.println("Sueldo=" + calc + " Puntos= " + points);
 } 
}
