package Backtracking;

public class tspProblem {
    static int tsp(int graph[][] , boolean v[] , int currPos , int n, int count , int cost, int ans){
        if (count == n && graph[currPos][0] > 0) {
            ans = Math.min(ans, cost + graph[currPos][0]);
            return ans;
        }

        for(int i =0; i<n; i++){
            if (v[i] == false && graph[currPos][i] >0) {
                v[i] = true;
                ans = tsp(graph, v, i, n, count +1, cost+ graph[currPos][i] , ans);
                v[i] = false;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        int n = 4;
 
        int[][] graph = {{0, 10, 15, 20},
                         {10, 0, 35, 25},
                         {15, 35, 0, 30},
                         {20, 25, 30, 0}};
 
        // Boolean array to check if a node
        // has been visited or not
        boolean[] v = new boolean[n];
 
        // Mark 0th node as visited
        v[0] = true;
        int ans = Integer.MAX_VALUE;
 
        // Find the minimum weight Hamiltonian Cycle
        ans = tsp(graph, v, 0, n, 1, 0, ans);
 
        // ans is the minimum weight Hamiltonian Cycle
        System.out.println(ans);
    }
}
