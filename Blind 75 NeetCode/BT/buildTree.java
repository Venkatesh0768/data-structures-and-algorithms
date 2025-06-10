package BT;

import java.util.LinkedList;
import java.util.Queue;

public class buildTree {
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

    static class BinarTree {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;

        }

    }

    static void preOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        System.out.println(root.data + " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    static void leverOrdertraversal(Node root) {

        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();

        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node currNode = q.remove();
            if (currNode == null) {
                System.out.println();
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

    static int countOfNode(Node root) {
        if (root == null) {
            return 0;
        }

        int leftNodes = countOfNode(root.left);
        int rightNodes = countOfNode(root.right);

        return leftNodes + rightNodes + 1;
    }

    static int sumOfNode(Node root) {
        if (root == null) {
            return 0;
        }

        int leftNodes = sumOfNode(root.left);
        int rightNodes = sumOfNode(root.right);

        return leftNodes + rightNodes + root.data;
    }

    static int heightOfNode(Node root) {
        if (root == null) {
            return 0;
        }

        int leftNodes = heightOfNode(root.left);
        int rightNodes = heightOfNode(root.right);
        int maxheight = Math.max(leftNodes, rightNodes) + 1;
        return maxheight;
    }

    static int diameterOfNode(Node root) {
        if (root == null) {
            return 0;
        }

        int diam1 = diameterOfNode(root.left);
        int diam2 = diameterOfNode(root.right);
        int diam3 = heightOfNode(root.left) + heightOfNode(root.right) + 1;
        return Math.max(diam3, Math.max(diam2, diam1));
    }

    static boolean isSubtree(Node rootNode, Node subTreeNode) {
        if (subTreeNode == null) {
            return true;
        }

        if (rootNode == null) {
            return false;
        }

        if (rootNode.data == subTreeNode.data) {
            if (isIdentical(rootNode , subTreeNode)) {
                return true;
            }
        }

        return isSubtree(rootNode.left, subTreeNode) || isSubtree(rootNode.right, subTreeNode);

    }

    static boolean  isIdentical(Node rootNode , Node subTreeNode){
        if (rootNode == null && subTreeNode == null) {
            return true;
        }

        if (rootNode == null || subTreeNode  ==   null) {
            return false;
        }

        if (rootNode.data == subTreeNode.data) {
            return isIdentical(rootNode.left, subTreeNode.left) && isIdentical(rootNode.right, subTreeNode.right);
        }

        return false;
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinarTree tree = new BinarTree();

        Node root = tree.buildTree(nodes);
        // System.out.println(root.data);

        System.out.println(diameterOfNode(root));
    }
}
