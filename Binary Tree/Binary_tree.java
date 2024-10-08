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

        public static void levelorder(Node root) { // O(n)

            if (root == null) {

                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while (!q.isEmpty()) {

                Node currNode = q.remove();

                if (currNode == null) {
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(currNode.data + " ");
                    if (currNode.left != null) {
                        q.add(currNode.left);
                    }
                    if (currNode.right != null) {
                        q.add(currNode.right);
                    }
                }
            }

        }

        public static int height(Node root) {
            if (root == null) {
                return 0;

            }

            int LH = height(root.left);
            int RH = height(root.right);
            return Math.max(LH, RH) + 1;
        }

        public static int Count(Node root) {
            if (root == null) {
                return 0;

            }

            int LH = Count(root.left);
            int RH = Count(root.right);
            return RH + LH + 1;
        }

        public static int Sum_of_Nodes(Node root) {
            if (root == null) {
                return 0;

            }

            int LH = Count(root.left);
            int RH = Count(root.right);
            return RH + LH + root.data;
        }

        public static int diameter(Node root) {
            if (root == null) {
                return 0;
            }

            int leftDiameter = diameter(root.left);
            int rightDiameter = diameter(root.right);
            int lh = height(root.left);
            int rh = height(root.right);

            int selfNode = lh + rh + 1;

            return Math.max(selfNode, Math.max(leftDiameter, rightDiameter));
        }

    }

    public static boolean isIdentical(Node node, Node subtree) {
        if (node == null && subtree == null) {
            return true;
        } else if (node == null || subtree == null || node.data != subtree.data) {
            return false;
        }
        if (!isIdentical(node.left, subtree.left)) {
            return false;
        }
        if (!isIdentical(node.right, subtree.right)) {
            return false;
        }

        return true;
    }

    public static boolean isSubtree(Node root, Node subtree) {
        if (root == null) {
            return false;
        }

        if (root.data == subtree.data) {
            if (isIdentical(root, subtree)) {
                return true;
            }

        }

        return isSubtree(root.left, subtree) || isSubtree(root.right, subtree);

    }

    public List<Integer> inorderTraversal(Node root) {
        List<Integer> list = new ArrayList<>();

        if (root == null) {
            System.out.println("Node is Empty");
        }
        inorderTraversal(root.left);
        list.add(root.data);
        inorderTraversal(root.right);

        return list;

    }

    static class info {
        Node node;
        int hd;

        public info(Node node , int hd){
            this.node = node;
            this.hd =hd;
        }

    }

    public static void TopView(Node root){

        //level order 
        Queue<info> q =  new LinkedList<>();
        HashMap<Integer,Node > map = new HashMap<>();
        int min =0; int max =0;
        q.add(new info(root , 0));
        q.add(null);

        while (!q.isEmpty()) {
            info currNode = q.remove();
            if (currNode ==  null) {
                if (q.isEmpty()) {
                    break;
                }
                else{
                    q.add(null);
                }
                
            }else{

                if (!map.containsKey(currNode.hd)) {
                    map.put(currNode.hd, currNode.node);
                }   

                if (currNode.node.left != null) {
                    q.add(new info(currNode.node.left , currNode.hd-1));
                    min =  Math.min(min, currNode.hd-1);
                }

                if (currNode.node.right != null) {
                    q.add(new info(currNode.node.right , currNode.hd+1));
                    max = Math.max(max,  currNode.hd+1);
                }
            }
        }

        for(int i =min; i<=max; i++){
            System.out.print(map.get(i).data + " ");
        }



    }



       public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(5);
        root.left.left = new Node(4);
        root.right.left= new  Node(7);
        root.right.right = new Node(6);

            TopView(root);
    }
}