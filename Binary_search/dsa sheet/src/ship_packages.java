public class ship_packages {
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5,6,7,8,9,10};
        int days = 5;
        System.out.println(shipWithinDays(arr , days));
    }
    static int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int low = maxi(weights);
        int high = sumOfElements(weights);
        int ans = -1;

        while(low <= high){
            int mid = (high + low)/2;
            if(daysRequired(weights , mid) <= days){
                ans = mid;
                high = mid -1;
            }else{
                low = mid +1;
            }
        }


        return  ans;

    }

    private static int daysRequired(int[] weights, int cap) {
        int load =0;
        int days =1;
        for(int i = 0; i<weights.length; i++){
            if (load + weights[i] > cap) {
                days++;
                load = weights[i];
            }
            else {
                load += weights[i];
            }
        }

        return days;
    }

    static int sumOfElements(int arr[]){
        int sum =0;
        for (int i = 0; i < arr.length ; i++) {
            sum += arr[i];
        }
        return sum;
    }

    static int maxi(int arr[]){
        int low = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length ; i++) {
            low = Math.max(low , arr[i]);
        }
        return  low;
    }
}
