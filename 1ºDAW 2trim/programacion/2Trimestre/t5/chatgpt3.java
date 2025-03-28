import java.util.ArrayList;
import java.util.Scanner;

class Persona{
    private String nombre;
    private int edad;

    public Persona(){
        nombre=" ";
        edad=0;
    }
    public Persona( String nom, int ed){
        this.nombre=nom;
        this.edad=ed;
    }

    public void Mostrar(){
        System.out.println("Nombre "+nombre+" edad "+edad);
    }

}

public class chatgpt3 {
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);

        ArrayList<Persona> p= new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            System.out.println("Inroduce el nombre");
            String n=tec.nextLine();
            System.out.println("Inroduce la edad");
            int e=tec.nextInt();
            tec.nextLine();

            p.add (new Persona(n,e));
        }

        for (int i = 0; i < p.size(); i++) {
            p.get(i).Mostrar(); 
        }
    }
}