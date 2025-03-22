// #include <iostream>
// #include <bits/stdc++.h>
// using namespace std;

// //apporach  1

// bool isSafe(int row, int col , vector<string> &board , int n) {

//     int duprow = row;
//     int dupcol = col;
//     while (row>=0 && col>=0)
//     {
//         if (board[row][col] == 'Q') {
//             return false;
//         }
//         row--;
//         col--;

//     }

//     row = duprow;
//     col = dupcol;
//     while ( col>=0)
//     {
//         if (board[row][col] == 'Q') {
//             return false;
//         }
//         col--;

//     }
//     // right up diagonal
//     row = duprow;
//     col = dupcol;
//     while (row< n && col>=0)
//     {
//         if (board[row][col] == 'Q') {
//             return false;
//         }
//         row++;
//         col--;

//     }

//     return true;

// }

// void solve(int col , vector<string> &board, vector<vector<string>> &ans ,int n){
//     if (col == n)
//     {
//         ans.push_back(board);

//         return;
//     }

//     for (int row = 0; row < board.size(); row++)
//     {
//         if (isSafe(row , col , board , n)){
//             board[row][col] = 'Q';
//             solve(col+1, board ,ans , n);
//             board[row][col] = '.';
//         }

//     }

// }
// int main()
// {
//     int n; cin>>n;
//     vector<vector<string>> ans;
//     vector<string> board(n);
//     string s(n, '.');
//     for (int i = 0; i < n; i++)
//     {
//         board[i] = s;
//     }

//     solve(0 , board, ans , n);

//     for (int i = 0; i < ans.size(); i++)
//     {
//         for (int j= 0; j < ans[i].size(); j++)
//         {
//             cout<<ans[i][j]<<endl;
//         }
//         cout<<"\n";
//     }

//     return 0;
// }

// apporach two ----2

#include <iostream>
#include <bits/stdc++.h>
using namespace std;

void solve(int col, vector<string> &board, vector<vector<string>> &ans, int n, vector<int> &leftRow, vector<int> &downDiagonal, vector<int> &upperDiagonal)
{

    if (col == n)
    {
        ans.push_back(board);
        return;
    }

    for (int row = 0; row <n; row++)
    {
        if (leftRow[row] == 0 && downDiagonal[row + col] == 0 && upperDiagonal[n - 1 + col - row] == 0)
        {
            board[row][col] = 'Q';

            leftRow[row] = 1;
            downDiagonal[row + col] = 1;
            upperDiagonal[n - 1 + col - row] = 1;

            solve(col + 1, board, ans, n, leftRow, downDiagonal, upperDiagonal);
            board[row][col] = '.';
            leftRow[row] = 0;
            downDiagonal[row + col] = 0;
            upperDiagonal[n - 1 + col - row] = 0;
        }
    }
}

int main()
{
    int n;
    cin >> n;
    vector<vector<string>> ans;
    vector<string> board(n);
    string s(n, '.');
    for (int i = 0; i < n; i++)
    {
        board[i] = s;
    }
    vector<int> leftRow(n, 0), downDiagonal(2 * n - 1), upperDiagonal(2 * n - 1);

    solve(0, board, ans, n, leftRow, downDiagonal, upperDiagonal);

    for (int i = 0; i < ans.size(); i++)
    {
        for (int j = 0; j < ans[i].size(); j++)
        {
            cout << ans[i][j] << endl;
        }
        cout << "\n";
    }

    return 0;
}