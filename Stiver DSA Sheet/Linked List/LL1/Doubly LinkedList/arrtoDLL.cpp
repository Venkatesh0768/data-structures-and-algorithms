#include <iostream>
#include <vector>
using namespace std;

class Node
{
public:
    int data;
    Node *next;
    Node *prev;
    Node(int data1)
    {
        data = data1;
        next = nullptr;
        prev = nullptr;
    }

    Node(int data1, Node *next1, Node *prev1)
    {
        data = data1;
        next = next1;
        prev = prev1;
    }
};
Node *arrtoDLL(vector<int> &arr)
{
    Node *head = new Node(arr[0]);
    Node *prev = head;

    for (int i = 1; i < arr.size(); i++)
    {
        Node *temp = new Node(arr[i], nullptr, prev);
        prev->next = temp;
        prev = temp;
    }

    return head;
}

// Deletion of the DLL
Node *deleteHeadNode(Node *head)
{
    if (head == NULL || head->next == NULL)
        return NULL;

    Node *prev = head;
    head = head->next;
    head->prev = nullptr;
    prev->next = nullptr;
    delete prev;
    return head;
}

Node *deleteTailNode(Node *head)
{
    if (head == NULL || head->next == NULL)
        return NULL;

    Node *temp = head;
    while (temp->next != NULL)
    {
        temp = temp->next;
    }

    Node *prev = temp->prev;
    prev->next = nullptr;
    temp->prev = nullptr;
    delete temp;

    return head;
}

Node *deleteKNode(Node *head, int k)
{
    if (head == NULL)
        return NULL;

    Node *temp = head;


    int cnt = 0;

    if (k ==1)
    {
        return deleteHeadNode(head);
    }
    

    while (temp != NULL)
    {
        cnt++;
        if (cnt == k)
            break;
        temp = temp->next;
    }

    Node* prev = temp->prev;
    Node* front = temp->next;


    if (prev == NULL && front == NULL)
    {
        return NULL;
    }
    else if (prev == NULL)
    {
         return deleteHeadNode(head);
        
    }else if(front == NULL){
        return deleteTailNode(head);
        
    }

    prev->next = front;
    front->prev = prev;

    temp->next = nullptr;
    temp->prev = nullptr;

    delete temp;

    return head;
    
    
}

Node* beforeHead(Node* head , int val){
    Node* newHead = new Node(val , head , nullptr);
    head->prev = newHead;

    return newHead;
}

Node* AfterHead(Node* head , int val){
    Node* front = head->next;
    Node* newHead = new Node(val , front , head);
    head->next = newHead;
    front->prev = newHead;
    return head;
}


Node* beforeTail(Node* head , int val){
    Node* tail = head;
    while (tail->next  != NULL)
    {
        tail =tail->next;
    }
    Node* prev = tail->prev;
    Node* newNode = new Node(val , tail , prev);
    prev->next = newNode;
    tail->prev = newNode;

    return head;
}

Node* afterTail(Node* head , int val){
    Node* tail = head;
    while (tail->next  != NULL)
    {
        tail =tail->next;
    }
    Node* newNode = new Node(val , nullptr , tail);
    tail->next = newNode;
    return head;
}


Node* insertKNode(Node* head , int val , int k){
    Node* temp = head;
    int cnt =0;

    if (k==1)
    {
        return beforeHead(head ,val);
    }
    

    while (temp != NULL)
    {
        cnt++;
        if(cnt == k-1){
            break;
        }
        temp = temp->next;
    }
    Node* front = temp->next;
    Node* newNode = new Node(val , front , temp);
    temp->next = newNode;
    front->prev =  newNode;

    return  head;

}

void deleteNode(Node* temp){
    Node* prev = temp->prev; 
    Node* front = temp->next; 

    if (front == NULL)
    {
        prev->next = nullptr;
        temp->prev = nullptr;
        delete temp;
        return;
    }

    prev->next = front;
    front->prev = prev;

    temp->next = temp->prev = nullptr;
    delete temp;
}
int main()
{
    vector<int> a = {1, 2, 4, 5, 6};
    Node *head = arrtoDLL(a);
   
    head = insertKNode(head , 20 , 1);

    Node *temp = head;
    while (temp)
    {
        cout << temp->data << endl;
        temp = temp->next;
    }

    return 0;
}