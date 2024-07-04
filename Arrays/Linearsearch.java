public class Linearsearch {
    public static void main(String[] args) {
        int arr[] ={2,5,8,9,6,3,1,4,7};
        int target = 8;
        System.out.println("Index Number is : " + searchLinear(arr, target));

        if(searchLinear(arr, target) == -1){
            System.out.println("Element not Found");
        }
        else{
            System.out.println("Element Found");
        }
        

    }
    public static int searchLinear( int arr[] , int target){
        for( int i =0; i<=arr.length;  i++){
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    
}
