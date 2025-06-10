import java.util.*;
public class P2_Valid_Anagram {
    public static void main(String[] args) {
        String  s = "anagram", t = "nagaram";

        System.out.println(isAnagram(s, t));
        
    }
    static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] count = new int[26];
        for(final char c : s.toCharArray()){
            ++count[c-'a'];
        }
        for(final char c : t.toCharArray()){
            if (count[c - 'a'] == 0){
                return false;
            }else{
                --count[c - 'a'];
            }
         
        }

        return true;
    }
}
