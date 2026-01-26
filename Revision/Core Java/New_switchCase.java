public class New_switchCase {
    
    public static void main(String[] args) {
        String ans = "Monday";
        String result = "";

        switch (ans) {
            case "Monday" , "Sunday" -> result = "working";
            default-> result = "Default";
        }

        System.out.println(result);
    }
}
