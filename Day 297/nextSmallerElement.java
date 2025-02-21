import java.util.*;
public class nextSmallerElement {
    public static int[] nse(int arr[], int n) {
        int[] res = new int[n];
        Stack<Integer> s = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            if (s.isEmpty()) {
                res[i] = -1;
            } else {
                while (!s.isEmpty() && s.peek() >= arr[i]) {
                    s.pop();
                }
                if (s.isEmpty()) {
                    res[i] = -1;
                } else {
                    res[i] = s.peek();
                }
            }
            s.push(arr[i]);
        }
        return res;
    }

    public static void main(String[] args) {
    int arr[] = {4, 5, 2, 10, 8};
    int n = arr.length;
    int[] res = nse(arr, n);
    for (int i = 0; i < n; i++) {
        System.out.print(res[i] + " ");
    }

    
    }
}