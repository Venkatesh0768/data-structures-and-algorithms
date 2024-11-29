package EASY;

public class NumberofTheCount {
    public static void main(String[] args) {
        System.out.println(numberOfZeros(1300056));
    }
    static int numberOfZeros(int n){
        return  helper( n , 0);
    }
    static  int helper(int n , int count){
        if (n == 0){
            return count;
        }
        int rem = n%10;
       if (rem== 0){
           return helper(n/10 , count+1);
       }
        return helper(n/10, count);
    }
}
