public class Quick_Sort {
    public static void qucik_sort(int arr[],int si , int ei){
        if (si>=ei) {
            return;
        }
        int pIdx = parition(arr , si , ei);
        qucik_sort(arr, si, pIdx-1);
        qucik_sort(arr, pIdx+1, ei); 
    }
    public static int parition(int arr[] , int si , int ei){
        int pivot = arr[ei];
        int i = si -1;
        for(int j=si; j<ei; j++){
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;

            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] =temp;
        return i;
                

    }
    public static void PrintArr(int arr[]){
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }


    public static  void main(String[] args) {
        int arr[] ={2,6,8,6,5,9};
        qucik_sort(arr, 0, arr.length-1);
        PrintArr(arr);

    }
}
