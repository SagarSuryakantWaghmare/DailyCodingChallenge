public class setMatrixZero {
    public static void setZeroes(int [][]mat){
        int n=mat.length;
        int m=mat[0].length;
        int row[]=new int[n];
        int col[]=new int[m];
        for (int i = 0; i < n; i++) {
           for (int j = 0; j < m; j++) {
            if(mat[i][j]==0){
                row[i]=-1;
                col[i]=-1;
            }
           }
        }
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <m; j++) {
                if(col[i]==-1||row[j]==-1){
                    mat[i][j]=0;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] mat={{1,1,1},{1,0,1},{1,1,1}};
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("After setting zeroes");
        setZeroes(mat);
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }

    }
}