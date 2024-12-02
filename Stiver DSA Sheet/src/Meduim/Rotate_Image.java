package Meduim;

import java.util.*;

public class Rotate_Image {
    public static void main(String[] args) {
        int arr[][] = {{5,1,9,11}, {2,4,8,10}, {13,3,6,7} ,{15,14,12,16}};
//        burteForce_approach(arr);
//        better_approach(arr);
        optimal_approach(arr);

    }

    static void printArray2D(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void burteForce_approach(int[][] arr) {
      int n = arr.length;
      int temp[][] = new int[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
               temp[j][n-i-1] = arr[i][j];
            }
        }
        printArray2D(temp);
    }

    private static void better_approach(int[][] arr) {



    }
    private static void optimal_approach(int[][] arr) {
        //arr -> transpose -> reverse

        //transpose
        int n = arr.length;

        for (int i =0; i<n; i++){
            for (int j = i + 1; j < n; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        printArray2D(arr);
        System.out.println();

        int row = arr.length;
        int col = arr[0].length;

        for (int i =0; i<row; i++){
            int start = 0;
            int end = col -1;
            while (start < end){
                int temp = arr[i][start];
                arr[i][start] = arr[i][end];
                arr[i][end] = temp;
                start++;
                end--;
            }
        }

        printArray2D(arr);
    }
}
