import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Combinations {
    public static List<List<Integer>>Combine(int n,int k){
        List<List<Integer>> subsets=new LinkedList<>();
        generateSubsets(1,n,new ArrayList<>(),subsets,k);
        return subsets;
    }
    public static void generateSubsets(int start,int n,List<Integer>current,List<List<Integer>>subsets,int k){
        if(current.size()==k){
            subsets.add(new ArrayList<>(current));
        }
        for(int i=start;i<=n;i++){
            current.add(i);
            generateSubsets(i+1, n, current, subsets, k);
            current.remove(current.size()-1);   
        }
    }

    public static void main(String[] args) {
        int n=4;
        int k=2;
        System.out.println(Combine(n,k));
    }
}