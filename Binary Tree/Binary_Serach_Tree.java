
/**
 * InnerBinary_Serach_Tree
 */

import java.sql.RowId;
import java.util.*;;

class Node {
    int key;
    Node left;
    Node right;

    public Node(int key) {
        this.key = key;
        this.left = null;
        this.right = null;
    }

}

public class Binary_Serach_Tree { // O(H)

    static Node search(Node root, int key) {
        if (root == null || root.key == key) {
            return root;
        }

        if (root.key < key) {
            return search(root.right, key);
        }

        return search(root.left, key);
    }

    static Node Inseration(Node root, int val) { // O(H)

        if (root == null) {
            root = new Node(val);
            return root;
        }

        if (root.key > val) {
            root.left = Inseration(root.left, val);
        } else {
            root.right = Inseration(root.right, val);
        }

        return root;

    }

    public static Node deleteNode(Node root, int key) {
        if (root.key > key) {
            deleteNode(root.left, key);
        } else if (root.key < key) {
            deleteNode(root.right, key);
        } else {
            // case 1
            if (root.left == null && root.right == null) {
                return null;
            }

            // case2 one Node in the root
            if (root.left == null) {
                return root.right;
            }

            if (root.right == null) {
                return root.left;
            }

            // two Nodes

            Node IS = findInorderSuccessor(root.right);
            root.key = IS.key;
            root.right = deleteNode(root.right, IS.key);
        }

        return root;
    }

