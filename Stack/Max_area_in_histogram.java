import java.util.ArrayList;
import java.util.Stack;

public class Max_area_in_histogram {
    public static void main(String[] args) {
        int height[] ={2,1,5,6,2,3};
        Max_area_histogram(height);
    }


    public static void Max_area_histogram(int height[]){
        int nsr[] = new int[height.length];
        int nsl[] = new int[height.length];

        //Next right smaller
        Stack<Integer> s = new Stack<>();
        for( int i = height.length-1; i>=0; i--){

            while (!s.isEmpty() && height[s.peek()] >= height[i]){
               s.pop(); 
            }
               if(s.isEmpty()){
                    nsr[i] = height.length;
               }
               else{
                 nsr[i] = s.peek();
               }
               s.push(i); 
            
        }
        PrintArray(nsr);

        //Next left smaller
        s = new Stack<>();
        for( int i = 0; i<height.length; i++){

            while (!s.isEmpty() && height[s.peek()] >= height[i]){
               s.pop(); 
            }
               if(s.isEmpty()){
                    nsl[i] = -1;
               }
               else{
                 nsl[i] = s.peek();
               }
               s.push(i); 
            
        }
        PrintArray(nsl);
       
        int max =0;
        for(int i = 0; i<height.length; i++){
            int high = height[i];
            int width = nsr[i] - nsl[i] -1;
            int area = high*width;
            max = Math.max(area, max);

        }
        System.out.println(max);
    }


    public static void PrintArray(int arr[]){
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
