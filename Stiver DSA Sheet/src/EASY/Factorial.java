package EASY;

import java.util.*;

public class Factorial {
    static ArrayList<Long> factorial(long n) {
       ArrayList<Long> result = new ArrayList<>();
       generatorFun(1 , 1, n, result);
       return result;
    }

    private static void generatorFun(long currentVal, int i, long n, ArrayList<Long> result) {
        if (currentVal > n){
            return;
        }
        result.add(currentVal);
        generatorFun(currentVal*(i+1) , i+1 , n, result);
  }

    public static void main(String[] args) {


    }


//    public static ArrayList<Integer> findUnion(int a[], int b[]) {
//        Set<Integer> ans = new HashSet<>();
//
//        for(int i =0; i<a.length; i++){
//            ans.add(a[i]);
//        }
//        for(int j =0; j<b.length; j++){
//            ans.add(b[j]);
//        }
//
//        ArrayList<Integer> a1 = new ArrayList<>(ans);
//        Collections.sort(a1);
//        return a1;
//
//    }


}

