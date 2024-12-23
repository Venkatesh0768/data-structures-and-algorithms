package Hard;

import java.util.*;

public class Sum4 {
    public static void main(String[] args) {
        int arr[] = {1, 0, -1, 0, -2, 2};
//        burteForce_approach(arr, 0);
//        System.out.println(better_approach(arr, 0));
        System.out.println(optimal_approach(arr, 0));

    }

    private static void burteForce_approach(int[] arr, int target) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    for (int l = k + 1; l < n; l++) {
                        if (arr[i] + arr[j] + arr[k] + arr[l] == target) {
                            System.out.println(arr[i] + " " + arr[j] + " " + arr[k] + " " + arr[l]);
                        }
                    }
                }
            }
        }

    }

    private static List<List<Integer>> better_approach(int[] arr, int target) {
        Set<List<Integer>> st = new HashSet<>();
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                Set<Integer> hashset = new HashSet<>();
                for (int k = j + 1; k < n; k++) {
                    int third = target - (arr[i] + arr[j] + arr[k]);

                    if (hashset.contains(third)) {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(arr[i]);
                        temp.add(arr[j]);
                        temp.add(arr[k]);
                        temp.add((int) third);
                        temp.sort(Integer::compareTo);
                        st.add(temp);
                    }
                    hashset.add(arr[k]);
                }
            }
        }

        // store the set elements in the answer:
        List<List<Integer>> ans = new ArrayList<>(st);
        return ans;
    }

    private static List<List<Integer>> optimal_approach(int[] arr, int target) {
        List<List<Integer>> list = new ArrayList<>();

        Arrays.sort(arr);
        int n = arr.length;


        for (int i = 0; i < arr.length; i++) {

            if (i > 0 && arr[i] == arr[i - 1]) continue;

            for (int j = i + 1; j < n; j++) {

                if (j > i + 1 && arr[j] == arr[j - 1]) continue;

                int k = j + 1;
                int l = n - 1;
                while (k < l) {
                    long sum = arr[i] + arr[j] + arr[k] + arr[l];

                    if (sum == target) {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(arr[i]);
                        temp.add(arr[j]);
                        temp.add(arr[k]);
                        temp.add(arr[l]);
                        list.add(temp);

                        k++;
                        l--;


                        while (k < l && arr[k] == arr[k - 1]) k++;
                        while (k < l && arr[l] == arr[l + 1]) l--;

                    } else if (sum < target) {
                        k++;
                    } else {
                        l--;

                    }
                }
            }
        }
        return list;
    }
}