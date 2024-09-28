import java.util.*;

public class Stackbasics {
    public static void main(String[] args) {
        // StackArrayList s = new StackArrayList();
        // s.push(1);
        // s.push(2);
        // s.push(3);
        // while (!s.isEmpty()) {
        //     System.out.println(s.peek());
        //     s.pop();
        // }
        StackLinkedList s1 = new StackLinkedList();

    }

    static class Node{
        int data; 
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class StackLinkedList{
        static Node head = null;
        public static boolean isEmpty(){
            return head == null;
        }

        public static void push(int data){
            Node newNode = new Node(data);

            if(isEmpty()){
                head = newNode;
            }
            
            newNode.next = head;
            head = newNode;
        }

        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }
    }
    
    static class StackArrayList {
        static ArrayList<Integer> list = new ArrayList<>();

        // if stack is empty
        public static boolean isEmpty() {
            return list.size() == 0;
        }

        // push the data
        public static void push(int data) {
            list.add(data);
        }

        // pop the data
        public static int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        // peek of the data 
        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            return list.get(list.size() - 1);
        }
    }
}
