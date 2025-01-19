#include <iostream>
#include <vector>
#include <cmath>
#include <algorithm>
using namespace std;

int trapRainWater(vector<vector<int>>& arr)
{
    int rows = arr.size();
    int cols = arr[0].size();

    int totalWater = 0;
    for (int i = 1; i < rows-1; i++)
    {
        for (int j = 1; j < cols-1; j++)
        {
           int maxLeft=0 , maxRight=0 , maxUp =0, maxDown =0;

            //maxleft
           for (int k = 0; k <=j; k++)
           {
             maxLeft = max(maxLeft, arr[i][k]);
           }

           //maxRIght
           for (int k = j; k <cols; k++)
           {
             maxRight = max(maxRight, arr[i][k]);
           }

           //maxUP
           for (int k = 0; k <= i; k++)
           {
             maxUp = max(maxUp, arr[k][j]);
           }

           for (int k = i; k < rows; k++)
           {
             maxDown = max(maxDown, arr[k][j]);
           }

           int minBoundary = min({maxLeft, maxRight, maxUp, maxDown});
           totalWater += max(0, minBoundary - arr[i][j]);

           
        }

    }

    return totalWater;
}



int main()
{
    vector<vector<int>> arr = {{1,4,3,1,3,2},{3,2,1,3,2,4},{2,3,3,2,3,1}};
    int final  =trapRainWater(arr);
    cout<< final<<endl;
    return 0;
}
