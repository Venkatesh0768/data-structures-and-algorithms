package EASY;

import java.util.HashMap;

public class Majority {
    static int majorityElement2(int[] arr) {
        int cnt = 0;
        int el = 0;
        for (int i = 0; i < arr.length; i++) {
            if (cnt == 0) {
                cnt = 1;
                el = arr[i];
            } else if (arr[i] == el) {
                cnt++;
            } else {
                cnt--;
            }
        }
        int cnt1 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == el) cnt1++;
        }
        if (cnt1 > arr.length / 2) {
            return el;
        }
        return -1;
    }
    public static int majorityElement(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        System.out.println(map);

        int majority = 0;
        for (int i = 0; i < map.size(); i++) {
            if (map.containsKey(arr[i])) {
                if (map.get(arr[i]) % 2 == 0) {
                    majority = arr[i];
                }
            }
        }

        System.out.println(map.size());

        return majority;

    }
    static int sum_MaxSubArray(int arr[]){
        int ms =arr[0];
        int cs = arr[0];

        for(int i =1; i<arr.length; i++){
            cs = Math.max(arr[i] , arr[i] + cs);
            ms = Math.max(cs ,ms);
        }

        return ms;
    }

    public static void main(String[] args) {
        int arr[] = {2,2,1,1,1,2,2};
        System.out.println(majorityElement2(arr));
    }
}
