public class Next_permutation {


    public static void Reverse(int arr[] , int i , int j){
        while (i<=j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void Printarrray(int arr[]){
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] ={1,2,5,4,3};

        //Finding the pivot element
        int pivot =  -1;
        int n = arr.length;
        for(int i = n-2; i>=0; i--){
            if (arr[i] < arr[i+1]) {
                pivot =i;
                break;
            }
        }

        if (pivot ==  -1) {
            Reverse(arr, 0, n-1);
            Printarrray(arr);

        }

        //descece and find
        for(int i = n-1; i>=pivot; i--){
            if (arr[pivot] < arr[i]) {
                int temp = arr[pivot];
                arr[pivot] = arr[i];
                arr[i] = temp;
                break;
            }
        }

        Reverse(arr, pivot+1, n-1);
        Printarrray(arr);


    }
}
