#include <iostream>
#include<bits/stdc++.h>
using namespace std;

int main()
{
    int n; cin>>n;
    cout<<n<<" ";
    while (n != 1)
    {
        if(n%2 ==0){
            n = n/2;
        }else{
            n = (n*n)+1;
        }
        cout<<n<<" ";
    }
    return 0;
}