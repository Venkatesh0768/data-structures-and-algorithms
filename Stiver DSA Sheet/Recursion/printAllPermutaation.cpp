#include <iostream>
#include <bits/stdc++.h>
using namespace std;
void recursivePermutation(vector<int> &ds, vector<int> &nums, int freq[])
{   

    if (ds.size() == nums.size())
    {
        for (auto it : ds)
        {
            cout << it << " ";
        }
        cout << endl;

        return;
    }

    for (int i = 0; i < nums.size(); i++)
    {
        if (!freq[i])
        {
            ds.push_back(nums[i]);
            freq[i] = 1;
            recursivePermutation(ds, nums, freq);
            freq[i] = 0;
            ds.pop_back();
        }
    }
}

void recursivePermutation2(int ind, vector<int> &nums)
{

    if (ind == nums.size())
    {
        for (auto it : nums)
        {
            cout << it << " ";
        }
        cout << endl;

        return;
    }

    for (int i = ind; i < nums.size(); i++)
    {
        swap(nums[ind], nums[i]);
        recursivePermutation2(ind + 1, nums);
        swap(nums[ind], nums[i]);
    }
}

int main()
{
    vector<int> ds;
    vector<int> nums = {1, 2, 3};
    int freq[nums.size()] = {0};
    recursivePermutation2(0, nums);

    return 0;
}