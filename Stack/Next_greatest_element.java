import java.util.Stack;

public class Next_greatest_element {
    public static void main(String[] args) {
        int arr[] = {5,7,2,3,1,4};
        int next_generator[] = new int[arr.length];

        next_greatest(arr , next_generator);

        for(int i =0; i<next_generator.length; i++){
            System.out.println(next_generator[i] + " ");
        }


    }

    public static void next_greatest(int arr[] , int nextg[]){

        Stack<Integer> s = new Stack<>();
        for( int i = arr.length-1; i>=0; i--){

            while (!s.isEmpty() && arr[s.peek()] <= arr[i]){
               s.pop(); 
            }
               if(s.isEmpty()){
                    nextg[i] = -1;
               }
               else{
                 nextg[i] = arr[s.peek()];
               }
               s.push(i);
            
            
        }
    }
}
