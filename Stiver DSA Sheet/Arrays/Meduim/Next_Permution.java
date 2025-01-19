package Meduim;

import java.util.Arrays;

public class Next_Permution {
    static int next_permutation(int arr[]) {
        int index = 0;
        int n = arr.length;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[i + 1]) {
                index = i;
                break;
            }
        }

        for (int i = n - 1; i >= index; i--) {
            if (arr[i] > arr[index]) {
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                break;
            }
        }
        if(index == 0){
             reverseTheArray(arr, 0 , n-1);
        }
        reverseTheArray(arr, index+1 , n-1);

        return -1;


    }

    static void reverseTheArray(int arr[], int si, int ei) {
        while (si<=ei) {
            int temp = arr[si];
            arr[si] = arr[ei];
            arr[ei] = temp;
            si++;
            ei--;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3};
        next_permutation(arr);
        System.out.println(Arrays.toString(arr));

//        reverseTheArray(arr, 0, arr.length-1);


    }
}
