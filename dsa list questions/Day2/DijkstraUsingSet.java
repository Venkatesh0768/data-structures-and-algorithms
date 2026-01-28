package Day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class DijkstraUsingSet {

    //Firststep to make node and dist
    static class Pair {
        int node;
        int dist;

        Pair(int node , int dist){
            this.node = node;
            this.dist = dist;
        } 
    }

    private static int[] dijkstra(int V, List<List<Pair>> adj, int src) {
        int[] dist = new int[V];

        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[0] =0;

        TreeSet<Pair> set = new TreeSet<>(
            (a , b) -> a.dist != b.dist ? a.dist - b.dist : a.node - b.node
        );


        set.add(new Pair(src, 0));

        while (!set.isEmpty()) {
            Pair current = set.pollFirst();
            int u = current.node;

            for(Pair  neighbor : adj.get(u)){
                int v = neighbor.node;
                int weight = neighbor.dist;

                if(dist[u] + weight < dist[v]){
                    if (dist[v] != Integer.MAX_VALUE) {
                        set.remove(new Pair(v, dist[v]));
                    }

                    dist[v] = dist[u] + weight;
                    set.add(new Pair(v, dist[v]));
                }
            }
        }

        return dist;

    }


    public static void main(String[] args) {
        int V = 5;
        List<List<Pair>> adj = new ArrayList<>();

        for(int i =0; i<V; i++){
            adj.add(new ArrayList<>());
        }

        adj.get(0).add(new Pair(1 ,2));
        adj.get(0).add(new Pair(4, 1));
        adj.get(1).add(new Pair(2, 3));
        adj.get(2).add(new Pair(3, 6));
        adj.get(4).add(new Pair(2, 2));
        adj.get(4).add(new Pair(3, 4));

        int[] dist =  dijkstra(V, adj, 0);

         System.out.println("Shortest distances from source 0:");
        for (int i = 0; i < V; i++) {
            System.out.println("Node " + i + " -> " + dist[i]);
        }
    }


    
}
