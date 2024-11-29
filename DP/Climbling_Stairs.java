public class Climbling_Stairs {
    public static int Climb_stairs(int n, int f[]) {

        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        if (f[n] != -1) {
            return f[n];
        }

        f[n] = Climb_stairs(n - 1, f) + Climb_stairs(n - 2, f);
        return f[n];
    }

    public static int fibTabulation(int n) {
        int dp[] = new int[n + 1];
        dp[0] = 1;

        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                dp[i] = dp[i - 1];
            } else {
                dp[i] = dp[i - 1] + dp[i - 2];
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(fibTabulation(n));
        int f[] = new int[n + 1];
        System.out.println(Climb_stairs(n, f));
    }
}
