public class Problem13 {
    public static int pair_friends(int n){
        if (n==1 || n==2) {
            return n ;
        }
        int fn1 = pair_friends(n-1);
        int fn2 = pair_friends(n-2);
        int fnn2= (n-1) * fn2;

        return fn1 + fnn2;
    }
    public static void main(String[] args) {
        System.out.println(pair_friends(3));
    }
}
