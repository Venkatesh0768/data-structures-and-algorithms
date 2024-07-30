public class Problem10 {
    public static int P10(int x, int n) {
        if (n == 0) {
            return 1;

        }
        int halfSquare  =  P10(x, n/2) * P10(x, n/2);
        if (n %2 != 0) {
            halfSquare = x * halfSquare;
        }
        return halfSquare;
    }

    public static void main(String[] args) {
        System.out.println(P10(2, 1));
    }

}
