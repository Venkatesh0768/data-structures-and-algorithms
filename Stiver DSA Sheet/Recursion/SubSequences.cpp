#include <iostream>
#include <bits/stdc++.h>
using namespace std;

bool subSequence(int ind, vector<int> &ds, int arr[], int n , int sum)  
{
    if (ind == n)
    {
    
        for (auto it : ds)
        {
            cout << it << " ";
            
        }

        if (ds.size() == 0)
        {
            cout<<"{}"<<endl;
        }
        
        cout << sum<< endl;
        return;
    }

    ds.push_back(arr[ind]);
    sum += arr[ind];
    subSequence(ind + 1, ds, arr, n , sum );
    ds.pop_back();
    sum -= arr[ind];
    subSequence(ind + 1, ds, arr, n , sum);
}

int main()
{
    int arr[] ={3,1,2};
    vector<int> ds;
    int n =3;
    subSequence(0, ds, arr, n , 0);
    return 0;
}