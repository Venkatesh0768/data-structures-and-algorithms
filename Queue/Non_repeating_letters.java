import java.util.LinkedList;
import java.util.Queue;

public class Non_repeating_letters {

    public static void non_repeating_letter(String str){
        int feq[] = new int[26];
        Queue<Character> q  = new LinkedList<>();

        for(int i =0; i<str.length(); i++){
            char ch = str.charAt(i);
            q.add(ch); 
            feq[ch - 'a']++;

            while (!q.isEmpty() && feq[q.peek() -'a'] > 1) {
                q.remove();
            }

            if (q.isEmpty()) {
                System.out.println(-1 + " ");
            }else{
                System.out.println(q.peek()+ " ");
            }
        }
    }
    public static void main(String[] args) {
        String str = "aabbcxc";
        non_repeating_letter(str);
    }   
}
