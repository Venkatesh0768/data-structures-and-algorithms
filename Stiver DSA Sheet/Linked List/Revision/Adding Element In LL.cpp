#include <iostream>
#include <bits/stdc++.h>
using namespace std;
//Adding And Deleting the Node;
struct Node{
    int data;
    Node* next;
    Node(int val){
        data = val;
        next = nullptr;
    }
};
//convert The Array to LL
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
//Inserting At Head
Node* insertingAtHead(int key, Node* head){
    if (head == NULL)
    {
        return new Node(key);
    }

    Node* prev = head;
    Node* newNode = new Node(key);
    newNode->next = prev;
    return newNode;
}
//Inserting At the Tail of The LinkedList
Node* insertingAtTail(int key , Node* head){
    Node* temp = head;
    while (temp->next != NULL)
    {
        temp = temp->next;
    }
    Node* newNode = new Node(key);
    temp->next = newNode;
    return head;
    
}

//Inserting At the Middle of the LL
Node* insertingMiddleOfLL(Node* head , int key , int pos){
    Node* newNode = new Node(key);

    if(pos ==1){return insertingAtHead(key , head);}

    Node* prev = head;
    for(int i = 1; i<pos-1 && prev != NULL; i++){
        prev = prev->next;
    }
    
    if(prev == nullptr){cout<<"This is Pos is OutOf Bound"; return NULL;}
    newNode->next = prev->next;
    prev->next = newNode;
    return head;
}

//Deleting the Node LL
// Node* deleteNodeLL(Node* head , int val){
//     Node* temp = head;
//     while (temp->data != val)
//     {
//        temp = temp->next;
//     }
    
// }

void printLL(Node* temp){
    while (temp)
    {
        cout<<temp->data<<" ";
        temp = temp->next;
    }
}
void deleteAtHead(Node* &head) {
    if (!head) return;
    Node* temp = head;
    head = head->next;
    delete temp;
}

void deleteAtTail(Node* &head){
    Node* temp = head;
    while (temp->next->next != nullptr)
    {
        temp = temp->next;
    }
    delete temp->next;
    temp->next = nullptr;
}

void deleteAllPos(Node* &head , int pos){
    if(pos == 1){
        deleteAtHead(head);
        return;
    }

    Node* temp = head;
    for(int i =1; i< pos -1 && temp != NULL; i++){
        temp= temp->next;
    }
    if (temp == nullptr || temp->next == nullptr)
    {
        cout<<"Sorry Buddy the pos Out";
        return;
    }
    
    Node* deltemp = temp->next;
    temp->next = temp->next->next;
    delete deltemp;
}

int main()
{
    vector<int> a = {1,2,3,4,5,6};
    Node* head = convertArrayToLL(a);
    deleteAtHead(head);
    deleteAtTail(head);
    deleteAllPos(head , 3);
    // head = insertingMiddleOfLL(head , 20 , 4);
    printLL(head);

    return 0;
}