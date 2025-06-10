import java.util.HashMap;

class Node {
    int data;
    Node next;

    Node(){}

    Node(int data) {
        this.data = data;
        this.next = null;
    }

    Node(int data , Node next) {
        this.data = data;
        this.next = next;
    }
}

public class test {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5 };
        int[] arr1 ={6,7,8,9,10};

        Node list1 = new Node();
        Node list2 = new Node();
        Node newNode = new Node();
        

        list1 = convertArrIntoLL(arr);
        list2 = convertArrIntoLL(arr1);

        newNode = mergeTwoSortedLL(list1, list2);
        reorderList(newNode);


        Node temp = newNode;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }

    static void reorderList(Node head){
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node second = slow.next;
        Node prev = slow.next = null;

        while (second != null) {
            Node temp = second.next;
            second.next = prev;
            prev = second;
            second = temp;
        }


        Node first = head;
        second = prev;

        while (second != null) {
            Node tmp1 = first.next;
            Node tmp2 = second.next;

            first.next = second;
            second.next = tmp1;

            first =tmp1;
            second = tmp2;
        }
    }

    static Node mergeTwoSortedLL(Node list1, Node list2) {
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

    static Node reverseLL(Node head) {
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;
    }

    static Node convertArrIntoLL(int arr[]) {
        if (arr == null || arr.length == 0) {
            return null;
        }
        Node head = new Node(arr[0]);
        Node prev = head;

        for (int i = 1; i < arr.length; i++) {
            Node newNode = new Node(arr[i]);
            prev.next = newNode;
            prev = newNode;
        }

        return head;
    }

    static boolean hasCycle1(Node head) {
        HashMap<Node , Integer> map = new HashMap<>();
        Node temp = head;

        while(temp != null){
            if(map.containsKey(temp)) {
                return true;
            }
            else{
                map.put(temp, 1);
            }

            temp = temp.next;
        }

        return false;
    }
    static boolean hasCycle(Node head) {
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) return true;
        }

        return false;
    }
}