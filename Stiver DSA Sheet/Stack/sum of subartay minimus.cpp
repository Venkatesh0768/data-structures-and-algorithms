#include <iostream>
#include <bits/stdc++.h>
using namespace std;
vector<int> findNse(vector<int> &a){
    int n = a.size();
    vector<int> res(n);
    stack<int> st;
    for (int i = n-1; i>=0; i--)
    {
        while (!st.empty() && a[st.top()] <= a[i]) st.pop();
        res[i] = st.empty() ? n : st.top();
        st.push(i);
    }
    return res;
}

vector<int> findPse(vector<int> &a){
    int n = a.size();
    vector<int> res(n);
    stack<int> st;
    for (int i = 0; i<n; i++)
    {
        while (!st.empty() && a[st.top()] < a[i]) st.pop();
        res[i] = st.empty() ? -1 : st.top();
        st.push(i);
    }
    return res;
}

int sum(vector<int> &a){
    int total =0;
    vector<int> nse = findNse(a);
    vector<int> pse = findPse(a);
    int MOD = 1e9 +7;
    int n = a.size();
    for (int i = 0; i < n; i++)
    {
        int left = i - pse[i];
        int right = nse[i] -i;

        total = (total + (right * left * 1LL * a[i]) % MOD)%MOD;
    }
    return total;
}


int main()
{
    vector<int> a ={1,4,6,7,3,7,8,1};
    cout<<sum(a);
    return 0;
}