import java.util.*;
public class class3 {


    static boolean isPalindrome(String s){
        int start =0;
        int end = s.length() -1; 
        while (start <= end) {
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        // String s = "rapoluvenky7@gmail.com";
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the Name : ");
        // String ans = sc.nextLine();
        // if (ans.toLowerCase().trim().equals(s)) {
        //     System.out.println("Login SuccesFull");
        // }else{
        //     System.out.println("Not Login");
        // }


        String s ="racecar";
        StringBuilder s1 = new StringBuilder(s).reverse();
        
        if (s.equals(s1.toString())) {
            System.out.println("Yes");
        }else{
            System.out.println("NO");
        }
    }
}522C   