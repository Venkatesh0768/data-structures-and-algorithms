#include <iostream>
#include <bits/stdc++.h>
using namespace std;

void solve()
{
    int n;
    cin >> n;
    vector<int> a(n);
    int cnt = 0;
    for (int i = 0; i < n; i++)
    {
        cin >> a[i];
        if (a[i] == 2)
        {
            cnt++;
        }
    }

    if (cnt % 2 == 0)
    {
        int mid = cnt / 2;
        int res = 0;
        for (int i = 0; i < n; i++)
        {
            if (a[i] == 2)
            {
                res++;
            }

            if (res == mid)
            {
                cout << i + 1 << endl;
                return;
            }
        }
    }

    cout << "-1" << endl;
}

int main()
{
    int t;
    cin >> t;

    while (t--)
    {
        solve();
    }

    return 0;
}