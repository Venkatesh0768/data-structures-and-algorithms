#include <iostream>
#include <bits/stdc++.h>
using namespace std;

void subSequence2(int ind, vector<int> &ds, int arr[], int n, int sum, int s)
{
    if (ind == n)
    {
        if (sum == s)
        {
            for (auto it : ds)
            {
                cout << it << " ";
            }
            cout<<"\n";
        }
        return;
    }

    ds.push_back(arr[ind]);
    sum += arr[ind];
    subSequence2(ind + 1, ds, arr, n, sum, s);
    ds.pop_back();
    sum -= arr[ind];
    subSequence2(ind + 1, ds, arr, n, sum, s);
}

void sub2(int ind , string &s , string current, vector<string> &a){
    if(ind == s.size()){
        a.push_back(current);
        return;
    }
    sub2(ind +1 , s , current +  s[ind] , a);
    sub2(ind +1 , s , current  , a);
}




int main()
{
    string input = "abc";
    string input2 = "abcde";
    vector<string> subsequences1;
    vector<string> subsequences2;


    sub2(0, input, "", subsequences1);
    sub2(0, input2, "", subsequences2);

    int cnt =0;
    
 // Use unordered_set for fast lookup
    unordered_set<string> set2(subsequences2.begin(), subsequences2.end());

    int count = 0;
    for (auto& s : subsequences1) {

        if (set2.count(s)) {
            count++;
        }
    }
    
    cout<< count<<endl;
    return 0;
}