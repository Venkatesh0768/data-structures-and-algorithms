import java.util.Arrays;
import java.util.Random;

public class contestBiWeekly {
    public static void main(String[] args) {
        int arr2[] = { 7 ,-2, -5};
        int arr1[] ={9 ,5 , -7};

        minCostr(arr1 , arr2 , 2);
     }

     static int maxA(int arr[]){
        int n = arr.length;
        int ans =0;
        int maxAbs= -1;

         for (int i = 1; i < n; i++) {
            int absvalue = Math.abs(arr[i-1]  - arr[i]);
            maxAbs =  Math.max(absvalue , maxAbs);
         }
         int lastabs = Math.abs(arr[n-1]  - arr[0]);
         maxAbs =  Math.max(lastabs , maxAbs);

         return  maxAbs;
     }

     static void minCostr(int[] arr , int[] brr , long k){
        int n = arr.length;
        int mincost =0;
        if (equalArray(arr, brr)){
            return;
        }else{
            int  cost = 0;
            for (int j = 0; j <n; j++) {
               int[] arr1 =  shuffle(arr);
               if (equalArray(arr1 , brr)){
                   return;
               }else{

                   for (int i = 0; i <n ; i++) {
                       int diff = brr[i] -  arr1[i];
                       cost += Math.abs(diff);
//

                   }
                   cost += (int) k;


               }
            }
//            System.out.println(cost);
        }

     }
    public static int[] shuffle(int[] arr) {
        Random random = new Random();
        for (int i = arr.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }


     static  boolean equalArray(int[] arr , int[] brr){
         for (int i = 0; i <arr.length ; i++) {
             if (arr[i] != brr[i]) {
                 return  false;
             }
         }
         return true;
     }
}
