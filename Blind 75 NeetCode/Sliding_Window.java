import java.util.HashMap;

public class Sliding_Window {
    public static void main(String[] args) {
        String s = "AABABBA";
        System.out.println(lengthOfLongestSubstring(s));
        System.out.println(characterReplacement(s, 1));

    }

    static int lengthOfLongestSubstring(String s) {
        int l = 0, r = 0, maxlen = 0;
        int n = s.length();
        HashMap<Character, Integer> map = new HashMap<>();

        while (r < n) {
            if (map.containsKey(s.charAt(r))) {
                l = Math.max(l, map.get(s.charAt(r)) + 1);
            }
            map.put(s.charAt(r), r);
            maxlen = Math.max(maxlen, r - l + 1);
            r++;
        }

        return maxlen;
    }

    static int characterReplacement(String s, int k) {
        int l = 0, res = 0, maxf = 0, r = 0;
        int n = s.length();
        HashMap<Character, Integer> map = new HashMap<>();

        while (r < n) {
            map.put(s.charAt(r), map.getOrDefault(s.charAt(r), 0) + 1);
            maxf = Math.max(map.get(s.charAt(r)), maxf);

            while ((r - l + 1) - maxf > k) {
                map.put(s.charAt(l), map.get(s.charAt(l)) - 1);
                l++;
            }

            res = Math.max(res, r - l + 1);
            r++;
        }

        return res;
    }

    static void pushZerosToEnd(int[] arr) {

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
        }
    }
}
