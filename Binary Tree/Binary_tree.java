import java.util.LinkedList;
import java.util.Queue;
import java.util.*;
import java.lang.Math;

/**
 * Binary_tree
 */
public class Binary_tree {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }

    static class Binary_trees {
        static int idx = -1;

        public static Node BuildTree(int nodes[]) { // O(n)
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = BuildTree(nodes);
            newNode.right = BuildTree(nodes);

            return newNode;

        }

        public static void preorder(Node root) { // O(n)

            if (root == null) {
                System.out.print("-1" + " ");
                return;
            }
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }

        public static void inorder(Node root) { // O(n)

            if (root == null) {
                // System.out.print("-1" + " ");
                return;
            }
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }

        public static void postorder(Node root) { // O(n)

            if (root == null) {
                // System.out.print("-1" + " ");
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }

        public static void levelorder(Node root){ //O(n)

            if(root == null){
                
                return;
            }
           Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while (!q.isEmpty()) {
                Node currNode = q.remove();
                if (currNode==null) {
                    if (q.isEmpty()) {
                        break;
                    }else{
                        q.add(null);
                    }
                }else{
                    System.out.print(currNode.data + " ");
                    if(currNode.left != null){
                        q.add(currNode.left);
                    }
                    if(currNode.right != null){
                        q.add(currNode.right);
                    }
                }
            }

            
        }



        public static int height(Node root){
            if (root == null) {
                return 0;
    
            }

            int LH = height(root.left);
            int RH = height(root.right);
            return Math.max(LH, RH) +1;
        }

        public static int Count(Node root){
            if (root == null) {
                return 0;
    
            }

            int LH = Count(root.left);
            int RH = Count(root.right);
            return RH + LH + 1;
        }

        public static int Sum_of_Nodes(Node root){
            if (root == null) {
                return 0;
    
            }

            int LH = Count(root.left);
            int RH = Count(root.right);
            return RH + LH + root.data;
        }


        public static int diameter(Node root){
            if(root ==  null){
                return 0;
            }

            int leftDiameter = diameter(root.left);
            int rightDiameter = diameter(root.right);
            int lh = height(root.left);
            int rh = height(root.right); 
    
            int selfNode = lh +rh+1;
    
            return Math.max(selfNode , Math.max(leftDiameter , rightDiameter));
        }

       








    }
 
     public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        Binary_trees tree = new Binary_trees();
        Node root = tree.BuildTree(nodes);
        System.out.println(tree.diameter(root));
    }
}