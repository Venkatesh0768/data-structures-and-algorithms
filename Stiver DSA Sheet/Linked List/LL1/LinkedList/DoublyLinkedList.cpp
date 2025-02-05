#include <iostream>
#include <vector>
using namespace std;

class Node
{
public:
    int data;
    Node *next;
    Node *back;

public:
    Node(int data1)
    {
        data = data1;
        next = nullptr;
        back = nullptr;
    }

public:
    Node(int data1, Node *next1, Node *back1)
    {
        data = data1;
        next = next1;
        back = back1;
    }
};

Node *convertArr2DLL(vector<int> arr)
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

Node *deleteHeadNode(Node *head)
{
    if (head == NULL || head->next == NULL)
    {
        return NULL;
    }

    Node *prev = head;
    head = head->next;
    head->back = nullptr;

    delete prev;
    return head;
}

Node *deleteTailNode(Node *head)
{
    if (head == NULL || head->next == NULL)
        return NULL;

    Node *tail = head;
    while (tail->next != NULL)
    {
        tail = tail->next;
    }

    Node *newTail = tail->back;
    newTail->next = nullptr;
    newTail->back = nullptr;
    delete tail;

    return head;
}

Node *deleteNodek(Node *head, int k)
{
    int cnt = 0;
    Node *temp = head;
    while (temp != NULL)
    {
        cnt++;
        if (cnt == k)
            break;
        temp = temp->next;
    }

    Node *prev = temp->back;
    Node *front = temp->next;

    if (prev == NULL && front == NULL)
    {
        delete temp;
        return NULL;
    }
    else if (prev == NULL)
    {

        return deleteHeadNode(head);
    }
    else if (front == NULL)
    {

        return deleteTailNode(head);
    }
    else
    {
        prev->next = front;
        front->back = prev;

        temp->next = nullptr;
        temp->back = nullptr;

        delete temp;
    }

    return head;
}

Node *insertBeforeHead(Node *head, int val)
{
    if (head == NULL)
    {
        return new Node(val, NULL, NULL);
    }

    Node *newNode = new Node(val, head, nullptr);
    head->back = newNode;
    return newNode;
}

Node *insertBeforeTail(Node *head, int val)
{
    int cnt = 0;
    Node *temp = head;
    if (head == NULL)
    {
        return new Node(val, NULL, NULL);
    }

    while (temp->next != NULL)
    {
        temp = temp->next;
    }

    Node *prev = temp->back;
    Node *newNode = new Node(val, temp, prev);
    prev->next = newNode;
    temp->back = newNode;
    return head;
}

Node *insertNodeAtK(Node *head, int k, int val)
{

    if (k <= 0)
        return head;

    if (k == 1)
    {
        return insertBeforeHead(head, val);
    }

    int cnt = 1;
    Node *temp = head;

    while (temp != nullptr && cnt < k) {
        temp = temp->next;
        cnt++;
    }


    if (temp == nullptr)
    {
        Node *newNode = new Node(val);
        Node *tail = head;

        while (tail->next != nullptr)
        {
            tail = tail->next;
        }

        tail->next = newNode;
        newNode->back = tail;
        return head;
    }

    Node *prev = temp->back;
    Node *newNode = new Node(val, temp, prev);
    
    if (prev != nullptr) prev->next = newNode;
    temp->back = newNode;

    return head;
}

void insertBeforeNode(Node *node, int val)
{
    Node *prev = node->back;
    Node *newNode = new Node(val, node, prev);
    prev->next = newNode;
    node->back = newNode;
}

int main()
{
    vector<int> arr = {2, 5, 8, 7};
    Node *head = convertArr2DLL(arr);
    head = insertNodeAtK(head, 5, 20);

    Node *temp = head;

    while (temp)
    {
        cout << temp->data << " ";
        temp = temp->next;
    }
}