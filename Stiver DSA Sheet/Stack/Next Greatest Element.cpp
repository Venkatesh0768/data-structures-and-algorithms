#include <iostream>
#include <bits/stdc++.h>
using namespace std;

vector<int> nextGreatestEle(vector<int> &a)
{
    int n = a.size();
    vector<int> ans(n);
    stack<int> st;

    for (int i = n - 1; i >= 0; i--)
    {
        while (!st.empty() && st.top() <= a[i])
        {
            st.pop();
        }

        if (st.empty())
            ans[i] = -1;
        else
            ans[i] = st.top();

        st.push(a[i]);
    }

    return ans;
}

int main()
{
    vector<int> ans = {4, 12, 5, 3, 1, 2, 5, 3, 1, 2, 4, 6};
    vector<int> list = nextGreatestEle(ans);
    for (int ele : list)
    {
        cout << ele << " ";
    }
    return 0;
}