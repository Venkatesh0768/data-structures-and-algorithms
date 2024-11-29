public class square_root {

    public static int Square_r(int x){
        int start =0;
        int end = x;
        while (start < end) {
            int mid = (start +end)/2;
            if (mid *mid == x) {
                return mid;
            }
            else if (mid < x) {
                start++;
    
            }else{
                 end++;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(Square_r(9));
    }
}
