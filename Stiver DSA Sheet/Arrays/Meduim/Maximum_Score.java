package Meduim;

import java.nio.channels.InterruptedByTimeoutException;

public class Maximum_Score {

    public static void main(String[] args) {
        int arr[] = {228, 394, 463, 227, 388, 757, 782, 238, 967};
        int arr1[] = {4, 3, 1, 5, 6};
        System.out.println(brute_Force(arr));
        System.out.println(Optimize_Approach(arr1));

    }
    static int Optimize_Approach(int arr[]){
        int smallest = Integer.MAX_VALUE;
        int second_Smallest = Integer.MAX_VALUE;
        for(int num : arr){
            if (num < smallest){
                second_Smallest = smallest;
                smallest = num;
            }else if (num< second_Smallest){
                second_Smallest  = num;
            }
        }

        return smallest+ second_Smallest;
    }

    static int brute_Force(int arr[]) {
        int n = arr.length;
        int maxScore = Integer.MIN_VALUE;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {

                int smallest = Integer.MAX_VALUE;
                int secondSmallest = Integer.MAX_VALUE;



                for (int k = i; k <= j; k++) {
                    if (arr[k] < smallest) {
                        secondSmallest = smallest;
                        smallest = arr[k];
                    } else if (arr[k] < secondSmallest) {
                        secondSmallest = arr[k];
                    }
                }

                if (secondSmallest != Integer.MAX_VALUE) {
                    maxScore = Math.max(maxScore, smallest + secondSmallest);
                }

            }

        }
        return maxScore;
    }
}

