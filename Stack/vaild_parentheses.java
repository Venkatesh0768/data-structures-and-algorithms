import java.lang.foreign.Arena;
import java.util.ArrayList;
import java.util.Stack;

public class vaild_parentheses {
    public static void main(String[] args) {
        String str = "({[]}(])";
        System.out.println(vaild_p(str));

    }

    public static boolean vaild_p(String str) {

        ArrayList<Character> str1 = new ArrayList<>();
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            str1.add(str.charAt(i));
        }

        for (int i = 0; i < str1.size(); i++) {
            int curr = str1.get(i);
            if (curr == '(' || curr == '{' || curr == '[') {
                s.push(str1.get(i));
            }else{
                if (s.isEmpty()) {
                    return false;
                }
                if (curr == '(' && s.peek() == ')' || curr == '{' && s.peek() == '}' || curr == '[' && s.peek() == ']') {
                    s.pop();
                } 
                else{
                    return false;
                }

            }

        }
        if (s.isEmpty()) {
            return true;
        }else{
            return false;
        }
        

    }
}
