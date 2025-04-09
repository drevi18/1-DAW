package practicat5.ejer2;

import java.util.ArrayList;

public class Curso {
    private String nom;
    private int plaz;
    private  int dia;
    private  int mes;
    ArrayList<Socio> s= new ArrayList<>();


    public Curso(){
        nom=" ";
        plaz=0;
        dia=0;
        mes=0;
    }
    public Curso(String nom, int plaz, int dia, int mes){
        this.nom=nom;
        this.plaz=plaz;
        this.dia=dia;
        this.mes=mes;
    }

    public int getPlaz() {
        return plaz;
    }

    public void setPlaz(int plaz) {
        this.plaz = plaz;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int hora) {
        this.mes = hora;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void AñadirSocio(Socio socio){
        this.s.add(socio);
     }

     
    public void ToString(){
        for (int i = 0; i < s.size(); i++) {
            
            System.out.println("El nombre "+nom+" las plazas máximas "+plaz+" el día que empieza "+dia+" del mes "+mes+" socios que están inscritos"+s.get(i));
        }
    }
}
