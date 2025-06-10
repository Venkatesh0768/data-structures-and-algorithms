#include <iostream>
#include <vector>
#include <unordered_map>
using namespace std;

int main()
{
    vector<vector<int>> mat = {
        {1, 2, 3, 4},
        {5, 6, 7, 8},
        {9, 10, 11, 12
    };
    vector<int> arr = {1, 2, 3, 4};
    firstCompleteIndex(arr , mat);
 
    return 0;
}


void firstCompleteIndex(vector<int>& arr, vector<vector<int>>& mat) {
        
        for (int i = 0; i < mat.size(); i++)
        {
            for (int j= 0; j <mat[i].size(); j++)
            {
                cout<< mat[i][j] << endl;
            }
            
        }
        
}
bool checkingThePainted( vector<vector<int>>& arr , int i , int j  ){
    
}