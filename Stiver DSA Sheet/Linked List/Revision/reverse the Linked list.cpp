#include <iostream>
#include <bits/stdc++.h>
using namespace std;

struct Node{
    int data;
    Node* next;
    Node(int val){
        data = val;
        next = nullptr;
    }
};
Node* convertArrayToLL(vector<int> &a){
    Node* head = new Node(a[0]);
    Node* prev = head;
    for (int i = 1; i < a.size(); i++)
    {
        Node* temp = new Node(a[i]);
        prev->next = temp;
        prev = temp;
    }

    return head;
}
//Iterate Method
Node* reverseLL(Node* &head){
    Node* prev = nullptr;
    Node* curr = head;
    Node* next;
    while (curr != nullptr)
    {
        next = curr->next;
        curr->next = prev;
        prev = curr;
        curr = next;
    }
    return prev;
}
//
void printLL(Node* temp){
    while (temp)
    {
        cout<<temp->data<<" ";
        temp = temp->next;
    }
}
int main()
{
    vector<int> a = {1,2,3,4,5,6,7};
    Node* head = convertArrayToLL(a);
    head = reverseLL(head);
    printLL(head);
    return 0;
}