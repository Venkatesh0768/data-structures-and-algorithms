#include <iostream>
#include <bits/stdc++.h>
using namespace std;

/*So, a >> n is equivalent to:
floor(a / (2^n))*/

// count the Bit 
int countBits(int n ){
    int cnt =0;
    while(n>0){
        cnt += n&1;
        n >>= 1;
    }

    return cnt;
}

// Check if ith Bit is Set
/*Checking bit at i = 2:

Bits are: 3rd:1, 2nd:1, 1st:0, 0th:1

So, the 2nd bit is 1 (set) → Output: "The 2nd bit is set."*/

int isSet(int n , int i){
    return (n & (1 << i) != 0);
}

int main()
{
    int n; cin>>n;
    cout<<countBits(n)<<endl;
    cout<<isSet(n , 2)<<endl;
 
    return 0;
}