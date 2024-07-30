public class factorial {
    public static int fact(int n){
        if (n==1) {
            return 1;
        }
        int fa = fact(n-1);

        return n* fa;
        
        

    }
    public static void main(String[] args) {
        System.out.println(fact(5));
    }
}
