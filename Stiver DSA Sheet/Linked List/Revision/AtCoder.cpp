#include <iostream>
#include <bits/stdc++.h>
using namespace std;


void solve(string s)
{
    if(s[0] == 'z' && s.size() == 1){
        cout<<'a'<<endl;
        return;
    }
    if(s.size() == 1 ){cout<<static_cast<char>(s[0] + 1)<<endl; return;}

    int sum =0;
    for(char c : s){
        sum += static_cast<int>(c);
    }

    int res = abs(2847 - sum);

    if (res >= 32 && res <= 126) {
        cout << static_cast<char>(res) << endl;
    } else {
        cout << "[Invalid ASCII: " << res << "]" << endl;
    }
}

int main()
{
    string s; cin>>s;
    solve(s);
    return 0;
}