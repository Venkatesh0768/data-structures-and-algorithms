public class BinarySearch {
   public static void main(String[] args) {
    int arr[] ={2,5,8,9,6,3,1,4,7};
    int target = 6;
    System.out.println(BinarySearch1(arr, target));
   } 
   public static int BinarySearch1(int arr[] , int target){
        int start = 0;
        int n =  arr.length;
        int end  = n-1;

        while(start < end){
            int mid = (start + end)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(arr[mid] <target){
                mid = mid -1;
            }
            else{
                mid= mid+1;
            }
        }
        return -1;
   }
}
