#include <iostream>
#include <bits/stdc++.h>
using namespace std;

vector<int> pge(vector<int> &a){
    int n =  a.size();
    vector<int> ans(n);
    stack<int> st;
    for(int i =0; i<n; i++){
        while (!st.empty() && st.top() < a[i])st.pop();
        ans[i] =  st.empty() ? -1 : a[i];
        st.push(a[i]); 
    }

    return ans;
}


int main()
{
    vector<int> a = {7,2,1,3,3,1,8};
    vector<int> ans = pge(a);
    for(int ele : ans){
        cout<<ele<<" ";
    }
    return 0;
}