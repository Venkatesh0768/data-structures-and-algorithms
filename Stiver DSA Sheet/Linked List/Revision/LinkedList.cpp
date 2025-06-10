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

Node* insertAtMiddle(Node* head , int val , int idx){
    Node* temp = head;

    for (int i = 0; i < idx -1 && temp != nullptr; i++)
    {
        temp = temp->next;
    }
    Node* newNode = new Node(val);
    newNode->next = temp->next;
    temp->next = newNode;
    return head;
}

Node* insertAtEnd(Node* head , int val){
    Node* temp = head;
    while (temp->next != NULL)
    {
        temp = temp->next;
    }
    Node* newNode = new Node(val);
    temp->next = newNode;
    return head;
}


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

Node* middleOfTheElement(Node* head) {
    Node* slow = head;
    Node* fast = head;

    while(fast != nullptr && fast->next != nullptr) {
        slow = slow->next;
        fast = fast->next->next;
    }

    return slow;
}


void printLL(Node* temp){
    while (temp)
    {
        cout<<temp->data<<"->";
        temp = temp->next;

    }
    cout<<"Null"<<endl;
}

int main() {
    vector<int> arr= {10, 20, 30, 40, 50};
    int n = sizeof(arr) / sizeof(arr[0]);

    Node* head = arrayToLinkedList(arr);
    head = middleOfTheElement(head);
    printLL(head);

    return 0;
}


