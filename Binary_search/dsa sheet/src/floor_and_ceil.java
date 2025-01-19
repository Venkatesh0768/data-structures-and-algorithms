public class floor_and_ceil {
    public static void main(String[] args) {
        int[] arr = {5, 6, 8, 9, 6, 5, 5, 6};
        int x = 7;
        System.out.println(floor(arr, x) + " " + ceil(arr, x));
    }

    static int floor(int[] arr, int x) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] <= x) {
                ans = arr[mid];
                low = mid + 1;

            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    static int ceil(int[] arr, int x) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] >= x) {
                ans = arr[mid];
                high = mid - 1;

            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}
