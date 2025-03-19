#include <iostream>
#include <bits/stdc++.h>
using namespace std;

void printTheAllCombinationSum(int ind, vector<int> &ds, vector<int> &arr, int n, int target)
{
    if (target == 0)
    {
        for (auto it : ds)
        {
            cout << it << " ";
        }
        cout << endl;
        return;
    }

    for (int i = ind; i < arr.size(); i++)
    {
        if (i > ind && arr[i] == arr[i - 1])
            continue;
        if (arr[i] > target)
            break;
        ds.push_back(arr[i]);
        printTheAllCombinationSum(i + 1, ds, arr, n, target - arr[i]);
        ds.pop_back();
    }
}

int main()
{

    vector<int> arr = {1, 1, 1, 2, 2};
    int target = 4;
    int n = arr.size();
    vector<int> ds;

    printTheAllCombinationSum(0, ds, arr, n, target);
    

    return 0;
}