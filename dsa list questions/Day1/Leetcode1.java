// Problem: Minimum Absolute Difference
// Platform: LeetCode
// Category: Sorting + Adjacent Difference
// Difficulty: Easy


// Input: int[] arr
// Output: List<List<Integer>>

// Constraints:
// 1 ≤ n ≤ 10^5
// -10^6 ≤ arr[i] ≤ 10^6


// After sorting, minimum absolute difference can only occur
// between adjacent elements.


// 1. Sort the array
// 2. Traverse adjacent elements to find min difference
// 3. Traverse again to collect all pairs with that difference
package Day1;
import java.util.*;

class LeetCode1 {
    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        //find the minimum absoult differnce
        int minDiff = Integer.MAX_VALUE;
        for(int i =1; i<n; i++){
            minDiff = Math.min(minDiff  , arr[i] - arr[i-1]);
        }

        // Finding the pair of the MinDiffernce
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            int diff = arr[i] - arr[i - 1];
            
            if (diff == minDiff) {
                ans.add(Arrays.asList(arr[i-1] ,arr[i]));
            }

        }

        return ans;

    }

    public static void main(String[] args) {
        int[]  arr = {3,2,4,1};
        List<List<Integer>> ans = minimumAbsDifference(arr);
        System.out.println(ans);
    
    }
}