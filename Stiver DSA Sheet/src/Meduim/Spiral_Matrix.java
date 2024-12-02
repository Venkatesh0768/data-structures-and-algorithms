package Meduim;


import java.util.*;

public class Spiral_Matrix {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3,4} , {5,6,7,8}, {9,10,11,12} , {13,14,15,16} };
        burteForce_approach(arr);
//        better_approach();
//        optimal_approach();

    }

    private static void burteForce_approach(int[][] arr) {
        ArrayList<Integer> a = new ArrayList<>();
        int row = arr.length;
        int col = arr[0].length;
        int top = 0, left = 0, bottom = row - 1, right = col - 1;

        while (top<=bottom && left<= right){
            for (int i = left; i<=right; i++){
               a.add(arr[top][i]);
            }

            top++;

            for (int i =top; i<=bottom; i++){
                a.add(arr[right][i]);
            }
            right--;

           if (top<=bottom){
               for (int i = right; i>=left; i--){
                   a.add(arr[bottom][i]);
               }
               bottom--;
           }
            if (left <= right) {
                for (int i = bottom; i >= top; i--){
                    a.add(arr[i][left]);
                }
                left++;
            }
        }

        System.out.println(a);

    }

    private static void better_approach(int[] arr) {

    }

    private static void optimal_approach(int[] arr) {

    }
}

