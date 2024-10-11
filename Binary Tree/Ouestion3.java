import java.util.ArrayList;

public class Ouestion3 {

    static class Node {
        int key;
        Node left;
        Node right;

        public Node(int key) {
            this.key = key;
            this.left = null;
            this.right = null;
        }

    }

    public static void getInorder(Node root , ArrayList<Integer> push){
        if (root == null) {
            return;
        }
        getInorder(root.left , push);
        push.add(root.key);
        getInorder(root.right, push);
    }


    public static void KthSmallest_element(Node root , int K){
         ArrayList<Integer> inorder = new ArrayList<>();
         getInorder(root , inorder);
        System.out.println(inorder.get(K));
    } 
    public static void main(String[] args) {

        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(11);

        root.left.left = new Node(3);
        root.left.right = new Node(6);

        root.right.right = new Node(20);

        KthSmallest_element(root, 5);
    
    }
}
