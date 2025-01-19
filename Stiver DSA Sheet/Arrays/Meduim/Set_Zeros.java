package Meduim;

import java.util.*;

public class Set_Zeros {
    public static void main(String[] args) {
        int arr[][] = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        int arr2[][] = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        burteForce_approach(arr2);


    }

    static void printArray2D(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }


    private static void burteForce_approach(int[][] arr) {
        int n = arr.length;
        int row[] = new int[arr.length];
        int col[] = new int[arr[0].length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 0) {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }
        //row Filling
        for (int i = 0; i < row.length; i++) {
            if (row[i] == 1) {
                for (int j = 0; j < arr.length; j++) {
                    arr[i][j] = 0;
                }
            }
        }

        //columns Filling the Arrary
        for (int i = 0; i < col.length; i++) {
            if (col[i] == 1) {
                for (int j = 0; j < arr.length; j++) {
                    arr[j][i] = 0;
                }
            }
        }

    }


    private static void better_approach(int[] arr) {

    }

    private static void optimal_approach(int[] arr) {

    }
}
