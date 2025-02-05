#include <iostream>
#include <bits/stdc++.h>
using namespace std;
std::unordered_map;

class Node{
public:
    int data;
    Node* next;

    Node(int data1){
        data= data1;
        next = nullptr;
    }

    Node(int data1 , Node* next1){
        data= data1;
        next = next1;
    }
};

int main()
{
    


 
    return 0;
}

int lengthOfLopp(Node* head){
    unordered_map<Node* ,int> vistiedNode;
    Node* temp = head;
    int timer =0;

    while (temp != NULL)
    {
        if(vistiedNode.find(temp) != vistiedNode.end()){
           int loopLength = timer -  vistiedNode[temp];
           return loopLength;
        }
        vistiedNode[temp] = timer;
        temp = temp->next;
        timer++;
    }

    return 0;
    
}