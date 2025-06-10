import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
};

class LinekedList {

    static Node arraytoLL(int arr[]) {
        Node head = new Node(arr[0]);
        Node temp = head;
        for (int i = 1; i < arr.length; i++) {
            Node newNode = new Node(arr[i]);
            temp.next = newNode;
            temp = newNode;
        }

        return head;
    }

    // inseration of the Node In LL
    static Node insertAtHead(Node head, int val) {
        if (head == null || head.next == null) {
            return new Node(val);
        }
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        return head;
    }

    static Node insertAtTail(Node head, int val) {
        if (head == null || head.next == null) {
            return new Node(val);
        }
        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        Node newNode = new Node(val);
        tail.next = newNode;
        return head;
    }

    static Node insertAtKthNode(Node head, int val, int k) {
        if (k <= 0) {
            return head;
        }

        Node newNode = new Node(val);

        int cnt = 1;
        Node temp = head;

        if (k == 1) {
            return insertAtHead(head, val);
        }

        while (temp != null && cnt < k - 1) {
            temp = temp.next;
            cnt++;
        }

        if (temp == null) {
            System.out.println("Position is out of bound");
            return head;
        }

        newNode.next = temp.next;
        temp.next = newNode;

        return head;
    }

    // Deletetion of the Node In LL
    static Node deleteAtHead(Node head) {
        if (head == null || head.next == null) {
            return null;
        }
        head = head.next;
        return head;
    }

    static Node deleteAtTail(Node head) {
        if (head == null || head.next == null) {
            return null;
        }
        Node tail = head;
        while (tail.next.next != null) {
            tail = tail.next;
        }
        tail.next = null;
        return head;
    }

    static Node deleteAtKthNode(Node head, int k) {
        if (k <= 0) {
            return null;
        }

        int cnt = 1;
        Node temp = head;

        if (k == 1) {
            return deleteAtHead(head);
        }

        while (temp != null && cnt < k - 1) {
            temp = temp.next;
            cnt++;
        }

        if (temp == null) {
            System.out.println("Position is out of bound");
            return head;
        }
        Node curr = temp.next;
        temp.next = curr.next;
        curr.next = null;
        return head;
    }
    
    
    //Find the lenght of the LL
    static void lengthOfLL(Node head){
        Node temp = head;
        int len =0;
        while (temp != null) {
            len++;
            temp = temp.next;
        }
        System.out.println(len);
    }
    
    //searching in LL
    static boolean searchInLL(Node head , int val){
        Node temp = head;
        while (temp !=null) {
            if (temp.data == val) {
                return true;
            }
            temp = temp.next;
        }

        return false;
    }
    
    //reverse the LL
    static Node reverseLL(Node head){
        Node prev = null;
        Node curr = head;
        Node next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }


    
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        Node head = arraytoLL(arr);

        lengthOfLL(head);
        head = reverseLL(head);
        System.out.println(searchInLL(head, 10));

        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data + " ");
            temp = temp.next;
        }

    }
}