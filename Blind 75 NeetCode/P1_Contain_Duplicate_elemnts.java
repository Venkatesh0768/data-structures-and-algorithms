import java.util.HashMap;
import java.util.HashSet;

public class P1_Contain_Duplicate_elemnts {

    public static void main(String[] args) {
        int arr[] = {1,2,3,1};
        System.out.println(containDuplicate(arr));
        
    }

    static boolean containDuplicate(int[] arr){
        HashSet<Integer> seen = new HashSet<>();
        for(int num :arr){
            if (seen.contains(num)) {
                return true;
            }else{
                seen.add(num);
            }
        }
        return false;
    }
}