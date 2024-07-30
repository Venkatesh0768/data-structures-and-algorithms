public class Descresing_order {
    public static void desc(int n){
        if(n<=0){
            return ; // base case
        }
        System.out.println(n);
        desc(n-1);

    }
    public static void main(String[] args) {
        desc(10);
    }
}   
