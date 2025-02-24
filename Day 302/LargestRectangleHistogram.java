import java.util.*;

public class LargestRectangleHistogram {
    public static int[] nse(int[] arr) {
        int n = arr.length;
        int ans[] = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            ans[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }
        return ans;
    }

    public static int[] pse(int[] arr) {
        int n = arr.length;
        int ans[] = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            ans[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        return ans;
    }

    public static int Largest(int[] arr) {
        int n = arr.length;
        int maxArea = 0;
        int[] nse = nse(arr);
        int[] pse = pse(arr);

        for (int i = 0; i < n; i++) {
            int width = nse[i] - pse[i] - 1;
            int area = arr[i] * width;
            maxArea = Math.max(maxArea, area); // Fix: Track max area instead of sum
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int height[] = { 2, 1, 5, 6, 2, 3 };
        System.out.println("Maximum :" + Largest(height));
    }
}
