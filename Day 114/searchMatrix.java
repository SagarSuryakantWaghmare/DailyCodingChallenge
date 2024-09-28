/**
 * searchMatrix
 */
public class searchMatrix {
    public static boolean searchMat(int [][]mat,int target){
        int n=mat.length;
        int m=mat[0].length;
        int low=0;
        int high=n*m-1;
        while (low<=high) {
            int mid=low+(high-low)/2;
            int midE=mat[mid/m][mid%m];
            if(midE==target){
                return true;
            }
            else if(target<midE){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int mat[][]={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target=16;
        System.out.println(searchMat(mat,target));
    }
}