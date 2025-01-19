package EASY;

import java.util.Arrays;

public class Leetcode {
    public static void bubbleSort(int arr[]) {
        for(int i =0; i<arr.length-1; i++){
            boolean swaped = false;
            for(int j =0; j< arr.length-i -1; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] =arr[j+1];
                    arr[j+1] = temp;
                    swaped = true;

                }
            }
            if (swaped == false) break;

        }

    }

    static void  inserationSort(int arr[]){
        for(int i =0; i<arr.length-1; i++){
            int j =i;
            while (j>0 && arr[j-1] > arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }

    public static int getSecondLargest(int[] arr) {
        int secondLargest = -1;
        int largest = arr[0];

        for(int i =1; i<arr.length; i++){
           if(arr[i] > largest){
               secondLargest =largest;
               largest = arr[i];
           } else if (arr[i] < largest && arr[i] > secondLargest) {
               secondLargest = arr[i];
           }
        }

        return secondLargest;
    }
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        int h = n-k;
        int j =0;
        int temp[] = new int[nums.length];

        for(int i =h; i< nums.length; i++){
            temp[j]= nums[i];
            j++;
        }
        for(int r =0; r<=k; r++){
            temp[j]= nums[r];
            j++;
        }

        for(int i=0; i< temp.length; i++){
            nums[i] = temp[i];
        }

    }

    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5,6,7};
        rotate(arr, 3);
        System.out.println(Arrays.toString(arr));
        System.out.println( getSecondLargest(arr));



     }


}