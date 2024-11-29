public class knapsack0_1 {
    public static int knapsack(int val[] , int  wt[] , int w, int n , int dp[][]){
        if (w == 0 || n ==0) {
            return 0;
        }

        if (dp[n][w] != -1)  {
            return dp[n][w];
        }
        if (wt[n-1] <= w) { // valid condition
            //Include Condition
            int ans1 = val[n-1] + knapsack(val, wt, w-wt[n-1], n -1 ,dp);

            //Exclude Condition
            int ans2 = knapsack(val, wt, w, n-1 , dp);
            dp[n][w] = Math.max(ans1, ans2);
            return dp[n][w];
        }else{
            dp[n][w] = knapsack(val, wt, w, n-1 , dp);
            return dp[n][w];

        }
    }

    public static int knapsackTabulation(int val[] , int  wt[] , int W){
        int n  = val.length;
        int[][] dp = new int[n+1][W+1];

        for(int i =0; i<n+1; i++){
            dp[i][0] =0;
        }

        for(int i =0; i<W+1; i++){
            dp[0][i] =0;
        }

        for(int i =1; i<n+1; i++){
            for(int j=1; j<W+1; j++){
                int v = val[i-1];
                int w= wt[i-1];

                if (w <= j) {
                    int incprofit = v + dp[i-1][j-w];
                    int excprofit = dp[i-1][j];
                    int maxP = Math.max(incprofit, excprofit);
                    dp[i][j] = maxP;
                }else{
                    int minp =dp[i-1][j];
                    dp[i][j] = minp;
                }
            }
        }

        return dp[n][W];
       
       
           
    }
    public static int Change_the_number(int coins[] , int sum){
        int n = coins.length;
        int dp[][] = new int[n+1][sum+1];

        for(int i =0; i<n+1; i++){
            dp[i][0]= 1;
        }

        for(int i =0; i<sum+1; i++){
            dp[0][i]= 0;
        }

        for(int i =1; i< n+1; i++){
            for(int j=1; j<sum+1; j++){
                if (coins[i-1] <= j) {
                    dp[i][j] = dp[i][j -coins[i-1]] + dp[i-1][j];
                }else{
                    dp[i][j] =  dp[i-1][j];
                }
            }
        }

        return dp[n][sum];
    }
    public static void main(String[] args) {

        // int coins[] = {1,2,3};
        // int sum =4;
        // System.out.println(Change_the_number(coins, sum));

        int val[] ={3,4,5,6};
        int wt[] ={2,3,3,4 ,5};
        int w =5;

        System.out.println(knapsackTabulation(val, wt, w));
        

    }
}
