#include <iostream>
#include <bits/stdc++.h>
using namespace std;

void solve(vector<int> &ds, vector<int> &a, int freq[] ,vector<vector<int>> &ans)
{
    if (ds.size() == a.size())
    {
        ans.push_back(ds);
        return;
    }

    for (int i = 0; i < a.size(); i++)
    {
        if (!freq[i])
        {
            ds.push_back(a[i]);
            freq[i] = 1;
            solve(ds, a, freq , ans);
            freq[i] = 0;
            ds.pop_back();
        }
    }
}

void solve1( vector<int> &a ,int ind , vector<vector<int>> &ans)
{
    if (ind == a.size())
    {
        ans.push_back(a);
        return;
    }

    for (int i = ind; i < a.size(); i++)
    {
        swap(a[ind] , a[i]);
        solve1(a, ind +1 , ans);
        swap(a[ind] , a[i]);
    }
}
string kthPermutation(int n, int k)
{
    int fact =1;
    vector<int> numbers;
    for (int i = 1; i <n; i++)
    {
        fact *= i;
        numbers.push_back(i);
    }

    numbers.push_back(n);
    string ans ="";
    k = k-1;

    while (true)
    {
       ans = ans + to_string(numbers[k / fact]);
       numbers.erase(numbers.begin() + k / fact);
       if (numbers.size() == 0) break;
       k = k % fact;
       fact = fact / numbers.size();
    }
    return ans;
    
}

int main()
{
    vector<int> ds;
    vector<vector<int>>  ans;
    vector<int> nums = {1, 2, 3 ,4};
    int freq[nums.size()] = {0};
    solve1(nums, 0, ans);

    sort(ans.begin() , ans.end());
    for (int i = 0; i < ans.size(); i++)
    {
        for (int j = 0; j < ans[i].size(); j++)
        {
            cout<<ans[i][j]<<" ";
        }
        cout<<endl;
    }
    
    return 0;
}



// vector<int> b(n);
//     b[0] = a[0];
//     for (int i = 1; i < n; i++)
//     {
//         b[i] = b[i - 1] * a[i];
//     }

//     vector<int> c(n);
//     c[n - 1] = a[n - 1];
//     for (int i = n - 2; i >= 0; i--)
//     {
//         c[i] = c[i + 1] * a[i];
//     }

//     for (int i = 0; i < n - 1; i++)
//     {
//         if (b[i] == c[i + 1])
//         {
//             cout << i +1<< endl;
//             return;
//         }
//     }

//     cout << "-1" << endl;