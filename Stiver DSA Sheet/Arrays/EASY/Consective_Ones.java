package EASY;

public class Consective_Ones {
    static int consectiveOnes(int arr[]) {
        int count = 0;
        int Maxi = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 1) {
               count =0;
            }
            else {
                count++;
                Maxi = Math.max(count , Maxi);
            }
        }
        return Maxi;
    }

    public static void main(String[] args) {
        int arr[] = {1, 1, 0, 1, 1, 1};
        System.out.println(consectiveOnes(arr));
    }
}
