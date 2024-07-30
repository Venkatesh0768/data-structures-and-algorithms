public class Problem9 {
    public static int P9(int x, int power) {
        if (power == 0) {
            return 1;

        }
        return x * P9(x, power - 1);

    }

    public static void main(String[] args) {
        System.out.println(P9(2, 10));
    }
}
