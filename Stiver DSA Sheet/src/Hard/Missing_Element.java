package Hard;

import javax.lang.model.element.Element;
import java.util.*;

public class Missing_Element {
    public static void main(String[] args) {
        int arr[] = {4, 3, 6, 2, 1, 1};
        System.out.println(findDuplicateUsingXOR(arr));
//        burteForce_approach(arr);
        better_approach(arr);
//        optimal_approach();c
    }


    private static void burteForce_approach(int[] arr) {
        int n = arr.length;
        System.out.println(findDuplicateUsingXOR(arr));
        Arrays.sort(arr);

        int missing_element =-1;


        //missing Element
        int xor1=0;
        int xor2 =0;

        for (int i =1; i<n; i++){
            xor2 = xor2^arr[i];
            xor1 =  xor1 ^ i;
        }
        xor1 = xor1^n;
        missing_element = xor1 ^xor2;
        System.out.println(missing_element);





        //repeated element;


    }
    private static int findDuplicateUsingXOR(int[] arr) {
        for(int i =0; i<arr.length; i++){
            for (int j= 0; j<arr.length; j++){
                if (arr[i] == arr[j]){
                    return arr[i];
                }
            }
        }
        return  -1;
    }

    private static void better_approach(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        long n = arr.length;
        long sn = (n *(n+1))/2;
        long s2n = (n*(n+1) * (2*n+1))/6;

        System.out.println("s" + "->" + sn);
        System.out.println("s2n" + "->" + sn);
        long s = 0; long s1 =0;
        for (int i =0; i<n; i++){
            s += arr[i];
            s1 += ((long)arr[i] * (long)arr[i]);
        }

        long val1 = s - sn;
        System.out.println(val1);
        long val2 = s1 - s2n;
        System.out.println(val2);

        val2 = val2/val1;
        System.out.println(val2);

        long x = (val1 + val2)/2;
        long y = x -val1;

        ans.add((int) x);
        ans.add((int)y);

    }

    private static void optimal_approach(int[] arr) {

    }
}
