public class Heap_Sort_test {

    public static void heapify(int i , int arr[] , int n ){
        int left = 2*i+1;
        int right = 2*i+2;
        int minHeap =i;

        if (left < arr.length && arr[minHeap] > arr[left]) {
            minHeap = left;
        }

        if (right < arr.length && arr[minHeap] > arr[right]) {
            minHeap = right;
        }


        if (minHeap != 1) {
            int temp = arr[i];
            arr[i] = arr[minHeap];
            arr[minHeap] = temp;

            heapify(minHeap, arr ,n);
        }
    }


    public static void Heap_sorting(int arr[]){
        int n = arr.length;
        for(int i = n/2; i>=0; i--){
            heapify(i , arr, n);
        }
        
        for(int i = n-1; i>=0; i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(0, arr, n);
        }
    }
    public static void main(String[] args) {

        int arr[] = {2,3,6,5,3};
        Heap_sorting(arr);

        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        
    }
}
