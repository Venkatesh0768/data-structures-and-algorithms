package Meduim;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FrequencyElement {

    public static void main(String[] args) {
        int arr[] = {1,4,8,13};
        int k =5;

        //hashing the elements
        Map<Integer , Integer>  map = new HashMap<>();
        for(int i =0; i< args.length; i++){
            if (map.containsKey(arr[i])){
                map.get(arr[i]);
            }else {
                map.put(arr[i] , 1);
            }
        }

        for (int i =0; i< args.length-1; i++){
            int el = arr[i];
            int j =k;
            while (arr[i] !=  arr[i+1]){
                arr[i] = arr[i]+1;
                j--;
            }
            System.out.println(arr[i]);

        }
        System.out.println(Arrays.toString(arr));

    }
}
