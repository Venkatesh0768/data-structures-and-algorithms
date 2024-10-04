import java.util.*;
public class Min_Absolute_Difference {
    public static void main(String[] args) {
        int A[] = {4,1,8,7};
        int B[] = {2,3,6,5};
        
        //sorting a and b
        Arrays.sort(A);
        Arrays.sort(B);

        int minAbs =0;

        for(int i =0; i<A.length; i++){
            minAbs += Math.abs(A[i] - B[i]);
        }

        System.out.println(minAbs);
    }
}
