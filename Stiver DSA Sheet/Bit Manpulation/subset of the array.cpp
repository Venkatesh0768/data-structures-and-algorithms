#include <iostream>
#include <bits/stdc++.h>
using namespace std;

void generateSubsets(vector<int> &a){
    int n = a.size();
    for (int i = 0; i < (1<<n); i++)
    {
        for (int j = 0; j < n; j++)
        {
           if(i & (1<<j)) cout<< a[j]<<" ";
        }
        
        cout<<endl;
    }

    
}

int main()
{   
    int n; cin>>n;
    vector<int> a ={1,2,3};
    generateSubsets(a);
    return 0;
}