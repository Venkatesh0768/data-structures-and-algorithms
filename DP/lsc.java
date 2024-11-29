public class lsc {
    public static int Longest_subsequence(String str1, String str2, int n, int m, int dp[][]) {
        if (n == 0 || m == 0) {
            return 0;
        }

        if (dp[n][m] != -1) {
            return dp[n][m];
        }

        if (str1.charAt(n - 1) == str2.charAt(m - 1)) {
            return dp[n][m] = Longest_subsequence(str1, str2, n - 1, m - 1, dp) + 1;
        } else {
            int ans1 = Longest_subsequence(str1, str2, n - 1, m, dp);
            int ans2 = Longest_subsequence(str1, str2, n, m - 1, dp);

            return dp[n][m] = Math.max(ans1, ans2);
        }
    }

    public static int lsc(String str1, String str2, int n, int m) {
        int dp[][] = new int[n + 1][m + 1];

        for (int i = 0; i < n + 1; i++) {
            dp[i][0] = 0;
        }

        for (int i = 0; i < m + 1; i++) {
            dp[0][i] = 0;
        }

        for(int i =1; i< n+1; i++){
            for(int j=1; j<m+1; j++){
                if (str1.charAt(n-1) == str2.charAt(m-1)) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                }else{
                    int ans1 =dp[i-1][j];
                    int ans2 = dp[i][j-1];
                    dp[i][j] = Math.max(ans1, ans2);
                }
            }
        }


        return dp[n][m];

    }

    public static void main(String[] args) {
        String str1 = "abcdge";
        String str2 = "ace";

        System.out.println(lsc(str1, str2,  str1.length(), str2.length()));

        // int dp[][] = new int[str1.length() + 1][str2.length() + 1];

        // for (int i = 0; i < dp.length; i++) {
        //     for (int j = 0; j < dp[0].length; j++) {
        //         dp[i][j] = -1;
        //     }
        // }

        // System.out.println(Longest_subsequence(str1, str2, str1.length(), str2.length(), dp));

    }
}
