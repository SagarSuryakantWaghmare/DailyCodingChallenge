public class RotateImage {
    public static void rotateImage(int[][]matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<i;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            reverse(matrix[i]);
        }
    }
    public static void reverse(int []matrix){
        int low=0;
        int high=matrix.length-1;
        while (low<high) {
            int temp=matrix[low];
            matrix[low]=matrix[high];
            matrix[high]=temp;
            low++;
            high--;
        }
    }

    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println("Matrix is as follows:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        rotateImage(matrix);
        System.out.println("After the rotation:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}