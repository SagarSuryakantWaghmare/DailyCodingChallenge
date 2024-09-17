import java.util.*;;
public class DfsGraph {
    public static void main(String[] args) {
        int V = 10; // Number of vertices
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>(V);

        // Initialize adjacency list
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        // Add edges
        adj.get(1).add(2);
        adj.get(1).add(6);
        adj.get(2).add(1);
        adj.get(2).add(3);
        adj.get(2).add(4);
        adj.get(3).add(2);
        adj.get(4).add(2);
        adj.get(4).add(5);
        adj.get(5).add(4);
        adj.get(5).add(8);
        adj.get(6).add(1);
        adj.get(6).add(7);
        adj.get(6).add(9);
        adj.get(7).add(6);
        adj.get(7).add(8);
        adj.get(8).add(5);
        adj.get(8).add(7);
        adj.get(9).add(6);
        System.out.println(adj);

        ArrayList<Integer> dfsResult = dfsGraph(V, adj);

        // Print the BFS traversal result
        System.out.println("DFS Traversal: " + dfsResult);
    }

    private static ArrayList<Integer> dfsGraph(int v, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> ans=new ArrayList<>();
        boolean vis[]=new boolean[v+1];
        vis[0]=true;
        dfs(1, vis,adj,ans);
        return ans;
    }

    private static void dfs(int node, boolean[] vis, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> ans) {
        vis[node]=true;
        ans.add(node);
        for(Integer it:adj.get(node)){
            if(vis[it]==false){
                  dfs(it, vis, adj, ans);
            }
        }
    }
      
}
