import java.util.*;
public class ArrayMultiplication {


    static void printMatrix(int[][]m,int r,int c){
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(" "+m[i][j]);
            }
            System.out.println();
        }
    }
    // for multiplication c1=r2
    static void multiplication(int[][] A, int r1, int c1, int[][] B, int r2, int c2) {
        if (r1 != c2) {
            System.out.println("Wrong input");
            return;
        }
        int[][] Mul = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) { // Fixed the loop condition here
                for (int k = 0; k < c1; k++) {
                    Mul[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        printMatrix(Mul,r1,c2);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the matrix1:");
        System.out.println("Enter the rows:");
        int r1=sc.nextInt();
        System.out.println("Enter the Column:");
        int c1=sc.nextInt();
        int m1[][]=new int[r1][c1];
        System.out.println("Enter the matrix1:");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                m1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the rows:");
        int r2=sc.nextInt();
        System.out.println("Enter the Column:");
        int c2=sc.nextInt();
        int m2[][]=new int[r2][c2];
        System.out.println("Enter the matrix2:");
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                m2[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix 1:");
        printMatrix(m1, r1, c1);
        System.out.println("Matrix 2:");
        printMatrix(m2, r2, c2);
        System.out.println("Multiplication :");
        multiplication(m1, r1, c1, m2, r2, c2);
        
    }
}

