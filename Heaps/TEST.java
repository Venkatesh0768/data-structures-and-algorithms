import java.util.*;

public class TEST {

    public static void findMinDiff(int arr[], int m) {
        int max = Integer.MAX_VALUE;

        Arrays.sort(arr);
        for (int i = 0; i + m - 1 < arr.length; i++) {
            int d = arr[i + m - 1] - arr[i];

            if (d < max) {
                max = d;
            }
        }

        System.out.println(max);

    }

    public static void Printarrray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 3, 4, 1, 9, 56, 7, 9, 12 };
        findMinDiff(arr, 3);
        search(arr, 0);

    }

    public static int search(int[] nums, int target) {

        if (nums.length == 0 || nums == null) {
            return -1;
        }

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            }
            if (nums[left] <= nums[mid]) {
                if (nums[left] <= target && target <= nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if ( nums[mid] <= target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;

                }
            }

        }
        return -1;

    }

}
