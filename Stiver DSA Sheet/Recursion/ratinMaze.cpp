#include <iostream>
#include <bits/stdc++.h>
using namespace std;

// void solve(int i, int j, vector<vector<int>> &a, int n, vector<string> &ans, string move, vector<vector<int>> &visited)
// {
//     if (i == n - 1 && j == n - 1)
//     {
//         ans.push_back(move);
//         return;
//     }

//     // dowm
//     if (i + 1 < n && !visited[i + 1][j] && a[i + 1][j] == 1)
//     {
//         visited[i][j] = 1;
//         solve(i+1, j, a, n, ans, move + 'D', visited);
//         visited[i][j] =0;
//     }

//     //right
//     if (j + 1 < n && !visited[i][j+1] && a[i][j+1] == 1)
//     {
//         visited[i][j] = 1;
//         solve(i, j+1, a, n, ans, move + 'R', visited);
//         visited[i][j] =0;
//     }

//     //Left
//     if (j - 1 >=0&& !visited[i][j-1] && a[i][j-1] == 1)
//     {
//         visited[i][j] = 1;
//         solve(i, j-1, a, n, ans, move + 'L', visited);
//         visited[i][j] =0;
//     }

//     //UpSide
//     if (i -1 >=0 && !visited[i - 1][j] && a[i - 1][j] == 1)
//     {
//         visited[i][j] = 1;
//         solve(i-1, j, a, n, ans, move + 'U', visited);
//         visited[i][j] =0;
//     }
// }

void solve(int i, int j, vector<vector<int>> &a, int n, vector<string> &ans, string move, vector<vector<int>> &visited, int di[], int dj[])
{
    if (i == n - 1 && j == n - 1)
    {
        ans.push_back(move);
        return;
    }

    string dir = "DRLU";
    for (int ind = 0; ind < 4; ind++)
    {
        int nexti = i + di[ind];
        int nextj = j + dj[ind];

        if (nexti >= 0 && nextj >= 0 && nexti < n && nextj < n && !visited[nexti][nextj] && a[nexti][nextj] == 1)
        {
            visited[i][j] = 1;
            solve(nexti, nextj, a, n, ans, move + dir[ind], visited, di, dj);
            visited[i][j] = 0;
        }
    }
}
int main()
{
    vector<vector<int>> mat = {{1, 0, 0, 0}, {1, 1, 1, 1}, {1, 1, 1, 0}, {0, 1, 1, 1}};
    int n = mat.size();

    vector<string> ans;
    vector<vector<int>> visited(n, vector<int>(n, 0));
    int di[] = {1, 0, 0, -1};
    int dj[] = {0, 1, -1, 0};

    if (mat[0][0] == 1)
    {
        solve(0, 0, mat, n, ans, "", visited, di, dj);
    }

    for (int i = 0; i < ans.size(); i++)
    {
        cout << ans[i] << endl;
    }

    return 0;
}