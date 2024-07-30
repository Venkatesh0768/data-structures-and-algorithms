public class Tiling_problem {


    public static int Tiling_11(int n){
        if(n==0 || n==1 ){
            return 1;
        }
        int vertical = Tiling_11( n -1);
        int Horizontal =Tiling_11( n -2);

        return vertical + Horizontal;
    }

    public static void main(String[] args) {
        int n = 5 ;
        System.out.println(Tiling_11(n));
    }
}
