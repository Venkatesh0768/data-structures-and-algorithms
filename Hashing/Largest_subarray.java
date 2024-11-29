import java.util.*;

public class Largest_subarray {
    public static void main(String[] args) {
        int arr[] = {1,1,1};

        HashMap<Integer, Integer> map = new HashMap<>();

        int sum =0;
        int count = 0;


        for(int i =0; i<arr.length; i++){
            sum +=arr[i];
            if (map.containsKey(sum)) {
               count++;
            }else{
                map.put(sum, i);
            }
        }


        System.out.println(count);

    }
}
