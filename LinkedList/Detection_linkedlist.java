public class Detection_linkedlist {

    public class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
        
    }

    public static Node head;
    public static Node tail; 



    //methods
    public void addFrist(int data){
        Node newnode = new Node(data);
        if (head == null) {
            head = tail = newnode;
            return;
        }
        newnode.next =  head;
        head = newnode;
    }

    public void addLast(int data){
        Node newnode = new Node(data);
        if (head == null) {
            head = tail = newnode;
            return;
        }
        tail.next =  newnode;
        tail= newnode;
    }

    public void print(){
        Node temp = head;
        if (head == null) {
            System.out.println("Linked List is Empty");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }


    // Detection of loop 
    public static boolean isCycle(){
        Node slow =head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }

        }
        return false;
        
    }
    public void add(int idx , int data){
        if(idx == 0){
            addFrist(data);
            return;
        }
        Node newnode = new Node(data);
        Node temp =head;
        int i =0;
        while (i< idx-1) {
            temp = temp.next;
            i++;
        } 
        newnode.next = temp.next;
        temp.next = newnode;


    }




    public static void main(String[] args) {
      Detection_linkedlist ll = new Detection_linkedlist();
      ll.addFrist(1);
      ll.addFrist(5);
      ll.addLast(8);
      ll.addLast(6);
      ll.add(2, 10);
      ll.print();
    }
}