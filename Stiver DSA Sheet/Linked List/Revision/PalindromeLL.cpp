#include <iostream>
#include <bits/stdc++.h>
using namespace std;

struct Node
{
    int data;
    Node *next;
    Node(int val)
    {
        data = val;
        next = nullptr;
    }
};
Node *convertArrayToLL(vector<int> &a)
{
    Node *head = new Node(a[0]);
    Node *prev = head;
    for (int i = 1; i < a.size(); i++)
    {
        Node *temp = new Node(a[i]);
        prev->next = temp;
        prev = temp;
    }

    return head;
}
Node *reverseLL(Node *&head)
{
    Node *prev = nullptr;
    Node *curr = head;
    Node *next;
    while (curr != NULL)
    {
        next = curr->next;
        curr->next = prev;
        prev = curr;
        curr = next;
    }

    return prev;
}
// palindrome or Not
bool checkPalindrome(Node *head)
{
    Node *slow = head;
    Node *fast = head;

    while (fast != NULL && fast->next != NULL)
    {
        slow = slow->next;
        fast = fast->next->next;
    }
    
    Node *newNode = reverseLL(slow->next);
    Node *first = head;
    Node *second = newNode;
    while (second)
    {
        if (first->data != second->data)
        {
            return false;
        }
        first = first->next;
        second = second->next;
    }
    return true;
}

void printLL(Node *temp)
{
    while (temp)
    {
        cout << temp->data << " ";
        temp = temp->next;
    }
}
int main()
{
    vector<int> a = {1, 2, 3,3,2,1};
    Node *head = convertArrayToLL(a);
    cout<<checkPalindrome(head)<<endl;
    printLL(head);
    return 0;
}