#include <iostream>
#include <bits/stdc++.h>
using namespace std;

int maxArea(vector<int> &a)
{
    int n = a.size();
    stack<int> st;
    int maxi = 0;
    for (int i = 0; i < n; i++)
    {
        while (!st.empty() && a[st.top()] > a[i])
        {
            int ele = st.top();
            st.pop();
            int nse = i;
            int pse = st.empty() ? -1 : st.top();
            maxi = max((a[ele] * (nse - pse - 1)), maxi);
        }
        st.push(i);
    }
    while (!st.empty())
    {
        int nse = n;
        int ele = st.top();
        st.pop();
        int pse = st.empty() ? -1 : st.top();
        maxi = max((a[ele] * (nse - pse - 1)), maxi);
    }

    return maxi;
}

int main()
{
    vector<int> height = {3, 2, 10, 11, 5, 10, 6, 3};
    cout<<maxArea(height);

    return 0;
}