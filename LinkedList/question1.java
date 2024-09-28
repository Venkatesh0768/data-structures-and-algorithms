public class question1 {

  // Inner class to represent a Node in the linked list
  public class Node {
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  // These should not be static, so each linked list has its own head, tail, and
  // size
  public Node head;
  public Node tail;
  public int size;

  // Constructor
  public question1() {
    this.head = null;
    this.tail = null;
    this.size = 0;
  }

  // Method to add a node at the beginning of the list
  public void addFirst(int data) {
    Node newnode = new Node(data);
    size++;
    if (head == null) {
      head = tail = newnode;
      return;
    }
    newnode.next = head;
    head = newnode;
  }

  // Method to print the linked list
  public void print() {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + "->");
      temp = temp.next;
    }
    System.out.println("null"); // Indicating the end of the list
  }

  // Method to get the size of the linked list
  public int getSize() {
    return size;
  }

  public void (int idx, int idx1) {
    if (idx == 0) {
        return;
    }
    Node temp = head;
    int i = 0;
    while (i != idx-1) {
        while(i <= idx +1 ){
          temp.next =null
        }
        temp.next= temp;
        temp
        i++;
    }
    newNode.next = temp.next;
    temp.next = newNode;
}
static Node skipMdeleteN(Node head, int m, int n)
    {
        Node curr = head; // Current node pointer
        Node t; // Temporary node pointer
        int count; // Counter variable

        // Traverse through the entire linked list
        while (curr != null) {

            // Skip m nodes
            for (count = 1; count < m && curr != null;
                 count++)
                curr = curr.next;

            // If end of the list is reached, return the
            // head
            if (curr == null)
                return head;

            // Start from the next node and delete n nodes
            t = curr.next;
            for (count = 1; count <= n && t != null;
                 count++) {
                Node temp = t;
                t = t.next;

                // Dereference the node for garbage
                // collection
                temp = null;
            }

            // Link the current node to the remaining list
            curr.next = t;

            // Move the current pointer to the next node
            curr = t;
        }

        return head;
    }





  // Main method to test the linked list functionality
  public static void main(String[] args) {
    question1 ll = new question1();
    ll.addFirst(7);
    ll.addFirst(6);
    ll.addFirst(3);
    ll.addFirst(2);
    ll.addFirst(1);
    ll.print(); // Output: 1->2->3->6->7->null

    question1 l1 = new question1();
    l1.addFirst(4);
    l1.addFirst(5);
    l1.print(); // Output: 5->4->null
  }
}
