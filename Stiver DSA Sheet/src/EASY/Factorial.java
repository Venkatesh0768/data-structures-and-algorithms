package EASY;

import java.util.*;

public class Factorial {

    public static void main(String[] args) {
            int a[] = { -7 ,8};
            int b[] ={ -8,-3, 8};
        System.out.println(findUnion(a,b));
        int arr[] = {1,1,3,3,4,4,5,5,6,6};

    }


    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        Set<Integer> ans = new HashSet<>();

        for(int i =0; i<a.length; i++){
            ans.add(a[i]);
        }
        for(int j =0; j<b.length; j++){
            ans.add(b[j]);
        }

        ArrayList<Integer> a1 = new ArrayList<>(ans);
        Collections.sort(a1);
        return a1;

    }


}

