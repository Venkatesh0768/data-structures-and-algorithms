#include <iostream>
#include <bits/stdc++.h>
using namespace std;

string DtoB(int n){
    string s ="";
    while (n > 0 )
    {
        if(n%2 ==1) s += '1';
        else s += '0'; 
        n = n/2;
    } 
    reverse(s.begin() , s.end());
    return s;    
}
int BtoD(string s){
    int ans =0;
    int power =1;
    for(int i = s.size()-1; i>=0; i--){
        if(s[i] == '1'){
            ans  += power;
        }
        power *= 2;
    }
    return ans;    
}

int main()
{
    // int n; cin>>n;
    string s; cin>>s;

    cout<<BtoD(s);
    return 0;
}