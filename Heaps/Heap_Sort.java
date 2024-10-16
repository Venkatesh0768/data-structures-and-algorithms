public class Heap_Sort {

    public static void heapsort(int arr[]){
        //step 1 
        int n = arr.length;
        for(int i =n/2; i>=0; i--){
            heapify(arr, i, n);
        }

        //add the last 
        for(int i =n-1; i>=0; i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, 0, n);
        }

    }
    private static void heapify(int[] arr, int i, int n) {
        int left = 2*i+1;
        int right = 2*i+2;
        int maxheap =i;

        if (left< arr.length && arr[left] < arr[maxheap]) {
            maxheap = left;
        }
        if (right < arr.length && arr[right] < arr[maxheap]) {
            maxheap = right;
        }


        if (maxheap != i) {

            int temp = arr[i];
            arr[i] = arr[maxheap];
            arr[maxheap] = temp;

            heapify(arr, maxheap, n);
            
        }
    }
    public static void main(String[] args) {

        int arr[] = {2,5,3,4,1};
        heapsort(arr);
        
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
    }
}
