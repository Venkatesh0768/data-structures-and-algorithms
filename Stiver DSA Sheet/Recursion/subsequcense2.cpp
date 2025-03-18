#include <iostream>
#include <bits/stdc++.h>
using namespace std;

void subSequence2(int ind, vector<int> &ds, int arr[], int n, int sum, int s)
{
    if (ind == n)
    {
        if (sum == s)
        {
            for (auto it : ds)
            {
                cout << it << " ";
            }
            cout<<"\n";
        }
        return;
    }

    ds.push_back(arr[ind]);
    sum += arr[ind];
    subSequence2(ind + 1, ds, arr, n, sum, s);
    ds.pop_back();
    sum -= arr[ind];
    subSequence2(ind + 1, ds, arr, n, sum, s);
}

int main()
{
    int arr[] = {1,3,6,7};
    vector<int> ds;
    int target = 7;
    int n = 4;
    subSequence2(0, ds, arr, n, 0, 7);
    return 0;
}