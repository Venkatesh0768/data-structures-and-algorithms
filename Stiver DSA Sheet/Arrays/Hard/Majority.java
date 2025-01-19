package Hard;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Majority {
    public static void main(String[] args) {


    }
    public List<Integer> majorityElement(int[] arr){
        int cnt1 = 0;
        int cnt2 = 0;
        int el1 = Integer.MIN_VALUE;
        int el2 = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (cnt1 == 0 && arr[i] != el2) {
                el1 = arr[i];
                cnt1 =1;
            } else if (cnt2 == 0 && arr[i] != el1) {
                el2 = arr[i];
                cnt2 =1;
            } else if (arr[i] == el1) {
                cnt1++;
            } else if (arr[i] == el2) {
                cnt2++;
            } else {
                cnt1--;
                cnt2--;
            }
        }
        List<Integer> ans = new ArrayList<>();
        cnt1 = 0;
        cnt2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == el1) cnt1++;
            if (arr[i] == el2) cnt2++;
        }
        int n = arr.length;


        if (cnt1 > n / 3) ans.add(el1);
        if (cnt2 > n / 3 && el1 != el2) ans.add(el2);

        return ans;
    }
}
