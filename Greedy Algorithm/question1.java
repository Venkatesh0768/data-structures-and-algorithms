/**
 * question1
 */
import java.util.*;
public class question1 {

    public static void main(String[] args) {
        String str = "RLRRLLRLRL";

        int count_L = 0;
        int count_R = 0;
        int ans =0;

        for(int i =0; i<str.length(); i++){
            char  curr = str.charAt(i);
            if (curr == 'L') {
                count_L++;
            }
            if (curr == 'R') {
                count_R++;
            }

            if (count_L == count_R) {
                ans++;
            }

        }
        System.out.println(ans);
    }
}