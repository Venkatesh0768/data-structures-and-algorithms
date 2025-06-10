import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Longest_Substring_Non_Repeating {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
        
    }
    static int lengthOfLongestSubstring(String s) {
        int n = s.length();
         HashMap < Character, Integer > set = new HashMap <> ();

        int l =0, r=0;
        int maxlen =0;

        while (r<n) {
            if (set.containsKey(s.charAt(r))) {
                l = Math.max(l, set.get(s.charAt(r)) + 1);
            }

            set.put(s.charAt(r), r);
            maxlen = Math.max(maxlen, r-l +1);
            r++;
        }

        return maxlen;
    }
}
