/**
 * test
 */
import java.util.*;
public class test {
    
    static boolean reverseArray(int nums[]) {
        HashMap<Integer , Integer> map =new HashMap<>();

        for(int i=0; i<nums.length; i++){
            map.put(i , nums[i]);
            System.out.println(map.get(i));
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,1};
       if (reverseArray(arr)) {
         System.out.println("duplicates is there");
       }else{
        System.out.println("No Duplicate is there");
       }
    }
}