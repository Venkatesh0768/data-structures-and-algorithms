#include <iostream>
#include <bits/stdc++.h>
using namespace std;

int NumberOfFruits1(vector<int> &a , int k){
    int maxlen =0; int l =0 , r= 0;
    int n = a.size();
    for(int i =0; i<n; i++){
        set<int> st;
        for (int j = i; j < n; j++)
        {
            st.insert(a[j]);
            if(st.size() <= k){
                maxlen = max(maxlen, j - i + 1);
            }else{
                break;
            }
        }
        
    }
    return maxlen;
}

int NumberOfFruits2(vector<int> &a, int k)
{
    int maxlen = 0;
    int l = 0, r = 0;
    int n = a.size();
    unordered_map<int, int> mp;
    while (r < n)
    {
        mp[a[r]]++;
        if (mp.size() > k)
        {
            while (mp.size() > k)
            {
                mp[a[l]]--;
                if (mp[a[l]] == 0)
                    mp.erase(a[l]);
                l++;
            }
        }

        if (mp.size() <= k)
        {
            maxlen = max(maxlen, r - l + 1);
        }
        r++;
    }
    return maxlen;
}

int NumberOfFruits3(vector<int> &a, int k)
{
    int maxlen = 0;
    int l = 0, r = 0;
    int n = a.size();
    unordered_map<int, int> mp;
    while (r < n)
    {
        mp[a[r]]++;
        if (mp.size() > k)
        {
            mp[a[l]]--;
            if (mp[a[l]] == 0)
                mp.erase(a[l]);
            l++;
        }

        if (mp.size() <= k)
        {
            maxlen = max(maxlen, r - l + 1);
        }
        r++;
    }
    return maxlen;
}
int main()
{
    vector<int> a = {3, 3, 3, 1, 2, 1, 1, 2, 3, 3, 4};
    cout << NumberOfFruits1(a, 2);
    return 0;
}