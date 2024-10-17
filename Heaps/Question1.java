
import java.util.*;
public class Question1  {

    static class largest  implements Comparable<largest>{
        int val; 
        public largest(int val){
            this.val = val;
        }

        @Override
        public int compareTo(largest s1){
            return s1.val - this.val;
        }
    
        
    }

    public static void main(String[] args) {
        int steam[] = {10,20,11,70,50,40,100,5};
        PriorityQueue<largest> pq = new PriorityQueue<>();

        for(int i =0; i<steam.length; i++){
            pq.add(new largest(steam[i]));
        }
        int k =5;

        for(int i =0; i<k-1; i++){
            pq.remove();
        }

        System.out.println(pq.peek().val);
    }
    
}
