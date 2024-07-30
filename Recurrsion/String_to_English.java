public class String_to_English {
    static String letters[] = {"Zero" ,"One" , "Two" , "Three" , "Four" ,"Five" , "Six" , "Seven" ,"Eight" , "Nine"};
    public static void PrintDigitsintoEnglish(int num){
        if (num == 0) {
            return;
        }
        int lastDigit =  num %10;
        PrintDigitsintoEnglish(num/10);
        System.out.print(letters[lastDigit] + " ");

    }
    public static void main(String[] args) {
       
        int num =1948;;
        PrintDigitsintoEnglish(num);
        
    }
}
