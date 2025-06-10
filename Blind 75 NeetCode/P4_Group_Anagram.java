import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class P4_Group_Anagram {
    public static void main(String[] args) {
        
    }

    static List<List<String>> groupAnagrams(String[] strs){
        HashMap<String , List<String>> res = new HashMap<>();

        for(int i =0; i<strs.length; i++){
            String s = strs[i];
            int[] count = new int[26];

            for (int j = 0; j < s.length(); j++) {
                count[s.charAt(j) - 'a']++;
            }

            String key = Arrays.toString(count);

            if (!res.containsKey(key)) {
                res.put(key, new ArrayList<>());
            }

            res.get(key).add(s);
        }

        return new ArrayList<>(res.values());

    }
}
