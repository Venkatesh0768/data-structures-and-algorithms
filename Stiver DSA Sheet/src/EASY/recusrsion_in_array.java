package EASY;

import java.util.ArrayList;

public class recusrsion_in_array {
    public static void main(String[] args) {
        int arr[]= {1,3,4,4,7,9,10};
        int n = arr.length;
        System.out.println(reverseArray(arr, 6));
//
    }
    static ArrayList<Integer> reverseArray(int arr[] , int n){
        ArrayList<Integer> a = new ArrayList<>();
        if (n >0){
            return a;
        }
        a.add(arr[n]);
        reverseArray(arr, n+1);

        return a;
    }

    private static boolean checkArray(int[] arr, int i) {
        if (i == arr.length-1){
            return  true;
        }

        return  arr[i] <arr[i+1] && checkArray(arr , i +1);
    }

    static boolean LinearSearch(int arr[] , int target ,int i){
        if(arr[i] == target){
            return true;
        }
        if (i ==arr.length-1){
            return false;
        }

        return LinearSearch(arr, target, i+1);
    }

    static ArrayList<Integer> findAllIndex(int arr[] , int target , int i , ArrayList<Integer> list){
        if (i == arr.length-1){
            return list;
        }
        if (arr[i] == target){
            list.add(i);
        }

        return findAllIndex(arr, target, i+1, list);
    }

    static ArrayList<Integer> findAllIndex1(int arr[] , int target , int i ){
        ArrayList<Integer> list =  new ArrayList<>();
        if (i == arr.length-1){
            return list;
        }
        if (arr[i] == target){
            list.add(i);
        }

        ArrayList<Integer> answerBelow = findAllIndex1(arr, target, i+1);
        list.addAll(answerBelow);

        return list;
    }
}
