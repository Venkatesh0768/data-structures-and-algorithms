#include <iostream>
#include<bits/stdc++.h>
using namespace std;

struct Node
{
   int data;
   Node* next;
   Node(int val){
    data = val;
    next =  nullptr;
   }
};


Node* arrayToLinkedList(vector<int> &a) {
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

void printLL(Node* temp){
    while (temp)
    {
        cout<<temp->data<<" ";
        temp = temp->next;

    }
}

int main() {
    vector<int> arr= {10, 20, 30, 40, 50};
    int n = sizeof(arr) / sizeof(arr[0]);

    Node* head = arrayToLinkedList(arr);
    printLL(head);

    return 0;
}
