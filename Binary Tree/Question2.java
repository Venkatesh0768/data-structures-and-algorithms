import java.util.ArrayList;
import java.util.Dictionary;

public class Question2 {
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

    public static Node BST(Node root, int key) {

        if (root == null || root.key == key) {
            return root;
        }

        if (root.key < key) {
            return BST(root.right, key);
        }

        return BST(root.left, key);

    }
    

    public static void getInorder(Node root , ArrayList<Integer> push){
        if (root == null) {
            return;
        }
        getInorder(root.left , push);
        push.add(root.key);
        getInorder(root.right, push);
    }


    public static void Difference(Node root , int key){
         ArrayList<Integer> inorder = new ArrayList<>();
         ArrayList<Integer> absValues = new ArrayList<>();
         getInorder(root , inorder);

    
         int max = Integer.MAX_VALUE;
         int n =0;
         for(int i=0; i<inorder.size(); i++){
            absValues.add(Math.abs(key - inorder.get(i)));

            if (max > absValues.get(i)) {
                max = absValues.get(i);
                n =i;

                // System.out.println(inorder.get(i));
            }
         }

         System.out.println(inorder.get(n) + " ("+"Difference is " + max + ")");
    } 

    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(11);

        root.left.left = new Node(3);
        root.left.right = new Node(6);

        root.right.right = new Node(20);

        Difference(root, 5);
    }
}
