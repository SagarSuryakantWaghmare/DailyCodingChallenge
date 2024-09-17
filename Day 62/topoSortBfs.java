import java.util.*;
public class topoSortBfs {
    static int[] topoSort(int v,ArrayList<ArrayList<Integer>> adj){
        int indegree[]=new int[v];
        // Calculate in-degrees of all vertices.
        for(int i=0;i<v;i++){
            for (int it : adj.get(i)) {
                indegree[it]++;
            }
        }

        // Queue to store
        Queue<Integer> q=new LinkedList<Integer>();
        // Add all vertices with in-degree 0 to the queue
        for (int i = 0; i < v; i++) {
            if(indegree[i]==0){
                q.add(i);
            }
        }
        int topo[]=new int[v];
        int index=0;
        // process vertices in the queue
        while (!q.isEmpty()) {
            int node=q.poll();
            topo[index++]=node;
            // Reduce the in-degree of adjacent vertices
            for (int it : adj.get(node)) {
                indegree[it]--;
                if(indegree[it]==0){
                    q.add(it);
                }
            }
        }
        return topo;
    }
    public static void main(String[] args) {
        int v = 6;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>(v);

        // Initialize adjacency list for each vertex
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }

        // Adding edges to the graph
        adj.get(5).add(2);
        adj.get(5).add(0);
        adj.get(4).add(0);
        adj.get(4).add(1);
        adj.get(2).add(3);
        adj.get(3).add(1);

        // Performing topological sort
        int[] topo = topoSort(v, adj);

        // Printing the topological order
        System.out.println("Topological Sort of the given graph:");
        for (int i : topo) {
            System.out.print(i + " ");
        }
    }
}
