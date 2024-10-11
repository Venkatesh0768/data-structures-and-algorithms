import java.util.ArrayList;

public class Question4 {
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


    public static void Two_sum( Node root1 , Node root2 , int X){
        ArrayList<Integer> inorder1 = new ArrayList<>();
        getInorder(root1, inorder1);

        ArrayList<Integer> inorder2 = new ArrayList<>();
        getInorder(root2, inorder2);

        for(int i =0; i<inorder1.size(); i++){
            for(int j=0; j<inorder2.size(); j++ ){
                if (inorder1.get(i) + inorder2.get(j)== X) {
                    System.out.println("(" + inorder1.get(i) + " , " + inorder2.get(j) + ")");
                }
            }
        }


    }
    public static void main(String[] args) {

         // Creating the first BST
         Node root1 = new Node(5);
         root1.left = new Node(3);
         root1.right = new Node(7);
         root1.left.left = new Node(2);
         root1.left.right = new Node(4);
         root1.right.left = new Node(6);
         root1.right.right = new Node(8);
 
         // Creating the second BST
         Node root2 = new Node(10);
         root2.left = new Node(6);
         root2.right = new Node(15);
         root2.left.left = new Node(3);
         root2.left.right = new Node(8);
         root2.right.left = new Node(11);
         root2.right.right = new Node(18);

         Two_sum(root1, root2, 16);


    }
}
