import java.util.*;;
public class BfsGraph {
    public static void main(String[] args) {
        int v=10;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>(v);
        for(int i=0;i<v;i++){
            adj.add(new ArrayList<>());
        }
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
      ArrayList<Integer> bfsResult = bfsGraph(v, adj);

      // Print the BFS traversal result
      System.out.println("BFS Traversal: " + bfsResult);
    }

    private static ArrayList<Integer> bfsGraph(int v, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> bfs=new ArrayList<>();
        boolean vis[]=new boolean[v+1];
        Queue<Integer> q=new LinkedList<>();
        q.add(0);
        vis[0]=true;
        while (!q.isEmpty()) {
            Integer node=q.poll();
            bfs.add(node);
            for (Integer it : adj.get(node)) {
                if(vis[it]==false){
                  vis[it]=true;
                  q.add(it);
                }
            }
        }
        return bfs;
    }
}
