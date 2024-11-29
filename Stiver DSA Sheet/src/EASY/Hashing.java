package EASY;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Hashing {
    public static void main(String[] args) {
        Map<Integer , Integer>  map = new HashMap<>();
        int arr[] ={2,3,2,3,5};

        for(int i=0; i < arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i]) + 1);
            }
            else{
                map.put(arr[i], 1);
            }
        }
        ArrayList<Integer> a = new ArrayList<>();
        for(int i =1; i<=arr.length; i++){
           a.add(map.getOrDefault(i, 0));
        }

        System.out.println(a);
    }

}
