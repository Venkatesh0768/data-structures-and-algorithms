package EASY;

import java.util.Arrays;

public class Merge_Sort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};
        merge_Sort(arr , 0 , arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void merge_Sort(int arr[] , int si , int ei){
        if(si>=ei) return;
        
        int mid = si + (ei -si)/2;
        merge_Sort(arr, si, mid);
        merge_Sort(arr, mid+1, ei);
        merge1(arr, si , mid , ei);
    }

    private static void merge1(int[] arr, int si, int mid, int ei) {

        int[] temp = new int[ei -si +1];
        int i =si;
        int j = mid+1;
        int k =0;

        while (i<=mid && j <=ei){
            if (arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            }else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i<=mid){
            temp[k++] = arr[i++];

        }
        while (j <=ei){
            temp[k++] = arr[j++];

        }


        for (k =0, i=si; k< temp.length; k++, i++){
            arr[i] = temp[k];
        }
    }

    static int[] merge_Sort(int arr[]){
       if (arr.length==1){
           return arr;
       }
       int mid = arr.length/2;
       int[] left = merge_Sort(Arrays.copyOfRange(arr,0 ,mid));
       int[] right = merge_Sort(Arrays.copyOfRange(arr , mid , arr.length));

       return merge(left, right);
    }

    private static int[] merge(int[] left ,int[] right) {
        int mix[] = new int[left.length+ right.length];
        int i =0;
        int j =0;
        int k =0;

        while (i<left.length && j < right.length){
            if (left[i] < right[j]){
                mix[k] = left[i];
                i++;
            }else {
                mix[k] = right[j];
                j++;
            }
            k++;
        }

        while (i<left.length){
            mix[k++] = left[i++];

        }
        while (j <right.length){
            mix[k++] = right[j++];

        }
        return mix;
    }
}
