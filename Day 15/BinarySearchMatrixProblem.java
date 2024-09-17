
public class BinarySearchMatrixProblem {
    static boolean searchMatrix(int[][] a, int target) {
        // number of rows=r,number of cols=m
        int n = a.length, m = a[0].length;
        int low = 0, high = n * m - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int midElt = a[mid / m][mid % m];
            if (midElt == target) {
                return true;
            }
            if (target < midElt) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // search the 'target' value in a 2d integer matrix of dimensions nXm and return
        // true if found,else return false,
        /*
         * input:
         * 1 3 5 7
         * 10 11 16 20
         * 23 30 34 60
         * output:
         * true
         * 
         * formula:
         * r=(rm+c)/m
         * c=(rm+c)%m
         */
        int a[][] = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
        int target = 10;
        System.out.println(searchMatrix(a, target));

    }
}
