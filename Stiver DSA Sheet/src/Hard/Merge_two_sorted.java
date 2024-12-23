package Hard;

import java.util.ArrayList;
import java.util.Arrays;

public class Merge_two_sorted {
    public static void main(String[] args) {
        int a1[] = {1, 2, 3, 0, 0, 0};
        int a2[] = {2, 5, 6};
        merge2(a1, a1.length, a2, a2.length);


    }

    public static void merge2(int[] a1, int m, int[] a2, int n) {
        int temp[] = new int[m+n];
        int left =0;
        int right =0;
        int k =0;
        while (left<a1.length  && right< a2.length){
            if (a1[left] < a2[right]){
                temp[k] = a1[left];
                left++;
            }else {
                temp[k] = a2[right];
                right++;
            }
            k++;
        }

        while (left<m){
            temp[k++] = a1[left++];
        }

        while (right<n){
            temp[k++] = a2[right++];
        }

        System.out.println(Arrays.toString(temp));


    }


    public static void merge(int[] a1, int m, int[] a2, int n) {
        int i = 0;
        while (i < m) {
            int smallest = Integer.MAX_VALUE;
            int k = 0;
            for (int j = 0; j < n; j++) {
                if (smallest > a2[j]) {
                    smallest = a2[j];
                    k = j;
                }

            }

            if (a1[i] > a2[k]) {
                int temp = a2[k];
                a2[k] = a1[i];
                a1[i] = temp;
                i++;
            } else {
                i++;
            }
        }

    }
}
