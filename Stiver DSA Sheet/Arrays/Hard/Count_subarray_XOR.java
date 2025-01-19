package Hard;

import java.util.*;

public class Count_subarray_XOR {
    public static void main(String[] args) {
        int arr[] = {4, 2, 2, 6, 4};
        int b = 6;
//        burteForce_approach(arr, b);
//        better_approach();
        optimal_approach(arr , b);

    }

    private static void burteForce_approach(int[] arr, int b) {
        int n = arr.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum ^= arr[j];
                if (sum == b) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    private static void better_approach(int[] arr) {

    }

    private static void optimal_approach(int[] arr ,int k) {

        int n  = arr.length;
        Map<Integer , Integer> map = new HashMap<>();
        int  cnt =0;
        int xr =0;
        map.put(xr, 1);

        for (int i =0; i< n; i++){
            xr = xr ^arr[i];

            int x = xr ^ k;
            if (map.containsKey(x)){
                cnt += map.get(x);
            }

            if (map.containsKey(xr)){
                map.put(xr, map.get(xr) + 1);
            }else {
                map.put(xr , 1);
            }
        }

        System.out.println(cnt);

    }

}


