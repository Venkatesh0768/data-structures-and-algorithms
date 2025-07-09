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

vector<int> solve(Node *root)
{
    vector<int> ans;
    if (root == NULL)
        return ans;
    map<int, int> mp;

    queue<pair<Node *, int>> q;
    q.push({root, 0});
    while (!q.empty())
    {
        auto it = q.front();
        q.pop();

        Node *first = it.first;
        int line = it.second;
        mp[line] = first->data;
        
        if (first->left != NULL)
        {
            q.push({first->left, line - 1});
        }
        if (first->right != NULL)
        {
            q.push({first->right, line + 1});
        }
    }

    for (auto &ele : mp)
    {
        ans.push_back(ele.second);
    }

    return ans;
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

    vector<int> ans = solve(root);
    for (auto &ele : ans)
    {
        cout << ele << " ";
    }

    return 0;
}