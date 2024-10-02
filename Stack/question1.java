import java.util.*;

public class question1 {

    public class  Node {
        char data;
        Node next;

        public Node(char data){
            this.data = data;
            this.next = null;
        }
        
    }
    public static Node head;
    public static Node tail;


    public void addFirst(char data){
        Node newNode = new Node(data);
        if(head == null){
            head= tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public static void print() {
        Node temp = head;
        if (head == null) {
            System.out.println("LinkedList is Empty");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");

    }

    public static void main(String[] args) {
        question1 s = new question1();
        s.addFirst('a');
        s.addFirst('e');
        // s.addFirst('c');
        // s.addFirst('c');
        s.addFirst('c');
        s.addFirst('a');
        s.print();


        String str = "abccba";
        LinkedList_palidrome_Stack(str);

        String anotherStr = "ababa";
        if (palidromeStack(anotherStr)) {
            System.out.println(anotherStr + " is a palindrome");
        } else {
            System.out.println(anotherStr + " is not a palindrome");
        }

        // String str = "ababa";
        // System.out.println(palidromeStack(str));

    }
    //using LinkedList
    public static void LinkedList_palidrome_Stack(String str){
        Stack<Character> s = new Stack<>();
        Node temp = head;

        if (head == null) {
            System.out.println("LinkedList is Empty");
            return;
        }

        while (temp != null) {
            s.push(temp.data);
            temp = temp.next;
        }
;

        boolean isPalindrome = true;
        for(int i =0 ; i<str.length(); i++){
            if(s.isEmpty() || s.pop() != str.charAt(i)){
                isPalindrome =  false;
                break;
            }
        }

        if(isPalindrome){
            System.out.println("The given string is Palindrome");
        }
        else{
            System.out.println("The given string is  not Palindrome");
        }
;
       
    }


    //using Stack to finding pliandrome 

    public static boolean palidromeStack(String str){
        Stack<Character> s = new Stack<>();
       
        for (int i = 0; i < str.length(); i++) {
            s.push(str.charAt(i));
        }

        // Pop characters and compare with original string to check for palindrome
        for (int i = 0; i < str.length(); i++) {
            if (s.pop() != str.charAt(i)) {
                return false;
            }
        }
        return true;
       
    }
}
