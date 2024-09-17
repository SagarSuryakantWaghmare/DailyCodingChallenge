
import java.util.*;;
public class bipartitleGraphbfs {
    public static void main(String[] args) {
        // Number of vertices
        int V = 8;
    
        // Adjacency list representation of the graph
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
    
        // Initialize the adjacency list for all vertices
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<Integer>());
        }
    
        // Add edges
        adj.get(0).add(1);
        adj.get(1).add(0);
    
        adj.get(1).add(2);
        adj.get(2).add(1);
    
        adj.get(2).add(3);
        adj.get(3).add(2);
    
        adj.get(3).add(4);
        adj.get(4).add(3);
    
        adj.get(4).add(5);
        adj.get(5).add(4);
    
        adj.get(5).add(6);
        adj.get(6).add(5);
    
        adj.get(6).add(7);
        adj.get(7).add(6);
    
        adj.get(7).add(0);
        adj.get(0).add(7);
    
        // Check if the graph is bipartite
        boolean result = isBiParitite(V, adj);
        
        if (result) {
            System.out.println("The graph is bipartite.");
        } else {
            System.out.println("The graph is not bipartite.");
        }
    }

    private static boolean isBiParitite(int v, ArrayList<ArrayList<Integer>> adj) {
      int color[]=new int[v];
      for(int i=0;i<v;i++){
        color[i]=-1;
      }  
      for(int i=0;i<v;i++){
        if(color[i]==-1){
            if(check(i,v,adj,color)){
                return false;
            }
        }
      }
      return true;
    }

    private static boolean check(int start, int v, ArrayList<ArrayList<Integer>> adj, int[] color) {
        Queue<Integer> q=new LinkedList<Integer>();
        q.add(start); 
        color[start]=0;
        while(!q.isEmpty()){
          int node=q.remove();
          for(int it:adj.get(node)){
              if(color[it]==-1){
                  color[it]=1-color[node];
                  q.add(it);
              }
              else if(color[it]==color[ node]){
                  return false;
              }
          }
        }
        return true;



    }
    
}

