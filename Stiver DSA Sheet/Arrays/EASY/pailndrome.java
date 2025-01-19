package EASY;

public class pailndrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }

    static boolean isPalindrome(String s) {
        String ans = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return isHelper(ans , 0 , ans.length()-1);

    }
    static boolean isHelper(String s  , int si, int ei){
        if(si >= ei) return  true;
        if(s.charAt(si) != s.charAt(ei)){
                return false;
        }
        return  isHelper(s, si+1, ei -1);
    }
}
