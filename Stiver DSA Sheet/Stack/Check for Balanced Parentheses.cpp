#include <iostream>
#include <bits/stdc++.h>
using namespace std;

bool isBalancedParenthesis(string s){
    stack<int> st;
    for(auto it : s){
        if(it == '{' || it == '[' || it == '('){
            st.push(it);
        }else{
            if(st.size() == 0) return false;
            char ch = st.top();
            st.pop();
            if(ch == '{' && it == '}' || ch == '[' && it == ']'  || ch == '(' && it == ')'){
                continue;
            }else{
                return false;
            }
        }

    }
    return st.empty();
}

int main()
{
    string s="()[{}()]";
    if(isBalancedParenthesis(s))
    cout<<"True"<<endl;
    else
    cout<<"False"<<endl;
    return 0;
}