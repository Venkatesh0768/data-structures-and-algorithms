public class binarysearch {
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 6};
        int target = 5;
        System.out.print(searchInsert(arr, target));


    }

    static int searchInsert(int[] nums, int target) {
        int start = 0;
        int n = nums.length;
        int ans = 0;
        int end = n - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                ans = mid;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }
}
