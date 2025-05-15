#include <iostream>
#include <bits/stdc++.h>
using namespace std;

string smallestNumber(string &s, int k)
{
    int n = s.size();
    stack<int> st;
    for (int i = 0; i < n; i++)
    {
        while (!st.empty() && k > 0 && (st.top() - '0') > s[i] - '0')
        {
            st.pop();
            k--;
        }
        st.push(s[i]);
    }
    while (k > 0)
    {
        st.pop();
        k--;
    }

    if (st.empty()){ return "0";}
       
    string res = "";
    while (!st.empty())
    {
        res += st.top();
        st.pop();
    }
    while (res.size() != 0 && res.back() == '0')
    {
        res.pop_back();
    }
    reverse(res.begin() , res.end());
    if(res.empty()) return "0";
    return res;
}

int main()
{
    string s = "1432219";
    int k = 3;
    cout << smallestNumber(s, k);

    return 0;
}