    public static Node findInorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.key + " ");
        inOrder(root.right);
    }

    public static void PrintInRange(Node root, int k1, int k2) {
        if (root == null) {
            return;
        }
        if (root.key >= k1 && root.key <= k2) {
            PrintInRange(root.left, k1, k2);
            System.out.print(root.key + " ");
            PrintInRange(root.right, k1, k2);
        } else if (root.key < k1) {
            PrintInRange(root.left, k1, k2);
        } else {
            PrintInRange(root.right, k1, k2);
        }

    }

    public static void PrintLeafPath(ArrayList<Integer> path) {
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + " ");
        }
        System.out.println();
    }

    public static void Print2Leafpath(Node root, ArrayList<Integer> path) {
        if (root == null) {
            return;
        }
        path.add(root.key);
        if (root.left == null && root.right == null) {
            PrintLeafPath(path);
        }
        Print2Leafpath(root.left, path);
        Print2Leafpath(root.right, path);
        path.remove(path.size() - 1);

    }

    public static Node CreateMirror(Node root) { // o(n)
        if (root == null) {
            return null;
        }
        Node LeftSubtreee = CreateMirror(root.left);
        Node RightSubtree = CreateMirror(root.right);

        root.left = RightSubtree;
        root.right = LeftSubtreee;

        return root;
    }

    public static Node Balanced_tree(int si, int ei, int arr[]) {
        if (si > ei) {
            return null;
        }
        int mid = (si + ei) / 2;
        Node root = new Node(arr[mid]);
        root.left = Balanced_tree(si, mid - 1, arr);
        root.right = Balanced_tree(mid + 1, ei, arr);

        return root;

    }

    public static void getInOrder(Node root, ArrayList<Integer> inorder) {
        if (root == null) {
            return;
        }
        getInOrder(root.left, inorder);
        inorder.add(root.key);
        getInOrder(root.right, inorder);

    }

    public static Node CreateBST(ArrayList<Integer> inorder, int si, int ei) {
        if (si > ei) {
            return null;
        }
        int mid = (si + ei) / 2;
        Node root = new Node(inorder.get(mid));
        root.left = CreateBST(inorder, si, mid - 1);
        root.right = CreateBST(inorder, mid + 1, ei);

        return root;

    }

    public static Node Balanced_BST(Node root) {

        // inorder
        ArrayList<Integer> inorder = new ArrayList<>();
        getInOrder(root, inorder);

        root = CreateBST(inorder, 0, inorder.size() - 1);

        return root;

    }

    public static void PreOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.key + " ");
        PreOrder(root.left);
        PreOrder(root.right);
    }

    static class info {

        boolean isBST;
        int size;
        int max;
        int min;

        public info(boolean isBST, int min, int max, int size) {
            this.isBST = isBST;
            this.min = min;
            this.max = max;
            this.size = size;
        }

    }

    public static int MaxSize = 0;

    public static info largest_BST(Node root) {

        if (root == null) {
            return new info(true, Integer.MAX_VALUE, Integer.MIN_VALUE, 0);
        }

        info Leftinfo = largest_BST(root.left);
        info RightInfo = largest_BST(root.right);

        int size = Leftinfo.size + RightInfo.size + 1;

        int min = Math.min(root.key, Math.min(Leftinfo.min, RightInfo.min));
        int max = Math.max(root.key, Math.max(Leftinfo.max, RightInfo.max));

        if (root.key <= Leftinfo.max || root.key >= RightInfo.min) {
            return new info(false, min, max, size);
        }

        if (Leftinfo.isBST && RightInfo.isBST) {
            MaxSize = Math.max(MaxSize, size);
            return new info(true, min, max, size);

        }

        return new info(false, min, max, size);

    }


    public static void getInOrder2(Node root , ArrayList<Integer>  inorder){
        if (root == null) {
            return;
        }

        getInOrder2(root.left, inorder);
        inorder.add(root.key);
        getInOrder2(root.right, inorder);

    }
    
    public static Node MergeBSTs(Node root1 , Node root2){
        ArrayList<Integer> inorder1 = new ArrayList<>();
        getInOrder2(root1, inorder1);

        ArrayList<Integer> inorder2 = new ArrayList<>();
        getInOrder2(root2, inorder2);
        

        int i =0; 
        int j =0;

        ArrayList<Integer> FinalArr = new ArrayList<>();

        while (i<inorder1.size() && j<inorder2.size()) {
            if (inorder1.get(i)  < inorder2.get(j)) {
                FinalArr.add(inorder1.get(i));
                i++;
            }else{
                FinalArr.add(inorder2.get(j));
                j++;
            }
        }

        while (i<inorder1.size()) {
            FinalArr.add(inorder1.get(i));
            i++;
        }

        while (j<inorder2.size()) {
            FinalArr.add(inorder2.get(j));
            j++;
        }

         return CreateBST(FinalArr, 0, FinalArr.size() - 1);
    }



    public static void main(String[] args) {

        // Node root = new Node(50);

        // root.left = new Node(30);
        // root.left.left = new Node(5);
        // root.left.right = new Node(20);

        // root.right = new Node(60);
        // root.right.left = new Node(45);
        // root.right.right = new Node(70);
        // root.right.right.left = new Node(65);

        // root.right.right.right = new Node(80);



        Node root1 = new Node(2);

        root1.left = new Node(1);
        root1.right = new Node(4);
        

        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);

        Node root = MergeBSTs(root1 , root2);
        PreOrder(root);

        
        // info Info1 = largest_BST(root);
        // System.out.println("Largest Bst is " + MaxSize);


        // int arr[] = {3,5,6,8,10,11,12};
        // Node root1 = Balanced_tree(0, arr.length -1, arr);
        // PreOrder(root1);

        // int values[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        // Node root = null;

        // for (int i = 0; i < values.length; i++) {
        // root = Inseration(root, values[i]);
        // }

        // Print2Leafpath(root, new ArrayList<>());
        // root = CreateMirror(root);
        // PreOrder(root);

        // inOrder(root);
        // System.out.println();
        // PrintInRange(root, 5, 12);

        // i

        
        // // inOrder(root);
        // // System.out.println();
        // root = Balanced_BST(root);
        // PreOrder(root);

        // System.out.println(search(root, 70) != null ? "Found " : "Not Found");
        // System.out.println(search(root, 45+0) != null ? "Found " : "Not Found");

        // Node root = new Node(8);
        // root.left = new Node(6);
        // root.left.left = new Node(5);
        // root.left.left.left = new Node(3);
        // root.right = new Node(10);
        // root.right.right = new Node(11);
        // root.right.right.right = new Node(12);

        // Balancing the BST
        // root = Balanced_BST(root);

        // // Printing the balanced tree using PreOrder traversal
        // System.out.println("PreOrder Traversal of Balanced BST:");
        // inOrder(root);
    }

}
