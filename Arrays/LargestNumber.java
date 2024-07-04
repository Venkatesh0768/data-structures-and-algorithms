public class LargestNumber {
    public static void main(String[] args) {
        int arr[] = {2,5,83,1,8,5,3};
        System.out.println(largestvalue(arr));
    }
    public static int largestvalue(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i =0; i<arr.length; i++){
            if(largest < arr[i] ){
                largest = arr[i];
            }
        }
        return largest;
    }
}
