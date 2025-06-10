package Leetcode;

import java.util.Arrays;

public class Robots {
    public static void main(String[] args) {

        int[][] grid = {
                { 2, 5, 4 },
                { 1, 5, 1 } };
        maxPathSum(grid);
        for (int[] row : grid) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println(minPathSum(grid));

    }

    static int maxPathSum(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int[][] prefix = new int[n][m];
        prefix[0][0] = grid[0][0];

        for (int i = 1; i < m; i++) {
            prefix[0][i] = prefix[0][i - 1] + grid[0][i];
        }

        for (int j = 1; j < n; j++) {
            prefix[j][0] = prefix[j - 1][0] + grid[j][0];
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                prefix[i][j] = grid[i][j] + Math.max(prefix[i - 1][j], prefix[i][j - 1]);
            }
        }

        int i = n-1 , j =m-1;

        while(i >0 ||  j > 0){
            grid[i][j] = 0;
            if (i == 0) {
                j--;
            }else if (j == 0) {
                i--;
            }else {
                if (prefix[i - 1][j] > prefix[i][j - 1]){
                    i--;
                }else {
                    j--;
                }
            }


        }

        grid[0][0] = 0;

        return prefix[n - 1][m - 1];
    }
    static int minPathSum(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int[][] prefix = new int[n][m];
        prefix[0][0] = grid[0][0];

        for (int i = 1; i < m; i++) {
            prefix[0][i] = prefix[0][i - 1] + grid[0][i];
        }

        for (int j = 1; j < n; j++) {
            prefix[j][0] = prefix[j - 1][0] + grid[j][0];
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                prefix[i][j] = grid[i][j] + Math.max(prefix[i - 1][j], prefix[i][j - 1]);
            }
        }

        return prefix[n - 1][m - 1];
    }
}
