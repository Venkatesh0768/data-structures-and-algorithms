#include <iostream>
#include <vector>

using namespace std;

class Node
{
    public:
    int data;
    Node* next;

    public:
    Node(int data1){
        data = data1;
        next = nullptr;
    }
};

struct Node1
{
    public:
    int data;
    Node* next;

    public:
    Node1(int data1){
        data = data1;
        next = nullptr;
    }
};


Node* convertArr2LL(vector<int> &arr){
    Node* head = new Node(arr[0]);
    Node* mover = head;
    for (int i = 1; i < arr.size(); i++)
    {
        Node* temp = new Node(arr[i]);
        mover->next = temp;
        mover = temp;
    }
    return head; 
}

Node* removeHeadLL(Node*  head){
    if(head == NULL){
        return head;
    }
    Node* temp = head;
    head = head->next;
    delete temp;
    return head;
}

Node* removeTailLL(Node* head){
    if (head == NULL || head->next == NULL)
    {
        return NULL;
    }
    Node* temp  = head;
    while (temp->next->next != NULL)
    {
        temp = temp->next;
    }
    delete temp->next;
    temp->next = nullptr;

    return head;
}




int main()
{
    vector<int> arr = {2,5,8,7};
    Node* head = convertArr2LL(arr); 
    head = removeTailLL(head);
    Node* temp = head;
    while (temp)
    {
        cout<<temp->data<< " ";
        temp = temp->next;
    }
    
}