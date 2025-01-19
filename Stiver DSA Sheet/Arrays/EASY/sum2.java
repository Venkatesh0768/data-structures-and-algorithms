package EASY;

import java.util.ArrayList;
import java.util.HashMap;

public class sum2 {
    public static void main(String[] args) {
        int arr[] = {2,0,1};
//        int ans[] = sumofTwo(arr, 9);
//        System.out.println(Arrays.toString(ans));

        sortColors(arr);


    }

    static int[] sumofTwo(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {

            if (map.containsKey(target - arr[i])){
                int a =map.get(target -arr[i]);
                return new int[]{a , i};
            } else {
                map.put(arr[i], i);
            }
        }
        return new int[]{};
    }

    public  static  void sortColors(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])){
                map.put(arr[i] ,map.get(arr[i])+1);
            }else{
                map.put(arr[i] ,1);
            }
        }
        ArrayList<Integer> a = new ArrayList<>();
        for(int i =0; i <map.size(); i++){
            int count = map.get(arr[0]);
            while (count != 0){
                a.add(i);
                count--;
            }
        }

        System.out.println(a);

    }

}
