package Hard;

import java.util.*;

public class Longest_subarraySum {
    public static void main(String[] args) {
        int arr[] = {15, -2, 2, -8, 1, 7, 10, 23};
        burteForce_approach(arr);
//        better_approach();
        optimal_approach(arr);

    }

    private static void burteForce_approach(int[] arr) {
        int n = arr.length;
        int maxlen = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i + 1; j < n; j++) {
                sum += arr[j];
                if (sum == 0) {
                    maxlen = Math.max(maxlen, j - i);
                }
            }
        }
        System.out.println(maxlen);
    }

    private static void better_approach(int[] arr) {

    }

    private static void optimal_approach(int[] arr) {
        HashMap<Integer , Integer>  ans = new HashMap<>();
        int n = arr.length;
        int sum =0;
        int maxlen =0;
        for (int i =0; i<n; i++){
            sum +=  arr[i];
            if (sum ==0){
                maxlen = i+1;
            }else {
                if (ans.containsKey(sum)){
                    maxlen = Math.max(maxlen , i - ans.get(sum));
                }else{
                    ans.put(arr[i] , i);
                }
            }
        }

        System.out.println(maxlen);
    }

}