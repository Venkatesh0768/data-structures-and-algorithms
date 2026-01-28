package Day1;
public class CyclicSort {

    static void cyclicSort(int[] arr){
        int n = arr.length;
        int i =0;

        while (i < n){
            int correctIndex = arr[i] -1;
            if (arr[i] != arr[correctIndex]){
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            }else {
                i++;
            }
        }
    }


    public static void main(String[] args) {
        int[] arr = {3,5,2,1,4};
        cyclicSort(arr);

        for(int ele : arr){
            System.out.print(ele + " ");
        }
        
    }
}
