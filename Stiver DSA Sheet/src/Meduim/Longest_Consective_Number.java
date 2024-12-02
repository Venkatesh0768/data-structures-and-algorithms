package Meduim;

import javax.swing.plaf.metal.MetalTheme;
import java.util.*;

public class Longest_Consective_Number{
    public static void main(String[] args) {
        int arr[] = {1,1,1,2,2,2,3,3,3,4,4,100,100,101,101, 102};
        System.out.println( better_approach(arr));

    }
    static boolean LinearSearch(int a[] , int num){
        for (int i =0; i<a.length; i++){
            if (a[i] == num){
                return true;
            }
        }
        return false;
    }

    public static int longestSuccessiveElements(int []a) {
        int n = a.length;
        int largest =1;

        for (int i =0; i<n; i++){
            int x = a[i];
            int cnt =1;
            while (LinearSearch(a,x+1) ==  true){
                x++;
                cnt++;
            }

            largest = Math.max(largest , cnt);
        }
        return largest;
    }



    private static int better_approach(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        int largest_len= 1;
        int cnt =1;
        int lastSmallest = arr[0];
       for (int i =1;i<n; i++) {
           if (arr[i] -1 == lastSmallest){
               lastSmallest = arr[i];
               cnt++;
           }else if (arr[i] != lastSmallest){
               cnt =1;
               lastSmallest =arr[i];
           }

           largest_len = Math.max(cnt , largest_len );

       }
       return largest_len;
    }

    private static void optimal_approach(int[] arr) {

    }
}