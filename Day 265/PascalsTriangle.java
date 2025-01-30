import java.util.*;
public class PascalsTriangle {
    public static List<List<Integer>> pascal(int n){
        List<List<Integer>> triangle=new ArrayList<>();
        List<Integer> first=new ArrayList<>();
        if(n<=0){
            return triangle;
        }
        first.add(1);
        triangle.add(first);
        for (int i = 1; i < n; i++) {

            List<Integer> pre=triangle.get(i-1);
            List<Integer> curr=new ArrayList<>();
            curr.add(1);
            for (int j = 1; j < i; j++) {
                curr.add(pre.get(j-1)+pre.get(j));
            }
            curr.add(1);
            triangle.add(curr);

        }
        return triangle;
    }

    public static void main(String[] args) {
        int n=4;
        List<List<Integer>> res=pascal(n);
        for (List<Integer> row : res) {
            System.out.println(row);
        }

    }
}