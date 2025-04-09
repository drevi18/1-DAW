package practicat5.ejer2;

import java.util.ArrayList;

public class Socio extends Cliente{
    private String dirc;
    ArrayList<Curso> c= new ArrayList<>();

    public Socio(){

    }

    public Socio(String nom, String ap, int telf, String dirc){
        super(nom,ap,telf);
        this.dirc=dirc;
    }

    public void AñadirCur(Curso curso){
       this.c.add(curso);
    }

    public void ToString(){
        for (int i = 0; i < c.size(); i++) {
            
            System.out.println("El nombre "+nom+" el apellido "+ap+" el teléfono "+telf+" la dirección"+dirc+" cursos a los que está inscrito"+c.get(i));
        }
    }
    

}
