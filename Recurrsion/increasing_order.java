public class increasing_order {

    public static void insc(int n ){
        if(n == 1){
            System.out.println(n); 
            return;
        }
        insc(n-1);
        System.out.println(n);

    }
    public static void main(String[] args) {
        insc(10);
    }
}
