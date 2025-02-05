#include <iostream>
#include <vector>

using namespace std;

class Node
{
public:
    int data;
    Node *next;

public:
    Node(int data1)
    {
        data = data1;
        next = nullptr;
    }
};

struct Node1
{
public:
    int data;
    Node *next;

public:
    Node1(int data1)
    {
        data = data1;
        next = nullptr;
    }
};

Node *convertArr2LL(vector<int> &arr)
{
    Node *head = new Node(arr[0]);
    Node *mover = head;
    for (int i = 1; i < arr.size(); i++)
    {
        Node *temp = new Node(arr[i] );
        mover->next = temp;
        mover = temp;
    }
    return head;
}

Node *removeHeadLL(Node *head)
{
    if (head == NULL)
    {
        return head;
    }
    Node *temp = head;
    head = head->next;
    delete temp;
    return head;
}

Node *removeTailLL(Node *head)
{
    if (head == NULL || head->next == NULL)
    {
        return NULL;
    }
    Node *temp = head;
    while (temp->next->next != NULL)
    {
        temp = temp->next;
    }
    delete temp->next;
    temp->next = nullptr;

    return head;
}
Node *deleteNodeK(Node *head)
{
    cout << "ENter the Value" << endl;
    int k;
    cin >> k;
    if (head == NULL)
    {
        return NULL;
    }

    if (k == 1)
    {
        Node *temp = head;
        head = temp->next;
        free(temp);
        return head;
    }
    int cnt = 0;
    Node *temp = head;
    Node *prev = NULL;

    while (temp != NULL)
    {
        cnt++;
        if (cnt == k)
        {
            prev->next = prev->next->next;
            free(temp);
            break;
        }
        prev = temp;
        temp = temp->next;
    }

    return head;
}

Node *deleteNodeVal(Node *head, int el)
{

    if (head == NULL)
    {
        return head;
    }

    if (head->data == el)
    {
        Node *temp = head;
        head = temp->next;
        free(temp);
        return head;
    }

    Node *temp = head;
    Node *prev = NULL;

    while (temp != NULL)
    {
        if (temp->data == el)
        {
            prev->next = prev->next->next;
            free(temp);
            break;
        }
        prev = temp;
        temp = temp->next;
    }
    
    return head;
}

Node *insertNodeK(Node *head, int el, int k)
{
    if (head == NULL)
    {
        if (k == 1) return new Node(el);
        else return NULL;
    }

    if(k ==1){
        Node* temp = new Node(el);
        temp->next = head;
        return temp;
    }

    int cnt =0;
    Node* temp = head;
    while (temp != NULL)
    {
        cnt++;
        if (cnt ==  k-1)
        {
            Node* newNode = new Node(el);
            newNode->next = temp->next;
            temp->next = newNode;
            break;
        }
        temp = temp->next;
       
    }

    return head;
    
}

int main()
{
    vector<int> arr = {2, 5, 8, 7};
    Node *head = convertArr2LL(arr);
    head = insertNodeK(head , 25 , 5);
    Node *temp = head;
    while (temp)
    {
        cout << temp->data << " ";
        temp = temp->next;
    }
}
