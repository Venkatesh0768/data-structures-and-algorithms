#include <iostream>
#include <bits/stdc++.h>
using namespace std;
// sum of number
int sumOfNumber(int n)
{
    if (n == 0)
    {
        return 0;
    }

    return n + sumOfNumber(n - 1);
}

void reverseArray(int l, int r, vector<int> &a)
{
    if (l>=r){
        return;
    }

    swap(a[l], a[r]);
    reverseArray(l + 1, r - 1, a);
}

int main()
{
    int n;
    cin >> n;
    vector<int> ans(n);
    for (int i = 0; i < n; i++)
    {
       cin>>ans[i];
    }
    
    reverseArray(0, n - 1, ans);
    for (auto &it : ans)
    {
        cout << it << " ";
    }

    return 0;
}