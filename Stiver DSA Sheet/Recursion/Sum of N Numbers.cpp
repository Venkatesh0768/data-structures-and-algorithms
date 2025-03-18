#include <iostream>
#include <bits/stdc++.h>
using namespace std;

// parmeterised way
void usingParmeterised(int i, int sum)
{
    if (i < 1)
    {
        cout << sum << endl;
        return;
    }
    usingParmeterised(i - 1, sum +i);
}


// using the functional way to write the code
int usingFunctional(int n){
    if(n==0){
        return 0;
    }

    return n + usingFunctional(n-1);
}

int main()
{

    usingParmeterised(5, 0);
    int a = usingFunctional(5);
    cout<<a<<endl;
    return 0;
}