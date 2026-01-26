import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Day1_Next_Permutation {

    public static void reverseArray(int a[], int start, int end) {
        while (start < end) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }

    public static int[] nextPermutation(int a[]) {
        int ind = -1;
        int n = a.length;
        for (int i = n - 2; i >= 0; i--) {
            if (a[i] < a[i + 1]) {
                ind = i;
                break;
            }
        }

        if (ind == -1) {
            reverseArray(a, 0, n - 1);
            return a;
        }

        for (int i = n - 1; i > ind; i--) {
            if (a[i] > a[ind]) {
                int temp = a[i];
                a[i] = a[ind];
                a[ind] = temp;
                break;
            }
        }

        reverseArray(a, ind + 1, n - 1);
        return a;
    }

    public static void main(String[] args) {
        int[] arr = { 3 ,1, 2 };
        arr = nextPermutation(arr);
        System.out.println(Arrays.toString(arr)); // [1, 3, 2]
    }
}
