package EASY;

import java.util.Arrays;
import java.util.HashMap;
import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class Convert2DArrayToBST {
    Node root;

    // Function to convert a 2D array to a BST
    public Node convert(int[][] arr) {
        // Sort the array based on the first element of each row
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

        // Construct the BST
        return constructBST(arr, 0, arr.length - 1);
    }

    private Node constructBST(int[][] arr, int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = (start + end) / 2;
        Node node = new Node(arr[mid][0]);

        node.left = constructBST(arr, start, mid - 1);
        node.right = constructBST(arr, mid + 1, end);

        return node;
    }

    // Function to print the inorder traversal of the BST
    void inorder(Node node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.data + " ");
            inorder(node.right);
        }
    }

    public static void main(String[] args) {
        int[][] arr = {
                {4,1,2},
                {5,0,3}
        };
        int t =0;
        Map<Integer , Integer> map = new HashMap<>();
       for(int i =0; i< arr.length; i++){
           for(int j =0; j<arr[0].length; j++){
               map.put( t+1 , arr[i][j]  );
               t++;
           }
       }

        for(int i =0; i< arr.length; i++){
            for(int j =0; j<arr[0].length; j++){
                int temp =  arr[i][j];
                arr[i][j] = map.get(arr[i][j]);
                map.put(arr[i][j] ,temp);
            }
        }




    }
}