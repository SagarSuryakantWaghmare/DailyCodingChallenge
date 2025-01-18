public class searchRowWiseTwoDMatrix {
    public static boolean searchMatrix(int [][]matrix,int target){
        int n=matrix.length;
        int m=matrix[0].length;
        int row=0;
        int col=m-1;
        while (row<n&&col>=0) {
            if(matrix[row][col]==target){
                return true;
            }
            if(matrix[row][col]<target){
                row++;
            }
            else{
                col--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 4, 7, 11, 15},
            {2, 5, 8, 12, 19},
            {3, 6, 9, 16, 22},
            {10, 13, 14, 17, 24},
            {18, 21, 23, 26, 30}
        };

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
            System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Search for 5: " + searchMatrix(matrix, 5));
    }
}