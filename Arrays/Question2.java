public class Question2 {
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int target = 3;
       System.out.println( checking(arr, target));
    }
    public static int checking( int arr[] , int target){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
