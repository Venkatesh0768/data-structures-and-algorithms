public class Check_sorted_array {
    public static boolean sorted_array(int arr[] , int i){
        if(i == arr.length -1){
            return true;
        }
        if (arr[i] > arr[i+1]) {
            return false;
        }
        return sorted_array(arr, i + 1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,3};
        System.out.println(sorted_array(arr, 0));
    }
}
