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

  // These should not be static, so each linked list has its own head, tail, and size
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
