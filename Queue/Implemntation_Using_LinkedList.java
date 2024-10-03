import java.util.*;

public class Implemntation_Using_LinkedList {

    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next = null;
        }
    }
    
    static class Queue1 {
        
        static Node  head = null;
        static Node  tail = null;

        public static boolean isEmpty(){
                return head == null && tail == null;
        }
        
        
        //add 
        public static void add(int data){
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;
                return;
            }

            tail.next = newNode;
            tail = newNode;
        }

        //remove

        public static int Remove(){

            if (isEmpty()) {
                System.out.println("queue is empty");
                return -1;
            }

            int front = head.data;

            if (tail == head) {
                tail = head = null;
            }
            else{
                head = head.next;
            }

            return front;   

        }

        public static int peek(){
            if (isEmpty()) {
                System.out.println("queue is empty");
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        // Queue1 q = new Queue1();
        Queue<Integer> q1 = new LinkedList<>();
        q1.add(1);
        q1.add(2);
        q1.add(3);
         
        while (!q1.isEmpty()) {
            System.out.println(q1.peek());
            q1.remove();
        }


    }
}
