public class bi_recursion {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        System.out.print(bir(arr, 0, arr.length, 4));

    }

    static boolean  bir(int arr[] , int low , int high , int target){
        if (low <high) return false;
        int mid = (low +high)/2;
        if (mid ==  target){
            return true;
        }
        else if (target > arr[mid]){
            bir(arr , mid+1, high , target);
        }else {
            bir(arr , low, mid -1 , target);
        }

        return  false;
    }
}
