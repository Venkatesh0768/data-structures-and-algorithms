import java.util.*;
import java.util.regex.MatchResult;
public class question4 {
    public static void main(String[] args) {
        int height[] = {4,2,0,3,2,5};
        TappingRainwater(height);
    }


    public static void TappingRainwater(int height[]){
        Stack<Integer> s = new Stack<>();
        int leftmax[] = new int[height.length];
        int rightmax[] = new int[height.length];

        //leftmax
        for(int i = height.length-1; i>=0; i--){
            while (!s.isEmpty() && height[s.peek()] <= height[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                leftmax[i] = height.length-1;
            }
            else{
                leftmax[i] = s.peek();
            }
            s.push(i);
        }
        PrintArray(leftmax);
       

        //rightmax
        s = new Stack<>();
        for(int i = 0; i<height.length; i++){
            while (!s.isEmpty() && height[s.peek()] <= height[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                rightmax[i] =height.length;
            }
            else{
                rightmax[i] = s.peek();
            }
            s.push(i);
        }
        PrintArray(rightmax);

        int Result =0;
        int waterlevel[] = new int[height.length];

        for(int i =0; i<height.length; i++ ){
            int width = Math.min(height[leftmax[i]] , height[rightmax[i]]) - height[i];
             waterlevel[i] = height[i] * width;
             Result += waterlevel[i];
        }

        System.out.println(Result);

        PrintArray(waterlevel);

        
       
        //sum of the total
    }
    public static void PrintArray(int arr[]){
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public int trap(int[] height) {
        int n = height.length;
        int left = 0 , right =n-1;
        int lmax = height[left] , rmax = height[right];
        int ans =0;

        while(left < right){
            if(height[left] < height[right]){
                lmax = Math.max(lmax , height[left]);
                ans += lmax - height[left];
                left++;
            }else{
                rmax = Math.max(rmax , height[right]);
                ans += rmax - height[right];
                right--;
            }

        }
        return ans;

        //time complexity - O(n)
        //space complexity - O(1)

        //this the assigment question i slovd but sloving this question there are many types like using leftmax and rightmax apporach firstly use brute force apporach 

        // int ans =0;
        // Stack<Integer> s = new Stack<>();

        // for(int i =0; i<height.length; i++){
        //     while(!s.isEmpty() && height[i] > height[s.peek()]){
        //         int top = s.pop();

        //         if(s.isEmpty()){
        //             break;
        //         }   


        //         int width = i - s.peek() -1;
        //         int height_boundarie = Math.min(height[i] , height[s.peek()]) - height[top];
        //         ans += width *  height_boundarie;
        //     }
        //     s.push(i);
        // }
        // return ans;

         //time complexity - O(n)
        //space complexity - O(n)}

    }
}
