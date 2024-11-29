
/**
 * BottomViewOfBinaryTree
 */
import java.util.*;

public class BottomViewOfBinaryTree {

    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }

    static class Info {
        int hd;
        Node node;

        public Info(int hd, Node node) {
            this.hd = hd;
            this.node = node;
        }

    }

    public static void Bottom_View_of_tree(Node root) {
        if (root == null)
            return;

        Queue<Info> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();

        int min = 0, max = 0;
        q.add(new Info(0, root));

        while (!q.isEmpty()) {
            Info current = q.remove();

            map.put(current.hd, current.node);

            min = Math.min(min, current.hd);
            max = Math.max(max, current.hd);

            if (current.node.left != null) {
                q.add(new Info(current.hd - 1, current.node.left));

            }

            if (current.node.right != null) {
                q.add(new Info(current.hd + 1, current.node.right));

            }
        }

        for (int i = min; i <= max; i++) {
            System.out.print(map.get(i).data + " ");
        }
    }

    public static void Top_View_of_tree(Node root) {

        if (root == null)
            return;
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();

        int min = 0, max = 0;
        q.add(new Info(0, root));

        while (!q.isEmpty()) {
            Info current = q.remove();

            if (!map.containsKey(current.hd)) {
                map.put(current.hd, current.node);
            }

            if (current.node.left != null) {
                q.add(new Info(current.hd - 1, current.node.left));
                min = Math.min(min, current.hd - 1);

            }

            if (current.node.right != null) {
                q.add(new Info(current.hd + 1, current.node.right));
                max = Math.max(max, current.hd + 1);
            }
        }

        for (int i = min; i <= max; i++) {
            System.out.print(map.get(i).data + " ");
        }
    }

    public static void RightSide_View_of_tree(Node root) {
        if (root == null)
            return;

        Queue<Info> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();

        int min = 0, max = 0;
        q.add(new Info(0, root));

        while (!q.isEmpty()) {
            Info current = q.remove();

            if (!map.containsKey(current.hd)) {
                map.put(current.hd, current.node);
            }

            if (current.node.right != null) {
                q.add(new Info(current.hd + 1, current.node.right));
                max = Math.max(max, current.hd + 1);
            }
        }

        for (int i = min; i <= max; i++) {
            System.out.print(map.get(i).data + " ");
        }
    }

    public static void LeftSide_View_of_tree(Node root) {
        if (root == null)
            return;
            
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();

        int min = 0, max = 0;
        q.add(new Info(0, root));

        while (!q.isEmpty()) {
            Info current = q.remove();

            if (!map.containsKey(current.hd)) {
                map.put(current.hd, current.node);
            }

            if (current.node.left != null) {
                q.add(new Info(current.hd - 1, current.node.left));
                min = Math.min(min, current.hd - 1);

            }

        }

        for (int i = min; i <= max; i++) {
            System.out.print(map.get(i).data + " ");
        }
    }

    static ArrayList <Integer> bottomView(Node root)
    {


        Queue<Info> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();

        int min = 0, max = 0;
        q.add(new Info(0, root));

        while (!q.isEmpty()) {
            Info current = q.remove();

            map.put(current.hd, current.node);

            min = Math.min(min, current.hd);
            max = Math.max(max, current.hd);

            if (current.node.left != null) {
                q.add(new Info(current.hd - 1, current.node.left));

            }

            if (current.node.right != null) {
                q.add(new Info(current.hd + 1, current.node.right));

            }
        }
        
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = min; i <= max; i++) {
            arr.add(map.get(i).data);
        }
        
        return arr;
        // Code here
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(5);
        root.left.left = new Node(4);
        root.right.left = new Node(7);
        root.right.right = new Node(6);

        
        System.out.println(bottomView(root));

        Bottom_View_of_tree(root);
        System.out.println("This is the Bottom view of the tree");
        Top_View_of_tree(root);
        System.out.println("This is the Topview of the tree");
        LeftSide_View_of_tree(root);
        System.out.println("This is the RightSide of the tree");
        RightSide_View_of_tree(root);
        System.out.println("This is the LeftSide of the tree");
    }
}