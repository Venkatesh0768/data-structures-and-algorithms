package EASY;

import java.util.ArrayList;

public class Main {

    static  long  factorial(long n){
        if (n==1) return 1;
        return n*factorial(n-1);
    }

    static ArrayList<Long> factorialNumbers(long n) {
        ArrayList<Long> a = new ArrayList<>();
        for(long i =1; i <=n; i++){
            if (factorial(i) <= n){
                a.add(i);
            }
        }

        return a;
    }

    static  int reverse(int n){
        int digit = (int)(Math.log10(n)) +1;
        return helper(n , digit);
    }

    private static int helper(int n, int digit) {
        if (n%10 ==n){
            return n;
        }
        int rem = n%10;
        return rem * (int)(Math.pow(10 , digit -1))+ helper(n/10 , digit-1);
    }


    public static void main(String[] args) {
//        int arr[] = {1,2,4,5,7,8,9,10};
//        int target = 10;
////        System.out.println(BinarySearch(arr,target, 0, arr.length-1));
//       reverse_Digit(1253);
//        System.out.println(sum);
        System.out.println(reverse(51));

    }

    static  int BinarySearch(int arr[] , int target , int si , int ei){
        if(si > ei) {
            return -1;
        }
        int mid = si + (ei -si)/2;
        if (arr[mid] == target){
            return mid;
        }
        if (arr[mid] >target){
            return BinarySearch(arr, target, si, mid -1);
        }
        return BinarySearch(arr, target, mid +1  ,ei);
    }
    static  int sum_of_digits(int n){
        if(n==0) return 0;
        return n%10 + sum_of_digits(n/10);

    }
    static int sum =0;
    static void reverse_Digit(int n){
        if (n ==0){
            return;
        }
        int rem = n%10;
        sum = sum*10 + rem;
        reverse_Digit(n/10);
    }

}