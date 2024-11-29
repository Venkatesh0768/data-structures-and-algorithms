package EASY;

import java.util.ArrayList;
import java.util.Arrays;

public class pattern {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};
        int n = arr.length;

        bubble_Sort(arr, n - 1, 0);
        System.out.println(Arrays.toString(arr));

    }

    static void patternProblem(int row, int col) {
        ArrayList<Integer>  a = new ArrayList<>();
        if (row == 0) return;

        if (row == col) {
            System.out.println();
            patternProblem(row -1, 0);
        } else {
            System.out.print("*" + " ");
            patternProblem(row, col + 1);
        }

    }

    static void bubble_Sort(int arr[] , int r , int c){
        if (r == 0) return;
        if (c<r){
            if (arr[c] > arr[c+1]){

                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }

            bubble_Sort(arr, r, c+1);
        }else {
            bubble_Sort(arr, r-1, 0);
        }


    }

}
