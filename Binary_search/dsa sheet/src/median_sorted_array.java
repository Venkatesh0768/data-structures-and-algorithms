import java.lang.reflect.Array;
import java.util.Arrays;

public class median_sorted_array {

    public static void main(String[] args) {
        int[] arr1 = {2, 3, 6, 7, 9};
        int[] arr2 = {1, 4, 8, 10};
        System.out.println(kthElement(arr1, arr2, 5));
    }

    static void findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;

        int i = 0;
        int j = 0;
        int k = 0;
        int[] arr = new int[n1 + n2];

        while (i < n1 && j < n2) {
            if (nums1[i] < nums2[j]) {
                arr[k] = nums1[i];
                i++;
            } else {
                arr[k] = nums2[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k++] = nums1[i++];
        }

        while (j < n2) {
            arr[k++] = nums2[j++];
        }

        if (k % 2 == 1) {
            System.out.println(arr[k / 2]);
        } else {
            int m1 = arr[k / 2];
            int m2 = arr[(k / 2) - 1];
            double ans = (double) (m1 + m2) / 2;

            System.out.println(ans);

        }

        System.out.println(Arrays.toString(arr));

    }

    static int kthElement(int[] nums1, int[] nums2, int k) {

        int n1 = nums1.length;
        int n2 = nums2.length;
        int n = n1 + n2;


        int cnt = 0;

        int i = 0;
        int j = 0;

        int indel1 = -1;


        while (i < n1 && j < n2) {
            if (nums1[i] < nums2[j]) {
                cnt++;
                if (cnt == k) {
                    indel1 = nums1[i];
                    break;
                }
                i++;
            } else {
                cnt++;
                if (cnt == k) {
                    indel1 = nums2[j];
                    break;
                }
                j++;
            }
        }
        while (i < n1) {
            cnt++;
            if (cnt == k) {
                indel1 = nums1[i];
                break;
            }

            i++;
        }

        while (j < n2) {
            cnt++;
            if (cnt == k) {
                indel1 = nums2[j];
                break;
            }
            j++;
        }

        return indel1;

    }


}
