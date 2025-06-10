#include <iostream>
#include <bits/stdc++.h>
using namespace std;

class Node{
public:
    int data;
    Node* next;
    Node(int val){
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
void printLL(Node *temp)
{
    while (temp)
    {
        cout << temp->data << " ";
        temp = temp->next;
    }
}
void divideOddAndEven(Node* &head){
    Node* oddDummy = new Node(-1); 
    Node* evenDummy = new Node(-1);
    
    Node* oddTail = oddDummy;
    Node* evenTail = evenDummy;

    while (head)
    {
        if (head->data %2 ==0)
        {
            evenTail->next = head;
            evenTail = evenTail->next;
        }else{
            oddTail->next= head;
            oddTail = oddTail->next;
        }
        head = head->next;
    }
    
    oddTail->next = nullptr;
    evenTail->next = nullptr;

    printLL(oddDummy->next);
    cout<<endl;
    printLL(evenDummy->next);
    
}


int main()
{
    vector<int> a = {1, 2, 3,3,2,1};
    Node *head = convertArrayToLL(a);
    divideOddAndEven(head);
    printLL(head);
    return 0;
}