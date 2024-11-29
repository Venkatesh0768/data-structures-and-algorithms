package EASY;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Basic_Array {


    static int removeDuplicateElements(int arr[]){
        int i =0;
        for(int j =1; j< arr.length; j++){
            if(arr[j] != arr[i]){
                arr[i+1] =arr[j];
                i++;
            }
        }
        return i+1;
    }

    static int secondLargestElement(int arr[]){
        int largest = arr[0];
        int slargest=-1;
        for(int i =1; i<arr.length; i++){
            if (arr[i] > largest){
                slargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > slargest) {
                slargest = arr[i];
            }
        }

        return slargest;
    }

    static int secondSmallestElement(int arr[]){
        int smallest = arr[0];
        int ssmallest= Integer.MAX_VALUE;
        for(int i =1; i<arr.length; i++){
            if (arr[i]  < smallest){
                ssmallest = smallest;
                smallest = arr[i];
            } else if (arr[i]  > smallest && arr[i] < ssmallest) {
                ssmallest = arr[i];
            }
        }

        return ssmallest;
    }
    //revese the Array
//    static void reverse(int arr[], int si , int ei){
//        while (si<ei){
//            int temp = arr[si];
//            arr[si] = arr[ei];
//            arr[ei] = temp;
//            si++; ei--;
//        }
//    }
    //Left Rotated the array
    static void leftRotatioon(int arr[] , int k){
        int n = arr.length-1;
        reverse(arr, 0 , k-1);
        reverse(arr, k , n);
        reverse(arr, 0, arr.length-1);
    }

    static void rightRotatioon(int arr[] , int k){
        int n = arr.length-1;
        reverse(arr, n-k+1, n);
        reverse(arr, 0 , n-k);
        reverse(arr, 0, n);
    }


    static void reverse(int arr[] ,int si , int ei){
        while(si<=ei){
            int temp = arr[si];
            arr[si] = arr[ei];
            arr[ei] =temp;
        }
    }

    static int[] rotateArray(int[] nums, int k) {
        // Write your code here.
        int n = nums.length-1;
        reverse(nums , 0 , k);
        reverse(nums, k+1, n);
        reverse(nums , 0, n);
        return nums;

    }

    public static void rotate(int[] nums, int k){
        int n = nums.length;
        int temp[] = new int[n];
        for(int i =0; i<n; i++){
            int r =(i+k)%n;
            temp[r] = nums[i];
        }
        for(int j =0; j<nums.length; j++){
            nums[j]  = temp[j];
        }
    }
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // add your code here
        Set<Integer> ans = new HashSet<>();

        for(int i =0; i<a.length; i++){
            ans.add(a[i]);
        }
        for(int j =0; j<b.length; j++){
            ans.add(b[j]);
        }
        ArrayList<Integer> a1 = new ArrayList<>(ans);
        return a1;
    }





    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,6,7};
        int a1[] ={2,8,9};
        findUnion(arr, a1);
        rotate(arr,3);
        rightRotatioon(arr ,3);
        System.out.println(Arrays.toString(arr));

//
    }

}
