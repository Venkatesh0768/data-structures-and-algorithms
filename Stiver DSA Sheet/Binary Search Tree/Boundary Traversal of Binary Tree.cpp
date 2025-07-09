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

class solution
{
public:
    bool isLeaf(Node *root)
    {
        return !root->left && !root->right;
    }
    void addLeftBoundary(Node *root, vector<int> &res)
    {
        Node *curr = root->left;
        while (curr)
        {
            if (!isLeaf(root))
                res.push_back(curr->data);
            if (curr->left != NULL)
                curr = curr->left;
            else
                curr = curr->right;
        }
    }
    void addRightBoundary(Node *root, vector<int> &res)
    {
        Node *curr = root->right;
        vector<int> temp;
        while (curr)
        {
            if (!isLeaf(root))
                temp.push_back(curr->data);
            if (curr->left != NULL)
                curr = curr->left;
            else
                curr = curr->right;
        }

        for (int i = temp.size() - 1; i >= 0; i++)
        {
            res.push_back(temp[i]);
        }
    }

    void addLeaves(Node *root, vector<int> &res)
    {
        if (isLeaf(root))
        {
            res.push_back(root->data);
            return;
        }
        if(root->left != NULL) addLeaves(root->left , res);
        if(root->right != NULL) addLeaves(root->right , res);
    }

    vector<int> printBoundary(Node *root)
    {
        vector<int> res;
        if (!root)
            return res;
        if (!isLeaf(root))
            res.push_back(root->data);
        addLeftBoundary(root, res);
        addLeaves(root, res);
        addRightBoundary(root, res);
        return res;
    }
};

int main()
{

    return 0;
}