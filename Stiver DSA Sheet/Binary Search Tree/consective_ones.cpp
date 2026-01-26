#include <iostream>
#include <bits/stdc++.h>
using namespace std;


int solve(vector<int> &ans){
    int cnt =0;
    int maxCnt  =0;
    for(int i =1; i<ans.size(); i++){
        if(ans[i-1] == ans[i]){
            cnt++;
        }else{
            cnt=0;
        }
        maxCnt = max(cnt , maxCnt);
    }

    return maxCnt;
}

int main()
{
    cout<<"Enter the size of array: "<<endl;
    int n;
    cin>>n;
    vector<int> a(n);
    for(int i =0; i<n; i++){
        int ele;
        cin>>ele;
        a[i] = ele;
    }
    cout<<solve(a)<<" ";
    return 0;
}