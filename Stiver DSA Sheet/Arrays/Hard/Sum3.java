package Hard;
import java.util.*;

public class Sum3 {
    public static List<List<Integer>> triplet(int n, int[] arr) {
        Set<List<Integer>> st = new HashSet<>();

        for (int i = 0; i < n; i++) {
            Set<Integer> hashset = new HashSet<>();
            for (int j = i + 1; j < n; j++) {
                //Calculate the 3rd element:
                int third = -(arr[i] + arr[j]);

                //Find the element in the set:
                if (hashset.contains(third)) {
                    List<Integer> temp = Arrays.asList(arr[i], arr[j], third);
                    temp.sort(null);
                    st.add(temp);
                }
                hashset.add(arr[j]);
            }
        }

        // store the set elements in the answer:
        List<List<Integer>> ans = new ArrayList<>(st);
        return ans;
    }
    static List<List<Integer>> optimal_approach(int arr[]){
        List<List<Integer>> list = new ArrayList<>();

        Arrays.sort(arr);
        int n = arr.length;
        for (int i =0; i< arr.length; i++){
            if (i >0 && arr[i] == arr[i-1] ) continue;
            int j = i +1;
            int k = n -1;
            while (j<k){
                int sum = arr[i] + arr[j] + arr[k];
                if (sum < 0){
                    j++;
                } else if (sum >0) {
                    k--;
                }else {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(arr[i]);
                    temp.add(arr[j]);
                    temp.add(arr[k]);

                    list.add(temp);
                    j++;
                    k--;
                    while (j<k && arr[j] == arr[j-1]) j++;
                    while (j<k && arr[k] == arr[k+1])k--;
                }
            }
        }

        return list;
    }

    public static void main(String[] args) {
        int arr[] = {-2,-2,-2,-1,-1,-1,0,0,0,2,2,2,2};
        System.out.println(optimal_approach(arr));

    }

    static int[] sum_of_three(int arr[]) {
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        return new int[]{arr[i], arr[j], arr[k]};
                    }
                }
            }
        }
        return new int[]{};
    }

    private static ArrayList<Integer> better_approach2(int n) {
        return null;
    }


}
