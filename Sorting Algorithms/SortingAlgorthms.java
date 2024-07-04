public class SortingAlgorthms {

    public static void main(String[] args) {

        int arr[] = {4,3,2,1,0,-1,-2,-3};
        InserationSort(arr);
        
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i] +" ");
        }
    }

    // public static void BubbleSort(int arr[]) {                                      //Bubble Sort
    //     for (int i = 0; i < arr.length; i++) {
    //         for (int j = i+1; j < arr.length; j++) {
    //             if (arr[i] >arr[j]) {
    //                 int temp = arr[i];
    //                 arr[i] = arr[j];
    //                 arr[j] = temp;
    //             }
    //         }
    //     }
    
    // }


      public static void SelectionSort(int arr[]) { 
        for (int i = 0; i < arr.length-1; i++) {
            int minpos = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[minpos] > arr[j]) {
                    minpos = j;
                }
            }
            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;
        }
    
    }
    public static void InserationSort(int arr[]) { 
        for (int i = 1; i < arr.length; i++) {
            int prev = i-1;
            int curr = arr[i];
            while (prev>=0 && arr[prev] > curr) {
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
           
        }
    
    }

    





}