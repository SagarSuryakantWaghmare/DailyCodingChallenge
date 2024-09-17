/**
 * CountPathInMaze
 */
public class CountPathInMaze {

    public static void main(String[] args) {
        // Calculate the path 0,0 to n,m
        int n = 3;
        int m = 3;
        System.out.println(calculateMaze(0, 0, n, m));
    }

    private static int calculateMaze(int right, int down, int n, int m) {
        if (right == n || down == m) {
            return 0;
        }
        if (right == n - 1 || down == m - 1) {
            return 1;
        }
        int rightPath = calculateMaze(right + 1, down, n, m);
        int downPath = calculateMaze(right, down + 1, n, m);
        return rightPath + downPath;
    }
}