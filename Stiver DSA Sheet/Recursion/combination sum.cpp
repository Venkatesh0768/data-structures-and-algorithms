#include <iostream>
#include <bits/stdc++.h>
using namespace std;

void printTheAllCombinationSum(int i, vector<int> &ds, int arr[], int n, int sum, int target)
{
    if (i == n)
    {
        if (sum == target)
        {
            for (auto it : ds)
            {
                cout << it << " ";
            }
            cout << endl;
        }
        return;
    }

    ds.push_back(arr[i]);
    sum += arr[i];
    printTheAllCombinationSum(i + 1, ds, arr, n, sum, target);
    ds.pop_back();
    sum -= arr[i];
    printTheAllCombinationSum(i + 1, ds, arr, n, sum, target);
}

// but you can select the number n number of times

void printTheAllCombinationSum(int i, vector<int> &ds, int arr[], int n, int target)
{
    if (i == n)
    {
        if (target == 0)
        {
            for (auto it : ds)
            {
                cout << it << " ";
            }
            cout << endl;
        }
        return;
    }

    if (arr[i] <= target)
    {
        ds.push_back(arr[i]);
        printTheAllCombinationSum(i , ds , arr , n  , target - arr[i]);
        ds.pop_back();
    }

    printTheAllCombinationSum(i + 1, ds, arr, n, target);
}

int main()
{
    int arr[] = {2, 3, 6, 7};
    int target = 7;
    int n = sizeof(arr) / sizeof(arr[0]);
    vector<int> ds;

    printTheAllCombinationSum(0, ds, arr, n, 7);
    return 0;
}