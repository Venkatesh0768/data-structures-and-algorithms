class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }

    Node() {
        this.data = 0;
        this.next = null;
    }
}

class LinkedList {
    private Node head;

    void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    void setHead(Node head) {
        this.head = head;
    }

    Node getHead() {
        return head;
    }

    void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

class LinkedList1 {
    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();
        LinkedList newlist = new LinkedList();

        int[] arr = { 1, 2, 3 };
        for (int a : arr) {
            list1.addLast(a);
        }

        int[] arr1 = { 4, 5, 6 };
        for (int a : arr1) {
            list2.addLast(a);
        }

        newlist.setHead(mergeTwoLists(list1.getHead(), list2.getHead()));

        System.out.println("Merged List:");
        newlist.display();

    }

    static Node mergeTwoLists(Node list1, Node list2) {
        Node dummy = new Node();
        Node curr = dummy;

        while (list1 != null && list2 != null) {
            if (list1.data < list2.data) {
                curr.next = list1;
                list1 = list1.next;
            } else {
                curr.next = list2;
                list2 = list2.next;
            }

            curr = curr.next;
        }

        if (list1 != null) {
            curr.next = list1;
        } else {
            curr.next = list2;
        }

        return dummy.next;

    }

}