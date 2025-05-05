#include <iostream>
#include <bits/stdc++.h>
using namespace std;


void gridRotate(vector<vector<char>>  &s){
    for (int i = 0; i < s.size(); i++)
    {
        for (int j = 0; j < s[i].size(); j++)
        {
            swap(s[i][j] , s[j][i]);
        }
    }

    for (int i = 0; i < s.size(); i++)
    {
        for (int j = 0; j < s[i].size(); j++)
        {
            cout<<s[i][j]<<" ";
        }
        cout<<endl; 
    }
}

int main()
{
    int n; cin>>n;
    vector<vector<char>> s(n, vector<char>(n));
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {
            cin>>s[i][j];
        }
        
    }

    
    
    vector<vector<char>> t(n, vector<char>(n));
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {
            cin>>t[i][j];
        }
        
    }
    
    
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {
            cout<<s[i][j]<<" ";
        }
        cout<<endl; 
    }
    
    cout<<endl;
    gridRotate(s);
    
    return 0;
}