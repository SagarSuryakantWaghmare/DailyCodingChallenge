import java.util.*;

public class NumberOfProvinces {

    // Method to perform DFS

    // Method to find the number of provinces
    public static int NumberOfProvinces(ArrayList<ArrayList<Integer>> adj, int v) {
        // create a list adj
        ArrayList<ArrayList<Integer>> adjLs = new ArrayList<ArrayList<Integer>>();
        // convert the adjaceny matrix to list
        for (int i = 0; i < v; i++) {
            adjLs.add(new ArrayList<Integer>());
        }
        // add the elements in the list

        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                if (adj.get(i).get(j) == 1 && i != j) {
                    adjLs.get(i).add(j);
                    adjLs.get(j).add(i);
                }
            }
        }
        int vis[] = new int[v];
        int count = 0;
        for (int i = 0; i < v; i++) {
            if (vis[i] == 0) {
                count++;
                dfs(i, adjLs, vis);
            }

        }

        return count;
    }

    private static void dfs(int node, ArrayList<ArrayList<Integer>> adjLs, int[] vis) {
        vis[node] = 1;
        for (Integer it : adjLs.get(node)) {
            if (vis[it] == 0) {
                dfs(it, adjLs, vis);
            }
        }
    }

    public static void main(String[] args) {
        // Example 1
        ArrayList<ArrayList<Integer>> adj1 = new ArrayList<>();
        adj1.add(new ArrayList<>(List.of(1, 1, 0)));
        adj1.add(new ArrayList<>(List.of(1, 1, 0)));
        adj1.add(new ArrayList<>(List.of(0, 0, 1)));

        int v1 = adj1.size(); // Number of vertices

        int result1 = NumberOfProvinces(adj1, v1);
        System.out.println("Number of Provinces in Example 1: " + result1); // Output should be 2

        // Example 2
        ArrayList<ArrayList<Integer>> adj2 = new ArrayList<>();
        adj2.add(new ArrayList<>(List.of(1, 0, 0, 1)));
        adj2.add(new ArrayList<>(List.of(0, 1, 1, 0)));
        adj2.add(new ArrayList<>(List.of(0, 1, 1, 0)));
        adj2.add(new ArrayList<>(List.of(1, 0, 0, 1)));

        int v2 = adj2.size(); // Number of vertices

        int result2 = NumberOfProvinces(adj2, v2);
        System.out.println("Number of Provinces in Example 2: " + result2); // Output should be 2
    }
}
