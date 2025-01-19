import java.util.Arrays;
import java.util.Scanner;

public class Agressive_cow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int cows = sc.nextInt();
            int arr[] = new int[n];
            for(int i =0; i<n; i++){arr[i] = sc.nextInt();}
            int ans =agressive_cows(arr , cows );
            System.out.println(ans);
            t--;
        }

    }

    static int agressive_cows(int arr[], int cows) {
        Arrays.sort(arr);
        int low = 1;
        int high = arr[arr.length-1] - arr[0];
        int ans =-1;
        while (low<=high){
            int mid = (low +high)/2;
            if (cowPlaced(arr, mid, cows) == true) {
                ans = mid;
                low = mid +1;
            } else {
                 high = mid -1;
            }
        }
        return ans ;
    }

    private static boolean cowPlaced(int[] arr, int dis, int cows) {
        int last = arr[0];
        int cntCow = 1;
        for (int j = 1; j < arr.length; j++) {
            if ((arr[j] - last) >= dis) {
                cntCow++;
                last = arr[j];
            }
            if (cntCow == cows) {
                return true;
            }
        }
        return false;
    }

}
