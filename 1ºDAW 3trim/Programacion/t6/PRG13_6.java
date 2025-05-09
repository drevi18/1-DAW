public class PRG13_6 {
    public static void main(String[] args) {
        
        
        Dado d = new Dado();
        System.out.println("Lanzando el dado"+" "+ d.lanzar());

        Moneda m = new Moneda();
        System.out.println("Lanzando moneda");
        int res = m.lanzar();
        if(res==0){
            System.out.println("cara");
        }else 
            System.out.println("cruz");
    }
}
