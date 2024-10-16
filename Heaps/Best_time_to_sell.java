public class Best_time_to_sell {
    public static void main(String[] args) {
        int stocks[] = {7,1,5,3,6,4};

        // rightmax
        int[] RightMax = new int[stocks.length];
        int n = stocks.length;
        RightMax[n - 1] = stocks[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            RightMax[i] = Math.max(RightMax[i + 1], stocks[i]);
        }
        // Printarrray(RightMax);


        int max = Integer.MIN_VALUE;

        for(int i =0; i<stocks.length; i++){
            int best_time = RightMax[i] - stocks[i];

            if (best_time >  max) {
                max = best_time;
            }
        }

        System.out.println(max);

    }
    
    public static void Printarrray(int arr[]){
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
