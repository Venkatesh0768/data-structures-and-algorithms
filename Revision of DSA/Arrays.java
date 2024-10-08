import java.lang.Character.Subset;

import javax.sound.sampled.Line;

/**
 * Arrays
 */
public class Arrays {

    // Linear search
    public static int LinearSearch(int arr[], int key) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                count++;
            }
            if (count == 2) {
                System.out.println(arr[i] + " " + i);
                break;
            }

        }

        return -1;

    }

    public static int BinarySearch(int arr[], int key) { // O(n)
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = (start + end) / 2;

            if (arr[mid] == key) {
                return mid;

            } else if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static int Largest_Number(int arr[]) { // O(n)
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
        }

        return largest;
    }

    public static int Smallest_Number(int arr[]) { // O(n)
        int largest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (largest > arr[i]) {
                largest = arr[i];
            }
        }

        return largest;
    }

    public static void Reverse_Array(int array[]) { // O(n^2)

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }

    public static void Pair_array(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print("(" + arr[i] + "," + arr[j] + ")" + "  ");
            }
            System.out.println();
        }
    }

    public static void Bubble_Sort(int arr[]) { // O(n^2)
        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] >= arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void Selection_Sort(int arr[]) { // O(n^2)
        for (int i = 0; i < arr.length; i++) {
            int curr = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[curr] >= arr[j]) {
                    curr = j;
                }
            }
            int temp = arr[curr];
            arr[curr] = arr[i];
            arr[i] = temp;
        }
    }

    public static void Insertion_Sort(int arr[]) { // O(n^2)
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;
        }
    }

    public static void Merge_sort(int arr[], int start, int end) { // O(nlogn)
        if (start >= end) {
            return;
        }

        int mid = start + (end - start) / 2;
        Merge_sort(arr, start, mid);
        Merge_sort(arr, mid + 1, end);

        Merge(arr, start, mid, end);

    }

    public static void Merge(int arr[], int start, int mid, int end) {
        int temp[] = new int[end - start + 1];
        int left = start;
        int right = mid + 1;
        int k = 0;

        while (left <= mid && right <= end) {
            if (arr[left] < arr[right]) {
                temp[k] = arr[left];
                left++;
            } else {
                temp[k] = arr[right];
                right++;
            }
            k++;

        }

        while (left <= mid) {
            temp[k++] = arr[left++];

        }

        while (right <= end) {
            temp[k++] = arr[right++];
        }

        for (k = 0, left = start; k < temp.length; k++, left++) {
            arr[left] = temp[k];
        }

    }

    public static void Print_array(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.err.print(arr[i] + " ");
        }
    }

    public static void subset_array(int arr[]) { // O(n^3)
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = 0; j < arr.length; j++) {
                int end = j;
                for (int k = start; k < end; k++) {
                    System.out.print(arr[k] + " ");
                }

                System.out.println();
            }
        }
    }

    // maximum subarray
    public static void Maximum_Subarray(int arr[]) { // O(n^3)
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {
                int total = 0;

                for (int k = i; k < j; k++) {
                    System.out.print(arr[k] + " ");
                    total += arr[k];
                }

                if (total > max) {
                    max = total;
                }

                System.out.println(" -> " + total);
            }
        }
        System.out.println(max);
    }

    public static void Maximum_Subarray2(int arr[]) { // O(n^2)
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {
                int total = 0;

                for (int k = i; k < j; k++) {
                    System.out.print(arr[k] + " ");
                    total += arr[k];
                }

                if (total > max) {
                    max = total;
                }

                System.out.println(" -> " + total);
            }
        }
        System.out.println(max);
    }

    public static void Tappingrainwater(int height[]) {

        if (height.length == 0) {
            System.out.println(0);
            return;
        }

        int leftmax[] = new int[height.length];
        int rightmax[] = new int[height.length];

        // leftmax
        leftmax[0] = height[0];
        for (int i = 1; i < leftmax.length; i++) {
            leftmax[i] = Math.max(leftmax[i - 1], height[i]);
        }
        Print_array(leftmax);
        System.out.println();

        rightmax[rightmax.length - 1] = height[height.length - 1];
        for (int i = rightmax.length - 2; i >= 0; i--) {
            rightmax[i] = Math.max(rightmax[i + 1], height[i]);
        }
        Print_array(rightmax);
        System.out.println();

        int trapped = 0;
        for (int i = 0; i < height.length; i++) {
            int waterlevel = Math.min(leftmax[i], rightmax[i]);
            trapped += waterlevel - height[i];

        }

        System.out.println(trapped);
    }


    


    

    public static void main(String[] args) {
        int arr[] = { 5, 10, 3, 4, 5 };
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        Tappingrainwater(height);
        // int key = 2;
        // System.out.println( LinearSearch(arr , key));
        // System.out.println(BinarySearch(arr, key));
        // System.out.println(Smallest_Number(arr));
        // Reverse_Array(arr);
        // Pair_array(arr);
        // Bubble_Sort(arr);
        // Insertion_Sort(arr);
        // Merge_sort(arr,0, arr.length-1);
        // Selection_Sort(arr);
        // Insertion_Sort(arr);
        // Maximum_Subarray(arr);
        // Print_array(arr);

    }
}