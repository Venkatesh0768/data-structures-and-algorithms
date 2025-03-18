#include <iostream>
#include <bits/stdc++.h>
using namespace std;


// parmeterised way
void usingParmeterised(int l, int arr[], int r)
{
    if (l >= r)
    {
        return;
    }
    swap(arr[l], arr[r]);
    usingParmeterised(l + 1, arr, r - 1);
}

// using the functional way to write the code
void usingFunctional(int i ,  vector<int>& arr)
{

    if(i >= arr.size()/2){
        return;
    }
    swap(arr[i] , arr[arr.size() - i -1]);
    usingFunctional(i+1 , arr);
    
}

int main()
{
    vector<int> arr = {1, 2, 3, 4, 5};
    // usingParmeterised(0, arr, 4);

    usingFunctional(0, arr);
    for (int i = 0; i < 5; i++)
    {
        cout<<arr[i]<< " ";
    }
    

    return 0;
}