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
void divideOddAndEven(Node* &head){
    Node* odd; Node* even;
    while (head)
    {
        if (head->data %2 ==0)
        {
            even = head->next;
        }else{
            odd = head->next;
        }

        head = head->next;
        
    }
    
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