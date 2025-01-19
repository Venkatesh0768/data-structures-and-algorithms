package Meduim;

public class subarray_sum {
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        int k =3;
        int maxlen =0;
        for (int i = 0; i<arr.length-1; i++){
            int sum =0;
            for (int j =0; j<arr.length; j++){
                sum += arr[j];
                if (sum == k){
                   maxlen++;
                }
            }
        }
        System.out.println(maxlen);
    }
}
