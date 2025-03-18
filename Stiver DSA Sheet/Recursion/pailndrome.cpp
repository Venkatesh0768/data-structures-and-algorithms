#include <iostream>
#include <bits/stdc++.h>
using namespace std;

bool isPailndrome(int i, string& a)
{
    if (i >= a.size() / 2)
    {
        return true;
    }
    if (a[i] != a[a.length() - i - 1])
        return false;
    return isPailndrome(i + 1, a);
}

int main()
{
    string a = "madsm";
    cout << isPailndrome(0, a) << endl;
    return 0;
}