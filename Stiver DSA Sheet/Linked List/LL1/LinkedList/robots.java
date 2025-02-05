class robots {
    public static void main(String[] args) {

        int[][] grid = {
                { 2, 5, 4 },
                { 1, 5, 1 } };
        System.out.println(minPathSum(grid));

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
            for (int j = 0; j < m; j++) {
                prefix[i][j] = grid[i][j] + Math.min(prefix[i - 1][j], prefix[i][j - 1]);
            }
        }

        return prefix[n - 1][m - 1];
    }
}