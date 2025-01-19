package Hard;

import java.util.*;

public class Pacals_Triangle {
    public static void main(String[] args) {
//        int arr[] = {10, 22, 12, 3, 0, 6};
        int c = 3;
        int r = 5;
//        burteForce_approach(r - 1, c - 1);


//        for (int i = 1; i <= r; i++) {
//            better_approach2(i);
//            System.out.println();
//        }
//        optimal_approach();

        System.out.println(generate(r));

    }


    public static  List<List<Integer>> generate(int numRows) {
        List<List<Integer>> all = new ArrayList<>();
        Set<Integer>  set = new HashSet<>();
       for (int i =1; i<=numRows; i++){
           all.add(better_approach2(i));
       }

       return all;
    }
    //    to find the element in the pascal trianlge
    private static void burteForce_approach(int r, int c) {
        int d1 = 1, d2 = 1, d3 = 1;
        for (int i = 1; i <= r; i++) {
            d1 = d1 * i;
        }

        for (int i = 1; i <= c; i++) {
            d2 = d2 * i;
        }

        int k = r - c;
        for (int i = 1; i <= k; i++) {
            d3 = d3 * i;
        }

        int ans = d1 / (d2 * d3);
        System.out.println(ans);

    }


    private static void better_approach(int n, int r) {
        int res = 1;
        for (int i = 0; i < r; i++) {
            res = res * (n - i);
            res = res / (i + 1);
        }
        System.out.println(res);
    }

    private static ArrayList<Integer> better_approach2(int n) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        int res = 1;
        for (int i =1; i<n; i++){
            res = res * (n-i);
            res = res /i;
            a.add(res);
        }

        return  a;
    }

    private static void optimal_approach(int[] arr) {

    }
}