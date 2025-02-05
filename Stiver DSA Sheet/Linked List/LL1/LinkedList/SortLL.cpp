#include <iostream>
#include <vector>
using namespace std;
int maxAscendingSum(vector<int> &nums)
{
    int n = nums.size();
    int cnt = nums[0];
    int sum = nums[0];

    for (int i = 1; i < n; i++)
    {
        if (nums[i - 1] > nums[i])
            sum += nums[i];
        else
            sum = nums[i];

        cnt = max(sum, cnt);
    }

    return cnt;
}

int main()
{
    int n;
    vector<int> a;
    for (int i = 0; i < n; i++)
    {
        cin>>a[i];
    }

    int cnt = maxAscendingSum(a);

    cout << cnt << endl;
    
    return 0;
}


