#include <iostream>
#include <stack>
#include <vector>
using namespace std;

vector<int> nse(vector<int> &a)
{
    int n = a.size();
    vector<int> nse(n, -1);
    stack<int> st;
    for (int i = 0; i < n; i++)
    {
        while (!st.empty() && st.top() >= a[i])
            st.pop();
        if (st.empty())
        {
            nse[i] = -1;
        }
        else
        {
            nse[i] = st.top();
        }

        st.push(a[i]);
    }

    return nse;
}

int main()
{
    vector<int> ans = {5, 7, 9, 6, 7, 4, 5, 1, 3, 7};
    vector<int> list = nse(ans);
    for (int ele : list)
    {
        cout << ele << " ";
    }
    return 0;
}