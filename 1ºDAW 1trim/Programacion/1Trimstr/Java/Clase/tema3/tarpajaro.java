

public class tarpajaro {
    public static void main(String[] args) {
         
        pajaro p1;

        p1= new pajaro();
        p1.setColor('v');
        p1.setEdad(5);
        
        System.out.println(p1.getColor()+" "+p1.getColorCadena());
        System.out.println(p1.getEdad()+" "+p1.getColorCadena());

        System.out.println(p1.getClass());

        
    }
}
