
import java.util.*;

public class Question3 {

    public static void Printarray(char arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static String lexicographicallySmallestString(int N , int K){

        char[] result = new char[N];

        for (int i = 0; i <N; i++) {
            result[i] ='a';
        }

        int remaining_result = K-N;

        for (int i = N-1; i >= 0; i--) {
            if (remaining_result>0) {
                int increase = Math.min(25, remaining_result);
                // System.out.println(increase);
                result[i] += increase;
                remaining_result -= increase;
            }else{
                break;
            }
        }
    
        return  new String(result);

    }

    public static void main(String[] args) {
       System.out.println( lexicographicallySmallestString(4, 52));
        

    }
}
