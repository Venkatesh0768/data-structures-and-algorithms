public class Day1_PascalTriangel {

    //1 Type of the Quesition and this is very Useful
    public static long ncr(int n, int r) {
        long res = 1;
        for (int i = 0; i < r; i++) {
            res = res * (n - i); 
            res = res / (i + 1); 
        }
        return res;
    }


    public static void main(String[] args) {
        System.out.println("THis is Working");
        long res = ncr(7, 2);
        System.out.println(res);
    }
}