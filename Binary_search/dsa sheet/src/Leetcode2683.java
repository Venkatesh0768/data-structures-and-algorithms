import java.util.Arrays;

public class Leetcode2683 {
    public static void main(String[] args) {
        int arr[] = {1, 1, 0};
        System.out.println(doesValidArrayExist(arr));
    }

    static boolean doesValidArrayExist(int[] derived) {
        int n=derived.length;
        int[] org=new int[n];

        //Populating the org array
        for(int i=1; i<n; i++){
            org[i]=derived[i-1]^org[i-1];
        }

        //Validating the rules for index i
        for(int i=0; i<n; i++){
            int idx=(i+1)%n;
            if(derived[i]!=(org[i]^org[idx])) return false;
        }

        return true;
//        int n = derived.length;
//        int[] temp = new int[n];
//        int[] original = new int[n];
//
//        //Creating a orginally array
//        for (int i = 0; i < n - 1; i++) {
//            original[i] = derived[i] ^ derived[i + 1];
//        }
//        original[n - 1] = derived[n - 1];
//
//        for (int i = 0; i < n; i++) {
//            if (i != n - 1) {
//                temp[i] = original[i] ^ original[i + 1];
//            } else {
//                temp[i] = original[i] ^ original[0];
//            }
//
//        }
//        for (int i = 0; i < n; i++) {
//            if (derived[i]  !=  temp[i]) {
//                return false;
//            }
//        }
//
//        return  true;
    }
}
