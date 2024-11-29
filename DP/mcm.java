public class mcm {
    public static int mcm1(int arr[], int i, int j, int dp[][]) {
        if (i == j) {
            return 0;
        }
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        int ans = Integer.MAX_VALUE;
        for (int k = i; k <= j - 1; k++) {
            int cost1 = mcm1(arr, i, k, dp);
            int cost2 = mcm1(arr, k + 1, j, dp);
            int cost3 = arr[i - 1] * arr[k] * arr[j];
            int final_res = cost1 + cost2 + cost3;

            ans = Math.min(ans, final_res);

        }

        return dp[i][j] = ans;
    }

    static int mcmTabulation(int arr[]) {
        int n = arr.length;
        int dp[][] = new int[n][n];
    
        for (int L = 2; L < n; L++) { // L is the chain length
            for (int i = 1; i < n - L + 1; i++) {
                int j = i + L - 1;
                dp[i][j] = Integer.MAX_VALUE;
    
                for (int k = i; k <= j - 1; k++) { // k is the split point
                    int cost = dp[i][k] + dp[k + 1][j] + arr[i - 1] * arr[k] * arr[j];
                    dp[i][j] = Math.min(dp[i][j], cost);
                }
            }
        }
    
        return dp[1][n - 1];
    }
    

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 3 };
        int n = arr.length;

        int dp[][] = new int[n][n];

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }
        System.out.println(mcmTabulation(arr));

    }
}
