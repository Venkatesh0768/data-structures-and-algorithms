public class flyo {
   final static int INF = 999999, V =4;

   static void floydWarshall(int dp[][]){
        for(int k =0; k<V; k++){
            for(int i=0; i<V; i++){
                for(int j =0; j <V; j++){
                    if (dp[i][k] + dp[k][j] < dp[i][j]) {
                        dp[i][j] = dp[i][k] + dp[k][j];
                    }
                }
            
            }
        }

        PrintFloyd(dp);
    }

    static void PrintFloyd(int arr[][]){
        for(int i =0; i<arr.length; i++){
            for(int j =0; j<arr[0].length; j++){
                if(arr[i][j] == INF){
                    System.out.print("INF ");
                }else{
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

  
    
    public static void main(String[] args) {
        
        int graph[][] = { { 0, 9, -4, INF },
                { 6, 0, INF, 2 },
                { INF, 5, 0, INF },
                { INF, INF, 1, 0 } };
        flyo a = new flyo();

        // Function call
        a.floydWarshall(graph);
    }
}