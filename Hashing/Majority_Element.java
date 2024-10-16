import java.util.*;

public class Majority_Element {
    public static void main(String[] args) {
        HashMap<Integer , Integer> map = new HashMap<>();

        int nums[] = {1,3,2,5,1,3,1,5,1};

        for(int i =0; i<nums.length; i++){
            // if (map.containsKey(nums[i])) {
            //     map.put(nums[i] , map.get(nums[i])  + 1);
            // }else{
            //     map.put(nums[i], 1);
            // }

            map.put(nums[i],  map.getOrDefault(nums[i], 0) + 1);
 
        }

        

       for(Integer key : map.keySet()){
        if (map.get(key) > nums.length/3) {
            System.out.println(key);
        }
       }
    } 
}
