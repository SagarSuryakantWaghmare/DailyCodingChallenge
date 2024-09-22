/**
 * generatedSpiralMatrix
 */
public class generatedSpiralMatrix {
    public static int[][] spiral(int n){
        int topRow=0, bottomRow=n-1, leftCol=0, rightCol=n-1;
        int[][] ans = new int[n][n];
        int count = 1;

        while (count <= n * n) {  
            // Traverse left to right
            for (int i = leftCol; i <= rightCol && count <= n * n; i++) {
                ans[topRow][i] = count++;
            }
            topRow++;
            
            // Traverse top to bottom along right column
            for (int i = topRow; i <= bottomRow && count <= n * n; i++) {
                ans[i][rightCol] = count++;
            }
            rightCol--;
            
            // Traverse right to left along bottom row
            for (int i = rightCol; i >= leftCol && count <= n * n; i--) {
                ans[bottomRow][i] = count++;
            }
            bottomRow--;
            
            // Traverse bottom to top along left column
            for (int i = bottomRow; i >= topRow && count <= n * n; i--) {
                ans[i][leftCol] = count++;
            }
            leftCol++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 4;
        int[][] spiralMatrix = spiral(n);
        for (int i = 0; i < spiralMatrix.length; i++) {
            for (int j = 0; j < spiralMatrix[0].length; j++) {
                System.out.print(spiralMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
