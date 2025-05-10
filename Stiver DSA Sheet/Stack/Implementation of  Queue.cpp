#include <iostream>
#include <bits/stdc++.h>
using namespace std;
// #define MAX 1000

// class Queue
// {
// private:
//     int front , rear;
//     int a[MAX];

// public:
//     Queue(){
//         front =0;
//         rear =0;
//     }

//     void enqueue(int x){
//         if(rear == MAX){
//             cout<<"queue Is Overflow";
//             return;
//         }
//         a[rear++] = x;
//     }

//     int dequeue(){
//         if (isEmpty())
//         {
//             cout<<"Queue Is Empty";
//             return -1;
//         }
//         return a[front++];
        
//     }

//     int peek(){
//         if (isEmpty())
//         {
//             cout<<"Queue Is Empty";
//             return -1;
//         }

//         return a[front];
//     }

//     int size(){
//         return rear - front;
//     }

//     bool isEmpty(){
//         return front == rear;
//     }

// };


//Using the Linked List 
struct Node
{
    int data;
    Node* next;
    Node(int val){
        data = val;
        next = nullptr;
    }
};


class Queue{
    private:
        Node  *front , *rear;
    public:
        Queue(){
            rear = front = nullptr;
            
        }

        void enqueue(int x){
           Node* temp = new Node(x);
           if(rear == nullptr){
                front = rear = temp;
             return;
           }
           rear->next = temp;
           rear = temp;
        }

        int dequeue(){
            if(isEmpty()){
                cout<<"Queue is Empty"<<endl;
                return -1;
            }
            int popEle = front->data;
            Node* temp = front;
            front = front->next;
            if(front  == nullptr) rear = nullptr;
            delete temp;
            return popEle;
        }

        int peek(){
            if(isEmpty()){
                cout<<"Queue is Empty"<<endl;
                return -1;
            }

            return front->data;
        }



        bool isEmpty(){
            return rear == front;
        }


};

int main()
{
    Queue q;
    q.enqueue(10);
    q.enqueue(20);
    q.enqueue(30);

    cout<<q.dequeue()<<endl;
    cout<<q.peek()<<endl;
    cout<<q.isEmpty()<<endl;
    

    return 0;
}