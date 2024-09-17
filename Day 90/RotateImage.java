/**
 * RotateImage
 */
public class RotateImage {

    public static void main(String[] args) {
        int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};
        int r=matrix.length;
        int c=matrix[0].length;
        System.out.println("Matrix before rotated:");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        rotateImage(matrix);
        System.out.println("Matrix after rotated:");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static void rotateImage(int[][] matrix) {
        int r=matrix.length;
        transposeInPlace(matrix,r,r);
        for (int i = 0; i < r; i++) {
            reverseInPlace(matrix[i]);
        }
        
    }

    private static void reverseInPlace(int[] arr) {
        int i=0;
        int j=arr.length-1;
        while (i<j) {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;

            i++;
            j--;
        }
    }

    private static void transposeInPlace(int[][] matrix, int r, int c) {
        for (int i = 0; i < r; i++) {
            for (int j = i; j < c; j++) {
                int temp=matrix[i][j];
                 matrix[i][j]=matrix[j][i];
                 matrix[j][i]=temp;
                //  System.out.print(matrix[i][j]+" ");
            }
        }
    }
}