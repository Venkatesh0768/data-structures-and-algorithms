import java.util.*;;

public class Question3 {
    public static void main(String[] args) {
        String str = "2[cv]";

       System.out.println(Decode_a_String(str));

    }

    public static String Decode_a_String(String str) {
        Stack<String> str1 = new Stack<>();
        Stack<Integer> num = new Stack<>();
        StringBuilder currentString = new StringBuilder();
        int number =0;

        for( char ch : str.toCharArray()){
            if (Character.isDigit(ch)) {
                number = number *10 + (ch - '0');
            }

            else if (ch == '[') {
                num.push(number);
                str1.push(currentString.toString());
                currentString.setLength(0);
                number =0;
            }

            else if(ch == ']'){
                StringBuilder temp = new StringBuilder(str1.pop());
                int repeat = num.pop();
                for(int i =0 ; i<repeat; i++){
                    temp.append(currentString);
                }
                currentString = temp;
            }
            else {
                // Normal characters are added to the current string
                currentString.append(ch);
            }
        }

        return currentString.toString();  

    }

    public static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    
}
