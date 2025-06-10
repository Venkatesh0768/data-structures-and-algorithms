public class Buy_And_Sell_Stocks {
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
        
    }

    static int maxProfit(int[] stocks) {
        int n = stocks.length;

        int[] RightMax = new int[n];
        RightMax[n-1] = stocks[n-1];
        for(int i =n-2; i>=0; i--){
            RightMax[i] = Math.max(RightMax[i+1],stocks[i]);
        }

        int  maxProfit =0;
        for(int i =0; i<stocks.length; i++){
            int profit = RightMax[i] -stocks[i];
            maxProfit = Math.max(maxProfit, profit);
        }

        return maxProfit;
    }
}
