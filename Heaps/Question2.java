import java.util.*;

public class Question2 {
    static class Effort implements Comparable<Effort> {
        int cost;
        int x;
        int y;

        public Effort(int cost, int x, int y) {
            this.cost = cost;
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Effort s1) {
            return this.cost - s1.cost;
        }
    }

    public static int Minimum_Effort(int grid[][]) {
        int n = grid.length;
        System.out.println(n);
        int m = grid[0].length;
        System.out.println(m);

        // Direction vectors for moving down, right, left, up
        int[][] direction = {{1, 0}, {0, 1}, {0, -1}, {-1, 0}};

        // Priority queue to store Effort objects based on their cost
        PriorityQueue<Effort> pq = new PriorityQueue<>();

        // Cost array to store minimum cost to reach each cell
        int[][] cost = new int[n][m];

        // Initialize cost array with maximum value
        for (int[] row : cost) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }

        // Start from the top-left corner
        pq.add(new Effort(grid[0][0], 0, 0));
        cost[0][0] = grid[0][0];

        while (!pq.isEmpty()) {
            Effort current = pq.poll();

            // If we reach the bottom-right corner, return the cost
            if (current.x == n - 1 && current.y == m - 1) {
                return current.cost;
            }

            // Explore neighbors
            for (int[] dir : direction) {
                int newX = current.x + dir[0];
                int newY = current.y + dir[1];

                if (newX >= 0 && newX < n && newY >= 0 && newY < m) {
                    int newCost = current.cost + grid[newX][newY];

                    // If new cost is less than previously recorded cost to reach this cell
                    if (newCost < cost[newX][newY]) {
                        cost[newX][newY] = newCost;
                        pq.add(new Effort(newCost, newX, newY));
                    }
                }
            }
        }

        return -1; // In case there's no valid path to reach bottom-right corner
    }

    public static void main(String[] args) {
        int arr[][] = {
                {31, 100, 65, 12, 18},
                {10, 13, 47, 157, 6},
                {100, 113, 174, 11, 33},
                {88, 124, 41, 20, 140},
                {99, 32, 111, 41, 20}
        };

        int result = Minimum_Effort(arr);
        System.out.println("Minimum cost to reach bottom-right corner: " + result);
    }
}
