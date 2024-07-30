public class Last_occurence {
    public static int LO(int arr[], int i , int key ){
        if (i == arr.length-1) {
            return -1;
        }
        int isFound  = LO(arr, i+1, key);
        if(isFound == -1 && key == arr[i]){
            return isFound;
        }
        return isFound;

    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,3};
        System.out.println(LO(arr, 0, 3));
    }
}
