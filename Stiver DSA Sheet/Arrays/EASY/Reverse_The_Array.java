package EASY;

public class Reverse_The_Array {
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5};
        reverseArray(arr);

    }

    static void reverseArray(int arr[]) {
        int[] ans = helper(arr , 0 , arr.length-1);
        printArray(ans);

    }
    static void printArray(int arr[]){
        for (int i =0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    static int[] helper(int[] arr , int si , int ei){
        if(si <ei) {
            int temp = arr[si];
            arr[si] = arr[ei];
            arr[ei] = temp;
            helper(arr , si +1, ei-1);
        }

        return arr;
    }

}
