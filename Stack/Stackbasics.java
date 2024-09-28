import java.util.*;

public class Stackbasics {
    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);

        // Print original stack
        System.out.println("Original Stack:");
        PrintStack(s);

        // Reverse the stack
        Reverse_a_stack(s);

        // Print reversed stack
        System.out.println("Reversed Stack:");
        PrintStack(s);
    }

    public static void PrintStack(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int x = s.pop();
        System.out.println(x);
        PrintStack(s);
        s.push(x); // Restore the stack
    }

    public static void Reverse_a_stack(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();
        Reverse_a_stack(s);
        pushBottom(s, top);
    }

    public static String reverseString(String str) {

        Stack<Character> s1 = new Stack<>();
        int idx = 0;
        while (idx < str.length()) {
            s1.push(str.charAt(idx));
            idx++;

        }

        StringBuilder result = new StringBuilder("");
        while (!s1.isEmpty()) {
            char top = s1.pop();
            result.append(top);

        }

        return str = result.toString();
    }

    public static void pushBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }

        int top = s.pop();
        pushBottom(s, data);
        s.push(top);
    }

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class StackLinkedList {
        static Node head = null;

        public static boolean isEmpty() {
            return head == null;
        }

        public static void push(int data) {
            Node newNode = new Node(data);

            if (isEmpty()) {
                head = newNode;
            }

            newNode.next = head;
            head = newNode;
        }

        public static int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        public static int peek() {
            if (isEmpty()) {
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
