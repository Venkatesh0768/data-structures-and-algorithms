import java.util.*;

public class Question4 {


    public static void Reversing_queue_at_k(int arr[] , int k){
        Queue<Integer> q1 = new LinkedList<>();

        for(int i =k-1; i>=0; i--){
            q1.add(arr[i]);
        }

        for(int i =0; i<k; i++){
            arr[i] = q1.peek();
            q1.remove();
        }
        PrintArray(arr);
        


    }


    public static void PrintArray(int arr[]){
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {


        int arr[] = {10,20,30,40,50,60,70,80,90,100};
        int k =7;
        Reversing_queue_at_k(arr, k);
    }
}
