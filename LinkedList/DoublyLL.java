public class DoublyLL {
    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next= null;
            this.prev = null;
        }
        
    }

    public static Node head;
    public static Node tail;
    public static int size;

                                                            //addFrist 
    public void addFrist(int data){
        Node newNode = new Node(data);
        size++;
        if (head == null || tail == null) {
            head = tail=newNode; 
            return;
        }

        newNode.next= head;
        head.prev= newNode;
        head = newNode;
    }
                                                        //removeFrist


    public int removeFrist(){
        if (head == null) {
            System.out.println("linkedList is Empty");
            return Integer.MIN_VALUE;
        }

        if(size ==1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }

        int val = head.data;
        head = head.next;
        head.prev =null;
        size--;
        return val;
    }

                                                        //addLast 

    public void  addLast(int data){
        Node newNode = new Node(data);
        if (head ==null) {
            head = tail = null;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        newNode.next =null;
        tail = newNode;
    }  
    
                                                        //removeLast
    public int removeLast(){
        if (head ==null) {
            head = tail = null;
            return Integer.MIN_VALUE;
        }
        if(size ==1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = tail.data;
        tail = tail.prev;
        tail.next = null;
        size--;
        return val;
    }                                                  



    public void print(){
        Node temp = head;
        if (head == null) {
            System.out.println("LinkedList is empty ");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp= temp.next;
        }
        System.out.println("null");
    }


    public void reverseLL(){
        Node curr = head;
        Node prev = null;
        Node next;

        while (curr != null ) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;

            prev =curr;
            curr= next; 
        }
        head = prev;
    }


    public static void main(String[] args) {
        DoublyLL dl = new DoublyLL();
        dl.addFrist(3);
        dl.addFrist(2);
        dl.addFrist(6);
        dl.addFrist(5);
        dl.addLast(10);
    



        dl.print();
        System.out.println();
        System.out.println(dl.size);

        dl.reverseLL();
        dl.print();

        // dl.removeLast();;
        // dl.print();
        // System.out.println();
        // System.out.println(dl.size);

        // dl.removeFrist();
        // dl.print();
        // System.out.println();
        // System.out.println(dl.size);
    }
}
