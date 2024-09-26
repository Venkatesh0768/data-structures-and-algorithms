public class Linkedlist {
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFrist(int data) {
        Node newnode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;

    }

    public void addLast(int data) {
        Node newnode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newnode;
            return;
        }
        tail.next = newnode;
        tail = newnode;
    }

    public void print() {
        Node temp = head;
        if (head == null) {
            System.out.println("LinkedList is Empty");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }

    }

    public void add(int idx, int data) {
        if (idx == 0) {
            addFrist(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst() {
        if (size == 0) {
            System.out.println("The Linked List Is Empty");
            size = 0;
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }

        int val = head.data;
        head = head.next;
        return val;
    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("The Linked List Is Empty");
            size = 0;
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }

        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;

    }

    public static boolean isCycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }

        }
        return false;

    }

    public static void removeCycle() {
        // first to detect the cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = true;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                cycle = true;
            }

        }
        if (cycle = false) {
            return;
        }
        slow = head;
        Node prev = null;
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        prev.next = null;

        // find the meeting

        // remove cycle ->last.next = null

    }
    private Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast= fast.next.next;
        }
        return slow;
    }

    private Node merge(Node lefthead , Node righthead ){
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while ( lefthead != null && righthead != null) {
            if (lefthead.data <= righthead.data) {
                temp.next = lefthead;
                lefthead = lefthead.next; 
            }else{
                temp.next = righthead;
                righthead = righthead.next;
            }
            temp = temp.next;
        }
        while (lefthead != null) {
            temp.next = lefthead;
            lefthead =lefthead.next;
            temp = temp.next;

        }
        while (righthead != null) {
            temp.next = righthead;
            righthead = righthead.next;
            temp = temp.next;
        }

        return mergedLL.next;

    }
    
    public Node mergerSort(Node head) {
        if (head == null || head.next == null) {
            return head; // Base case: return if list is empty or has one element
        }
    
        // Step 1: Find the middle of the linked list
        Node mid = getMid(head);
        
        // Step 2: Split the linked list into two halves
        Node righthead = mid.next;  // Right half starts from mid.next
        mid.next = null;  // End the left half
    
        // Step 3: Recursively sort both halves
        Node lefthead = mergerSort(head);  // Sort the left half
        Node rightHead = mergerSort(righthead);  // Sort the right half
    
        // Step 4: Merge the two sorted halves
        return merge(lefthead, rightHead);
    }
    


    // public Node mergerSort(Node head){
    //     if(head ==null || head.next == null){
    //         return head;
    //     }
    //     //find mid 
    //     Node mid = getMid(head);
        
    //     //left & right ms 
    //     Node righthead = mid.next;
    //     mid.next = null;
    //     Node lefthead = mergerSort(head);  // Sort the left half
    //     Node rightHead = mergerSort(righthead);

    //     //merge
    //     return merge(lefthead , rightHead);
    // }


                                                                                    //ZIG ZAG CODE

    public void zigZAG(){
        //find mid 
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next !=  null) {
            slow =slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        //reverse the second half 
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev =curr;
            curr = next;
        }
        Node left = head;
        Node right = prev;
        Node nextL , nextR;

        //alt merge - ZIGZAG 
        while (left != null && right != null) {
            nextL = left.next;
            left.next = right;
            nextR =right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;

        }

    }                                                                             

    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
         ll.addFrist(1);
         ll.addFrist(2);
         ll.addFrist(3);
         ll.addFrist(4);
         ll.addFrist(5);
         ll.zigZAG();
         ll.print();

        // Linkedlist.Node(int data)
        // head.next = new Node(2);
        // head.next.next = new Node(3);
        // head.next.next.next = head;
        // ll.addFrist(1);
        // ll.addFrist(5);
        // ll.addLast(8);
        // ll.addLast(6);
        // ll.add(2, 10);
        // ll.head.next.next
        // ll.removeLast();
        // ll.removeFirst();
        // ll.print();
        // ll.add(2, 12);
        // ll.print();
        // System.out.println("The Size Of the LinkedList -> " + size);

    

    }
}
