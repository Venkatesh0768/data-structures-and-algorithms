#include <iostream>
#include <bits/stdc++.h>
using namespace std;

void subsetSums(int ind, vector<int> &arr, vector<int> &sumSubset, int n, int sum)
{
    if (ind == n)
    {
        // sumSubset.push_back(sum);
        cout<<sum<<" ";
        return;
    }

    subsetSums(ind + 1, arr, sumSubset, n, sum + arr[ind]);
    subsetSums(ind + 1, arr, sumSubset, n, sum);
}

int main()
{
    vector<int> arr = {3,1,2};
    int n = arr.size();
    vector<int> ds;
    subsetSums(0 , arr, ds, n, 0);
    return 0;
}