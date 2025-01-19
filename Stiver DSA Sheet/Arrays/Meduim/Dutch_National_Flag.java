package Meduim;

import java.util.Arrays;

public class Dutch_National_Flag {
    static void  Sortthe(int arr[]){
        int low =0;
        int high = arr.length-1;
        int mid = 0;

        while (mid<=high){
            if (arr[mid] == 0 ){
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] =  temp;
                mid++;
                low++;
            }
            else if (arr[mid] == 1 ){
                mid++;
            }
            else{
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] =  temp;
                high--;

            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,1,1,0,0,0,2,2,2,0,0,0};
        Sortthe(arr);
        System.out.println(Arrays.toString(arr));
    }


}
