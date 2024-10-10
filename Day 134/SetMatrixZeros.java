/**
 * SetMatrixZeros
 */
public class SetMatrixZeros {
    // public static void setZeros(int[][]m){
    //     // Brute force approach
    //     int r=m.length;
    //     int c=m[0].length;
    //     for (int i = 0; i < m.length; i++) {
    //         for(int j=0;j<m[0].length;j++){
    //             if(m[i][j]==0){
    //                 rowChange(m,i);
    //                 colChange(m,j);
    //             }
    //         }
    //     }
    //     for (int i = 0; i < r; i++) {
    //         for (int j = 0; j < c; j++) {
    //             if(m[i][j]==-1){
    //                 m[i][j]=0;
    //                 m[i][j]=0;
    //             }
    //         }
    //     }
    // }
    // public static void rowChange(int m[][],int i){
    //     for (int j = 0; j < m.length; j++) {
    //         m[0][j]=-1;
    //     }
    // }
    // public static void colChange(int[][]m,int j){
    //     for (int i = 0; i < m.length; i++) {
    //         m[i][0]=-1;
    //     }
    // }

    public static void setZeros(int[][] m) {
        int r = m.length;
        int c = m[0].length;
        
        // Better solution
        int row[] = new int[r];
        int col[] = new int[c];
        
        // Mark the rows and columns that need to be zeroed
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (m[i][j] == 0) {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }
        
        // Set the marked rows and columns to zero
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (row[i] == 1 || col[j] == 1) {
                    m[i][j] = 0;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        int [][]m = {{1, 0, 1, 1}, {0, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}};
        
        System.out.println("Matrix:");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println();
        setZeros(m);
        
        System.out.println("Matrix set to zero:");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
}    