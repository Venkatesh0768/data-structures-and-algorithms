package Meduim;

import java.util.ArrayList;
import java.util.Arrays;

public class Array_Leaders {

    public static void main(String[] args) {
        int arr[] ={10 , 22, 12, 3, 0, 6};
        burteForce_approach(arr);
        System.out.println(optimal_approach(arr));

    }

    private static void burteForce_approach(int[] arr) {
        ArrayList<Integer> a = new ArrayList<>();
        int n =arr.length;

        for(int i =0; i<n; i++){
            boolean flag = true;
            for(int j =i+1; j<n; j++){
                if(arr[i] < arr[j]){
                    flag = false;
                }
            }
            if (flag == true) a.add(arr[i]);
        }

        System.out.println(a);
    }
    private static ArrayList<Integer> optimal_approach(int[] arr) {
        ArrayList<Integer> a = new ArrayList<>();
        int n =arr.length;
        int max_value = Integer.MIN_VALUE;
        int count = arr[n-1];

        for(int i =n-2; i>=0; i--){
            if(arr[i] > count){
                a.add(count);
                count = arr[i];
            }
        }
        a.add(count);

        for (int i = 0; i < a.size() / 2; i++) {
            Integer temp = a.get(i);
            a.set(i, a.get(a.size() - i - 1));
            a.set(a.size() - i - 1, temp);
        }


        return a;
    }
}
