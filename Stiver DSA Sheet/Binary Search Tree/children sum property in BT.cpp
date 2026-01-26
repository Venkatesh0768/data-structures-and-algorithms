#include <iostream>
#include <bits/stdc++.h>
using namespace std;

// TreeNode structure
struct TreeNode {
    int val;
    TreeNode *left;
    TreeNode *right;
    TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
};
class Solution {
public:
    // Function to change the values of the nodes
    // based on the sum of its children's values.
    void changeTree(TreeNode* root) {
        // Base case: If the current node
        // is NULL, return and do nothing.
        if (root == NULL) {
            return;
        }

        // Calculate the sum of the values of
        // the left and right children, if they exist.
        int child = 0;
        if (root->left) {
            child += root->left->val;
        }
        if (root->right) {
            child += root->right->val;
        }

        // Compare the sum of children with
        // the current node's value and update
        if (child >= root->val) {
            root->val = child;
        } else {
            // If the sum is smaller, update the
            // child with the current node's value.
            if (root->left) {
                root->left->val = root->val;
            } else if (root->right) {
                root->right->val = root->val;
            }
        }

        // Recursively call the function
        // on the left and right children.
        changeTree(root->left);
        changeTree(root->right);

        // Calculate the total sum of the
        // values of the left and right
        // children, if they exist.
        int tot = 0;
        if (root->left) {
            tot += root->left->val;
        }
        if (root->right) {
            tot += root->right->val;
        }

        // If either left or right child
        // exists, update the current node's
        // value with the total sum.
        if (root->left or root->right) {
            root->val = tot;
        }
    }
};


// Function to print the inorder
// traversal of the tree
void inorderTraversal(TreeNode* root) {
    if (root == nullptr) {
        return;
    }
    inorderTraversal(root->left);
    cout << root->val << " ";
    inorderTraversal(root->right);
}

// void changeTree(Node * root){
//     if(root == NULL) return;
//     int child =0;
//     if(root->left) child += root->left->data;
//     if(root->right) child += root->right->data;

//     if(child >= root->data)root->data =child;
//     else{
//         if(root->left) root->left->data = root->data;
//         else if(root->right) root->right->data = root->data;
//     }
//     changeTree(root->left);
//     changeTree(root->right);

//     int tot =0;
//     if(root->left) tot += root->left->data;
//     if(root->right) tot += root->right->data;
//     if(root->left or root->right)root->data = tot;

// }


// vector<int> inorderItreative(Node *root)
// {

//     stack<Node *> st;
//     Node *node = root;
//     vector<int> inorder;
//     while (true)
//     {
//         if (node != NULL)
//         {
//             st.push(node);
//             node = node->left;
//         }
//         else
//         {
//             if (st.empty() == true)
//                 break;
//             node = st.top();
//             st.pop();
//             inorder.push_back(node->data);
//             node = node->right;
//         }
//     }

//     return inorder;
// }


int main()
{
    TreeNode  *root = new TreeNode(40);
    root->left = new TreeNode(10);
    root->right = new TreeNode(20);
    root->left->left = new TreeNode(2);
    root->left->right = new TreeNode(5);
    root->right->left = new TreeNode(30);
    root->right->right = new TreeNode(40);

    Solution sol;
    sol.changeTree(root);
    inorderTraversal(root);
    
    return 0;
}