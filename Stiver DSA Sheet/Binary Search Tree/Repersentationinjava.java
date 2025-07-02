
class Node {

    int data;
    Node left;
    Node right;

    public Node(int val) {
        this.data = val;
    }

}

public class Repersentationinjava {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(29);

        preOrder(root);

    }

    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }
}
