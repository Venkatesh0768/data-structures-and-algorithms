/**
 * first_occurence
 */
public class first_occurence {
    public static int FO(int arr[], int i , int key ){
        if(key == arr[i]){
            return i;
        }
        if (i == arr.length-1) {
            return i;
        }
        return FO(arr, i+1, key);

    }


    public static void main(String[] args) {
        int arr[] = {1,2,3,4,3};
        System.out.println(FO(arr, 0, 3));
    }
} 