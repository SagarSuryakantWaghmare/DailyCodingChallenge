import java.util.Scanner;

public class spiralMatrix {
    static void printSpiralOrder(int[][] matrix, int r, int c) {
        int topRow = 0, bottomRow = r - 1, leftCol = 0, rightCol = c - 1;
        int totalElements = 0;
        while (totalElements < r * c) {
            for (int j = leftCol; j <= rightCol && totalElements < r * c; j++) {
                System.out.println(matrix[topRow][j] + " ");
                totalElements++;
            }
            topRow++;
            for (int i = topRow; i <= bottomRow && totalElements < r * c; i++) {
                System.out.println(matrix[i][rightCol] + " ");
                totalElements++;
            }
            rightCol--;
            for (int j = rightCol; j >= leftCol && totalElements < r * c; j--) {
                System.out.println(matrix[bottomRow][j] + " ");
                totalElements++;
            }
            bottomRow--;
            for (int i = bottomRow; i >= topRow && totalElements < r * c; i--) {
                System.out.println(matrix[i][leftCol] + " ");
                totalElements++;
            }
            leftCol++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and column:");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        int total = r * c;
        System.out.println("Enter " + total + " values.");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Input matrix:");
        spiralMatrix(matrix,r,c);
    }
}
