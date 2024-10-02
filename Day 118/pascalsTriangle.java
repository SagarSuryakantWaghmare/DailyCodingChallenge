import java.util.ArrayList;
import java.util.List;

public class pascalsTriangle {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        if (numRows == 0) {
            return triangle;
        }

    
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);

        for (int i = 1; i < numRows; i++) {
            List<Integer> preRow = triangle.get(i - 1);
            List<Integer> currentRow = new ArrayList<>();

            currentRow.add(1); 

            for (int j = 1; j < i; j++) {
                currentRow.add(preRow.get(j - 1) + preRow.get(j));
            }

            currentRow.add(1);  
            triangle.add(currentRow);
        }

        return triangle;
    }

    public static void main(String[] args) {
        pascalsTriangle pt = new pascalsTriangle();
        int numRows = 5;  
        List<List<Integer>> result = pt.generate(numRows);

        for (List<Integer> row : result) {
            System.out.println(row);
        }
    }
}
