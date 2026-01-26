import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import javax.swing.tree.TreeCellRenderer;

class Tree {
    int val;
    Tree left, right;
    
    public Tree(int val) {
        this.val = val;
        left = right = null;
    }
    
}

public class BinaryTree {
    static int diameter = 0;

    public static void levelOrderTraversal(Tree root) {
        if (root == null)
            return;

        Queue<Tree> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Tree node = queue.poll();
            System.out.println(node.val + " ");

            if (node.left != null)
                queue.add(node.left);
            if (node.right != null)
                queue.add(node.right);
        }
    }

    public static void preorder(Tree root) {
        if (root == null) {
            return;
        }
        System.out.println(root.val);
        preorder(root.left);
        preorder(root.right);
    }

    public static void inorder(Tree root) {
        if (root == null) {
            return;
        }
        preorder(root.left);
        System.out.println(root.val);
        preorder(root.right);
    }

    public static void postorder(Tree root) {
        if (root == null) {
            return;
        }
        preorder(root.left);
        preorder(root.right);
        System.out.println(root.val);
    }

    public static void preorderIterative(Tree root) {
        if (root == null) {
            return;
        }

        Stack<Tree> st = new Stack<>();
        st.push(root);

        while (!st.isEmpty()) {
            Tree node = st.pop();
            System.out.println(node.val);

            if (node.left != null)
                st.push(node.left);
            if (node.right != null)
                st.push(node.right);
        }
    }

    public static void inorderIterative(Tree root) {
        Stack<Tree> st = new Stack<>();
        Tree curr = root;

        while (curr != null || !st.isEmpty()) {
            while (curr != null) {
                st.push(curr);
                curr = curr.left;
            }

            curr = st.pop();
            System.out.println(curr.val);
            curr = curr.right;
        }
    }

    public static void postOrderTraversal(Tree root) {
        if (root == null) {
            return;
        }

        Stack<Tree> st1 = new Stack<>();
        Stack<Tree> st2 = new Stack<>();

        st1.push(root);
        while (!st1.isEmpty()) {
            Tree node = st1.pop();
            st2.push(node);

            if (node.left != null)
                st1.push(node.left);
            if (node.right != null)
                st1.push(node.right);
        }

        while (!st2.isEmpty()) {
            System.out.print(st2.pop().val + " ");
        }
    }

    public static int height(Tree root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(height(root.left), height(root.right));
    }

    public static int size(Tree root) {
        if (root == null)
            return 0;
        return 1 + size(root.left) + size(root.right);

    }

    public static int countLeaves(Tree root) {
        if (root == null)
            return 0;
        if (root.left == null && root.right == null) {
            return 1;
        }
        return countLeaves(root.left) + countLeaves(root.right);
    }

    public static boolean isIdentical(Tree root1, Tree root2) {
        if (root1 == null && root2 == null)
            return true;
        if (root1 == null || root2 == null)
            return false;
        return (root1.val == root2.val) && isIdentical(root1.left, root2.right)
                && isIdentical(root1.right, root2.right);
    }

    public static Tree mirror(Tree root) {
        if (root == null) {
            return null;
        }
        Tree left = mirror(root.left);
        Tree right = mirror(root.right);
        root.left = right;
        root.right = left;
        return root;
    }

    public static Tree lowestCommonAncestor(Tree root, Tree p, Tree q) {
        if (root == null) {
            return null;
        }

        if(root == p || root == q) return root;

        Tree left = lowestCommonAncestor(root.left, p, q);
        Tree right = lowestCommonAncestor(root.right, p, q);

        if (left != null && right != null ) {
            return root;
        }

        return (left != null) ? left : right;
    }

    public static int heightDiameter(Tree root){
        if(root == null) return 0;
        int leftHeight = heightDiameter(root.left);
        int rightHeight = heightDiameter(root.right);

        diameter = Math.max(diameter, leftHeight+rightHeight+1);
        return 1 + Math.max(leftHeight , rightHeight);
    }

    public static int diameter(Tree root){
        diameter =0;
        heightDiameter(root);
        return diameter;
    }

    public static void main(String[] args) {
        Tree root = new Tree(10);
        root.left = new Tree(20);
        root.right = new Tree(30);
        root.left.left = new Tree(40);
        root.left.right = new Tree(50);

        Tree p = root.left.left;
        Tree q = root.left.right;


        // System.out.println(height(root));
        // System.out.println(size(root));
        // System.out.println(countLeaves(root));

       Tree lca = lowestCommonAncestor(root, p, q);
       System.out.println(lca.val);

       System.out.println(diameter(root));

        // Tree mirror = mirror(root);
        // preorder(mirror);




    }

}
