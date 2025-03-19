#include <iostream>
#include <bits/stdc++.h>
using namespace std;

void subsetSums(int ind, vector<int> &arr, vector<int> &ds)
{
    for(auto it : ds){
        cout<<it<<" ";
    }
    cout<<endl;
    for (int i = ind; i < arr.size(); i++)
    {
        if (i != ind && arr[i] == arr[i-1])continue;
        ds.push_back(arr[i]);
        subsetSums(i+1, arr, ds);
        ds.pop_back();
     
    }
    
}

int main()
{
    vector<int> arr = {1, 2,2,2,3,3};
    int n = arr.size();
    vector<int> ds;
    subsetSums(0 , arr, ds);

    return 0;
}