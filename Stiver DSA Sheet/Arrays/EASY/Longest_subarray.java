package EASY;

public class Longest_subarray {


    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 1, 1, 1, 1, 4, 2, 3};
        int  k =6;
        System.out.println(Better_approach(arr , k));
    }

    public static int lenOfLongestSubarr(int[] arr, int k) {
       int left =0; int right=0;
       int sum = arr[0];
       int maxlen =0;
       int n = arr.length;

       while (right <n){
           while (sum > k && left<=right){
               sum -= arr[left];
               left++;
           }
           if (sum ==k){
               maxlen = Math.max(maxlen , right - left +1);
           }
           right++;
           if (right < n){
                sum +=arr[right];
           }
       }

       return maxlen;
    }
    static int Better_approach(int arr[] , int k){
        int cnt =0;
        int maxlen =0;
        for (int i =0; i<arr.length; i++){
            int sum =0;
            for (int j =i; j<arr.length; j++){
                sum += arr[i];
                if (sum == k){
                    cnt++;
                    maxlen = Math.max(maxlen , j-i +1);
                }
            }
        }
        return maxlen;
    }

}
