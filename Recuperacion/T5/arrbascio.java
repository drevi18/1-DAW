
import java.util.ArrayList;
import java.util.Scanner;

public class arrbascio {
    static Scanner tec= new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<String> ciud = new ArrayList<>();

        addCiud(ciud);
        Mostrar(ciud);



    }

    public static void addCiud(ArrayList<String> ciud){
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce un nombre de ciudad ");
            String nom= tec.nextLine();
            ciud.add(nom);
        }
    }

    public static void Mostrar(ArrayList<String> ciud){
        for (int i = 0; i < ciud.size(); i++) {
            System.out.println(ciud.get(i));
        }
    }
}
