public class Day1_KadaneAlog {

    public static void maixmumSubarraySum(int a[]) {
        int maxi = Integer.MIN_VALUE;
        int sum = 0;

        int start = 0, end = 0, tempStart = 0;

        for (int i = 0; i < a.length; i++) {
            sum += a[i];

            if (sum > maxi) {
                maxi = sum;
                start = tempStart;
                end = i;
            }
            if (sum < 0) {
                sum = 0;
                tempStart = i + 1;

            }
        }

        System.out.println(maxi + " this is the maxi ");

        for (int i = start; i < end; i++) {
            System.out.println(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        maixmumSubarraySum(arr);
    }

}