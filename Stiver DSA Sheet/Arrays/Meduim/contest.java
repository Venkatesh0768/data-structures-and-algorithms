package Meduim;

import javax.naming.InsufficientResourcesException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static sun.jvm.hotspot.runtime.BasicObjectLock.size;

public class contest {

    public static void main(String[] args) {
////        int arr[][] ={{1,2},{2,5},{3,9},{1,15}};
////      int arr[][]=  {{9,4},{19,5},{2,8},{3,11},{2,15}};
//        int arr[][] ={{10 , 5} ,{1,7}};
////        int arr[][] ={{1,4},{18,5},{15,7},{12,9},{1,11},{18,13},{16,17}};
//        int index =arr[0][0];
//        int time =arr[0][1];
//        for (int i =1; i< arr.length; i++){
//
//            int unitTime  = arr[i][1] - arr[i-1][1];
//            if (time < unitTime){
//                time = unitTime;
//                index = arr[i][0];
//            }
//
//        }
//
//        System.out.println(time);
//        System.out.println(index);

        String initialCurrency = "EUR";
        List<List<String>> pair1 = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();



        List<String> a =  new ArrayList<>();
        a.add("EUR");
        a.add("USD");

        List<String> b =  new ArrayList<>();
        b.add("USD");
        b.add("JPY");

        pair1.add(a);
        pair1.add(b);

        double[] rate1 ={2.0,3.0};
        for(int i =0; i<pair1.size(); i++){
            for (int j=0; j< pair1.size(); i++ ){
                System.out.println(pair1.);
            }
        }




    }
}
