import java.util.HashMap;

public class Longest_Repeating_Char_Replacement {
    public static void main(String[] args) {
        String s = "ABAB";
        System.out.println(characterReplacement(s, 2));

    }
    static int characterReplacement(String s, int k) {
        HashMap<Character , Integer>  count =  new HashMap<>();
        int n = s.length();
        int l =0, r=0 , res =0 , maxf=0;
        while (r<n) {
            //left is increasing
            count.put(s.charAt(r), count.getOrDefault(s.charAt(r), 0) + 1);
            maxf = Math.max(count.get(s.charAt(r)), maxf);

            while ((r-l +1) - maxf > k) {
                count.put(s.charAt(l), count.get(s.charAt(l)) - 1);
                l++;
            }

            res = Math.max(res, r-l +1);

            r++;
        }

        return res;
    }
}
