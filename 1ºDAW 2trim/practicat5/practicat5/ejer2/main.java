package practicat5.ejer2;

// Autor: Sara

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);
        ArrayList<Socio> socio= new ArrayList<>();
        ArrayList<Curso> curso= new ArrayList<>();

        Socio s= new Socio();
        Socio comps= new Socio();
        Curso c= new Curso();
        Curso compc= new Curso();


        boolean comp=true;
        int menu, totalcurs=0;


        do { 
            System.out.println("[0] Salir");
            System.out.println("[1] Registrar socio");
            System.out.println("[2] Registrar curso");
            System.out.println("[3] Inscribir un socio en un curso");
            System.out.println("[4] Mostrar listado alfabético de socios");
            System.out.println("[5] Mostrar listados cursos");
            menu=tec.nextInt();

            switch (menu) {
                case 1:
                String nom,ap,dirc;
                int telf;
                    System.out.println("Introduce el nombre de la persona ");
                    nom=tec.nextLine();
                    tec.nextLine();
                    System.out.println("Introduce el apellido de la persona ");
                    ap=tec.nextLine();
                    System.out.println("Introduce la dirección");
                    dirc=tec.nextLine();
                    System.out.println("Introduce el teléfono de la persona ");
                    telf=tec.nextInt();
                    
                    s=new Socio(nom,ap,telf,dirc);
                    socio.add(s);
                    break;
                case 2:
                String no;
                int cant, dia, mes;
                    System.out.println("Introduce el nombre del curso ");
                    no=tec.nextLine();
                    tec.nextLine();
                    System.out.println("Introduce las plazas del curso ");
                    cant=tec.nextInt();
                    System.out.println("Introduce el día que empieza ");
                    dia=tec.nextInt();
                    System.out.println("Introduce la mes del curso ");
                    mes=tec.nextInt();
                    
                    c= new Curso(no, cant,dia,mes);
                    curso.add(c);
                    break;


                case 3:
                    String ns,nc;
                    int auxsoc=0,auxcur=0, di, me;

                    System.out.println("A que socio quieres inscribir?");
                    ns=tec.nextLine();
                    tec.nextLine();

                    for (int i = 0; i < socio.size(); i++) {
                        comps=socio.get(i);
                        
                        if (ns.equals(comps.getNom())) {
                        System.out.println("Socio "+ns+" esta en la posición "+i);
                        auxsoc=i;
                        } else
                        System.out.println("Ese socio no está registrado");
                        }

                    System.out.println("A que curso quieres inscribir a "+ns);
                    nc=tec.nextLine();

                    for (int j = 0; j < curso.size(); j++) {
                        compc=curso.get(j);
                        
                        if (nc.equals(compc.getNom())) {
                        System.out.println("Curso "+nc+" esta en la posición "+j);
                        System.out.println("Introduce que día es hoy");
                        di=tec.nextInt();
                        System.out.println("Introduce a que mes estámos");
                        me=tec.nextInt();
                            if(c.getMes()>me&&c.getDia()>di&&totalcurs<compc.getPlaz())
                                System.out.println("La fecha es correcta, se puede apuntar");
                                auxcur=j;
                                totalcurs++;
                            } else
                            System.out.println("Este curso empieza antes, no puedes registrate");
                    }

                    socio.get(auxsoc).AñadirCur(curso.get(auxcur));
                    curso.get(auxcur).AñadirSocio(socio.get(auxsoc));

                    break;
                case 4:

                    s.ToString();

                    break;
                case 5:
                    c.toString();
                    break;
            
                default:
                System.out.println("Adiós");
                    comp=false;
                    break;
            }
        } while (comp==true);
    }
}
