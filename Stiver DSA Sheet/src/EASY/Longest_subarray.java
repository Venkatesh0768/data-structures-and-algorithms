package EASY;

public class Longest_subarray {


    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 1, 1, 1, 1, 4, 2, 3};

        int n = arr.length;
        int maxlen =0;
        int k =3;
        for (int i = 0; i < n; i++) {
            int sum = 0; int len =0;
            for (int j = 0; j < n; j++) {
                sum = sum + arr[j];
               len = j-i+1;
            }
          if (maxlen < len){
              if (sum == k){
                  maxlen = Math.max( maxlen, len);
              }
          }

        }
        System.out.println(maxlen);

        System.out.println(lenOfLongestSubarr(arr , k));
    }

    public static int lenOfLongestSubarr(int[] arr, int k) {
        //optimal
        int right =0, left =0;
        long sum =0;
        int maxlen =0;
        int n = arr.length;


        while(right <n){
            sum += arr[right];

            while(left <=right && sum > k){
                sum -= arr[left];
                left++;
            }

            if(sum ==k) {
                maxlen = Math.max(maxlen , right - left + 1);
            }

            right++;

        }

        return maxlen;
    }
}
