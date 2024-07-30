public class fibonacci_number {
    public static int fibo(int n){
        if(n<0){
            return -1;
        }
        if (n==0) {
            return 0;
        }
        if (n==1) {
            return 1;
        }
        int fa = fibo(n-1) + fibo(n-2);
        return fa;
    }
    public static void main(String[] args) {
        System.out.println(fibo(8));
    }
}
