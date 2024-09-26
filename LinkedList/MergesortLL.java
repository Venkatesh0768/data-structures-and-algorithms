public class MergesortLL {

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

    // Function to find the middle of the linked list
    private Node getMid(Node head) {
        if (head == null || head.next == null) {
            return head; // Base case: if the list is empty or has one node, return the node
        }

        Node slow = head;
        Node fast = head.next; // Start fast one step ahead to avoid returning the same node

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow; // Slow pointer will be at the middle
    }

    // Function to merge two sorted linked lists
    private Node merge(Node lefthead, Node righthead) {
        Node mergedLL = new Node(-1); // Dummy node
        Node temp = mergedLL;

        while (lefthead != null && righthead != null) {
            if (lefthead.data <= righthead.data) {
                temp.next = lefthead;
                lefthead = lefthead.next;
            } else {
                temp.next = righthead;
                righthead = righthead.next;
            }
            temp = temp.next;
        }
        while (lefthead != null) {
            temp.next = lefthead;
            lefthead = lefthead.next;
            temp = temp.next;
        }
        while (righthead != null) {
            temp.next = righthead;
            righthead = righthead.next;
            temp = temp.next;
        }

        return mergedLL.next; // Skip the dummy node
    }

    // Merge sort function
    public Node mergerSort(Node head) {
        // Base case: if list is empty or has only one element
        if (head == null || head.next == null) {
            return head;
        }

        // Find the mid
        Node mid = getMid(head);

        // Split into two halves
        Node rightHead = mid.next;
        mid.next = null;

        // Debugging: Print left and right sublists before sorting
        System.out.println("Left list before sorting: ");
        printList(head);
        System.out.println("Right list before sorting: ");
        printList(rightHead);

        // Recursively sort the two halves
        Node lefthead = mergerSort(head);
        Node righthead = mergerSort(rightHead);

        // Merge two sorted halves
        return merge(lefthead, righthead);
    }

    // Function to print the linked list
    public void print() {
        printList(head);
    }

    private void printList(Node node) {
        if (node == null) {
            System.out.println("null");
            return;
        }
        while (node != null) {
            System.out.print(node.data + " -> ");
            node = node.next;
        }
        System.out.println("null");
    }

    // Function to add a node at the beginning of the linked list
    public void addFirst(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = tail = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    public static void main(String[] args) {
        MergesortLL ll = new MergesortLL();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);

        ll.print();

        ll.head = ll.mergerSort(ll.head); // Perform merge sort on the linked list

        System.out.println("Sorted list:");
        ll.print(); // Print sorted list
    }
}
