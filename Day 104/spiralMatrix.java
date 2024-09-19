import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class spiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        List<Integer> ans = new LinkedList<>();
        ans = spiralOrder(matrix);
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }

    private static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0) {
            return result;
        }
        int r = matrix.length;
        int c = matrix[0].length;
        int topRow = 0;
        int bottomRow = r - 1;
        int leftCol = 0;
        int rightCol = c - 1;
        int totalElements = 0;

        while (totalElements < r * c) {
            // left to right (along the top row)
            for (int j = leftCol; j <= rightCol && totalElements < r * c; j++) {
                result.add(matrix[topRow][j]);
                totalElements++;
            }
            topRow++; 
            // top to bottom (along the right column)
            for (int i = topRow; i <= bottomRow && totalElements < r * c; i++) {
                result.add(matrix[i][rightCol]);
                totalElements++;
            }
            rightCol--; 
            // right to left (along the bottom row)
            for (int j = rightCol; j >= leftCol && totalElements < r * c; j--) {
                result.add(matrix[bottomRow][j]);
                totalElements++;
            }
            bottomRow--; 
            // bottom to top (along the left column)
            for (int i = bottomRow; i >= topRow && totalElements < r * c; i--) {
                result.add(matrix[i][leftCol]);
                totalElements++;
            }
            leftCol++; 
        }

        return result;
    }
}
