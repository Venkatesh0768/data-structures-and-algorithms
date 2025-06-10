#include <iostream>
#include <bits/stdc++.h>
using namespace std;

void spiralOrder(vector<vector<int>> &mat)
{
    int top = 0, left = 0;
    int bottom = mat.size() - 1;
    int right = mat[0].size() - 1;

    while (top <= bottom && left <= right)
    {
        for (int i = left; i <= right; i++)
        {
            cout << mat[top][i] << " ";
        }
        top++;

        for (int i = top; i <= bottom; i++)
        {
            cout << mat[i][right] << " ";
        }
        right--;

        if (top <= bottom)
        {
            for (int i = right; i >= left; i--)
            {
                cout << mat[bottom][i] << " ";
            }
            bottom--;
        }

        if (left <= right)
        {
            for (int i = bottom; i >=top; i--)
            {
                cout << mat[i][left] << " ";
            }
            left++;
        }
    }

}

int countFactor(int n ){
    int cnt =0;
    for (int i = 1; i *i  < n; i++)
    {
       if(n % i == 0){
         cnt += (i*i == n)?1:2;
       }
    }
    return cnt;
}

string removeDuplicate(string &a){
    string res;
    for(char c: a){
        if (a.empty() || a.back() != c)
        {
            res+=c;
        }
        
    }
    return res;
}

int main()
{
    vector<vector<int>> matrix = {
        {1, 2, 3, 4},
        {5, 6, 7, 8},
        {9, 10, 11, 12}};
    
    vector<int> ans = {10, 15, 21};
    vector<int> res;
    for(int num : ans){
        res.push_back(countFactor(num));
    }
    for(int ele :  res){
        cout<<ele<<" ";
    }
    // spiralOrder(matrix);
    return 0;
}