public class cgpt2 {
    public static void main(String[] args) {
        
    int []num = {3, 4, 2, 4, 1, 4, 5};
        int numbus= 4, cont=0;
    for (int i=0; i<num.length; i++){
        if (num[i] == numbus){
            cont++;
        }
    }
    System.out.println("El num "+numbus+" aparece "+cont+" veces");
}
}
