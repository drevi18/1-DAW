public class ejerclase {
    public static void main(String[] args) {
        double datoBus=3.5;
        double notas[]={4.5,3.5,7.9,2.8};
        String nombres[]={"Juan", "Pepe","Maria","Mónica"};
        int pas;
        final int NUM=5;

        pas= busquedadeDesordenado(notas,NUM,datoBus);
        if(pas<0){
            System.out.println("Dato no encontrado");
        }else 
            System.out.println("El dato "+datoBus+" esta en la posición "+pas);
            System.out.println("La persona con nota "+datoBus+" es "+nombres[pas]);
    }
    public static int busquedadeDesordenado(double []v,int n,double dato){
        boolean encontrado=false;
        int i=0,pos=-1;
        int alum=0;
        while (i<n&&pos==-1&&dato<=v[i]) {
            if (dato==v[i]) {
                pos=i;
            }else  
            i++;
            
        }
        return pos; 
    }
}
