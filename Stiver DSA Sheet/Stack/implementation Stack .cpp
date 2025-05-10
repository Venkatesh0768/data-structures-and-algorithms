#include <iostream>
#include <bits/stdc++.h>
using namespace std;

// #define MAX 1000

// class Stack
// {
// private:
//     int top;
//     int arr[MAX];
// public:
//     Stack(){
//         top = -1;
//     }

//     bool push(int x){
//         if(top>=(MAX -1)){
//             cout<<"Stack is Overflow";
//             return false;
//         }
//         arr[++top] = x;
//         return true;
//     }

//     int pop(){
//         if(top < 0){
//             cout<<"Stack is Empty";
//             return false;
//         }
//         return arr[top--];

//     }

//     int peek(){
//         if(top < 0){
//             cout<<"Stack is Empty";
//             return -1;
//         }

//         return arr[top];
//     }

//     int size(){
//         return top +1;
//     }

//     bool isEmpty(){
//         return (top <0);
//     }

// };

struct Node
{
    int data;
    Node *next;
    Node(int val)
    {
        data = val;
        next = nullptr;
    }
};

class Stack
{
private:
    Node *top;
public:
    Stack(){
        top = nullptr;
    }

    void push(int x){
        Node* newNode = new Node(x);
        newNode->next = top;
        top = newNode;
    }

    int pop(){
        if(isEmpty()){
            cout<<"Stack is empty"<<endl;
            return -1;
        }
        int popedEle = top->data;
        Node* temp = top;
        top =top->next;
        delete temp;
        return popedEle;
    }
    int peek(){
        if(isEmpty()){
            cout<<"Stack is empty"<<endl;
            return -1;
        }

        return top->data;
    }

    bool isEmpty(){
        return top == nullptr;
    }
};

main()
{
    Stack s;
    s.push(12);
    s.push(13);
    s.push(14);
    s.push(15);
    s.push(16);

    cout << s.pop() << endl;
    cout << s.peek() << endl;
    
    return 0;
}