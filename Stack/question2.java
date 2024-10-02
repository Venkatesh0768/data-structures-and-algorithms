import java.util.*;
public class question2 {
    public static void main(String[] args) {
        System.out.println(Simplefy("/home/"));
        System.out.println(Simplefy("/home//foo/"));
        System.out.println(Simplefy("/home/foo/.."));
        System.out.println(Simplefy("/home/user//doc/../pic/.../"));
        System.out.println(Simplefy("/../"));
    }

    public static String Simplefy(String str){
        String array[] = str.split("/");
        Stack<String> stack = new Stack<>();
        String  output = "/";
        int i =0;

        if(array.length >0){
            for(String s : array){
                if(s.equals("..")){
                    if (stack.isEmpty()) {
                        stack.pop();
                    }else{
                        continue;
                    }
                }else if (s.isEmpty() | s.equals(".")  | s.equals("/"))  {
                    continue;
                }else{
                    stack.push(s);
                }
                
            }
        }else{

        }

        while (!stack.isEmpty()) {
            array[i++] = stack.pop();
        }

        for(int j =i-1; j>=0; j--){
            if (j != 0) {
                output = output + array[j] + "/";
            }
            else{
                output = output + array[j];
            }
        }
        return output;
        
    }
     
}
class Solution {
    public String simplifyPath(String path) {
        String array[] = path.split("/");   // Split the input path by "/"
        Stack<String> stack = new Stack<>(); // Stack to hold valid directories

        // Process each part of the path
        for (String s : array) {
            if (s.equals("..")) { // Parent directory ".."
                if (!stack.isEmpty()) { // Only pop if stack is not empty
                    stack.pop();
                }
            }
            else if (s.equals(".") || s.isEmpty()) { // Current directory "." or empty string
                continue; // Skip these cases
            }
            else { // A valid directory name
                stack.push(s);
            }
        }

        // Build the simplified path from the stack
        StringBuilder output = new StringBuilder();

        while (!stack.isEmpty()) {
            output.insert(0, "/" + stack.pop()); // Insert directories in reverse order
        }

        // If the stack is empty, return root "/"
        return output.length() == 0 ? "/" : output.toString();
    }
}
