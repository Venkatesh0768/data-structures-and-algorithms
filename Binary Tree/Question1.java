

public class Question1 {

    static class Node {
        int key;
        Node left;
        Node right;
    
        public Node(int key){
            this.key = key;
            this.left =null;
            this.right = null;
        }
        
    }

     

    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(11);

        root.left.left = new Node(3);
        root.left.right = new Node(6);

        root.right.right = new Node(20);

        // Inorder(root);
        Range_sum_of_BST(root, 5, 11);
        System.out.println(sum);
   
    }

    public static void Inorder(Node root){
        if(root ==  null){
            return;
        }
        Inorder(root.left);
        System.out.println(root.key);
        Inorder(root.right);
    }
        public static int sum =0;

    public static int Range_sum_of_BST(Node root , int L , int R){
        if (root == null) {
            return -1;
        }
        

        if(root.key >= L && root.key <= R){
            Range_sum_of_BST(root.left , L , R);
            System.out.print(root.key + " ");
                sum += root.key;
            Range_sum_of_BST(root.right ,L , R);
        }else if(root.key < L){
            Range_sum_of_BST(root.right , L , R);
        }else{
            Range_sum_of_BST(root.left , L , R);
        }
        return sum;


    }
    
}
