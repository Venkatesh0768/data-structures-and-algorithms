import java.util.*;

public class Stack_and_Queue_using_Dequeue {

    static class Stack_using_dequeue {

        static Deque<Integer> Deque = new LinkedList<>();

        public static void add(int data) {
            Deque.addLast(data);
        }

        public static int pop(){
            return Deque.removeLast();
        }

        public static int peek(){
            return Deque.getLast();
        }
    }

    public static void main(String[] args) {
            Stack_using_dequeue s = new Stack_using_dequeue();
            s.add(1);
            s.add(2);
            s.add(3);

            System.out.println(s.peek() + " ");
            System.out.println(s.pop());
            System.out.println(s.pop());
            System.out.println(s.pop());

    }
}