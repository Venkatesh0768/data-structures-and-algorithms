public class rotated_array {
    public static int Rotated_array(int arr[] , int target , int si , int ei){
        if (si>ei) {
            return -1;
        }

        //kaam 
        int mid = si + (ei-si)/2;
        if (arr[mid] == target) {
            return mid;
        }

        //left 
        if (arr[si] <= arr[mid]) {
            if (arr[si] <= target && target<=arr[mid]) {
               return Rotated_array(arr, target, si, mid-1);  
            }
            else{
                return Rotated_array(arr, target, mid+1, ei);  
            }
            
        }


        //right
        else {
            if (arr[mid] <= target && target<=arr[ei]) {
               return Rotated_array(arr, target, si, mid-1);  
            }
            else{
                return Rotated_array(arr, target, mid+1, ei);  
            }
            
        }
    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int index = Rotated_array(arr, 0, 0, arr.length-1);
        System.out.println(index);
    }
}
