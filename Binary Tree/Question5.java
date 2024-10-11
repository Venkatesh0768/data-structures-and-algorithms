public class Question5 {
    static class Node {
        int key; 
        Node left, right;

        public Node(int key) {
            this.key = key;
            this.left = null;
            this.right = null;
        }
    }

    static class Info {
        boolean isBST;
        int sum;
        int max;
        int min;

        public Info(boolean isBST, int min, int max, int sum) {
            this.isBST = isBST;
            this.min = min;
            this.max = max;
            this.sum = sum; 
        }
    }

    public static int maxSize = 0; 

    public static Info largest_BST(Node root) {
        if (root == null) {
            return new Info(true, Integer.MAX_VALUE, Integer.MIN_VALUE, 0);
        }

        Info leftInfo = largest_BST(root.left);
        Info rightInfo = largest_BST(root.right);

        // Check if the current subtree is a BST
        if (leftInfo.isBST && rightInfo.isBST && root.key > leftInfo.max && root.key < rightInfo.min) {
            int currentSum = leftInfo.sum + rightInfo.sum + root.key;
            maxSize = Math.max(maxSize, currentSum);
            return new Info(true, Math.min(root.key, leftInfo.min), Math.max(root.key, rightInfo.max), currentSum);
        }

        return new Info(false, 0, 0, 0); // Not a BST
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(1);
        root.left.right = new Node(8);
        root.right.right = new Node(7); // This breaks the BST property

        largest_BST(root); // Invoke the method

        // Output the result
        System.out.println("Maximum Sum BST: " + maxSize);
    }
}
