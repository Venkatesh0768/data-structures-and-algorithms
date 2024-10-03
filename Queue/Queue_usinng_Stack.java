import java.util.*;
public class Queue_usinng_Stack {

    static class Queue_push {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty(){
            return s1.isEmpty();
        }

        //add
        public static void add(int data){
            while (!s1.isEmpty()) {
                s2.push(s1.pop()); 
            }
            s1.push(data);

            while (!s2.isEmpty()) {
                s1.push(s2.pop()); 
            }

        }

        public static int remove(){
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }

            return s1.pop();
        }

        public static int peek(){
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }

            return s1.peek();
        }
        
    }
    static class Queue_pop {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty(){
            return s1.isEmpty();
        }

        //add

        public static void add(int data){
            s1.push(data);
            System.out.println(s1);
        }

        public static void remove(){
            
            while (!s1.isEmpty()) {
                s2.push(s1.pop()); 
            }
            s2.pop();

            while (!s2.isEmpty()) {
                s1.push(s2.pop()); 
            }

            
            
        }

        public static int peek(){
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }

            while (!s1.isEmpty()) {
                s2.push(s1.pop()); 
            }
            int peek = s2.peek();

            while (!s2.isEmpty()) {
                s1.push(s2.pop()); 
            }
            return peek;
        }
        
    }
   public static void main(String[] args) {

        Queue_pop s = new Queue_pop();
        s.add(1);
        s.add(2);
        s.add(3);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.remove();
        }
    
   } 
}
