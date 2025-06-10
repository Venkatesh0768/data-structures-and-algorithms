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

Node* mergeLL(Node* &l1  , Node* &l2){
    Node* dummy(0);
    Node* mergeNode = dummy;

    while (l1 && l2)
    {
        if(l1->data < l2->data){
            mergeNode->next = l1;
            l1 = l1->next;
        }else{
            mergeNode->next = l2;
            l2 = l2->next;
        }
        mergeNode = mergeNode->next;
        
    }

    mergeNode = l1 ? l1: l2;
    return dummy->next;
    
}



int main()
{
    vector<int> a = {0,1,2,3,4,5};
    vector<int> b = {5,6,7,8,9,10};
    Node *head1 = convertArrayToLL(a);
    Node* head2 = convertArrayToLL(b);
    Node* ans = mergeLL(head1 , head2);
    printLL(ans);
    return 0;
}