package EASY;

import java.util.Arrays;

public class Quick_sort {
    public static void main(String[] args) {
        int[] arr = {4,3,2,5,1,7,9};
        quick_sort(arr, 0 , arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
    static void quick_sort(int[] arr , int low , int high){
        if (low < high){
            int pIdx = Partition(arr, low , high);
            quick_sort(arr, low , pIdx -1);
            quick_sort(arr , pIdx+1 , high);
         }
    }

    private static int Partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low -1;

        for (int j =low; j<high; j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i;



    }
}
