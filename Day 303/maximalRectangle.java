import java.util.Stack;

public class maximalRectangle {  
    public static int largestRectangle(int[] heights) {
        int max = 0;
        int n = heights.length;
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i <= n; i++) {
            int h = (i == n) ? 0 : heights[i];

            while (!st.isEmpty() && h < heights[st.peek()]) {
                int height = heights[st.pop()]; 
                int width = st.isEmpty() ? i : i - st.peek() - 1;  
                max = Math.max(max, height * width);
            }
            st.push(i);  
        }
        return max;
    }

    public static int MaximalRectangle(int[][] arr) {
        int n = arr.length;
        if (n == 0) return 0;  
        int m = arr[0].length;

        int[][] presum = new int[n][m];

        // Compute the presum (prefix sum) array
        for (int i = 0; i < m; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j][i] == 1) {  
                    sum++;
                } else {
                    sum = 0;
                }
                presum[j][i] = sum;  
            }
        }

        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            maxArea = Math.max(maxArea, largestRectangle(presum[i]));
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int arr[][] = {
            {1, 0, 1, 1, 0},
            {1, 0, 1, 1, 1},
            {1, 1, 1, 1, 1},
            {1, 1, 0, 0, 1},
            {1, 1, 1, 1, 1}
        };
        System.out.println(MaximalRectangle(arr));  
    }
}
