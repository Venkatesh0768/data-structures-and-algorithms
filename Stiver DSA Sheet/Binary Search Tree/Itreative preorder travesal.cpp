#include <iostream>
#include <bits/stdc++.h>
using namespace std;
struct Node
{
    int data;
    Node *left;
    Node *right;

    Node(int val)
    {
        data = val;
        left = NULL;
        right = NULL;
    }
};

vector<int> preorderItreative(Node *root)
{
    vector<int> preorder;
    if (root == NULL)
        return preorder;
    stack<Node *> st;
    st.push(root);
    while (!st.empty())
    {
        root = st.top();
        st.pop();
        preorder.push_back(root->data);
        if (root->right != NULL)
            st.push(root->right);
        if (root->left != NULL)
            st.push(root->left);
    }

    return preorder;
}
vector<int> inorderItreative(Node *root)
{

    stack<Node *> st;
    Node *node = root;
    vector<int> inorder;
    while (true)
    {
        if (node != NULL)
        {
            st.push(node);
            node = node->left;
        }
        else
        {
            if (st.empty() == true)
                break;
            node = st.top();
            st.pop();
            inorder.push_back(node->data);
            node = node->right;
        }
    }

    return inorder;
}

// 2stack method
vector<int> postorderItreative(Node *root)
{
    vector<int> postorder;
    if (root == NULL)
        return postorder;
    stack<Node *> st1, st2;
    st1.push(root);
    while (!st1.empty())
    {
        root = st1.top();
        st1.pop();
        st2.push(root);
        if (root->left != NULL)
            st1.push(root->left);
        if (root->right != NULL)
            st1.push(root->right);
    }

    while (!st2.empty())
    {
        postorder.push_back(st2.top()->data);
        st2.pop();
    }

    return postorder;
}

// using 1 stack
vector<int> postorderItreative2(Node *root)
{
    vector<int> postorder;
    if (root == NULL)
        return postorder;

    stack<Node *> st;
    Node *curr = root;

    while (curr != NULL || !st.empty())
    {
        if (curr != NULL)
        {
            st.push(curr);
            curr = curr->left;
        }
        else
        {
            Node *temp = st.top()->right;
            if (temp == NULL)
            {
                temp = st.top();
                st.pop();
                postorder.push_back(temp->data);
                while (!st.empty() && temp == st.top()->right)
                {
                    temp = st.top();
                    st.pop();
                    postorder.push_back(temp->data);
                }
            }
            else
            {
                curr = temp;
            }
        }
    }

    return postorder;
}


//preinpostTraversal
vector<int> preinpostTraversal(Node* root){
    stack<pair<Node* , int>> st;
    st.push({root , 1});
    vector<int> pre , in , post;

    if(root == NULL) return;

    while (!st.empty())
    {
        auto it = st.top();
        st.pop();

        if(it.second ==1){
            pre.push_back(it.first->data);
            it.second++;
            st.push(it);

            if(it.first->left != NULL){
                st.push({it.first->left , 1});
            }
        }
        else if(it.second == 2){
            in.push_back(it.first->data);
            it.second++;
            st.push(it);

            if(it.first->right != NULL){
                st.push({it.first->right , 1});
            }
        }
        else{
            post.push_back(it.first->data);
        }
    }
    
}


int main()
{
    struct Node *root = new Node(1);
    root->left = new Node(2);
    root->right = new Node(7);
    root->left->left = new Node(3);
    root->left->right = new Node(4);
    root->left->right->left = new Node(5);
    root->left->right->right = new Node(6);

    vector<int> ans = postorderItreative2(root);
    for (auto &ele : ans)
    {
        cout << ele << " ";
    }
}