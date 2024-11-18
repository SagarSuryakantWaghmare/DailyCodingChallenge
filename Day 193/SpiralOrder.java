import java.util.ArrayList;
import java.util.List;

public class SpiralOrder {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0) {
            return result;
        }
        
        int rows = matrix.length;
        int cols = matrix[0].length;
        int topRow = 0;
        int bottomRow = rows - 1;
        int leftCol = 0;
        int rightCol = cols - 1;

        while (topRow <= bottomRow && leftCol <= rightCol) {
            // Traverse from left to right
            for (int i = leftCol; i <= rightCol; i++) {
                result.add(matrix[topRow][i]);
            }
            topRow++;

            // Traverse from top to bottom
            for (int i = topRow; i <= bottomRow; i++) {
                result.add(matrix[i][rightCol]);
            }
            rightCol--;

            // Traverse from right to left
            if (topRow <= bottomRow) { // Check to avoid duplicate rows
                for (int i = rightCol; i >= leftCol; i--) {
                    result.add(matrix[bottomRow][i]);
                }
                bottomRow--;
            }

            // Traverse from bottom to top
            if (leftCol <= rightCol) { // Check to avoid duplicate columns
                for (int i = bottomRow; i >= topRow; i--) {
                    result.add(matrix[i][leftCol]);
                }
                leftCol++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };
        
        List<Integer> ans = spiralOrder(matrix);
        System.out.println(ans); // Expected output: [1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7]
    }
}
