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
bool getPath(Node *root, vector<int> &ans, int x)
{
    if (!root)
        return false;
    ans.push_back(root->data);
    if (root->data == x)
        return true;
    if (getPath(root->left, ans, x) || getPath(root->right, ans, x))
        return true;
    ans.pop_back();
    return false;
}

vector<int> solve(Node *root, int B)
{
    vector<int> arr;
    if (root == NULL)
        return arr;
    getPath(root, arr, B);
    return arr;
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

    vector<int> res;
    res = solve(root, 6); // Fixed line
    for (auto &ele : res)
    {
        cout << ele << " ";
    }
    return 0;
}
