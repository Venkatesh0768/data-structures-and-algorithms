#include <iostream>
#include <vector>
using namespace std;

class Node{
public:
    int data;
    Node* next;
    Node* prev;
    Node(int data1){
        data = data1;
        next = nullptr;
        prev = nullptr;
    }

    Node(int data1 , Node* next1 , Node* prev1){
        data= data1;
        next = next1;
        prev = prev1;
    }
};
Node* arrtoDLL(vector<int> &arr){
    Node*  head = new Node(arr[0]);
    Node* prev = head;

    for (int i = 0; i < arr.size(); i++)
    {
        Node* temp = new Node(arr[i] , nullptr , prev);
        prev->next = temp;
        prev = temp;
    }

    return head;
    
}


int main()
{   
    vector<int> a ={1,2,4,5,6};
    Node* head = arrtoDLL(a);

    Node* temp = head;
    while (temp)
    {
        cout<< temp->data <<endl;
        temp = temp->next;
    }
    

 
    return 0;
}