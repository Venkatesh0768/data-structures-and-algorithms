#include <iostream>
#include<vector>
#include<stack>
using namespace std;

vector<int> next2(vector<int> &a)
{
    int n = a.size();
    vector<int> nge(n , -1);
    stack<int> st;

    for (int i = (2 * n) - 1; i >= 0; i--)
    {
        while (!st.empty() && st.top() <= a[i % n])
            st.pop();
        if (i < n)
        {
            nge[i] = st.empty() ? -1 : st.top();
        }

        st.push(a[i % n]);
    }

    return nge;
}

int main()
{
    vector<int> ans = {2, 10, 12, 1, 11};
    vector<int> list = next2(ans);
    for (int ele : list)
    {
        cout << ele << " ";
    }
    return 0;

}