public class sum_of_natural_number {
    public static int natural_number(int n){
        if (n<0) {
            return 0;
        }
        int n11 = natural_number(n-1);
        return n +  n11;
    }
    public static void main(String[] args) {
        System.out.println(natural_number(3));
    }
}
