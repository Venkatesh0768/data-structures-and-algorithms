#include <iostream>
#include <bits/stdc++.h>
using namespace std;

int main()
{
    vector<int> a ={4,7,1,1,2,-3,-7,17,15 ,-16};
    list<int> st;
    for (int i = 0; i < a.size(); i++)
    {
       if (a[i] > 0){
        st.push_back(a[i]);
       } else{
            while (!st.empty() && st.back() > 0 && st.back() < abs(a[i]))st.pop_back();
            if (!st.empty() && st.back() == abs(a[i])) st.pop_back();
            else if(st.empty() ||  st.back() < 0) st.push_back(a[i]); 
       }
    }
    for(auto &ele : st){
        cout<<ele<<" ";
    }
    return 0;
}