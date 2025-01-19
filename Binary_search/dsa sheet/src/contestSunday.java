public class contestSunday {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int[] arr1 = {5, 0, 6};

        System.out.println(max_sum_of_subarray(arr1, arr1.length , 1));
    }

    static int giveSum(int[] arr, int start, int i) {
        int sum = 0;
        for (int j = start; j <= i; j++) {
            sum += arr[j];
        }
        return sum;
    }
    static int max_sum_of_subarray(int arr[], int n, int k)
    {
        int max_sum = 0;
        for (int i = 0; i + k <= n; i++) {
            int temp = 0;
            for (int j = i; j < i + k; j++) {
                temp += arr[j];
            }
            if (temp > max_sum)
                max_sum = temp;
        }

        return max_sum;
    }

    static int minMaxSubarray(int[] arr, int m) {
        int sum = 0;
        for (int k = 0; k < m; k++) {
            for (int i = 0; i < arr.length; i++) {
                int max = Integer.MIN_VALUE;
                int min = Integer.MAX_VALUE;
                for (int j = i; j < arr.length; j++) {
                    max = Math.max(max, arr[i]);
                    min = Math.min(arr[j], min);
                }
                System.out.println(max + " ->"+ min);

                sum += max+ min;
                System.out.println(sum);
            }
        }

        return sum;
    }
}
