#include <iostream>
#include <bits/stdc++.h>
using namespace std;

int main()
{
    vector<int> ans = {1,2,4,7,3,9,3};
    int max = INT_MIN;
    int secondMax = INT_MIN;
    for (int i = 0; i < ans.size(); i++)
    {
        if(ans[i] > max){
            secondMax = max;
            max = ans[i];
        }else if(ans[i] < max && ans[i] > secondMax ){
            secondMax = ans[i];
        } 
    }

    cout<<secondMax<<endl;
    return 0;
}