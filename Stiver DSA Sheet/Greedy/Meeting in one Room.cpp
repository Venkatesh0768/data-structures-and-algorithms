#include <iostream>
#include <bits/stdc++.h>
using namespace std;

struct Data
{
    int start;
    int end;
    int ind;
};

class Solution
{
public:
    bool static comparator(Data v1, Data v2)
    {
        return v1.end < v2.end;
    }

    int maxMeetings(int start[], int end[], int n)
    {
        Data arr[n];
        for (int i = 0; i < n; i++)
        {
            arr[i].start = start[i];
            arr[i].end = end[i];
            arr[i].ind = i;
        }
        sort(arr, arr + n, comparator);
        int cnt = 1, freetime = arr[0].end;
        for (int i = 1; i < n; i++)
        {
            if (arr[i].start > freetime)
            {
                cnt++;
                freetime = arr[i].end;
            }
        }

        return cnt;
    }
};

int main()
{
    Solution obj;
    int n = 6;
    int start[] = {1, 3, 0, 5, 8, 5};
    int end[] = {2, 4, 5, 7, 9, 9};
    int ans = obj.maxMeetings(start, end, n);
    cout<<ans;

    return 0;
}