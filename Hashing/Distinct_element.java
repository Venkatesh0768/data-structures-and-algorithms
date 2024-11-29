/**
 * Distinct_element
 */
import java.util.*;
public class Distinct_element {

    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet();

        int num[] = {4,3,2,5,6,7,3,4,2,1};
        for(int i =0; i<num.length; i++){
            hs.add(num[i]);
        }

        System.out.println("ans = " + hs.size());
    }
}