#include <iostream>
#include <bits/stdc++.h>
using namespace std;

int subSequence2(int ind, int arr[], int n, int sum, int s)
{
    if (ind == n)
    {

        if (sum == s)
            return 1;
        else
            return 0;
    }

    sum += arr[ind];
    int l = subSequence2(ind + 1, arr, n, sum, s);
    sum -= arr[ind];
    int r = subSequence2(ind + 1, arr, n, sum, s);

    return l + r;
}

int main()
{
    int arr[] = {5, 2, 3, 10, 6, 8};
    vector<int> ds;
    int n = 6;
    cout<<subSequence2(0, arr, n, 0, 10);
    return 0;
}