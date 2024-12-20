import java.util.*;
public class PascalsTriangle {
    public static ArrayList<ArrayList<Integer>> pascal(int n){
        ArrayList<ArrayList<Integer>> triangle=new ArrayList<>();
        ArrayList<Integer> firstRow=new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);
        for(int i=1;i<n;i++){
            ArrayList<Integer> curr=new ArrayList<>();
            ArrayList<Integer> preRow=triangle.get(i-1);
            curr.add(1);
            for(int j=1;j<i;j++){
                curr.add(preRow.get(j-1) + preRow.get(j));
            }
            curr.add(1);
            triangle.add(curr);
        }
        return triangle;
    }

    public static void main(String[] args) {
        int n = 5;
        ArrayList<ArrayList<Integer>> result = pascal(n);
        for (ArrayList<Integer> row : result) {
            System.out.println(row);
        }
    }
}