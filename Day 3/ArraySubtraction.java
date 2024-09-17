import java.util.*;
public class ArraySubtraction {


    static void printMatrix(int[][]m,int r,int c){
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(" "+m[i][j]);
            }
            System.out.println();
        }
    }
    static void SubtractionMatrix(int[][]m1,int[][]m2,int r, int c){
        int result[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                result[i][j]=m1[i][j]-m2[i][j];
            }
        }
        System.out.println("Subtraction Matrix:");
        printMatrix(result, r, c);
        return ;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the matrix1:");
        System.out.println("Enter the rows:");
        int r=sc.nextInt();
        System.out.println("Enter the Column:");
        int c=sc.nextInt();
        int m1[][]=new int[r][c];
        System.out.println("Enter the matrix1:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                m1[i][j]=sc.nextInt();
            }
        }
        int m2[][]=new int[r][c];
        System.out.println("Enter the matrix2:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                m2[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix 1:");
        printMatrix(m1, r, c);
        System.out.println("Matrix 2:");
        printMatrix(m2, r, c);
        SubtractionMatrix(m1, m2, r, c);
        
    }
}

