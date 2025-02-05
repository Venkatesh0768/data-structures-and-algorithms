#include <iostream>
#include <vector>
using namespace std;

class Node {
public: 
    int data;
    Node* next;
    Node* prev;

    Node(int data1) {
        data = data1;
        next = nullptr;
        prev = nullptr;
    }

    Node(int data1, Node* next1, Node* prev1) {
        data = data1;
        next = next1;
        prev = prev1;
    }
};


Node* convertArr2DLL(vector<int> &arr) {
    if (arr.empty())
    {
        return nullptr;
    }

    Node* head = new Node(arr[0]);
    Node* prev = head;

    for (int i = 1; i < arr.size(); i++)
    {
        Node* temp = new Node(arr[i] , nullptr, prev);
        prev->next = temp;
        prev = temp;
    }
    return head;
    
}


Node* deleteHeadNode(Node* head){
    if (head == NULL) {
        return NULL;
    }

    if (head->next == NULL) {
        delete head;
        return NULL;
    }

    Node* prev = head;
    head = head->next;

    head->prev = nullptr;
    prev->next = nullptr;

    delete prev;
    return head;
    
}


Node*  deleteTail(Node* head){
    if(head == NULL || head->next ==  NULL){
        return NULL;
    }

    Node* tail = head;
    while (tail->next = NULL)
    {
        tail = tail->next;
    }

    Node* newTail = tail->prev;
    tail->prev = nullptr;
    

    
}
void printDLL(Node* head) {
    Node* temp = head;
    while (temp) {
        cout << temp->data << " ";
        temp = temp->next;
    }
    cout << endl;
}

int main() {
    vector<int> arr = {12, 5, 8, 8};
    Node* head = convertArr2DLL(arr);
    head = deleteHeadNode(head);
    printDLL(head); 

    return 0;
}
