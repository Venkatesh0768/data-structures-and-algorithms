import java.util.*;
public class Max_length_chain {
    public static void main(String[] args) {
        int chian[][] = {{5,24} , {39 ,60} ,{5,28} , {27,40}, {50,90}};

        int arr[][] = new int[chian.length][3];

        for(int i =0; i<chian.length; i++){
            arr[i][0] = i;
            arr[i][1] = chian[i][0];
            arr[i][2] = chian[i][1];
        }

        Arrays.sort( arr, Comparator.comparing(o->o[2]));

        int maxChian = 1;
        int endChain = arr[0][2];
        for(int i =0; i<arr.length; i++){
            if (endChain < arr[i][1]) {
                maxChian++;
                endChain = arr[i][2];
            }
        }
       System.out.println(+maxChian);
        
    }
    
}