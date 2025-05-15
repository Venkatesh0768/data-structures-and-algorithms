#include <iostream>
#include <bits/stdc++.h>
using namespace std;

int tappingRainwater(vector<int> &a){
    int n = a.size();
    int res =0;
    for(int i =0; i<n; i++){
        int j =i;
        int leftmax =0;
        int rightmax =0;

        while(j>=0){
            leftmax = max(leftmax , a[j]);
            j--;
        }
        j = i;
        while(j<n){
            rightmax = max(rightmax , a[j]);
            j++;
        }

        res += min(leftmax , rightmax) - a[i];
    }
    return res;
}
int tappingRainwater2(vector<int> &a){
    int n = a.size();
    int leftmax[n] , rightmax[n];

    //leftmax
    leftmax[0] = a[0];
    for (int i = 1; i < n; i++){
       leftmax[i] = max(leftmax[i-1] , a[i]);
    }
    
    //rightmax
    rightmax[n-1] = a[n-1];
    for(int i = n-2; i>=0; i--){
        rightmax[i] = max(rightmax[i+1] , a[i]);
    }

    int waterTrapped =0;
    for (int i = 0; i < n; i++){
        waterTrapped += min(leftmax[i] , rightmax[i]) - a[i];
    }
    
    return waterTrapped;
}

int tappingRainwater3(vector<int> &a){
    int lmax = 0, rmax = 0, total = 0;
    int n = a.size();
    int l =0;
    int r = n-1;

    while (l<=r)
    {
        if(a[l] <= a[r]){
            if(lmax <= a[l]){
                lmax = a[l];
            }else{
                total += lmax - a[l];
            }
            l++;
        }else{
            if(rmax <= a[r]){
                rmax = a[r];
            }else{
                total += rmax - a[r];
            }
            r--;
        }
    }

    return total;
    
}



int main()
{
    vector<int> a= {0,1,0,2,1,0,1,3,2,1,2,1};
    int res = tappingRainwater2(a);
    cout<<res<<endl;
    return 0;
}