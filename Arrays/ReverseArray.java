public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {5,2,6,3,8,6,0};
        revearray(arr);
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void revearray(int number[]){
        
        int start = 0;
        int end = number.length - 1;
        while (start<end) {
            int temp = number[end];
            number[end] = number[start];
            number[start] = temp;
            start++;
            end--;
            
        }
    }
}
