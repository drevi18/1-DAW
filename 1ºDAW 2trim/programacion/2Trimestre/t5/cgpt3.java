public class cgpt3 {
    public static void main(String[] args) {
        int [] num= {3, 5, 7, 3, 2, 3, 8};

        int numbus=3;
        for(int i=0; i<num.length;i++){
            if(num[i]==numbus){
                num[i]=0;
            }
            System.out.println(num[i]);
        }
    }
}
