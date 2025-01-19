public class smllest_divisior_bs {
    public static void main(String[] args) {
        int arr[] ={44,22,33,11,1};
        int threshold =5;
        System.out.println(smallestDivisor(arr , threshold));
    }
    public static int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length;

        int low =1;
        int high = Integer.MIN_VALUE;

        for(int i =0; i<n; i++){
            high = Math.max(high , nums[i]);
        }
        int ans= -1;

        while(low <= high){
            int mid = (low +high)/2;
            if(divisor(nums, mid)<= threshold){
                ans = mid;
                high = mid -1;
            }else{
                low = mid +1;
            }
        }
        return ans;
    }
    static int divisor(int arr[] , int d){
        int sum =0;
        for (int j : arr) {
            sum += (int) Math.ceil((double) j / d);
        }
        return sum;
    }

//    static int maxi(int arr[]){
//        int maximum = Integer.MAX_VALUE;
//        for (int j : arr) {
//             maximum =  Math.max(maximum , j);
//        }
//        return maximum;
//    }
}