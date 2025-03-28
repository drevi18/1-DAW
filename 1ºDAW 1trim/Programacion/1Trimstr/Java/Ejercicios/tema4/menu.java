import java.util.Scanner;

public class menu{
    public static void main(String[]args){
        Scanner tec = new Scanner(System.in);


        System.out.println("Dime que quieres hacer");
        System.out.println("[] ");
        System.out.println("[] ");
        int x= tec.nextInt();

        while (x!=0) {
            
            switch (x) {
                case 1:
                    
                    break;
                case 2:

                    break;

                case 3:

                    break;
                case 4:

                    break;
                default:
                    break;
            }

            
            
            
            System.out.println("Dime que quieres hacer \n0. \n1. \n2. \n3. \n4.");
            System.out.println("Que quieres hacer?");
             x= tec.nextInt();
        }
    }
}
