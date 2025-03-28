import java.util.Scanner; 
public class chatgpt4 { 
  public static void main(String[] args) { 
      Scanner tec= new Scanner(System.in); 
     
  //Escribe un programa que calcule el salario semanal de un trabajador 
  //dado el número de horas trabajadas y el salario por hora. Si el trabajador 
  //trabaja más de 40 horas, se le pagarán las horas adicionales al 50% más del valor por hora. 
  //Entrada: horas trabajadas y salario por hora 
  //Proceso: calcular salario semanal + horas extra 
  //salida: salario semanal 
     
  int horasTrabajadas, salarioHora; 
    System.out.println("Introduce las horas trabajadas esta semana: "); 
    horasTrabajadas= tec.nextInt(); 
    System.out.println("Introduce el salario por hora: "); 
    salarioHora= tec.nextInt(); 
   
     float horasExtra= Math.max(0,horasTrabajadas-40); 
     float salarioExtra=horasExtra * salarioHora*1.5f; 
     float salarioBase= (horasTrabajadas-horasExtra)*salarioHora; 
       System.out.println("Salario semanal"); 
       System.out.println((horasTrabajadas>40)? salarioExtra+salarioBase :salarioBase );
    } 
     }
     
