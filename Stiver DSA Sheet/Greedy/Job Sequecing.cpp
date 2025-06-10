#include <iostream>
#include <bits/stdc++.h>
using namespace std;

struct Job
{
    int id;
    int deadline;
    int profit;
};

class Solution
{
public:
    bool static comparsion(Job a, Job b)
    {
        return (a.profit > b.profit);
    }

    pair<int ,int > JobScheduling(Job arr[] , int n){
        sort(arr, arr + n , comparsion);
        int maxi = arr[0].deadline;
        for (int i = 1; i < n; i++)
        {
            maxi = max(maxi , arr[i].deadline);
        }

        int slot[maxi +1];
        for (int i = 0; i <=maxi; i++) slot[i] = -1;
        
        int countjobs =0 , jobProfit =0; 
        for (int i = 0; i < n; i++)
        {
            for (int j = arr[i].deadline; j>0; j--)
            {
                if (slot[j] == -1)
                {
                    slot[j] = i;
                    countjobs++;
                    jobProfit += arr[i].profit;
                    break;
                }
                
            }
            
        }
        return make_pair(countjobs , jobProfit);
    }
};

int main()
{
   int n = 4;
   Job arr[n] = {{1,4,20},{2,1,10},{3,2,40},{4,2,30}};

   Solution ob;
   //function call
   pair < int, int > ans = ob.JobScheduling(arr, n);
   cout << ans.first << " " << ans.second << endl;

    return 0;
}