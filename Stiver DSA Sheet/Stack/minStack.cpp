#include <iostream>
#include <bits/stdc++.h>
using namespace std;
class minStack
{
private:
    stack<int> mainstack;
    stack<int> minstack;

public:
    void push(int x){
        mainstack.push(x);
        if(minstack.empty() ||  x< minstack.top()){
            minstack.push(x);
        }
    }
    int pop(){
        int n = minstack.top();
        return n;
    }

    
};
int main()
{

    return 0;
}