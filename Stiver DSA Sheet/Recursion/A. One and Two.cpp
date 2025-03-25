#include <iostream>
#include <bits/stdc++.h>
using namespace std;



void solve()
{
    int n;
    cin >> n;
    vector<int> a(n);
    for (int i = 0; i < n; i++)
    {
        cin >> a[i];
    }

  
    

    for (int i = 0; i < n; i++)
    {
    
        int first = 1;
        for (int j= 0; j <=i; j++)
        {
            first *= a[j];
        }
        int second = 1;
        for (int j= i + 1; j<n; j++)
        {
            second *= a[j];
        }
        
        if (first == second) 
        {
            cout<<i + 1<<endl;
            return;
        }
        
    }

    cout<<"-1"<<endl;
}

int main()
{
    int t;
    cin >> t;

    while (t--)
    {
        solve();
    }

    return 0;
}