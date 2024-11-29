package EASY;

public class MissingElements {

    //    1.BinarySearch

//    2.sum
    static  int missingElement2(int arr[]){
        int n = arr.length;
        int sum = (n* (n+1))/2;
        int s1 =0;
        for(int i =0; i<n; i++){
            s1 = s1+ arr[i];
        }

        return  sum-s1;
    }

    static int missingNumber(int[] nums) {
        int xor1 = 0, xor2 = 0;
        int n = nums.length;
        for (int j = 0; j <= n - 1; j++) {
            xor2 = xor2 ^ nums[j];
            xor1 = xor1 ^ j;
        }
        xor1 = xor1 ^ n;
        return xor1 ^ xor2;
    }

    public static void main(String[] args) {
            int arr[] = {0,1};
        System.out.println(missingElement2(arr));


    }


//    how many way you can do this to slove 1.Binary Search 2.sum 3.xor

}
