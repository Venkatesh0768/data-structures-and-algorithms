#include <iostream>
#include <bits/stdc++.h>
using namespace std;

int characterReplacement(string s, int k) {
        int n = s.size();
        int maxlen = 0; 
        int l = 0, r = 0;
        unordered_map<char, int> mp;
        while (r < n) {
            mp[s[r]]++;

            if(mp.size() > k) {
                mp[s[l]]--;
                if (mp[s[l]] == 0) {
                    mp.erase(s[l]);
                }
                l++;
            }
            if (mp.size() <= k) {
                maxlen = max(maxlen, r - l + 1);
            }
            r++;
        }

        return maxlen;
    }

int main()
{   
    string a = "abcabc";
    cout<<characterReplacement(a, 2);
 
    return 0;
}