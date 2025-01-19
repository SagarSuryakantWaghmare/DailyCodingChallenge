public class PeakInTwoD {
    public static int max(int[][]a,int n,int m,int mid){
        int maxRow=0;
        for (int i = 0; i < n; i++) {
            if(a[i][mid]>a[i][maxRow]){
                maxRow=i;
            }
        }
        return maxRow;
    }
    public static int[] findPeak(int [][]a){
        int n=a.length;
        int m=a[0].length;
        int low=0;
        int high=m-1;
        while (low<=high) {
            int mid=(low+high)/2;
            int row=max(a,n,m,mid);
            int left=mid-1>=0?a[row][mid-1]:-1;
            int right=mid+1<m?a[row][mid+1]:-1;
            if(a[row][mid]>left&&a[row][mid]>right){
                return new int[]{row,mid};
            }
            else if(a[row][mid]<left){
                high=mid-1;
            }
            else{
                low=mid+1;
            }

        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[][] matrix = {
                { 10, 20, 15 },
                { 21, 30, 14 },
                { 7, 16, 32 }
        };

        int peak[] = findPeak(matrix);
        System.out.println("Peak element is index at : " + peak[0] + " " + peak[1]);
    }

}
