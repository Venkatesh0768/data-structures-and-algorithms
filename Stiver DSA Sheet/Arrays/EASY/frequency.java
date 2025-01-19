package EASY;

public class frequency {
    public static void main(String[] args) {
        int arr[] = {1,4,8,13};
        int k =5;
        highestFrequency(arr, k);
    }
    static void highestFrequency(int arr[] , int k){
        int count =0;
        for (int i =0; i< arr.length-1; i++){
            while (arr[i] != arr[i+1]){
                if (count<k) {arr[i] = arr[i] + 1; count++; }
                if(count == k) break;
                if(count< k && i == arr.length) i=0;
            }
            i++;
        }

        PrintArray(arr);
    }

    private static void PrintArray(int[] arr) {
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
