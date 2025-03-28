

public class ejerciciotablas {
    public static void main(String[] args) {

    
        int i,num;
    /*    Scanner tec= new Scanner(System.in);
    do { 
        System.out.println("Inroduce un número para mostrar su tabla de multiplicar: ");
        num= tec.nextInt();
    } while (num<1||num>10);*/
    
    for(num=0; num<=10; num++){

        System.out.println();
        System.out.println("Tabla del: "+num);
        System.out.println();
        
        for(i=0; i<=10; i++){
            int mult= i*num;
            System.out.println(num+"*"+i+"="+mult);
        }
        }     
    }
}