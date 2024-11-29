import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class maxsubarray {
    public static void main(String[] args) {
        int nums[] = {2, 7, 6, 1, 4, 5};
        ArrayList<Integer> num = new ArrayList<>();


        for(int i =0; i<nums.length; i++){
            for(int j =i; j<nums.length; j++){
                int sum =0; 
                for(int k =i; k<=j; k++){
                    sum += nums[k];
                    // System.out.print(nums[k] +" ," );
                }
                // System.out.println(" -> " + sum);
                int max =Integer.MIN_VALUE;
                if (sum % 3 ==0) {
                    max = Math.max(max, sum);
                    num.add(max);
                }

            }

           
        }

        Collections.sort(num);
        System.out.println(num.get(num.size()-1));

    }
}
